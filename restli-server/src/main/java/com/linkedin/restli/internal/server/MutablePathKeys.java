/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

/**
 * $Id: $
 */

package com.linkedin.restli.internal.server;


import com.linkedin.restli.server.PathKeys;

import java.util.Set;


/**
 * @author Josh Walker
 * @version $Revision: $
 */

public interface MutablePathKeys extends PathKeys
{

  /**
   * Append a value to the path keys collection.
   *
   * @param key key name
   * @param value key value
   * @return this
   */
  MutablePathKeys append(String key, Object value);

  /**
   * Set a set of batch keys.
   *
   * @param batchKeys batch keys to be set
   * @return this
   */
  MutablePathKeys setBatchKeys(Set<Object> batchKeys);
}
