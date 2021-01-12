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
		public readonly Dictionary<string, IValue> Attr;

		public ElementContext(IElement element, IElement? parent = null)
		{
			Attr = element.Attributes.ToDictionary(k => k.Attribute);
			Parent = parent == null ? null : parent.Current;
		}

		public ElementContext(ElementContext context)
		{
			Parent = context.Parent;
			Attr = new Dictionary<string, IValue>(context.Attr);
		}

		public object? this[string name]
		{
			get
			{
				ElementContext context = this;

				if(name.Contains("."))
				{
					string[] nameParts = name.Split(".");
					for (int i = 0; i < nameParts.Length - 1; i++)
					{
						if(nameParts[i] == "parent")
							context = context.Parent;
					}
					name = nameParts[^1];
				}
				if(context == null) return null;

				IValue? value = context.Attr.GetValueOrDefault(name);
				if (value is DataValue dataValue)
					return dataValue.Value;
				else if (value is ListValue listValue)
					return listValue.Values;
				else if(value is null && Parent is not null)
					return context.Parent[name];

				return null;
			}
			set
			{
				if(value is not IValue valueObject) return;
				Attr[name] = valueObject;
			}
		}
	}
}
