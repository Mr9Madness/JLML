using System;
using System.IO;
using System.Linq;
using System.Net.Http;
using JLML.Contexts;
using JLML.Objects;
using JLML.Objects.Elements;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;
using Microsoft.CodeAnalysis.CSharp.Scripting;
using Microsoft.CodeAnalysis.Scripting;

namespace JLML.Html.Visitors
{
	public class OptionVisitor : IOptionVisitor<IElement>
	{
		private ValueVisitor valueVisitor;
		private PageContext pageContext;
		public OptionVisitor(PageContext pageContext, ValueVisitor valueVisitor)
		{
			this.pageContext = pageContext;
			this.valueVisitor = valueVisitor;
		}

		public IElement Visit(ImportOptions options)
		{
			string importText = "";
			var path = pageContext[options.IsFromSpecified
				? options.FromDestination : options.ElementName
			].ToString();
			if(string.IsNullOrWhiteSpace(path))
			{
				throw new System.ArgumentNullException(
					nameof(options),
					$"Cannot find value ({(options.IsFromSpecified ? options.FromDestination : options.ElementName)}) in page context"
				);
			}

			bool takeCertainElement = false;
			if(!path.EndsWith(".jlml"))
			{
				if(!options.IsFromSpecified)
					path = path + ".jlml";
				else if(options.ElementName.EndsWith(".jlml"))
					path = path + options.ElementName;
				else
					path = path + options.ElementName + ".jlml";
			}
			else {
				takeCertainElement = true;
			}
			if(File.Exists(path))
				importText = File.ReadAllText(path);
			else
			{
				HttpClient client = new HttpClient();
				try {
					var resource = client.GetStringAsync(path).GetAwaiter().GetResult();

					if (!string.IsNullOrWhiteSpace(resource))
						importText = resource;
				}
				catch(Exception ex) { }
			}

			try {
				JLMLDocument document = JLMLDocumentLoader.Load(importText);
				if(!takeCertainElement) return document.FirstOrDefault();
				return document.FirstOrDefault(options.ElementName);
			}
			catch(System.Exception ex)
			{
				System.Console.WriteLine(ex.Message);
			}

			return null;
		}

		public IElement Visit(ConditionalOptions options)
		{
			Type objectType = null;
			string compareToString = string.Empty;
			if(options.CompareToTokens is ConcatValue concat)
			{
				objectType = typeof(string);
				compareToString = valueVisitor.Visit(concat);
			}
			else if(options.CompareToTokens is DataValue data)
			{
				objectType = data.DataType;
				compareToString = data.Value.ToString();
			}

			string castedProperty =
				objectType == typeof(int) ? $"(int){options.Property}"
				: objectType == typeof(bool) ? $"(bool){options.Property}"
				: $"{options.Property}.ToString()";

			string conditionString = $"(page, parent) => {castedProperty} {options.CompareTokens} {compareToString}";

			var scriptOptions = ScriptOptions.Default.AddReferences(typeof(PageContext).Assembly).AddImports("System", "JLML.Contexts");
			var condition = CSharpScript.EvaluateAsync<Func<PageContext, ElementContext, bool>>(conditionString, scriptOptions).GetAwaiter().GetResult();

			if(condition(pageContext, options.Element.Current))
				return options.Element;
			return null;
		}
	}
}