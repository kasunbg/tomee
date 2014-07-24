/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tomee.jul.formatter.log;

import org.apache.juli.logging.Log;

public class NoopLogger implements Log {
    public static final NoopLogger INSTANCE = new NoopLogger();

    private NoopLogger() {
        // no-op
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isErrorEnabled() {
        return false;
    }

    @Override
    public boolean isFatalEnabled() {
        return false;
    }

    @Override
    public boolean isInfoEnabled() {
        return false;
    }

    @Override
    public boolean isTraceEnabled() {
        return false;
    }

    @Override
    public boolean isWarnEnabled() {
        return false;
    }

    @Override
    public void trace(final Object message) {
        // no-op
    }

    @Override
    public void trace(final Object message, final Throwable t) {
        // no-op
    }

    @Override
    public void debug(final Object message) {
        // no-op
    }

    @Override
    public void debug(final Object message, final Throwable t) {
        // no-op
    }

    @Override
    public void info(final Object message) {
        // no-op
    }

    @Override
    public void info(final Object message, final Throwable t) {
        // no-op
    }

    @Override
    public void warn(final Object message) {
        // no-op
    }

    @Override
    public void warn(final Object message, final Throwable t) {
        // no-op
    }

    @Override
    public void error(final Object message) {
        // no-op
    }

    @Override
    public void error(final Object message, final Throwable t) {
        // no-op
    }

    @Override
    public void fatal(final Object message) {
        // no-op
    }

    @Override
    public void fatal(final Object message, final Throwable t) {
        // no-op
    }
}
