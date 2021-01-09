using System.Collections.Generic;
using System.Linq;
using JLML.Contexts;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public class ImageElement : NamedElement, IElement, IElementOptions
	{
		public ImageElement()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			Current = null;
			Identifier = "image";
		}

		public override string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
