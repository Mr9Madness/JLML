﻿using System.Collections.Generic;
using System.Linq;
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
		}

		public string Identifier { get; init; }

		public ICollection<IValue> Attributes { get; init; }
		public ICollection<IElement> Children { get; init; }

		// Options when element has import
		public ImportOptions ImportOptions { get; set; } = null;

		public ConditionalOptions ConditionalOptions { get; set; } = null;

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
	}
}
