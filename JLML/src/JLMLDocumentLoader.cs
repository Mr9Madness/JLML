using Antlr4.Runtime;
using JLML.Objects;
using JLML.Parsers;

namespace JLML
{
	public static class JLMLDocumentLoader
	{
		public static JLMLDocument Load(string fileText)
		{
			Generated.JLMLLexer lexer = new Generated.JLMLLexer(new AntlrInputStream(fileText));
			Generated.JLMLParser parser = new Generated.JLMLParser(new CommonTokenStream(lexer));

			parser.RemoveErrorListeners();
			parser.AddErrorListener(new JLMLErrorListener());

			try {
				ElementVisitor visitor = new ElementVisitor();
				return (JLMLDocument)parser.jlml().Accept(visitor);
			}
			catch(RecognitionException rex)
			{
				throw rex.GetBaseException();
			}
		}
	}
}
