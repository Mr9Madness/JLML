using System;
using System.IO;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.CommandLine;
using JLML.Html.Transpiler;
using JLML.Objects;
using System.CommandLine.Invocation;

namespace JLML.Tool
{
	public enum Lang
	{
		Html,
	}
	class Program
	{
		static async Task Main(string[] args)
		{
			var command = new Command("html")
			{
				new Option<string>(new string[] { "-f", "--file" }),
			};
			command.Handler = CommandHandler.Create<string, string>(
				(string file, string output) => DoTask(Lang.Html, file, output)
			);
			var rootCommand = new RootCommand {
				command,
				new Option<string>(new string[] { "-o", "--output" })
			};

			rootCommand.InvokeAsync(args).Wait();
		}

		static async Task DoTask(Lang lang, string filePath, string outputDir)
		{
			if(!File.Exists(filePath)) throw new System.Exception("File does not exist");
			if(!Directory.Exists(outputDir)) Console.WriteLine("Output directory does not exist. It will be created");

			string fileName = Path.GetFileNameWithoutExtension(filePath);

			CancellationTokenSource source = new CancellationTokenSource();
			CancellationToken token = source.Token;

			string fileText = await File.ReadAllTextAsync(filePath, Encoding.UTF8, token);

			JLMLDocument script = JLMLDocumentLoader.Load(fileText);

			IScriptable transpiler = lang switch {
				Lang.Html => new HtmlTranspiler(),
			};
			string contents = transpiler.ToScript(script);

			Directory.CreateDirectory(outputDir);
			await File.WriteAllTextAsync(Path.Join(outputDir, fileName + ".html"), contents, Encoding.UTF8, token);
		}
	}
}
