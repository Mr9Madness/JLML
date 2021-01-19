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
		private readonly ValueVisitor valueVisitor = new();
		private readonly OptionVisitor optionVisitor = new();

		private IElement currentElement = null;

		public override JLMLDocument VisitJlml([NotNull] JLMLParser.JlmlContext context)
		{
			JLMLDocument baseScript = new();
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

			JLMLParser.PairContext[] pairContext = context.pair();
			for (int i = 0; i < pairContext.Length; i++)
			{
				var value = pairContext[i].Accept(valueVisitor);
				value.Element = element;
				element.Attributes.Add(value);
			}

			element.Current = new ElementContext(element, currentElement);

			currentElement = element;
			JLMLParser.ElementContext[] elementContext = context.element();
			for (int i = 0; i < elementContext.Length; i++)
				element.Children.Add(elementContext[i].Accept(this));

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

			var element = GetNamedElement(context.IDENTIFIER().GetTextValue(), with, when, loop);

			if(withContext != null) element.ImportOptions.Element = element;
			if(whenContext != null) element.ConditionalOptions.Element = element;
			if(loopContext != null) element.LoopOptions.Element = element;

			return element;
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
			IElement key;
			if (context == null)
				key = new Element();
			else
				key = context.Accept(this);

			return key;
		}

		private static NamedElement GetNamedElement(string name, [Nullable] ImportOptions with, [Nullable] ConditionalOptions when, [Nullable] LoopOptions loop)
		{
			if(Enum.TryParse(name, true, out ElementName elementName))
			{
				return elementName switch
				{
					ElementName.Select => new SelectElement { ImportOptions = with, ConditionalOptions = when, LoopOptions = loop },
					ElementName.Image => new ImageElement { ImportOptions = with, ConditionalOptions = when, LoopOptions = loop },
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