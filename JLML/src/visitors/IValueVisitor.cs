using JLML.Values;

namespace JLML.Visitors
{
	public interface IValueVisitor<T>
	{
		public T Visit(CalculatedValue value);

		public T Visit(DataValue value);

		public T Visit(ImportValue value);

		public T Visit(ObjectValue value);

		public T Visit(ReferenceValue value);

		public T Visit(BaseScript value);

		public T Visit(Value value);
	}
}