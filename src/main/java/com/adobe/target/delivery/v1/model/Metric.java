/*
 * Copyright 2021 Adobe. All rights reserved.
 * This file is licensed to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may obtain a copy
 * of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 * OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 *
 * NOTE: This is an auto generated file. Do not edit directly.
 */
package com.adobe.target.delivery.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Metric */
@JsonPropertyOrder({
  Metric.JSON_PROPERTY_TYPE,
  Metric.JSON_PROPERTY_SELECTOR,
  Metric.JSON_PROPERTY_EVENT_TOKEN,
  Metric.JSON_PROPERTY_ANALYTICS
})
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-05-11T11:10:29.904-07:00[America/Los_Angeles]")
public class Metric {
  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricType type;

  public static final String JSON_PROPERTY_SELECTOR = "selector";
  private String selector;

  public static final String JSON_PROPERTY_EVENT_TOKEN = "eventToken";
  private String eventToken;

  public static final String JSON_PROPERTY_ANALYTICS = "analytics";
  private AnalyticsResponse analytics;

  public Metric type(MetricType type) {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricType getType() {
    return type;
  }

  public void setType(MetricType type) {
    this.type = type;
  }

  public Metric selector(String selector) {

    this.selector = selector;
    return this;
  }

  /**
   * The selector
   *
   * @return selector
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The selector")
  @JsonProperty(JSON_PROPERTY_SELECTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSelector() {
    return selector;
  }

  public void setSelector(String selector) {
    this.selector = selector;
  }

  public Metric eventToken(String eventToken) {

    this.eventToken = eventToken;
    return this;
  }

  /**
   * The event token that should be sent with the notifications in case the click occurred.
   *
   * @return eventToken
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The event token that should be sent with the notifications in case the click occurred.")
  @JsonProperty(JSON_PROPERTY_EVENT_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventToken() {
    return eventToken;
  }

  public void setEventToken(String eventToken) {
    this.eventToken = eventToken;
  }

  public Metric analytics(AnalyticsResponse analytics) {

    this.analytics = analytics;
    return this;
  }

  /**
   * Get analytics
   *
   * @return analytics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANALYTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AnalyticsResponse getAnalytics() {
    return analytics;
  }

  public void setAnalytics(AnalyticsResponse analytics) {
    this.analytics = analytics;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.type, metric.type)
        && Objects.equals(this.selector, metric.selector)
        && Objects.equals(this.eventToken, metric.eventToken)
        && Objects.equals(this.analytics, metric.analytics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, selector, eventToken, analytics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    eventToken: ").append(toIndentedString(eventToken)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
