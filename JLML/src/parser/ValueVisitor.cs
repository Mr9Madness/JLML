using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using JLML.Generated;
using JLML.Objects;
using JLML.Objects.Values;
using Microsoft.CodeAnalysis.CSharp.Scripting;

namespace JLML.Parsers
{
	/// <summary>
	/// Visitor for JLML values/attributes.
	/// Parses JLML values/attributes using antlr
	/// </summary>
	public class ValueVisitor : JLMLBaseVisitor<IValue>
	{
		public override IValue VisitPair([NotNull] JLMLParser.PairContext context)
		{
			IValue datavalue = context.value().Accept(this);
			datavalue.Attribute = context.key().GetText();

			return datavalue;
		}

		public override IValue VisitValue([NotNull] JLMLParser.ValueContext context)
		{
			ITerminalNode identif = context.IDENTIFIER();
			ITerminalNode @string = context.STRING();
			ITerminalNode integer = context.NUMBER();
			ITerminalNode literal = context.LITERAL();

			return context switch
			{
				_ when identif != null => GetDataValueFromNode(identif, typeof(object)),
				_ when @string != null => GetDataValueFromNode(@string, typeof(string)),
				_ when integer != null => GetDataValueFromNode(integer, typeof(int)),
				_ when literal != null => GetDataValueFromNode(literal, typeof(bool)),
				_ => new DataValue { DataType = typeof(string), Value = context.GetText() }
			};
		}

		public override ListValue VisitList([NotNull] JLMLParser.ListContext context)
		{
			return new ListValue
			{
				Values = context.USABLE_TOKENS().Select(o => GetValueFromString(o.GetText())).ToList(),
			};
		}

		public override CalculatedValue VisitMath([NotNull] JLMLParser.MathContext context)
		{
			var op = context.op;
			JLMLParser.ValueContext value = context.value();

			//var child = context.GetChild(1).GetChild(1);

			return new CalculatedValue {
				// Operator = new List<char>(addOp.GetText().Split(' ')),
				// Values = ,
			};
		}

		public override ConditionalValue VisitWhenthen([NotNull] JLMLParser.WhenthenContext context)
		{
			string property = context.PROPERTY_NAME().GetText();
			string compareTokens = context.COMPARE_TOKENS().GetText();
			string comparableToken = context.USABLE_TOKENS().GetText();

			var values = context.value();
			var value1 = values[0].GetText();
			var value2 = values[1].GetText();

			string condition = $"page => {property} {compareTokens} {comparableToken} ? {value1} : {value2}";
			return new ConditionalValue
			{
				Condition = CSharpScript.EvaluateAsync<Func<BaseScript, object>>(condition).GetAwaiter().GetResult()
			};
		}

		private DataValue GetDataValueFromNode(ITerminalNode node, [NotNull] Type type)
		{
			var value = Convert.ChangeType(node.GetText(), type);
			return new DataValue { DataType = type, Value = value };
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

		private object GetValueFromString(string value)
		{
			if (int.TryParse(value, out int intValue)) return intValue;
			else if (Double.TryParse(value, out double doubleValue)) return doubleValue;

			else if (DateTime.TryParse(value, out DateTime datetimeValue)) return datetimeValue;

			else if (char.TryParse(value, out char charValue)) return charValue;

			else if (!value.Contains('"')) return value;
			else return value;
		}
	}
}
