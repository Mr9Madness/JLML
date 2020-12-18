using JLML.Objects;

namespace JLML
{
    public interface IScriptable
    {
        public string ToScript(BaseScript value);
    }
}
