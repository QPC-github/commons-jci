/*
 * Copyright 1999-2004 The Apache Software Foundation.
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
package org.apache.commons.jci.stores;


/**
 * @author tcurdt
 *
 */
public final class FileResourceStore implements ResourceStore {

    public byte[] read( final String resourceName ) {
        throw new RuntimeException("NYI");
    }
    public void write( final String resourceName, final byte[] clazzData ) {
        throw new RuntimeException("NYI");
    }    
    public void remove( final String resourceName ) {
        throw new RuntimeException("NYI");
    }
}