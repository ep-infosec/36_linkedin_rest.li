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

package com.linkedin.restli.examples;


import com.linkedin.restli.client.ProtocolVersionOption;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.RestliRequestOptionsBuilder;


public interface TestConstants
{
  String TESTNG_GROUP_NOT_IMPLEMENTED = "not_implemented";

  static final RestliRequestOptions FORCE_USE_NEXT_OPTIONS =
      new RestliRequestOptionsBuilder().setProtocolVersionOption(ProtocolVersionOption.FORCE_USE_NEXT).build();
}
