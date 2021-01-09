using System;
using System.Text;
using JLML.Contexts;
using JLML.Html.Visitors;
using JLML.Objects;

namespace JLML.Html.Transpiler
{
	public class HtmlTranspiler : IScriptable
	{
		public string ToScript(JLMLDocument value)
		{
			PageContext context = new PageContext();
			ElementVisitor visitor = new ElementVisitor(context);
			return value.Accept(visitor);
		}
	}
}
