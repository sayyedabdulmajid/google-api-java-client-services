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
 * A warning that the screen hierarchy is deeper than the recommended threshold.
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
public final class UIElementTooDeep extends com.google.api.client.json.GenericJson {

  /**
   * The depth of the screen element
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer depth;

  /**
   * The screen id of the element
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String screenId;

  /**
   * The screen state id of the element
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String screenStateId;

  /**
   * The depth of the screen element
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDepth() {
    return depth;
  }

  /**
   * The depth of the screen element
   * @param depth depth or {@code null} for none
   */
  public UIElementTooDeep setDepth(java.lang.Integer depth) {
    this.depth = depth;
    return this;
  }

  /**
   * The screen id of the element
   * @return value or {@code null} for none
   */
  public java.lang.String getScreenId() {
    return screenId;
  }

  /**
   * The screen id of the element
   * @param screenId screenId or {@code null} for none
   */
  public UIElementTooDeep setScreenId(java.lang.String screenId) {
    this.screenId = screenId;
    return this;
  }

  /**
   * The screen state id of the element
   * @return value or {@code null} for none
   */
  public java.lang.String getScreenStateId() {
    return screenStateId;
  }

  /**
   * The screen state id of the element
   * @param screenStateId screenStateId or {@code null} for none
   */
  public UIElementTooDeep setScreenStateId(java.lang.String screenStateId) {
    this.screenStateId = screenStateId;
    return this;
  }

  @Override
  public UIElementTooDeep set(String fieldName, Object value) {
    return (UIElementTooDeep) super.set(fieldName, value);
  }

  @Override
  public UIElementTooDeep clone() {
    return (UIElementTooDeep) super.clone();
  }

}
