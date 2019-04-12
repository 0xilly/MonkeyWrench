/*
 * Copyright (c) 2019. Anthony Anderson
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 */

package info.mdhs.monkeywrench.instrument.canidate;

import info.mdhs.monkeywrench.api.accesss.AccessTransform.Access;
import javassist.bytecode.analysis.Type;

public interface IFieldCandidate
{

    String getName();

    Type getType();

    boolean isStatic();

    boolean isFinal();

    Access getAccess();
}
