using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class LoopOptions : IOptions
	{
		public string ListRef { get; init; }
		public string ValueRef { get; init; }
		public IElement Element { get; set; }

		public string Accept(IOptionVisitor<string> visitor) => visitor.Visit(this);
	}
}
