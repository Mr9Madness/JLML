using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public interface IOptions
	{
		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor);
	}
}