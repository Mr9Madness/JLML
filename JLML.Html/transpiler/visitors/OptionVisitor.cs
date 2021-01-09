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
				catch(System.InvalidOperationException) { }
			}

			JLMLDocument document = JLMLDocumentLoader.Load(importText);

			if(!takeCertainElement) return document;
			return document.FirstOrDefault(options.ElementName);
		}

		public IElement Visit(ConditionalOptions options)
		{
			string compareToString = string.Empty;
			if(options.CompareToTokens is ConcatValue concat)
				compareToString = valueVisitor.Visit(concat);
			else if(options.CompareToTokens is DataValue data)
				compareToString = valueVisitor.Visit(data);

			string conditionString = $"(page, parent) => {options.Property} {options.CompareTokens} {compareToString}";

			var condition = CSharpScript.EvaluateAsync<Func<PageContext, ElementContext, bool>>(conditionString).GetAwaiter().GetResult();

			if(condition(pageContext, options.Element.Current))
				return options.Element;
			return null;
		}
	}
}