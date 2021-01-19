using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using JLML.Objects;
using Xunit;

namespace JLML.Test
{
	public class ParsingTests
	{
		[Fact]
		public async Task TestDocumentAsync()
		{
			string fileText = await File.ReadAllTextAsync("test.jlml", Encoding.UTF8);
			JLMLDocument script = JLMLDocumentLoader.Load(fileText);

			Assert.NotNull(script);
		}

		[Fact]
		public void TestStringAsync()
		{
			string jlmlHeaders = @"set page.title ""Quick example"";";
			string jlmlContent = @"form: { 
			input: {type: ""text""; placeholder: ""Test value""}
			select: {values: (""First"", ""Second"");option: for value in values { value: value;}}
			}";

			JLMLDocument script = JLMLDocumentLoader.Load(jlmlHeaders + jlmlContent);

			Assert.NotNull(script);

			var baseElement = script.Children.FirstOrDefault();

			Assert.NotNull(baseElement);
			Assert.Equal(0, baseElement.Attributes.Count);
			Assert.Equal(2, baseElement.Children.Count);
		}
	}
}
