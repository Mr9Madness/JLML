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

		public static JLMLDocument BaseScript { get; private set; }

		private PageContext pageContext;
		public ElementVisitor(PageContext pageContext)
		{
			this.pageContext = pageContext;

			valueVisitor = new ValueVisitor(pageContext);
			optionVisitor = new OptionVisitor(pageContext, valueVisitor);
		}

		public string Visit(JLMLDocument value)
		{
			BaseScript = value;

			pageContext.AddRange(value.Attributes.Cast<HeaderValue>().ToDictionary(o => o.Attribute, e => e.Value));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlBase(pageContext, objList);
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
			IEnumerable<string> objList = ResolveChildElementsOptions(
				value.Children.Where(o => o is NamedElement nEl && nEl.Identifier.Equals("option", StringComparison.OrdinalIgnoreCase))
			).Select(o => o.Accept(this)).ToList();

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
					var listValue = element.Current[element.LoopOptions.ListRef] as IEnumerable<object>;
					foreach (var item in listValue)
					{
						IElement loopElement = element.Clone() as IElement;
						loopElement.Current[element.LoopOptions.ValueRef] = item;

						elementList.Add(loopElement);
					}
				}

				if (element.ConditionalOptions is not null)
				{
					var condition = optionVisitor.Visit(element.ConditionalOptions) as ConditionalOptions;
				}
			}

			return elementList;
		}
	}
}
