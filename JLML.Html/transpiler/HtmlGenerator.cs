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
			builder.AppendLine("<head>");

			var title = pageOptions["title"];
			if(title != null)
				builder.AppendLine($"<title>{title}</title>");

			builder.AppendLine("</head>");
			builder.AppendLine($"<body>");

			foreach (var child in childObjs) builder.AppendLine(child);

			builder.AppendLine("</body>");
			builder.Append("</html>");

			return builder.ToString();
		}

		/// <summary>
		/// Create a html tag from provided id, attributes and child element/objects.
		/// In format &lt;{<paramref name="id" />} {<paramref name="attrs" />}&gt; if no elements/objects provided.
		/// Otherwise in normal html format &lt;{<paramref name="id" />} {<paramref name="attrs" />}&gt;&lt;/{<paramref name="id" />}&gt;
		/// </summary>
		public static string CreateHtmlTag(string id, IEnumerable<string> attrs, IEnumerable<string> childObjs)
		{
			StringBuilder builder = new StringBuilder();

			builder.Append($@"<{id} {string.Join(' ', attrs)}");

			if (childObjs.Any()) builder.Append(">" + Environment.NewLine);
			else
			{
				builder.Append(" />");
				return builder.ToString();
			}

			foreach (var item in childObjs) builder.AppendLine(item);

			builder.Append($"</{id}>");

			return builder.ToString();

		}

		public static string GetHtmlAttrFromId(string identifier) => identifier switch
		{
			"tags" => "class",
			"text" => "content",
			_ => identifier,
		};
	}
}