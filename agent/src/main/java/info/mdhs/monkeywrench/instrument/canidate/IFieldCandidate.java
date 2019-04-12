package info.mdhs.monkeywrench.instrument.canidate;

import info.mdhs.monkeywrench.api.accesss.AccessTransform.Access;
import javassist.bytecode.analysis.Type;

public interface IFieldCandidate
{

    String getName();

    Type getType();

    boolean isStatic();

    boolean isFinal();

    Access getAccess();
}
