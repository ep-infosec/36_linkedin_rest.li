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

package com.linkedin.restli.restspec;


import com.linkedin.restli.common.HttpStatus;
import com.linkedin.restli.examples.MockRecord;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.annotations.RestMethod;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;


/**
 * @author Keren Jin
 */
@RestLiCollection(name = "testAnnotationSub",
                  namespace = "com.linkedin.restli.restspec",
                  parent = TestAnnotationResource.class)
@EmptyAnnotation
public class TestAnnotationSubresource extends CollectionResourceTemplate<Long, MockRecord>
{
  @RestMethod.Delete
  @PartialInclusiveAnnotation(used = 1, unused = "this value is ununsed")
  public UpdateResponse delete(Long key)
  {
    return new UpdateResponse(HttpStatus.S_204_NO_CONTENT);
  }
}
