using Antlr4.Runtime;
using JLML.Objects;
using JLML.Parsers;

namespace JLML
{
	/// <summary>
	/// Document loader for jlml files
	/// </summary>
	public static class JLMLDocumentLoader
	{
		/// <summary>
		/// Loads given text and parses it into a JLML document
		/// The child or children of this object are the root element of the parsed text
		/// </summary>
		/// <param name="fileText">Text to be parsed</param>
		/// <returns>An JLML document that can either given to a transpiler (e.g. the JLML.Html HtmlTranspiler)</returns>
		public static JLMLDocument Load(string fileText)
		{
			Generated.JLMLLexer lexer = new(new AntlrInputStream(fileText));
			Generated.JLMLParser parser = new(new CommonTokenStream(lexer));

			parser.RemoveErrorListeners();
			parser.AddErrorListener(new JLMLErrorListener());

			try {
				ElementVisitor visitor = new();
				return (JLMLDocument)parser.jlml().Accept(visitor);
			}
			catch(RecognitionException rex)
			{
				throw rex.GetBaseException();
			}
		}
	}
}
