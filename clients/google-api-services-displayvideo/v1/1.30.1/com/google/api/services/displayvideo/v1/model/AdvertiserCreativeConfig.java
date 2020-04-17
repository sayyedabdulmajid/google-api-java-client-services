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
 * Creatives related settings of an advertiser.
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
public final class AdvertiserCreativeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dynamicCreativeEnabled;

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long iasClientId;

  /**
   * Whether or not to use DV360's Online Behavioral Advertising (OBA) compliance.
   *
   * Warning: Changing OBA settings may cause the audit status of your creatives to be reset by some
   * ad exchanges, making them ineligible to serve until they are re-approved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean obaComplianceDisabled;

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns.
   *
   * Applicable only when the advertiser has a CM hybrid ad server configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean videoCreativeDataSharingAuthorized;

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDynamicCreativeEnabled() {
    return dynamicCreativeEnabled;
  }

  /**
   * Whether or not the advertiser is enabled for dynamic creatives.
   * @param dynamicCreativeEnabled dynamicCreativeEnabled or {@code null} for none
   */
  public AdvertiserCreativeConfig setDynamicCreativeEnabled(java.lang.Boolean dynamicCreativeEnabled) {
    this.dynamicCreativeEnabled = dynamicCreativeEnabled;
    return this;
  }

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * @return value or {@code null} for none
   */
  public java.lang.Long getIasClientId() {
    return iasClientId;
  }

  /**
   * An ID for configuring campaign monitoring provided by Integral Ad Service (IAS). The DV360
   * system will append an IAS "Campaign Monitor" tag containing this ID to the creative tag.
   * @param iasClientId iasClientId or {@code null} for none
   */
  public AdvertiserCreativeConfig setIasClientId(java.lang.Long iasClientId) {
    this.iasClientId = iasClientId;
    return this;
  }

  /**
   * Whether or not to use DV360's Online Behavioral Advertising (OBA) compliance.
   *
   * Warning: Changing OBA settings may cause the audit status of your creatives to be reset by some
   * ad exchanges, making them ineligible to serve until they are re-approved.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getObaComplianceDisabled() {
    return obaComplianceDisabled;
  }

  /**
   * Whether or not to use DV360's Online Behavioral Advertising (OBA) compliance.
   *
   * Warning: Changing OBA settings may cause the audit status of your creatives to be reset by some
   * ad exchanges, making them ineligible to serve until they are re-approved.
   * @param obaComplianceDisabled obaComplianceDisabled or {@code null} for none
   */
  public AdvertiserCreativeConfig setObaComplianceDisabled(java.lang.Boolean obaComplianceDisabled) {
    this.obaComplianceDisabled = obaComplianceDisabled;
    return this;
  }

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns.
   *
   * Applicable only when the advertiser has a CM hybrid ad server configuration.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVideoCreativeDataSharingAuthorized() {
    return videoCreativeDataSharingAuthorized;
  }

  /**
   * By setting this field to `true`, you, on behalf of your company, authorize Google to use video
   * creatives associated with this Display & Video 360 advertiser to provide reporting and features
   * related to the advertiser's television campaigns.
   *
   * Applicable only when the advertiser has a CM hybrid ad server configuration.
   * @param videoCreativeDataSharingAuthorized videoCreativeDataSharingAuthorized or {@code null} for none
   */
  public AdvertiserCreativeConfig setVideoCreativeDataSharingAuthorized(java.lang.Boolean videoCreativeDataSharingAuthorized) {
    this.videoCreativeDataSharingAuthorized = videoCreativeDataSharingAuthorized;
    return this;
  }

  @Override
  public AdvertiserCreativeConfig set(String fieldName, Object value) {
    return (AdvertiserCreativeConfig) super.set(fieldName, value);
  }

  @Override
  public AdvertiserCreativeConfig clone() {
    return (AdvertiserCreativeConfig) super.clone();
  }

}
