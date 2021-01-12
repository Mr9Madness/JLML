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
			IEnumerable<string> textList = value.Attributes.Where(o => o.Attribute == "text").Select(o => o.Accept(valueVisitor));
			IEnumerable<string> attrList = value.Attributes.Where(o => o.Attribute != "text").Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlTag("div", textList, attrList, objList);
		}

		public string Visit(NamedElement value)
		{
			IEnumerable<string> textList = value.Attributes.Where(o => o.Attribute == "text").Select(o => o.Accept(valueVisitor));
			IEnumerable<string> attrList = value.Attributes.Where(o => o.Attribute != "text").Select(o => o.Accept(valueVisitor));

			// Get values that could only be attributes in html
			IEnumerable<string> objList = ResolveChildElementsOptions(value.Children).Select(o => o.Accept(this));

			return HtmlGenerator.CreateHtmlTag(value.Identifier, textList, attrList, objList);
		}

		public string Visit(SelectElement value)
		{
			IEnumerable<string> textList = value.Attributes.Where(o => o.Attribute == "text").Select(o => o.Accept(valueVisitor));
			IEnumerable<string> attrList = value.Attributes
				.Where(o => o.Attribute != "text" && o.GetType() != typeof(ListValue))
				.Select(o => o.Accept(valueVisitor));

			// Select element can only have options as children to all others are ignored
			IEnumerable<string> objList = ResolveChildElementsOptions(
				value.Children.Where(o => o is NamedElement nEl && nEl.Identifier.Equals("option", StringComparison.OrdinalIgnoreCase))
			).Select(o => o.Accept(this)).ToList();

			return HtmlGenerator.CreateHtmlTag("select", textList, attrList, objList);
		}

		public string Visit(ImageElement value)
		{
			NamedElement? source = null;
			var sourceList = value.Children
				.Where(o => o is NamedElement nEl && nEl.Identifier.Equals("source", StringComparison.OrdinalIgnoreCase))
				.Cast<NamedElement>();
			foreach (var item in sourceList)
			{
				if(item.ConditionalOptions != null)
				{
					// condition is true if not null
					var conditionElement = optionVisitor.Visit(item.ConditionalOptions);
					if (conditionElement != null) source = item;
				}
				else
				{
					source = item;
				}
			}

			if(source != null)
			{
				var src = source.Attributes
					.Where(o => o is DataValue data && data.Attribute.Equals("src", StringComparison.OrdinalIgnoreCase))
					.Cast<DataValue>().First();

				value.Attributes.Add(src);
			}

			IEnumerable<string> textList = value.Attributes.Where(o => o.Attribute == "text").Select(o => o.Accept(valueVisitor));
			IEnumerable<string> attrList = value.Attributes.Where(o => o.Attribute != "text" && o.GetType() != typeof(ListValue)).Select(o => o.Accept(valueVisitor));

			NamedElement? description = value.Children
				.Where(o => o is NamedElement nEl && nEl.Identifier.Equals("description", StringComparison.OrdinalIgnoreCase))
				.Cast<NamedElement>().FirstOrDefault();

			var imgElement = HtmlGenerator.CreateHtmlTag("img", textList, attrList, Enumerable.Empty<string>());
			if(description == null) return imgElement;

			List<string> objList = new List<string>
			{
				imgElement,
				description.Accept(this),
			};

			return HtmlGenerator.CreateHtmlTag("figure", textList, Enumerable.Empty<string>(), objList);
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
				}

				if (element.LoopOptions is null && element.ConditionalOptions is null)
				{
					elementList.Add(element);
				}


				if (element.LoopOptions is not null)
				{
					var listValue = element.Current[element.LoopOptions.ListRef];
					if(listValue is not null && listValue is IEnumerable<object> list)
					{
						foreach (var item in list)
						{
							IElement loopElement = element.Clone() as IElement;
							loopElement.Current[element.LoopOptions.ValueRef] = new DataValue {
								Attribute = element.LoopOptions.ValueRef,
								DataType = item.GetType(),
								Value = item,
							};

							elementList.Add(loopElement);
						}
					}
				}

				if (element.ConditionalOptions is not null)
				{
					var conditionElement = optionVisitor.Visit(element.ConditionalOptions);
					if(conditionElement != null) elementList.Add(conditionElement);
				}
			}

			return elementList;
		}
	}
}
