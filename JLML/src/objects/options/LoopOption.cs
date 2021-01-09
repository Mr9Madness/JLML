using System;
using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class LoopOptions : IOptions
	{
		public string ListRef { get; init; }
		public string ValueRef { get; init; }
		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor) => throw new NotSupportedException("Loop options cannot be translated");
	}
}
