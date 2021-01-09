using System.Collections.Generic;

namespace JLML.Contexts
{
	public class PageContext
	{
		private Dictionary<string, object> props;

		public PageContext()
		{
			props = new Dictionary<string, object>
			{
				{ "Width", 1920 }
			};
		}

#nullable enable
		public object? this[string name]
		{
			get {
				if(!props.ContainsKey(name)) return null;
				return props.GetValueOrDefault(name);
			}
			set {
				if (!props.ContainsKey(name)) return;
				var val = props.GetValueOrDefault(name);

				if(val == null) return;
				props[name] = value?.ToString();
			}
		}

		public void AddRange(Dictionary<string, string> objects)
		{
			foreach (var item in objects)
			{
				props.Add(item.Key, item.Value);
			}
		}
	}
}
