using System;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class ConditionalOptions : IOptions
	{
		public Func<BaseScript, bool> Condition { get; set; }
		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor) => visitor.Visit(this);
	}
}
