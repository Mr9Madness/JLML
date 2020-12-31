using System.Collections.Generic;
using JLML.Contexts;
using JLML.Objects.Elements;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects
{
	public class BaseScript : IElement
	{
		public BaseScript()
		{
			Headers = new List<HeaderValue>();
		}

		public BaseScript(IElement element) : this()
		{
			Attributes = element.Attributes;
			Children = element.Children;
			parent = new ElementContext(this);
		}

		public string FileName { get; set; }

		public ICollection<HeaderValue> Headers { get; init; }

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		private ElementContext parent;
		public ElementContext Parent { get => parent; set => parent = value; }

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