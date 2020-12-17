using System;
using System.Collections.Generic;
using System.Text;
using JLML.Visitors;

namespace JLML.Values
{
    public class DataValue : ObjectValue
    {
		public Type DataType { get; init; }
        public object Value { get; init; }

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
