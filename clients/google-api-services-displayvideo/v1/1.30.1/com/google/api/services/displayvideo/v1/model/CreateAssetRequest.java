/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.displayvideo.v1.model;

/**
 * A request message for CreateAsset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CreateAssetRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The filename of the asset, including the file extension.
   *
   * The filename must be UTF-8 encoded with a maximum size of 240 bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * Required. The filename of the asset, including the file extension.
   *
   * The filename must be UTF-8 encoded with a maximum size of 240 bytes.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * Required. The filename of the asset, including the file extension.
   *
   * The filename must be UTF-8 encoded with a maximum size of 240 bytes.
   * @param filename filename or {@code null} for none
   */
  public CreateAssetRequest setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  @Override
  public CreateAssetRequest set(String fieldName, Object value) {
    return (CreateAssetRequest) super.set(fieldName, value);
  }

  @Override
  public CreateAssetRequest clone() {
    return (CreateAssetRequest) super.clone();
  }

}
