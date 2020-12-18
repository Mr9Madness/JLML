using System;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using JLML.Generated;
using JLML.Objects;
using JLML.Objects.Elements;
using JLML.Objects.Options;
using JLML.Objects.Values;

namespace JLML.Parsers
{
	public class ElementVisitor : Generated.JLMLBaseVisitor<IElement>
	{
		private ValueVisitor valueVisitor = new ValueVisitor();
		private OptionVisitor optionVisitor = new OptionVisitor();

		protected override IElement DefaultResult => new Element();

		public override BaseScript VisitJlml([NotNull] JLMLParser.JlmlContext context)
		{
			BaseScript baseScript = new BaseScript();

			var headerContexts = context.headers();
			for (int i = 0; i < headerContexts.Length; i++)
				baseScript.Headers.Add(headerContexts[i].Accept(valueVisitor) as HeaderValue);

			var elementContexts = context.element();
			for (int i = 0; i < elementContexts.Length; i++)
				baseScript.Children.Add(elementContexts[i].Accept(this));

			return baseScript;
		}

		public override IElement VisitElement([NotNull] JLMLParser.ElementContext context)
		{
			IElement element = GetNamedElementOrDefault(context.elementkey());

			JLMLParser.PairContext[] pairContext = context.pair();
			for (int i = 0; i < pairContext.Length; i++)
				element.Attributes.Add(pairContext[i].Accept(valueVisitor));

			JLMLParser.ElementContext[] elementContext = context.element();
			for (int i = 0; i < elementContext.Length; i++)
				element.Children.Add(elementContext[i].Accept(this));

			return element;
		}


		public override IElement VisitElementkey([NotNull] JLMLParser.ElementkeyContext context)
		{
			var with = context.with().Accept(optionVisitor) as ImportOptions;
			var when = context.when().Accept(optionVisitor) as ConditionalOptions;

			return GetNamedElement(context.key().GetText(), with, when);
		}

		public override IElement VisitErrorNode(IErrorNode node)
		{
			return base.VisitErrorNode(node);
		}

		public override IElement VisitTerminal(ITerminalNode node)
		{
			return base.VisitTerminal(node);
		}

		private IElement GetNamedElementOrDefault(JLMLParser.ElementkeyContext context)
		{
			IElement key = null;
			if (context != null) key = context.Accept(this);
			else key = new Element();

			return key;
		}

		private IElement GetNamedElement(string name, ImportOptions with, ConditionalOptions when)
		{
			if(Enum.TryParse<ElementName>(name, true, out ElementName elementName))
			{
				return elementName switch
				{
					ElementName.Select => new SelectElement { ImportOptions = with, ConditionalOptions = when },
					ElementName.Image => new ImageElement { ImportOptions = with, ConditionalOptions = when },
					ElementName.Input => new InputElement { ImportOptions = with, ConditionalOptions = when },
					_ => throw new NotSupportedException($"{name} element is not supported"),
				};
			}
			else
			{
				return new NamedElement
				{
					Identifier = name,
					ImportOptions = with,
					ConditionalOptions = when,
				};
			}
		}

	}
}