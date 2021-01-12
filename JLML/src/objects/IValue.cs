using System;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public interface IValue
	{
		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public string Accept(IValueVisitor<string> visitor);
	}
}
