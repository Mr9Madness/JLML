using System;
using System.Collections.Generic;
using JLML.Contexts;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public interface IElement : ICloneable
	{
		public ElementContext Current { get; set; }

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		public string Accept(IElementVisitor<string> visitor);
	}

	public interface IElementOptions : IElement, ICloneable
	{
		#nullable enable

		// Options when element has import
		public ImportOptions? ImportOptions { get; set; }

		// Options when element has a condition
		public ConditionalOptions? ConditionalOptions { get; set; }

		// Options when element has a condition
		public LoopOptions? LoopOptions { get; set; }

		public void LoadImport(IElement importedElement);
	}
}