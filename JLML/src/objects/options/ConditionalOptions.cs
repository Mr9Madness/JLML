using System;
using System.Collections.Generic;
using JLML.Contexts;
using JLML.Objects.Elements;
using JLML.Objects.Values;
using JLML.Visitors;
using Microsoft.CodeAnalysis.CSharp.Scripting;

namespace JLML.Objects.Options
{
	public class ConditionalOptions : IOptions
	{
		public string Property;
		public string CompareTokens;
		public IValue CompareToTokens;

		public IElement Element { get; set; }

		public IElement Accept(IOptionVisitor<IElement> visitor) => visitor.Visit(this);
	}
}
