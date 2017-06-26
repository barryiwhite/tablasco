/*
 * Copyright 2017 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.gs.tablasco;

import org.eclipse.collections.impl.factory.Maps;
import org.junit.Rule;
import org.junit.Test;

import java.util.Map;

public class NoExpectedResultsTest
{
    @Rule
    public final TableVerifier verifier = new TableVerifier()
            .withMavenDirectoryStrategy();

    @Test
    public void asynchronousResultsLoadingOnlyFailsIfResultsAreRequired()
    {
        Map<String, VerifiableTable> tables = Maps.fixedSize.of(TableTestUtils.TABLE_NAME, TableTestUtils.ACTUAL);
        this.verifier.verify(tables, tables);
    }
}
