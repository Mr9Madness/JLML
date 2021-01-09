using System.Collections.Generic;
using JLML.Contexts;
using JLML.Objects.Elements;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects
{
	public class JLMLDocument : IElement
	{
		public JLMLDocument()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			current = new ElementContext(this);
		}

		public JLMLDocument(IElement element)
		{
			Attributes = element.Attributes;
			Children = element.Children;
			current = new ElementContext(this);
		}

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		private ElementContext current;
		public ElementContext Current { get => current; set => current = value; }

		public string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}

		public object Clone()
		{
			throw new System.NotImplementedException();
		}
	}
}