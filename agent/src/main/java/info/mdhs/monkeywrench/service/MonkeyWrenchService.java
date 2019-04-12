/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.service;

import info.mdhs.monkeywrench.api.IMonkeyWrench;
import info.mdhs.monkeywrench.api.wrench.IWrench;

import java.util.HashSet;
import java.util.ServiceLoader;
import java.util.Set;

public class MonkeyWrenchService
{
    private ServiceLoader<IMonkeyWrench> wrenchServiceLoader;
    private Set<IWrench> wenches;

    public MonkeyWrenchService()
    {
        wenches = new HashSet<>();
        wrenchServiceLoader = ServiceLoader.load(IMonkeyWrench.class);

    }
}
