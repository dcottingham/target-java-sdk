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
package Model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Page load response. Contains the result of prefetching or executing a request that will retrieve
 * content for all selectors not associated with a particular view.
 */
@ApiModel(
    description =
        "Page load response. Contains the result of prefetching or executing a request that will retrieve content for all selectors not associated with a particular view. ")
@JsonPropertyOrder({
  PageLoadResponse.JSON_PROPERTY_OPTIONS,
  PageLoadResponse.JSON_PROPERTY_METRICS,
  PageLoadResponse.JSON_PROPERTY_ANALYTICS,
  PageLoadResponse.JSON_PROPERTY_STATE,
  PageLoadResponse.JSON_PROPERTY_TRACE
})
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2021-05-10T11:24:27.013-07:00[America/Los_Angeles]")
public class PageLoadResponse {
  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<Option> options = null;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private List<Metric> metrics = null;

  public static final String JSON_PROPERTY_ANALYTICS = "analytics";
  private AnalyticsResponse analytics;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Map<String, Object> trace = null;

  public PageLoadResponse options(List<Option> options) {

    this.options = options;
    return this;
  }

  public PageLoadResponse addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * List of options that should be applied. Note: options that have been set on selectors assigned
   * to views will not be included here.
   *
   * @return options
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "List of options that should be applied. Note: options that have been set on selectors assigned to views will not be included here. ")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }

  public PageLoadResponse metrics(List<Metric> metrics) {

    this.metrics = metrics;
    return this;
  }

  public PageLoadResponse addMetricsItem(Metric metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<Metric>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * Click track metrics. Note that click metrics for selectors set with views will not be included
   * here. In case the same activity is serving content for selectors both assinged to a view and
   * selectors without any views, and having click track metrics that are not assotiated with any
   * view within the activity, then: * in case of a prefetch only request, these metrics (tokens)
   * will be set in the Prefetch response&#39;s metrics. * in case of an execute only request, the
   * metrics will be set in the page load response&#39;s metrics. * in case of a request, with both,
   * execute and prefetch, metrics will be set in the page load response&#39;s metrics only.
   *
   * @return metrics
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Click track metrics. Note that click metrics for selectors set with views will not be included here. In case the same activity is serving content for selectors both assinged to a view and selectors without any views, and having click track metrics that are not assotiated with any view within the activity, then:   * in case of a prefetch only request, these metrics (tokens) will be set in the Prefetch response's metrics.   * in case of an execute only request, the metrics will be set in the page load response's metrics.   * in case of a request, with both, execute and prefetch, metrics will be set in the page load response's     metrics only. ")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Metric> getMetrics() {
    return metrics;
  }

  public void setMetrics(List<Metric> metrics) {
    this.metrics = metrics;
  }

  public PageLoadResponse analytics(AnalyticsResponse analytics) {

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

  public PageLoadResponse state(String state) {

    this.state = state;
    return this;
  }

  /**
   * View state token that must be sent back with display notification for the view. May only be
   * present for prefetch requests.
   *
   * @return state
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "View state token that must be sent back with display notification for the view. May only be present for prefetch requests. ")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public PageLoadResponse trace(Map<String, Object> trace) {

    this.trace = trace;
    return this;
  }

  public PageLoadResponse putTraceItem(String key, Object traceItem) {
    if (this.trace == null) {
      this.trace = new HashMap<String, Object>();
    }
    this.trace.put(key, traceItem);
    return this;
  }

  /**
   * The object containing all trace data for the request, only present if the trace token was
   * provided in the request.
   *
   * @return trace
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "The object containing all trace data for the request, only present if the trace token was provided in the request. ")
  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTrace() {
    return trace;
  }

  public void setTrace(Map<String, Object> trace) {
    this.trace = trace;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageLoadResponse pageLoadResponse = (PageLoadResponse) o;
    return Objects.equals(this.options, pageLoadResponse.options)
        && Objects.equals(this.metrics, pageLoadResponse.metrics)
        && Objects.equals(this.analytics, pageLoadResponse.analytics)
        && Objects.equals(this.state, pageLoadResponse.state)
        && Objects.equals(this.trace, pageLoadResponse.trace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, metrics, analytics, state, trace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageLoadResponse {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    analytics: ").append(toIndentedString(analytics)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
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
