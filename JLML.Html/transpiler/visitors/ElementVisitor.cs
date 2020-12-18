using System;
using System.Collections.Generic;
using System.Linq;
using JLML.Html.Generator;
using JLML.Objects;
using JLML.Objects.Elements;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class ElementVisitor : IElementVisitor<string>
	{
		private ValueVisitor valueVisitor = new ValueVisitor();
		private OptionVisitor optionVisitor = new OptionVisitor();

		public static BaseScript BaseScript { get; private set; }
		List<IElement> importableValue = new List<IElement>();

		public string Visit(BaseScript value)
		{
			BaseScript = value;

			var headers = value.Headers.ToDictionary(o => o.Attribute, e => e.Value);

			// Get values that could only be attributes in html
			IEnumerable<string> objList = value.Children.Select(o => o.Accept(this));
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			return HtmlGenerator.CreateHtmlBase(headers, attrList, objList);
		}

		public string Visit(Element value)
		{
			// Get values that could only be attributes in html
			IEnumerable<string> objList = value.Children.Select(o => o.Accept(this));
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			return HtmlGenerator.CreateHtmlTag("div", attrList, objList);
		}

		public string Visit(NamedElement value)
		{
			// Get values that could only be attributes in html
			IEnumerable<string> objList = value.Children.Select(o => o.Accept(this));
			IEnumerable<string> attrList = value.Attributes.Select(o => o.Accept(valueVisitor));

			return HtmlGenerator.CreateHtmlTag(value.Identifier, attrList, objList);
		}

		public string Visit(SelectElement value)
		{
			IEnumerable<string> attrList = value.Attributes.Where(o => o.GetType() != typeof(ListValue)).Select(o => o.Accept(valueVisitor));

			// Select element can only have options as children to all others are ignored
			List<string> objList = new List<string>();
			var optionValues = value.Children.Where(o => o.GetType() == typeof(OptionElement)).Cast<OptionElement>().ToList();
			if(!optionValues.Any()) optionValues.Add(new OptionElement());

			ListValue listValue = new ListValue();
			var values = value.Attributes.Where(o => string.Equals(o.Attribute, "values", StringComparison.CurrentCultureIgnoreCase)).Cast<ListValue>();
			foreach (var item in values) listValue.Values.AddRange(item.Values);

			if(listValue.Values.Count == optionValues.Count)
			{
				for (int i = 0; i < optionValues.Count; i++)
				{
					OptionElement option = optionValues[i];
					option.Value = listValue.Values[i];
					objList.Add(option.Accept(this));
				}
			}
			else {
				for (int i = 0; i < optionValues.Count; i++)
				{
					OptionElement option = optionValues[i];
					objList.Add(option.Accept(this));
				}
			}

			// objList.AddRange(values.Select(o => string.Join("\r\n", o.Values.Select(v => $"<option>{v}</option>"))));

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
	}
}
