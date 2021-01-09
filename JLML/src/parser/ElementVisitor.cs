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

		public override JLMLDocument VisitJlml([NotNull] JLMLParser.JlmlContext context)
		{
			JLMLDocument baseScript = new JLMLDocument();
			currentElement = baseScript;

			var headerContext = context.headers();
			if(headerContext != null)
				_ = headerContext.Accept(this);

			var elementContexts = context.element();
			for (int i = 0; i < elementContexts.Length; i++)
			{
				var child = elementContexts[i].Accept(this);
				baseScript.Children.Add(child);
			}

			return baseScript;
		}

		public override IElement VisitHeaders([NotNull] JLMLParser.HeadersContext context)
		{
			var declareHeaders = context.assignheader();
			var setHeaders = context.setheader();

			for (int i = 0; i < declareHeaders.Length; i++)
				currentElement.Attributes.Add(declareHeaders[i].Accept(valueVisitor));

			for (int i = 0; i < setHeaders.Length; i++)
				currentElement.Attributes.Add(setHeaders[i].Accept(valueVisitor));

			return currentElement;
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
			var withContext = context.with();
			var whenContext = context.when();
			var loopContext = context.loop();
			ImportOptions with = null;
			ConditionalOptions when = null;
			LoopOptions loop = null;

			if(withContext != null) with = withContext.Accept(optionVisitor) as ImportOptions;
			if(whenContext != null) when = whenContext.Accept(optionVisitor) as ConditionalOptions;
			if(loopContext != null) loop = loopContext.Accept(optionVisitor) as LoopOptions;

			return GetNamedElement(context.IDENTIFIER().GetTextValue(), with, when, loop);
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

		private IElement GetNamedElement(string name, [Nullable] ImportOptions with, [Nullable] ConditionalOptions when, [Nullable] LoopOptions loop)
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