package info.mdhs.monkeywrench.instrument.wrench;

import info.mdhs.monkeywrench.api.IWrench;

public class Wrench implements IWrench
{
    private Class wrench;

    private Class target;

    public Wrench(Class wrench, Class target)
    {
        this.wrench = wrench;
        this.target = target;
    }

    public Class getWrench()
    {
        return this.wrench;
    }

    @Override
    public Class getTarget()
    {
        return null;
    }

//    public CtClass getTarget()
//    {
//        return this.target;
//    }
}
