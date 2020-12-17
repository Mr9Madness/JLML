using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace JLML.Html.Generator
{
	public static class HtmlGenerator
	{
		public static string CreateHtmlBase(Dictionary<string, string> pageOptions, IEnumerable<string> children)
		{
			StringBuilder builder = new StringBuilder();

			builder.Append("<html>");
			builder.AppendLine("<head>");

			string title = pageOptions.GetValueOrDefault("title") ?? "JLML Page";
			builder.AppendLine($"<title>{title}</title>");

			builder.AppendLine("</head>");
			builder.AppendLine("<body>");

			foreach (var item in children) builder.AppendLine(item);

			builder.AppendLine("</body>");
			builder.Append("</html>");

			return builder.ToString();
		}

		/// <summary>
		/// Create a html tag from provided id, attributes and child element/objects.
		/// In format <{<see cref="id">} {<see cref="attrs">} /> if no elements/objects provided.
		/// Otherwise in normal html format <{<see cref="id">} {<see cref="attrs">}></{<see cref="id">}>
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