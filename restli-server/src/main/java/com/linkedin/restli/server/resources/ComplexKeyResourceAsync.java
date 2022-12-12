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

package com.linkedin.restli.server.resources;

import com.linkedin.restli.server.BatchCreateRequest;
import com.linkedin.restli.server.BatchCreateResult;
import com.linkedin.restli.server.BatchDeleteRequest;
import com.linkedin.restli.server.BatchPatchRequest;
import com.linkedin.restli.server.BatchUpdateRequest;
import com.linkedin.restli.server.BatchUpdateResult;
import com.linkedin.restli.server.PagingContext;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.linkedin.common.callback.Callback;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.common.ComplexResourceKey;
import com.linkedin.restli.common.PatchRequest;
import com.linkedin.restli.server.CreateResponse;
import com.linkedin.restli.server.UpdateResponse;

public interface ComplexKeyResourceAsync<K extends RecordTemplate, P extends RecordTemplate, V extends RecordTemplate> extends
    BaseResource, KeyValueResource<ComplexResourceKey<K,P>, V>
{
  void get(ComplexResourceKey<K, P> key, Callback<V> callback);

  void create(V entity, Callback<CreateResponse> callback);

  void batchGet(Set<ComplexResourceKey<K, P>> ids, Callback<Map<ComplexResourceKey<K, P>, V>> callback);

  void batchCreate(BatchCreateRequest<ComplexResourceKey<K, P>, V> entities,
                   Callback<BatchCreateResult<ComplexResourceKey<K, P>, V>> callback);

  void batchUpdate(BatchUpdateRequest<ComplexResourceKey<K, P>, V> entities,
                   Callback<BatchUpdateResult<ComplexResourceKey<K, P>, V>> callback);

  void batchUpdate(BatchPatchRequest<ComplexResourceKey<K, P>, V> entities,
                   Callback<BatchUpdateResult<ComplexResourceKey<K, P>, V>> callback);

  void batchDelete(BatchDeleteRequest<ComplexResourceKey<K, P>, V> ids,
                   Callback<BatchUpdateResult<ComplexResourceKey<K, P>, V>> callback);

  void getAll(PagingContext ctx, Callback<List<V>> callback);

  void update(ComplexResourceKey<K, P> key, V entity, Callback<UpdateResponse> callback);

  void update(ComplexResourceKey<K, P> key, PatchRequest<V> patch, Callback<UpdateResponse> callback);

  void delete(ComplexResourceKey<K, P> key, Callback<UpdateResponse> callback);
}
