using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using JLML.Generated;
using JLML.Values;

namespace JLML.Parsers
{
	/// <summary>
	/// Visitor for JLML text files.
	/// Parses JLML files using antlr
	/// </summary>
	public class JLMLVisitor : JLMLBaseVisitor<Value>
	{
		public override Value VisitJlml([NotNull] JLMLParser.JlmlContext context)
		{
			List<Value> children = new List<Value>();
			foreach (var item in context.obj())
				children.Add(Visit(item));

			return new BaseScript() { Children = children };
		}

		public override Value VisitObj([NotNull] JLMLParser.ObjContext context)
		{
			var pair = context.pair();
			Value[] values = new Value[pair.Length];
			for(int i = 0; i < pair.Length; i++)
			{
				values[i] = Visit(pair[i]);
			}

			return new Value { Children = values };
		}

		public override Value VisitPair([NotNull] JLMLParser.PairContext context)
		{
			var obj = context.obj();
			if(obj != null) return Visit(obj);

			JLMLParser.KeyContext id = context.key();
			JLMLParser.ValueContext[] values = context.value();
			if(values.Length > 1)
			{
				Value[] visitedValues = new Value[values.Length];
				for(int i = 0; i < values.Length; i++)
				{
					visitedValues[i] = GetValueFromPair(context, values[i]);
				}
				return new Value { Children = visitedValues };
			}

			return GetValueFromPair(context, values[0]);
		}
		public override CalculatedValue VisitMath([NotNull] JLMLParser.MathContext context)
		{
			ITerminalNode addOp = context.ADDICTIVE_OPERATORS();
			ITerminalNode mulOp = context.MULTIPLICATIVE_OPERATORS();
			JLMLParser.ValueContext value = context.value();

			//var child = context.GetChild(1).GetChild(1);

			return new CalculatedValue {
				// Operator = new List<char>(addOp.GetText().Split(' ')),
				// Values = ,
			};
		}

		public override ImportValue VisitWith([NotNull] JLMLParser.WithContext context)
		{
			var withIdentifier = context.STRING();
			var withExpression = context.WITH_EXPRESSION();
			var childrenValue = Visit(context.obj());

			return new ImportValue
			{
				ImportReference = withIdentifier.GetText(),//withString.GetText(),
				ReferenceVariable = withExpression.GetText(),
				Children = childrenValue.Children,
			};
		}

		public override Value VisitValue([NotNull] JLMLParser.ValueContext context)
		{
			// JLMLParser.ObjContext obj = context.obj();
			// if(obj != null) return Visit(obj);
			// JLMLParser.MathContext[] math = context.math();
			// if (math != null) return Visit(math);
			// JLMLParser.WithContext with = context.with();
			// if (with != null) return Visit(with);

			ITerminalNode @string = context.STRING();
			ITerminalNode integer = context.NUMBER();
			ITerminalNode literal = context.LITERAL();
			ITerminalNode identifier = context.IDENTIFIER();
			// ITerminalNode lambda = context.LAMBDA_EXPRESSION();

			return context switch
			{
				_ when identifier != null => new ReferenceValue { Value = identifier.GetText() },
				_ when @string != null => GetDataValueFromNode(@string, typeof(string)),
				_ when integer != null => GetDataValueFromNode(integer, typeof(int)),
				_ when literal != null => GetDataValueFromNode(literal, typeof(bool)),
				_ => new DataValue { DataType = typeof(string), Value = context.GetText() }
			};
		}

		private DataValue GetDataValueFromNode(ITerminalNode node, [NotNull] Type type)
		{
			var value = Convert.ChangeType(node.GetText(), type);
			return new DataValue { DataType = type, Value = value };
		}

		private Value GetValueFromPair(JLMLParser.PairContext pairContext, JLMLParser.ValueContext valueContext)
		{
			string id = pairContext.key().GetText();

			var obj = valueContext.obj();
			var withReference = valueContext.with();
			var calcReference = valueContext.math();

			var valueReference = pairContext.value();

			if(withReference != null)
			{
				ImportValue import = VisitWith(withReference);
				import.Identifier = id;

				return import;
			}
			else if(calcReference != null && calcReference.Length > 0)
			{
				var calcValue = new CalculatedValue { Identifier = id };
				var firstValue = valueContext.GetChild(0).GetText();
				calcValue.Values.Add(firstValue);
				calcValue.ValueTypes.Add(GetValueTypeFromString(firstValue));

				for (int i = 0; i < calcReference.Length; i++)
				{
					CalculatedValue value = VisitMath(calcReference[i]);
					calcValue.Operator.AddRange(value.Operator);
					calcValue.Values.AddRange(value.Values);
					calcValue.ValueTypes.AddRange(value.ValueTypes);
				}
				return calcValue;
			}
			else if(obj != null)
			{
				return new ObjectValue
				{
					Identifier = id,
					Children = Visit(obj).Children
				};
			}
			else if(valueReference != null)
			{
				DataValue dataValue = (DataValue)Visit(valueReference[0]);
				dataValue.Identifier = id;

				return dataValue;
			}
			else if(valueContext != null)
			{
				ObjectValue objectValue = (ObjectValue)Visit(valueContext);
				objectValue.Identifier = id;

				return objectValue;
			}

			return (ObjectValue)Visit(pairContext);
		}

		private Type GetValueTypeFromString(string value)
		{
			if(int.TryParse(value, out _)) return typeof(int);
			else if(Double.TryParse(value, out _)) return typeof(double);

			else if(DateTime.TryParse(value, out _)) return typeof(DateTime);

			else if(char.TryParse(value, out _)) return typeof(char);

			else if(!value.Contains('"')) return typeof(object);
			else return typeof(string);
		}
	}
}
