/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.javassist;

import info.mdhs.monkeywrench.common.ApiServiceLoader;

import java.lang.instrument.Instrumentation;

public class MWJavassistAgent
{

    private static ApiServiceLoader serviceLoader;

    public static void premain(String[] args, Instrumentation instrumentation)
    {
        serviceLoader = new ApiServiceLoader();
    }
}
