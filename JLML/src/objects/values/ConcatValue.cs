using System.Collections.Generic;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class ConcatValue : IValue
	{
		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public List<DataValue> Values { get; init; }

		public string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}