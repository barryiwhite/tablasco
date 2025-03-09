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

package com.gs.tablasco.files;

/**
 * A {@link FilenameStrategy} that returns a different filename for each test in a class. The filename is constructed
 * using the simple class name of the test plus the method name and file extension.
 */
public class FilePerMethodStrategy implements FilenameStrategy {
    @Override
    public String getExpectedFilename(Class<?> testClass, String methodName) {
        return testClass.getSimpleName() + '_' + methodName + ".txt";
    }

    @Override
    public String getOutputFilename(Class<?> testClass, String methodName) {
        return testClass.getSimpleName() + '_' + methodName + ".html";
    }

    @Override
    public String getActualFilename(Class<?> testClass, String methodName) {
        return testClass.getSimpleName() + '_' + methodName + ".txt";
    }
}
