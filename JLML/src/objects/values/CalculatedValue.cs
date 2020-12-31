using System;
using System.Collections.Generic;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class CalculatedValue : IValue
	{
		public CalculatedValue()
		{
			Operator = new List<char>();
			ValueTypes = new List<Type>();
			Values = new List<object>();
		}

		public string Attribute { get; set; }

		public IElement Element { get; set; }

		public List<char> Operator { get; init; }

		public List<Type> ValueTypes { get; init; }

		public List<object> Values { get; init; }

		public string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
