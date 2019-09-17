/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.common.execption;

public class EmptyWrenchField extends Exception
{
    public EmptyWrenchField(Class clazz)
    {
        super(clazz + ": @MonkeyWrench value is empty");
    }
}
