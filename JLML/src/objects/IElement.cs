using System.Collections.Generic;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public interface IElement
	{
		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		public string Accept(IElementVisitor<string> visitor);
	}

	public interface IElementOptions : IElement
	{
		// Options when element has import
		public ImportOptions ImportOptions { get; set; }

		// Options when element has a condition
		public ConditionalOptions ConditionalOptions { get; set; }

		public void LoadImport(IElement importedElement);
	}
}