using System.Collections.Generic;
using System.Linq;
using JLML.Objects.Elements;
using JLML.Objects.Values;

namespace JLML.Contexts
{
	public class ElementContext
	{
#nullable enable
		public readonly ElementContext? Parent;
		private Dictionary<string, IValue> attr;

		public ElementContext(IElement element, IElement? parent = null)
		{
			attr = element.Attributes.ToDictionary(k => k.Attribute);
			Parent = parent == null ? null : parent.Current;
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
				else if(value is null && Parent is not null)
					return Parent[name];

				return null;
			}
			set
			{
				if(attr.ContainsKey(name)) return;
				if(value is not IValue valueObject) return;
				attr[name] = valueObject;
			}
		}
	}
}
