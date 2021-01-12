using System.Linq;

namespace JLML.Objects.Elements
{
	public static class ElementExtensions
	{
		/// <summary>
		/// Get first child in element
		/// </summary>
		public static IElement FirstOrDefault(this IElement element)
		{
			foreach (var item in element.Children)
			{
				return item;
			}

			return default(NamedElement);
		}

		/// <summary>
		/// Breadth first search though the element tree starting at the given element
		/// Breadth first search is used because the tree can be very deep
		/// </summary>
		public static NamedElement FirstOrDefault(this IElement element, string name)
		{
			if(element is NamedElement named && named.Identifier == name) return named;
			foreach (var item in element.Children)
			{
				if(item is not NamedElement el) continue;

				if(el.Identifier == name) return el;
			}

			// FIXME: Breadth first search implementation is not good
			foreach (var item in element.Children)
			{
				if (item is not NamedElement el) continue;

				if (el.Children.Any())
				{
					var childEl = el.FirstOrDefault(name);
					if (childEl != default(NamedElement)) return childEl;
				}
			}

			return default(NamedElement);
		}
	}
}

namespace JLML.Objects.Values
{
	public static class ValueExtensions
	{
		public static string GetTextValue(this Antlr4.Runtime.Tree.IParseTree tree) => tree.GetText().Replace("\"", "");
	}
}


//			o
//		o		o
//	o	o	o
