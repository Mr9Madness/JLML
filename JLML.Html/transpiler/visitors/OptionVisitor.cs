using JLML.Objects.Options;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class OptionVisitor : IOptionVisitor<string>
	{
		public string Visit(ConditionalOptions value)
		{
			throw new System.NotImplementedException();
		}

		public string Visit(ImportOptions value)
		{
			throw new System.NotImplementedException();
		}
	}
}