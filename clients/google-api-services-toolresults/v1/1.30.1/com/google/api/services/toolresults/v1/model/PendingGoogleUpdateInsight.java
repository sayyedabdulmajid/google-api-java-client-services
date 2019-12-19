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

package com.google.api.services.toolresults.v1.model;

/**
 * This insight indicates that the hidden API usage originates from a Google-provided library. Users
 * need not take any action.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PendingGoogleUpdateInsight extends com.google.api.client.json.GenericJson {

  /**
   * The name of the Google-provided library with the non-SDK API dependency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nameOfGoogleLibrary;

  /**
   * The name of the Google-provided library with the non-SDK API dependency.
   * @return value or {@code null} for none
   */
  public java.lang.String getNameOfGoogleLibrary() {
    return nameOfGoogleLibrary;
  }

  /**
   * The name of the Google-provided library with the non-SDK API dependency.
   * @param nameOfGoogleLibrary nameOfGoogleLibrary or {@code null} for none
   */
  public PendingGoogleUpdateInsight setNameOfGoogleLibrary(java.lang.String nameOfGoogleLibrary) {
    this.nameOfGoogleLibrary = nameOfGoogleLibrary;
    return this;
  }

  @Override
  public PendingGoogleUpdateInsight set(String fieldName, Object value) {
    return (PendingGoogleUpdateInsight) super.set(fieldName, value);
  }

  @Override
  public PendingGoogleUpdateInsight clone() {
    return (PendingGoogleUpdateInsight) super.clone();
  }

}
