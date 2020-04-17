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
 * A strategy that uses a fixed bidding price.
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
public final class FixedBidStrategy extends com.google.api.client.json.GenericJson {

  /**
   * The fixed bid amount, in micros of the advertiser's currency. For insertion order entity,
   * bid_amount_micros should be set as 0. For line item entity, bid_amount_micros must be greater
   * than or equal to billable unit of the given currency and smaller than or equal to the upper
   * limit 1000000000.
   *
   * For example, 1500000 represents 1.5 standard units of the currency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bidAmountMicros;

  /**
   * The fixed bid amount, in micros of the advertiser's currency. For insertion order entity,
   * bid_amount_micros should be set as 0. For line item entity, bid_amount_micros must be greater
   * than or equal to billable unit of the given currency and smaller than or equal to the upper
   * limit 1000000000.
   *
   * For example, 1500000 represents 1.5 standard units of the currency.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBidAmountMicros() {
    return bidAmountMicros;
  }

  /**
   * The fixed bid amount, in micros of the advertiser's currency. For insertion order entity,
   * bid_amount_micros should be set as 0. For line item entity, bid_amount_micros must be greater
   * than or equal to billable unit of the given currency and smaller than or equal to the upper
   * limit 1000000000.
   *
   * For example, 1500000 represents 1.5 standard units of the currency.
   * @param bidAmountMicros bidAmountMicros or {@code null} for none
   */
  public FixedBidStrategy setBidAmountMicros(java.lang.Long bidAmountMicros) {
    this.bidAmountMicros = bidAmountMicros;
    return this;
  }

  @Override
  public FixedBidStrategy set(String fieldName, Object value) {
    return (FixedBidStrategy) super.set(fieldName, value);
  }

  @Override
  public FixedBidStrategy clone() {
    return (FixedBidStrategy) super.clone();
  }

}
