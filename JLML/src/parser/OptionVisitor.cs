using System;
using Antlr4.Runtime.Misc;
using JLML.Generated;
using JLML.Objects;
using JLML.Objects.Options;
using Microsoft.CodeAnalysis.CSharp.Scripting;

namespace JLML.Parsers
{
	public class OptionVisitor : Generated.JLMLBaseVisitor<IOptions>
	{
		public override ConditionalOptions VisitWhen([NotNull] JLMLParser.WhenContext context)
		{
			string property = context.PROPERTY_NAME().GetText();
			string compareTokens = context.COMPARE_TOKENS().GetText();
			string comparableToken = context.USABLE_TOKENS().GetText();

			string condition = $"page => {property} {compareTokens} {comparableToken}";
			return new ConditionalOptions
			{
				Condition = CSharpScript.EvaluateAsync<Func<BaseScript, bool>>(condition).GetAwaiter().GetResult()
			};
		}

		public override ImportOptions VisitWith([NotNull] JLMLParser.WithContext context)
		{
			var withIdentifier = context.STRING();
			var withExpression = context.WITH_EXPRESSION();

			return new ImportOptions
			{
				ImportReference = withIdentifier.GetText(),
				ReferenceVariable = withExpression.GetText(),
			};
		}
	}
}
