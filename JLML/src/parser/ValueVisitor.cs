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
			ITerminalNode @string = context.STRING();
			ITerminalNode identif = context.PROPERTY_NAME();
			ITerminalNode integer = context.NUMBER();
			ITerminalNode literal = context.LITERAL();

			if(@string != null) return GetDataValueFromNode(@string, typeof(string));
			if(integer != null) return GetDataValueFromNode(integer, typeof(int));
			if(literal != null) return GetDataValueFromNode(literal, typeof(bool));
			if(identif != null) return new VariableValue { Value = identif.GetText() };

			return new DataValue { DataType = typeof(string), Value = context.GetText() };
		}

		public override ConcatValue VisitConcat([NotNull] JLMLParser.ConcatContext context)
		{
			return new ConcatValue
			{
				Values = context.USABLE_TOKENS().Select(o => o.Accept(this)).Cast<DataValue>().ToList(),
			};
		}

		public override ListValue VisitList([NotNull] JLMLParser.ListContext context)
		{
			return new ListValue
			{
				Values = context.USABLE_TOKENS().Select(o => o.Accept(this)).Cast<DataValue>().ToList(),
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

			string value2 = property;
			if(values.Length > 1)
				value2 = values[1].GetText();

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
	}
}
