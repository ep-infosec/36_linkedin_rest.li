/*
   Copyright (c) 2016 LinkedIn Corp.

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

package com.linkedin.restli.common.attachments;


/**
 * Callback representing various methods which are invoked as potential data sources are iterated through from a
 * {@link com.linkedin.restli.common.attachments.RestLiDataSourceIterator}
 *
 * @author Karim Vidhani
 */
public interface RestLiDataSourceIteratorCallback
{
  /**
   * Invoked when a new data source is available for consumption. This data source will be invoked via the standard
   * {@link com.linkedin.r2.message.stream.entitystream.Writer} APIs to produce data to write to the
   * {@link com.linkedin.r2.message.stream.entitystream.WriteHandle}.
   *
   * @param dataSourceWriter the data source which can write/produce data.
   */
  public void onNewDataSourceWriter(final RestLiAttachmentDataSourceWriter dataSourceWriter);

  /**
   * Invoked when all data sources represented by this {@link com.linkedin.restli.common.attachments.RestLiDataSourceIterator}
   * have finished.
   */
  public void onFinished();

  /**
   * Invoked when all data sources represented by this {@link com.linkedin.restli.common.attachments.RestLiDataSourceIterator}
   * have finished being abandoned.
   */
  public void onAbandonComplete();

  /**
   * Invoked when there was a problem producing the next data source.
   *
   * @param throwable the Throwable that caused this to happen.
   */
  public void onStreamError(Throwable throwable);
}
