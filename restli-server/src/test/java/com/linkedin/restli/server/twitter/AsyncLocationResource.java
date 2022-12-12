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

package com.linkedin.restli.server.twitter;


import com.linkedin.common.callback.Callback;
import com.linkedin.restli.common.PatchRequest;
import com.linkedin.restli.server.UpdateResponse;
import com.linkedin.restli.server.annotations.CallbackParam;
import com.linkedin.restli.server.annotations.RestLiSimpleResource;
import com.linkedin.restli.server.resources.SimpleResourceAsyncTemplate;
import com.linkedin.restli.server.twitter.TwitterTestDataModels.Location;


/**
 * Simple resource that contains the location of a status.
 */
@RestLiSimpleResource(name="asynclocation", parent=AsyncStatusCollectionResource.class)
public class AsyncLocationResource extends SimpleResourceAsyncTemplate<Location>
{
  /**
   * Gets the location of the parent status.
   */
  @Override
  public void get(@CallbackParam final Callback<Location> callback)
  {
    callback.onSuccess(null);
  }

  /**
   * Updates the location of the parent status.
   */
  @Override
  public void update(final Location entity, @CallbackParam final Callback<UpdateResponse> callback)
  {
    callback.onSuccess(null);
  }

  /**
   * Updates the location of the parent status.
   */
  @Override
  public void update(final PatchRequest<Location> patch, @CallbackParam final Callback<UpdateResponse> callback)
  {
    callback.onSuccess(null);
  }

  /**
   * Deletes the location of the parent status.
   */
  @Override
  public void delete(@CallbackParam final Callback<UpdateResponse> callback)
  {
    callback.onSuccess(null);
  }
}
