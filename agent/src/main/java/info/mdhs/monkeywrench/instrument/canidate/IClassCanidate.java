package info.mdhs.monkeywrench.instrument.canidate;

import info.mdhs.monkeywrench.api.accesss.AccessTransform.Access;

import java.util.Set;

public interface IClassCanidate
{
    String getName();

    String getPackage();

    Set<IFieldCandidate> getFeildCanidtates();

    Set<IMethodCandidate> getMethodCanidates();

    Access getAccess();

}
