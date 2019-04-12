/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench;

import info.mdhs.monkeywrench.api.IMonkeyWrench;
import info.mdhs.monkeywrench.api.wrench.IWrenchRegistry;
import info.mdhs.monkeywrench.wrench.WrenchRegistry;

import java.lang.instrument.Instrumentation;

public class MonkeyWrenchAgent implements IMonkeyWrench
{
    private  IWrenchRegistry registry = new WrenchRegistry();

    public static void premain(String[] args, Instrumentation instrumentation)
    {

    }

        @Override
        public IWrenchRegistry getWrenchRegistry ()
        {
            return null;
        }
}
