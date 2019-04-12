package info.mdhs.monkeywrench.instrument.wrench;

import com.google.common.collect.ImmutableSet;
import info.mdhs.monkeywrench.api.IWrench;
import info.mdhs.monkeywrench.api.MonkeyWrench;
import info.mdhs.monkeywrench.exception.NoWrenchException;

import javassist.ClassPool;

import java.util.HashSet;
import java.util.Set;

public class WrenchRegistry
{
    private Set<IWrench> wrenches;
    private ClassPool pool = ClassPool.getDefault();

    public WrenchRegistry()
    {
        wrenches = new HashSet<>();
    }

    //TODO handle inner classes
    public void registerWrench(Object object)
    {
        if (object.getClass().isAnnotationPresent(MonkeyWrench.class)) {
            //                var wrench = pool.get(object.getClass());
//                var annoTarget = object.getClass().getAnnotation(MonkeyWrenchAgent.class);
//                var target = pool.get(annoTarget.value().getName());

//                wrenches.add(new Wrench(wrench, target));
        } else {
            try
            {
                throw new NoWrenchException("Class must have the @MonkeyWrenchAgent annotation");
            } catch (NoWrenchException e)
            {
                e.printStackTrace();
            }
        }
    }

    public Set<IWrench> getWrenches()
    {
        return ImmutableSet.copyOf(this.wrenches);
    }

}
