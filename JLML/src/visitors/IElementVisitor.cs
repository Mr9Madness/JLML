using JLML.Objects;
using JLML.Objects.Elements;

namespace JLML.Visitors
{
	public interface IElementVisitor<T>
	{
		public T Visit(BaseScript value);

		public T Visit(NamedElement value);

		public T Visit(SelectElement value);

		public T Visit(ImageElement value);

		public T Visit(InputElement value);

		public T Visit(OptionElement value);

		public T Visit(Element value);
	}
}
