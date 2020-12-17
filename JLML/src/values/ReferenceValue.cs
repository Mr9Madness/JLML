using JLML.Visitors;

namespace JLML.Values
{
    public class ReferenceValue : DataValue
    {
		public ReferenceValue()
		{
			DataType = typeof(string);
		}

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
    }
}
