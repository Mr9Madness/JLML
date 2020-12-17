using System.Collections.Generic;
using System.Text;
using JLML.Visitors;

namespace JLML.Values
{
	public class BaseScript : Value
	{
		public BaseScript()
		{
			Headers = new List<Value>();
		}

		public string FileName { get; set; }

		public ICollection<Value> Headers { get; init; }

		public override string Accept(IValueVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}
	}
}