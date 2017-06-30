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

package com.gs.tablasco.results.parser;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.text.ParseException;

public class SectionReaderState extends ParserState
{
    protected SectionReaderState(ExpectedResultsParser parserState)
    {
        super(parserState);
    }

    @Override
    public ParserState parse(StreamTokenizer st) throws IOException, ParseException
    {
        int token = st.ttype;
        if (token != StreamTokenizer.TT_WORD || !st.sval.equals(ExpectedResultsParser.SECTION_IDENTIFIER))
        {
            throw new ParseException("expected line " + st.lineno() + " to begin with Section", st.lineno());
        }
        token = st.nextToken();
        if (token != StreamTokenizer.TT_WORD && token != '"')
        {
            throw new ParseException("expected a section name on line " + st.lineno(), st.lineno());
        }
        String testName = st.sval;

        token = st.nextToken();
        String tableName = null;
        if (token == StreamTokenizer.TT_WORD || token == '"')
        {
            tableName = st.sval;
            token = st.nextToken();
        }

        this.getParser().startNewSection(testName, tableName);

        if (token != StreamTokenizer.TT_EOL)
        {
            throw new ParseException("invalid data after the class name on line " + st.lineno(), st.lineno());
        }

        return this.getParser().getHeaderState();
    }
}
