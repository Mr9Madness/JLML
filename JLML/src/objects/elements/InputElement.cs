using System.Collections.Generic;
using System.Linq;
using JLML.Contexts;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public class InputElement : IElement, IElementOptions
	{
		public InputElement()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			Current = null;
		}

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }
		public ElementContext Current { get; set; }

#nullable enable

		// Options when element has import
		public ImportOptions? ImportOptions { get; set; } = null;

		// Options when element has a condition
		public ConditionalOptions? ConditionalOptions { get; set; } = null;

		// Options when element needs to loop
		public LoopOptions? LoopOptions { get; set; } = null;

		public void LoadImport(IElement importedElement)
		{
			foreach (var child in importedElement.Children) Children.Add(child);

			foreach (var attr in importedElement.Attributes)
			{
				if (Attributes.Any(o => o.Attribute == attr.Attribute))
					continue;

				Attributes.Add(attr);
			}
		}

		public string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}

		public object Clone()
		{
			return new InputElement
			{
				Attributes = Attributes,
				Children = Children,
				ConditionalOptions = ConditionalOptions,
				ImportOptions = ImportOptions,
				LoopOptions = LoopOptions,
				Current = Current,
			};
		}
	}
}
