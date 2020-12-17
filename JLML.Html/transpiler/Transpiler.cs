using System;
using System.Text;
using JLML.Html.Visitors;
using JLML.Values;

namespace JLML.Html.Transpiler
{
	public class HtmlTranspiler : IScriptable
	{
		public string ToScript(BaseScript value)
		{
			ValueVisitor visitor = new ValueVisitor();
			return value.Accept(visitor);
		}
	}
}
