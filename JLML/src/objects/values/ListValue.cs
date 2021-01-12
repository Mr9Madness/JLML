using System;
using System.Collections.Generic;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class ListValue : IValue
	{
		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public List<object> Values { get; init; }

		public string Accept(IValueVisitor<string> visitor) => throw new NotSupportedException("List values cannot be translated");

	}
}