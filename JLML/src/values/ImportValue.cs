using JLML.Visitors;

namespace JLML.Values
{
	public class ImportValue : ObjectValue
	{
		public string ImportReference { get; init; }
		public string ReferenceVariable { get; init; }

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}
