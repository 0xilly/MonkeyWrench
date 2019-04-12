package info.mdhs.monkeywrench.api.accesss;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AccessTransform
{
    enum Access {PUBLIC, PRIVATE, PROTECTED}

    Access value();
}
