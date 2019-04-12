package info.mdhs.monkeywrench.instrument.canidate;

import info.mdhs.monkeywrench.api.accesss.AccessTransform.Access;
import javassist.bytecode.analysis.Type;

public interface IMethodCandidate
{
    String getName();

    Type getReturnType();

    Access getAcess();
}
