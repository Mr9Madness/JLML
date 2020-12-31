using System.IO;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using Antlr4.Runtime;
using JLML.Objects;
using JLML.Parsers;

namespace JLML
{
	public static class JLMLDocument
	{
		public static BaseScript Load(string fileText, CancellationToken cancellationToken = default)
		{
			Generated.JLMLLexer lexer = new Generated.JLMLLexer(new AntlrInputStream(fileText));
			Generated.JLMLParser parser = new Generated.JLMLParser(new CommonTokenStream(lexer));

			ElementVisitor visitor = new ElementVisitor();
			return (BaseScript)parser.jlml().Accept(visitor);
		}
	}
}