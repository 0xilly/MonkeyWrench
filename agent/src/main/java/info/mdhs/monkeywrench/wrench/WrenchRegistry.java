/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.wrench;

import info.mdhs.monkeywrench.api.wrench.IWrench;
import info.mdhs.monkeywrench.api.wrench.IWrenchRegistry;

import java.util.HashSet;
import java.util.Set;

public class WrenchRegistry implements IWrenchRegistry
{
    private Set<IWrench> wrenches;

    public WrenchRegistry()
    {
        wrenches = new HashSet<>();
    }

    @Override
    public Set<IWrench> getWrenchRegistry()
    {
        return this.wrenches;
    }

    @Override
    public void registerWrench(IWrench wrench)
    {
        wrenches.add(wrench);
    }
}
