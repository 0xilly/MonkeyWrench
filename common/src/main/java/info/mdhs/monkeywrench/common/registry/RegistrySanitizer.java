/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.common.registry;

import info.mdhs.monkeywrench.api.annotation.markers.MonkeyWrench;
import info.mdhs.monkeywrench.common.execption.NoSuchWrench;

import java.util.HashSet;
import java.util.Set;

public class RegistrySanitizer
{
    private Set<Object> unsanitized;
    private Set<Wrench> sanitized = new HashSet<>();

    public RegistrySanitizer(Set<Object> wrenchRegistry)
    {
        this.unsanitized = wrenchRegistry;
        sanitizeRegistry();
    }

    private void sanitizeRegistry()
    {
        this.unsanitized.forEach(un ->
        {
            var clazz = un.getClass();
            try {
                if (!clazz.isAnnotationPresent(MonkeyWrench.class))
                {
                    throw new NoSuchWrench(clazz);
                } else {
                    var mr = clazz.getAnnotation(MonkeyWrench.class);
                    sanitized.add(new Wrench(clazz, mr.value()));
                }
            } catch (NoSuchWrench e)
            {
                e.printStackTrace();
            }
        });
    }

    public Set<Wrench> getWrenches()
    {
        return sanitized;
    }
}
