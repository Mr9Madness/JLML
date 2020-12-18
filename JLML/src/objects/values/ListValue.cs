using System.Collections.Generic;
using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class ListValue : IValue
	{
		public string Attribute { get; set; }

		public List<object> Values { get; init; }

		public string Accept(IValueVisitor<string> visitor)
		{
			throw new System.NotImplementedException("List value cannot be visited");
		}

	}
}