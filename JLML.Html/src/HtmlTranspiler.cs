using JLML.Contexts;
using JLML.Html.Generator;
using JLML.Html.Visitors;
using JLML.Objects;

namespace JLML.Html.Transpiler
{
	/// <summary>
	/// A transpiler for the hypertext markup language 
	/// </summary>
	public class HtmlTranspiler : IScriptable
	{
		/// <summary>
		/// Sets wether the transpiled document needs to be formatted (e.g. new lines between lines)
		/// </summary>
		/// <param name="format">True is the document needs to formatted. False if not</param>
		/// <returns>The current HTML transpiler instance for chaining</returns>
		public HtmlTranspiler SetFormatting(bool format)
		{
			HtmlGenerator.SetFormatting(format);

			return this;
		}

		/// <summary>
		/// Transpiles the given value into html
		/// </summary>
		/// <param name="value">The parsed jlml document</param>
		/// <returns>An html string that represents the given document</returns>
		public string ToScript(JLMLDocument value)
		{
			PageContext context = new();
			ElementVisitor visitor = new(context);
			return value.Accept(visitor);
		}
	}
}
