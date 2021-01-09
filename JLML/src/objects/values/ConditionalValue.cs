using System;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class ConditionalValue : IValue
	{
		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public Func<JLMLDocument, object> Condition { get; set; }

		public string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
