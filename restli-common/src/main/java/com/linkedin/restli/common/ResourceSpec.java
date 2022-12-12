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

package com.linkedin.restli.common;


import com.linkedin.data.template.DynamicRecordMetadata;
import com.linkedin.data.template.RecordTemplate;
import java.util.Map;


/**
 * Runtime representation of resource spec.
 *
 * @author Eran Leshem
 */
public interface ResourceSpec extends ResourceProperties
{
  /**
   * @return the class of the key
   */
  Class<?> getKeyClass();

  /**
   * @return the RecordTemplate that the Resource Manages
   */
  Class<? extends RecordTemplate> getValueClass();

  /**
   * @return the map of key names to key classes, if the keyClass is a CompoundKey
   */
  Map<String, CompoundKey.TypeInfo> getKeyParts();

  /**
   * @return the key of the key, if the keyClass is a ComplexResourceKey
   */
  Class<? extends RecordTemplate> getKeyKeyClass();

  /**
   * @return the parameters of the key, if the keyClass is a ComplexResourceKey
   */
  Class<? extends RecordTemplate> getKeyParamsClass();

  /**
   * @param methodName the name of the method
   * @return the {@link DynamicRecordMetadata} of the method
   */
  public DynamicRecordMetadata getRequestMetadata(String methodName);

  /**
   * @param methodName the name of the method
   * @return the {@link DynamicRecordMetadata} of the Response
   */
  public DynamicRecordMetadata getActionResponseMetadata(String methodName);
}
