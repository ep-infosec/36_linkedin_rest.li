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

package com.linkedin.restli.internal.server.model;

import java.util.Map;

/**
 * Builds a RestApi model. Currently we only support configuration via anno-rest annotations. In
 * the future, we could support RESTSpec or convention-based configuration.
 *
 * @author dellamag
 */
public interface RestApiBuilder
{
  public Map<String, ResourceModel> build();
}
