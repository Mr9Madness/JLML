using System.Collections.Generic;
using JLML.Contexts;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public class Element : IElement
	{
		public Element()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			Current = null;
		}

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }
		public ElementContext Current { get; set; }

		public string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}

		public object Clone()
		{
			return new Element
			{
				Attributes = Attributes,
				Children = Children,
				Current = Current,
			};
		}
	}
}
