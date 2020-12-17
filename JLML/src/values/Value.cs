using System;
using System.Collections.Generic;
using System.Text;
using JLML.Visitors;

namespace JLML.Values
{
    public class Value : IValue
    {
		public ICollection<Value> Children { get; init; }

		public virtual string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
