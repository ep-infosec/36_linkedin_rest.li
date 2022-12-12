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

/* $Id$ */
package com.linkedin.r2.sample.echo;

import com.linkedin.common.callback.Callback;

/**
 * @author Chris Pettitt
 * @version $Revision$
 */
public class ThrowingEchoService implements EchoService
{
  @Override
  public void echo(String msg, Callback<String> callback)
  {
    throw new RuntimeException("service failure");
  }
}
