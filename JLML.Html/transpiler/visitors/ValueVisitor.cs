using System.Collections.Generic;
using System.Linq;
using System.Text;
using JLML.Contexts;
using JLML.Html.Generator;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class ValueVisitor : IValueVisitor<string>
	{
		private PageContext pageContext;
		public ValueVisitor(PageContext pageContext)
		{
			this.pageContext = pageContext;
		}

		public string Visit(DataValue value)
		{
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""{value.Value}""";
		}

		public string Visit(CalculatedValue value)
		{
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""5""";
		}

		public string Visit(ConditionalValue value)
		{
			var conditionedValue = value.Condition(ElementVisitor.BaseScript);
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""{conditionedValue}""";
		}

		public string Visit(VariableValue value)
		{
			var variableValue = GetValue(value);
			return $@"{HtmlGenerator.GetHtmlAttrFromId(value.Attribute)}=""{variableValue}""";
		}

		public string Visit(ConcatValue value)
		{
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < value.Values.Count; i++)
			{
				DataValue val = value.Values[i];
				if(val is VariableValue var)
				{
					var text = GetValue(var);
					builder.Append(text);
				}
				else
					builder.Append(val.Value);
			}

			return builder.ToString();
		}

		private object GetValue(DataValue value)
		{
			string valueId = value.Value.ToString();
			return pageContext[valueId] ?? value.Element.Current[valueId];
		}
	}
}