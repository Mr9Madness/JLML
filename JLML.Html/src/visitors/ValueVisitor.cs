using System.Collections.Generic;
using System.Linq;
using System.Text;
using JLML.Contexts;
using JLML.Html.Generator;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	/// <summary>
	/// Visits values and translates it into html for elements to use
	/// </summary>
	public class ValueVisitor : IValueVisitor<string>
	{
		private readonly PageContext pageContext;
		public ValueVisitor(PageContext pageContext)
		{
			this.pageContext = pageContext;
		}

		public string Visit(DataValue value)
		{
			return HtmlGenerator.CreateHtmlAttr(value.Attribute, value.Value.ToString());
		}

		public string Visit(CalculatedValue value)
		{
			return HtmlGenerator.CreateHtmlAttr(value.Attribute, 5.ToString());
		}

		public string Visit(ConditionalValue value)
		{
			var conditionedValue = value.Condition(ElementVisitor.BaseScript);
			return HtmlGenerator.CreateHtmlAttr(value.Attribute, conditionedValue.ToString());
		}

		public string Visit(VariableValue value)
		{
			return HtmlGenerator.CreateHtmlAttr(value.Attribute, GetValue(value).ToString());
		}

		public string Visit(ConcatValue value)
		{
			string[] builder = new string[value.Values.Count];
			for (int i = 0; i < value.Values.Count; i++)
			{
				var listValue = value.Values[i];
				if(listValue == null) continue;
				string id = listValue.ToString();
				if(TryGetValue(value.Element.Current, id, out object val))
					builder[i] = val.ToString();
				else
					builder[i] = id;
			}

			if(string.IsNullOrEmpty(value.Attribute))
				return string.Join(null, builder);
			return HtmlGenerator.CreateHtmlAttr(value.Attribute, string.Join(" ", builder));
		}

		private object GetValue(DataValue value)
		{
			string valueId = value.Value.ToString();
			return pageContext[valueId] ?? value.Element.Current[valueId];
		}
		private bool TryGetValue(ElementContext current, string id, out object value)
		{
			value = pageContext[id] ?? current[id];
			return value != null;
		}
	}
}