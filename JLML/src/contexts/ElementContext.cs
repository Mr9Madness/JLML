using System.Collections.Generic;
using System.Linq;
using JLML.Objects.Elements;
using JLML.Objects.Values;

namespace JLML.Contexts
{
	public class ElementContext
	{
#nullable enable
		private ElementContext? parentContext;
		private Dictionary<string, IValue> attr;

		public ElementContext(IElement element, IElement? parent = null)
		{
			attr = element.Attributes.ToDictionary(k => k.Attribute);
			parentContext = parent == null ? null : parent.Current;
		}

		public object? this[string name]
		{
			get
			{
				IValue value = attr[name];
				if (value is DataValue dataValue)
					return dataValue.Value;
				else if (value is ListValue listValue)
					return listValue.Values;
				else if(value is null && parentContext is not null)
					return parentContext[name];

				return null;
			}
			// set
			// {
			// 	var prop = typeof(Page).GetProperty(name, System.Reflection.BindingFlags.IgnoreCase);
			// 	var val = prop.GetValue(page);

			// 	if (val == null) return;
			// 	prop.SetValue(page, value);
			// }
		}
	}
}
