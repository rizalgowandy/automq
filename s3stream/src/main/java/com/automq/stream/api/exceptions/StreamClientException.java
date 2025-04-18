/*
 * Copyright 2025, AutoMQ HK Limited.
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.automq.stream.api.exceptions;

/**
 * All stream client exceptions will list extends StreamClientException and list here.
 */
public class StreamClientException extends RuntimeException {
    private final int code;

    public StreamClientException(int code, String str) {
        this(code, str, null);
    }

    public StreamClientException(int code, String str, Throwable e) {
        super("code: " + code + ", " + str, e);
        this.code = code;
    }

    public StreamClientException(int code, String str, boolean writableStackTrace) {
        super("code: " + code + ", " + str, null, false, writableStackTrace);
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
