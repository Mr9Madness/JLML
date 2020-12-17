using System;
using System.Collections.Generic;
using JLML.Visitors;

namespace JLML.Values
{
	public class CalculatedValue : ObjectValue
	{
		public CalculatedValue()
		{
			Operator = new List<char>();
			ValueTypes = new List<Type>();
			Values = new List<object>();
		}

		public string Attribute { get; init; }

		public List<char> Operator { get; init; }

		public List<Type> ValueTypes { get; init; }

		public List<object> Values { get; init; }

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
