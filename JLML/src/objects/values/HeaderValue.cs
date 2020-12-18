using JLML.Visitors;

namespace JLML.Objects.Values
{
	public class HeaderValue : IValue
	{
		public HeaderType Type { get; set; }

		public string Attribute { get; set; }

		public string Value { get; set; }

		public string Accept(IValueVisitor<string> visitor)
		{
			throw new System.NotImplementedException("Header value cannot be visited");
		}

		public enum HeaderType
		{
			Declare,
			Set,
		}
	}
}