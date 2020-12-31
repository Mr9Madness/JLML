using JLML.Contexts;
using JLML.Objects.Elements;
using JLML.Objects.Options;
using JLML.Visitors;

namespace JLML.Html.Visitors
{
	public class OptionVisitor : IOptionVisitor<IElement>
	{
		private PageContext pageContext;
		public OptionVisitor(PageContext pageContext)
		{
			this.pageContext = pageContext;
		}

		public IElement Visit(ImportOptions value)
		{
			throw new System.NotImplementedException();
		}

		public IElement Visit(ConditionalOptions value)
		{
			throw new System.NotImplementedException();
		}

		public IElement Visit(LoopOptions value)
		{
			IElement element = value.Element;


		}
	}
}