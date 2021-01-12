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
				{ "width", 1920 }
			};
		}

#nullable enable
		public object? this[string name]
		{
			get {
				// All page properties have to be lower case to avoid null returns
				string lowerName = name.ToLower();

				if(!props.ContainsKey(lowerName)) return null;
				return props.GetValueOrDefault(lowerName);
			}
			set {
				// All page properties have to be lower case to avoid null returns
				string lowerName = name.ToLower();

				if (!props.ContainsKey(lowerName)) return;
				var val = props.GetValueOrDefault(lowerName);

				if(val == null) return;
				props[lowerName] = value?.ToString();
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
