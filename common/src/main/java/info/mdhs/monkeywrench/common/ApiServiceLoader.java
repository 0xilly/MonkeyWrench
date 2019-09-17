/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.common;

import info.mdhs.monkeywrench.api.IMonkeyService;
import info.mdhs.monkeywrench.api.annotation.markers.Bind;
import info.mdhs.monkeywrench.api.wrench.IWrenchRegistry;
import info.mdhs.monkeywrench.common.registry.MonkeyRegistry;

import java.util.Arrays;
import java.util.ServiceLoader;

public class ApiServiceLoader
{
    private ServiceLoader<IMonkeyService> wrenchServiceLoader;
    private IWrenchRegistry wrenchRegistry = new MonkeyRegistry();

    public ApiServiceLoader()
    {
        wrenchServiceLoader = ServiceLoader.load(IMonkeyService.class);

        wrenchServiceLoader.forEach(ws ->
        {
            var clazz = ws.getClass();

            Arrays.asList(clazz.getDeclaredFields()).forEach(field ->
            {
                if (field.isAnnotationPresent(Bind.class) && field.getType() == IWrenchRegistry.class)
                {
                    try
                    {
                        field.set(null, wrenchRegistry);
                    } catch (IllegalAccessException e)
                    {
                        e.printStackTrace();
                    }
                }
            });
        });
    }
}
