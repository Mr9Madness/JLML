using System;
using System.Collections.Generic;
using System.Linq;
using JLML.Contexts;
using JLML.Html.Generator;
using JLML.Objects;
using JLML.Objects.Elements;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class ElementVisitor : IElementVisitor<string>
	{
		private readonly ValueVisitor valueVisitor;
		private readonly OptionVisitor optionVisitor;

		public static BaseScript BaseScript { get; private set; }

		private PageContext pageContext;
		public ElementVisitor(PageContext pageContext)
		{
			this.pageContext = pageContext;

			valueVisitor = new ValueVisitor(pageContext);
			optionVisitor = new OptionVisitor(pageContext);
		}

		public string Visit(BaseScript value)
		{
			BaseScript = value;

			var headers = value.Headers.ToDictionary(o => o.Attribute, e => e.Value);

			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlBase(headers, attrList, objList);
		}

		public string Visit(Element value)
		{
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlTag("div", attrList, objList);
		}

		public string Visit(NamedElement value)
		{
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlTag(value.Identifier, attrList, objList);
		}

		public string Visit(SelectElement value)
		{
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			// Select element can only have options as children to all others are ignored
			IEnumerable<string> objList =
				ResolveChildElementsOptions(value.Children.Where(o => o.GetType() == typeof(OptionElement)))
				.Cast<OptionElement>().Select(o => o.Accept(this)).ToList();

			return HtmlGenerator.CreateHtmlTag("select", attrList, objList);
		}

		public string Visit(ImageElement value)
		{
			throw new System.NotImplementedException();
		}

		public string Visit(InputElement value)
		{
			throw new System.NotImplementedException();
		}

		public string Visit(OptionElement value)
		{
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			var text = pageContext[value.Value.ToString()] ?? value.Current[value.Value.ToString()];
			if(value.Value == null) value.Value = text;

			return HtmlGenerator.CreateHtmlTag("option", attrList, objList);
		}

		/// <summary>
		/// Resolves child element import, condition and loop options.
		/// When using a loop option child element does not need to be resolved further
		/// </summary>
		private List<IElement> ResolveChildElementsOptions(IEnumerable<IElement> elements)
		{
			var elementList = new List<IElement>();
			foreach (var el in elements)
			{
				if(el is not IElementOptions element)
				{
					elementList.Add(el);
					continue;
				}

				if (element.ImportOptions is not null)
				{
					var import = optionVisitor.Visit(element.ImportOptions);
					element.LoadImport(import);

					elementList.Add(element);
				}

				if (element.LoopOptions is not null)
				{
					IElement loopElement = optionVisitor.Visit(element.LoopOptions);
					var listValue = element.Parent[element.LoopOptions.ListRef] as IEnumerable<object>;
					foreach (var item in listValue)
					{
						el
						elementList.Add(loopElement.Clone() as IElement);
					}
				}

				if (element.ConditionalOptions is not null)
				{
					var condition = optionVisitor.Visit(element.ConditionalOptions) as ConditionalOptions;
					if(condition.Condition(BaseScript)) elementList.Add(element);
				}
			}

			return elementList;
		}
	}
}
