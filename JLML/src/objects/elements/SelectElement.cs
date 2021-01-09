using System.Collections.Generic;
using System.Linq;
using JLML.Contexts;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public class SelectElement : NamedElement, IElement, IElementOptions
	{
		public SelectElement()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			Current = null;
			Identifier = "select";
		}

		public override string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
