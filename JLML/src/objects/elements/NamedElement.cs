﻿using System.Collections.Generic;
using System.Linq;
using JLML.Contexts;
using JLML.Objects.Options;
using JLML.Objects.Values;
using JLML.Visitors;

namespace JLML.Objects.Elements
{
	public class NamedElement : IElement, IElementOptions
	{
		public NamedElement()
		{
			Attributes = new List<IValue>();
			Children = new List<IElement>();
			Current = null;
		}

		public string Identifier { get; init; }

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

		public virtual void LoadImport(IElement importedElement)
		{
			if(importedElement == null) return;

			foreach (var child in importedElement.Children) Children.Add(child);

			foreach (var attr in importedElement.Attributes)
			{
				if (Attributes.Any(o => o.Attribute == attr.Attribute))
					continue;

				Attributes.Add(attr);
			}
		}


		public virtual string Accept(IElementVisitor<string> visitor)
		{
			return visitor.Visit(this);
		}

		public virtual object Clone()
		{
			var element = new NamedElement
			{
				Identifier = Identifier,
				Attributes = new List<IValue>(Attributes),
				Children = new List<IElement>(Children),
				ConditionalOptions = ConditionalOptions,
				ImportOptions = ImportOptions,
				LoopOptions = LoopOptions,
				Current = new ElementContext(Current),
			};

			foreach (var item in element.Attributes)
			{
				item.Element = element;
			}

			return element;
		}
	}
}
