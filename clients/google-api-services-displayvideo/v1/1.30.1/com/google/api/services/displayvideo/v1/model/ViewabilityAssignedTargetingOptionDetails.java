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
 * Assigned viewability targeting option details. This will be populated in the details field of an
 * AssignedTargetingOption when targeting_type is `TARGETING_TYPE_VIEWABILITY`.
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
public final class ViewabilityAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY`
   * (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * Output only. The predicted viewability percentage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String viewability;

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY`
   * (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option).
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY`
   * (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option).
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public ViewabilityAssignedTargetingOptionDetails setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  /**
   * Output only. The predicted viewability percentage.
   * @return value or {@code null} for none
   */
  public java.lang.String getViewability() {
    return viewability;
  }

  /**
   * Output only. The predicted viewability percentage.
   * @param viewability viewability or {@code null} for none
   */
  public ViewabilityAssignedTargetingOptionDetails setViewability(java.lang.String viewability) {
    this.viewability = viewability;
    return this;
  }

  @Override
  public ViewabilityAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (ViewabilityAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public ViewabilityAssignedTargetingOptionDetails clone() {
    return (ViewabilityAssignedTargetingOptionDetails) super.clone();
  }

}
