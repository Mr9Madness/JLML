using System.Collections.Generic;

namespace JLML.Contexts
{
	public class PageContext
	{
		private Page page;

		public PageContext(Page page)
		{
			this.page = page;
		}

#nullable enable
		public object? this[string name]
		{
			get {
				var prop = typeof(Page).GetProperty(name, System.Reflection.BindingFlags.IgnoreCase);
				return prop?.GetValue(page);
			}
			set {
				var prop = typeof(Page).GetProperty(name, System.Reflection.BindingFlags.IgnoreCase);
				var val = prop?.GetValue(page);

				if(prop == null || val == null) return;
				prop.SetValue(page, value);
			}
		}
	}
	public class Page
	{
		public int Width { get; set; }
	}
}
