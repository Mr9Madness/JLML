using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class ImportOptions : IOptions
	{
		public string ImportReference { get; init; }
		public string ReferenceVariable { get; init; }

		public string Accept(IOptionVisitor<string> visitor) => visitor.Visit(this);
	}
}
