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

package com.linkedin.restli.examples.greetings.server;


import com.linkedin.data.ByteString;
import com.linkedin.restli.examples.custom.types.CustomLong;
import com.linkedin.restli.examples.greetings.api.Greeting;
import com.linkedin.restli.examples.typeref.api.BytesRef;
import com.linkedin.restli.examples.typeref.api.CalendarRef;
import com.linkedin.restli.examples.typeref.api.CustomLongRef;
import com.linkedin.restli.examples.typeref.api.DateRef;
import com.linkedin.restli.examples.typeref.api.IPAddressSimple;
import com.linkedin.restli.server.annotations.Action;
import com.linkedin.restli.server.annotations.ActionParam;
import com.linkedin.restli.server.annotations.Finder;
import com.linkedin.restli.server.annotations.QueryParam;
import com.linkedin.restli.server.annotations.RestLiCollection;
import com.linkedin.restli.server.resources.CollectionResourceTemplate;

import java.net.InetAddress;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;


/**
 * @author Moira Tagle
 * @version $Revision: $
 */
@RestLiCollection(name="customTypes",
                  namespace = "com.linkedin.restli.examples.greetings.client")
public class CustomTypesResource extends CollectionResourceTemplate<Long, Greeting>
{
  @Finder("customLong")
  public List<Greeting> customLong(@QueryParam(value="l", typeref=CustomLongRef.class) CustomLong l)
  {
    return Collections.emptyList();
  }

  @Finder("customLongArray")
  public List<Greeting> customLongArray(@QueryParam(value="ls", typeref=CustomLongRef.class) CustomLong[] ls)
  {
    return Collections.emptyList();
  }

  @Finder("date")
  public List<Greeting> date(@QueryParam(value="d", typeref=DateRef.class) Date d)
  {
    return Collections.emptyList();
  }

  @Finder("calendar")
  public List<Greeting> calendar(@QueryParam(value="calendar", typeref=CalendarRef.class) Calendar calendar)
  {
    return Collections.emptyList();
  }

  @Finder("ip")
  public List<Greeting> ip(@QueryParam(value="ip", typeref=IPAddressSimple.class) InetAddress ip)
  {
    return Collections.emptyList();
  }

  @Action(name="calendarAction")
  public int calendarAction(@ActionParam(value="calendar", typeref=CalendarRef.class) Calendar calendar)
  {
    return calendar.get(Calendar.YEAR);
  }

  @Finder("calendars")
  public List<Greeting> calendars(@QueryParam(value="calendars", typeref=CalendarRef.class) Calendar[] calendars)
  {
    return Collections.emptyList();
  }

  @Action(name="action")
  public long action(@ActionParam(value="l", typeref=CustomLongRef.class) CustomLong l)
  {
    return l.toLong();
  }

  @Action(name="arrayAction", returnTyperef=CustomLongRef.class)
  public CustomLong[] arrayAction(@ActionParam(value="ls", typeref=CustomLongRef.class) CustomLong[] ls)
  {
    return ls;
  }
}
