﻿using JLML.Objects.Elements;
using JLML.Visitors;

namespace JLML.Objects.Options
{
	public class ImportOptions : IOptions
	{
		public string ElementName { get; init; }
		public string FromDestination { get; init; }
		public bool IsFromSpecified { get; init; }

		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor) => visitor.Visit(this);
	}
}
