using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using JLML.Html.Generator;
using JLML.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class ValueVisitor : IValueVisitor<string>
	{
		List<Value> importableValue = new List<Value>();

		public string Visit(BaseScript value)
		{
			IEnumerable<string> children = value.Children.Select(o => Visit(o));


			return HtmlGenerator.CreateHtmlBase(new Dictionary<string, string> {}, children);
		}

		public string Visit(Value value)
		{
			// Get values that could only be attributes in html
			IEnumerable<string> attrList = value.Children
				.Where(o => o.GetType() != typeof(ObjectValue) && o.GetType() != typeof(Value))
				.Select(o => Visit(o));
			IEnumerable<string> objList = value.Children
				.Where(o => o.GetType() == typeof(ObjectValue) || o.GetType() == typeof(Value))
				.Select(o => Visit(o));

			return HtmlGenerator.CreateHtmlTag("div", attrList, objList);
		}

		public string Visit(ObjectValue value)
		{
			// Get values that could only be attributes in html
			IEnumerable<string> attrList = value.Children
				.Where(o => o.GetType() != typeof(ObjectValue) && o.GetType() != typeof(Value))
				.Select(o => Visit(o));
			IEnumerable<string> objList = value.Children
				.Where(o => o.GetType() == typeof(ObjectValue) || o.GetType() == typeof(Value))
				.Select(o => Visit(o));
			return HtmlGenerator.CreateHtmlTag(value.Identifier, attrList, objList);
		}

		public string Visit(DataValue value)
		{
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Identifier)}=""{value.Value}""";
		}

		public string Visit(CalculatedValue value)
		{
			return "";
		}

		public string Visit(ImportValue value)
		{
			return "";
		}

		/// <summary>
		/// Visit an reference value
		/// </summary>
		public string Visit(ReferenceValue value)
		{
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Identifier)}=""{value.Value}""";
		}

	}
}