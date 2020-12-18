using System;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public interface IValue
	{
		public string Attribute { get; set; }

		public string Accept(IValueVisitor<string> visitor);
	}
}