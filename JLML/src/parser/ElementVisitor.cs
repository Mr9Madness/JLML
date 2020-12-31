using System;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using JLML.Contexts;
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

		private IElement currentElement = null;

		public override BaseScript VisitJlml([NotNull] JLMLParser.JlmlContext context)
		{
			BaseScript baseScript = new BaseScript();

			var headerContexts = context.headers();
			for (int i = 0; i < headerContexts.Length; i++)
				baseScript.Headers.Add(headerContexts[i].Accept(valueVisitor) as HeaderValue);

			currentElement = baseScript;
			var elementContexts = context.element();
			for (int i = 0; i < elementContexts.Length; i++)
			{
				var child = elementContexts[i].Accept(this);
				baseScript.Children.Add(child);
			}

			return baseScript;
		}

		public override IElement VisitElement([NotNull] JLMLParser.ElementContext context)
		{
			IElement element = GetNamedElementOrDefault(context.elementkey());
			element.Current = new ElementContext(element, currentElement);

			JLMLParser.PairContext[] pairContext = context.pair();
			for (int i = 0; i < pairContext.Length; i++)
				element.Attributes.Add(pairContext[i].Accept(valueVisitor));

			currentElement = element;
			JLMLParser.ElementContext[] elementContext = context.element();
			for (int i = 0; i < elementContext.Length; i++)
			{
				var child = elementContext[i].Accept(this);
				element.Children.Add(child);
			}

			return element;
		}

		public override IElement VisitElementkey([NotNull] JLMLParser.ElementkeyContext context)
		{
			var with = context.with().Accept(optionVisitor) as ImportOptions;
			var when = context.when().Accept(optionVisitor) as ConditionalOptions;
			var loop = context.loop().Accept(optionVisitor) as LoopOptions;

			return GetNamedElement(context.IDENTIFIER().GetText(), with, when, loop);
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
			if (context == null)
				key = new Element();
			else
				key = context.Accept(this);

			return key;
		}

		private IElement GetNamedElement(string name, ImportOptions with, ConditionalOptions when, LoopOptions loop)
		{
			if(Enum.TryParse<ElementName>(name, true, out ElementName elementName))
			{
				return elementName switch
				{
					ElementName.Select => new SelectElement { ImportOptions = with, ConditionalOptions = when, LoopOptions = loop },
					ElementName.Image => new ImageElement { ImportOptions = with, ConditionalOptions = when, LoopOptions = loop },
					ElementName.Input => new InputElement { ImportOptions = with, ConditionalOptions = when, LoopOptions = loop },
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
					LoopOptions = loop,
				};
			}
		}

	}
}