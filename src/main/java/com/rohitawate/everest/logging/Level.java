/*
 * Copyright 2018 Rohit Awate.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.rohitawate.everest.logging;

public enum Level {
    SEVERE, WARNING, INFO;

    int getValue() {
        switch (this) {
            case SEVERE:
                return 3;
            case WARNING:
                return 2;
            default:
                return 1;
        }
    }

    boolean greaterThanEqualTo(Level level) {
        return this.getValue() >= level.getValue();
    }
}
