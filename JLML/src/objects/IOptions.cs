using JLML.Visitors;

namespace JLML.Objects.Options
{
	public interface IOptions
	{
		public string Accept(IOptionVisitor<string> visitor);
	}
}