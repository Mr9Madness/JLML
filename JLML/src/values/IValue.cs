using System;
using System.Collections.Generic;
using JLML.Visitors;

namespace JLML.Values
{
	public interface IValue
	{
		public ICollection<Value> Children { get; init; }

		public string Accept(IValueVisitor<string> visitor);
	}
}