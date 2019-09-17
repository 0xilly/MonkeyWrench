/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.common.registry;

public class Wrench
{
    Class wrench;
    Class target;

    public Wrench(Class wrench, Class target)
    {
        this.wrench = wrench;
        this.target = target;
    }

    public Class getWrench()
    {
        return wrench;
    }

    public Class getTarget()
    {
        return target;
    }
}
