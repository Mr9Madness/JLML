using System.IO;
using System.Text;
using System.Threading.Tasks;
using JLML.Objects;
using Xunit;

namespace JLML.Html.Test
{
	public class TranspilerTests
    {
        [Fact]
        public async Task TestDocumentToHtmlAsync()
        {
            string fileText = await File.ReadAllTextAsync("test.jlml", Encoding.UTF8);
            JLMLDocument script = JLMLDocumentLoader.Load(fileText);

            var transpiler = new Transpiler.HtmlTranspiler();
            var html = transpiler.ToScript(script);

            Assert.NotNull(script);
        }
    }
}
