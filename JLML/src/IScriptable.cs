using JLML.Values;

namespace JLML
{
    public interface IScriptable
    {
        public string ToScript(BaseScript value);
    }
}
