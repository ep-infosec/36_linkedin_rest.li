/*
 * Copyright (c) 2017 LinkedIn Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.linkedin.restli.server.resources.unstructuredData;


import com.linkedin.parseq.promise.Promise;
import com.linkedin.restli.server.RoutingException;
import com.linkedin.restli.server.UnstructuredDataWriter;
import com.linkedin.restli.server.annotations.UnstructuredDataWriterParam;
import com.linkedin.restli.server.resources.BaseResource;


/**
 * @deprecated Use {@link UnstructuredDataCollectionResourceTask} instead.
 * A version of {@link UnstructuredDataCollectionResource} with {@link Promise} async interface
 */
@Deprecated
public interface UnstructuredDataCollectionResourcePromise<K> extends BaseResource, KeyUnstructuredDataResource<K>
{
  default Promise<Void> get(K key, @UnstructuredDataWriterParam UnstructuredDataWriter writer)
  {
    throw new RoutingException("'get' is not implemented", 400);
  }
}
