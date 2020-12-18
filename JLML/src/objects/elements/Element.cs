using System.Collections.Generic;
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
		}

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		public string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
