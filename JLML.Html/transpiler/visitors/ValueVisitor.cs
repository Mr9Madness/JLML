using System.Collections.Generic;
using System.Linq;
using JLML.Html.Generator;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class ValueVisitor : IValueVisitor<string>
	{

		public string Visit(DataValue value)
		{
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""{value.Value}""";
		}

		public string Visit(CalculatedValue value)
		{
			return "";
		}

		public string Visit(ConditionalValue value)
		{
			var conditionedValue = value.Condition(ElementVisitor.BaseScript);
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""{conditionedValue}""";
		}

	}
}