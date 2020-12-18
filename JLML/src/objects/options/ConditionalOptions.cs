using System;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class ConditionalOptions : IOptions
	{
		public Func<BaseScript, bool> Condition { get; set; }

		public string Accept(IOptionVisitor<string> visitor) => visitor.Visit(this);
	}
}
