using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class ImportOptions : IOptions
	{
		public string ImportReference { get; init; }
		public string ReferenceVariable { get; init; }
		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor) => visitor.Visit(this);
	}
}
