using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using JLML.Contexts;

namespace JLML.Html.Generator
{
	public static class HtmlGenerator
	{
		/// <summary>
		/// Create the base body tag with provided options and child element/objects.
		/// </summary>
		public static string CreateHtmlBase(PageContext pageOptions, IEnumerable<string> childObjs)
		{
			StringBuilder builder = new StringBuilder();

			builder.Append("<html>");
			builder.Append("<head>");

			var title = pageOptions["title"];
			if(title != null)
				builder.Append($"<title>{title}</title>");

			builder.Append("</head>");
			builder.Append($"<body>");

			foreach (var child in childObjs) builder.Append(child);

			builder.Append("</body>");
			builder.Append("</html>");

			return builder.ToString();
		}

		/// <summary>
		/// Create a html tag from provided id, attributes and child element/objects.
		/// In format &lt;{<paramref name="id" />} {<paramref name="attrs" />}&gt; if no elements/objects provided.
		/// Otherwise in normal html format &lt;{<paramref name="id" />} {<paramref name="attrs" />}&gt;&lt;/{<paramref name="id" />}&gt;
		/// </summary>
		public static string CreateHtmlTag(string id, IEnumerable<string> text, IEnumerable<string> attrs, IEnumerable<string> childObjs)
		{
			StringBuilder builder = new StringBuilder();

			string htmlId = GetHtmlElementNameFromId(id);

			builder.Append($@"<{htmlId} {string.Join(' ', attrs)}");

			if (text.Any() || childObjs.Any()) builder.Append(">");
			else
			{
				builder.Append(" />");
				return builder.ToString();
			}

			foreach (var item in text) builder.Append(item);
			foreach (var item in childObjs) builder.Append(item);

			builder.Append($"</{htmlId}>");

			return builder.ToString();
		}

		public static string CreateHtmlAttr(string name, string value)
		{
			if(name == "text") return value;
			return $@"{GetHtmlAttrFromId(name)}=""{value}""";
		}

		public static string GetHtmlAttrFromId(string identifier) => identifier switch
		{
			"tags" => "class",
			_ => identifier,
		};

		public static string GetHtmlElementNameFromId(string identifier) => identifier switch
		{
			"link" => "a",
			"description" => "figcaption",
			_ => identifier,
		};
	}
}