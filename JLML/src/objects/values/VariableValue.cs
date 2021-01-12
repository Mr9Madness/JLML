using System;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class VariableValue : DataValue
	{
		public new Type DataType { get; } = typeof(object);

		public override string Accept(IValueVisitor<string> visitor) => visitor.Visit(this);
	}
}