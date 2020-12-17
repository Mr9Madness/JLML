using JLML.Visitors;

namespace JLML.Values
{
    public class ObjectValue : Value
    {
        public string Identifier { get; set; }

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
