using System;
using System.Collections.Generic;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class DataValue : IValue
	{
		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public Type DataType { get; init; }
		public object Value { get; init; }

		public virtual string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
