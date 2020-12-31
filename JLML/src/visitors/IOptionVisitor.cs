using JLML.Objects.Options;

namespace JLML.Visitors
{
	public interface IOptionVisitor<T>
	{
		public T Visit(ConditionalOptions value);

		public T Visit(ImportOptions value);

		public T Visit(LoopOptions value);
	}
}
