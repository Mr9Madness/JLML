using System;
using System.Text;
using JLML.Html.Visitors;
using JLML.Objects;

namespace JLML.Html.Transpiler
{
	public class HtmlTranspiler : IScriptable
	{
		public string ToScript(BaseScript value)
		{
			ElementVisitor visitor = new ElementVisitor();
			return value.Accept(visitor);
		}
	}
}
