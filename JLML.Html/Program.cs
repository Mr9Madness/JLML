using System.Diagnostics.CodeAnalysis;
using System.IO;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using JLML.Html.Transpiler;
using JLML.Objects;

namespace JLML.Html
{
	class Program
	{
		static async Task Main([NotNull] string filePath, [NotNull] string outputDir)
		{
			filePath = "samples/test.jlml";
			outputDir = "output/";

			CancellationTokenSource source = new CancellationTokenSource();
			CancellationToken token = source.Token;

			string fileText = await File.ReadAllTextAsync(filePath, Encoding.UTF8, token);

			BaseScript script = JLMLDocument.Load(fileText, token);

			HtmlTranspiler transpiler = new HtmlTranspiler();
			string contents = transpiler.ToScript(script);

			Directory.CreateDirectory(outputDir);
			await File.WriteAllTextAsync(Path.Join(outputDir, filePath), contents, Encoding.UTF8, token);
		}
	}
}
