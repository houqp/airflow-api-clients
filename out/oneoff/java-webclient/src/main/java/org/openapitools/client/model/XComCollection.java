/*
 * Airflow API (Stable)
 * Apache Airflow management API.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: dev@airflow.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.XComCollectionItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * XComCollection
 */
@JsonPropertyOrder({
  XComCollection.JSON_PROPERTY_XCOM_ENTRIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:19.635Z[GMT]")
public class XComCollection {
  public static final String JSON_PROPERTY_XCOM_ENTRIES = "xcom_entries";
  private List<XComCollectionItem> xcomEntries = null;


  public XComCollection xcomEntries(List<XComCollectionItem> xcomEntries) {
    
    this.xcomEntries = xcomEntries;
    return this;
  }

  public XComCollection addXcomEntriesItem(XComCollectionItem xcomEntriesItem) {
    if (this.xcomEntries == null) {
      this.xcomEntries = new ArrayList<>();
    }
    this.xcomEntries.add(xcomEntriesItem);
    return this;
  }

   /**
   * Get xcomEntries
   * @return xcomEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_XCOM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<XComCollectionItem> getXcomEntries() {
    return xcomEntries;
  }


  public void setXcomEntries(List<XComCollectionItem> xcomEntries) {
    this.xcomEntries = xcomEntries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XComCollection xcomCollection = (XComCollection) o;
    return Objects.equals(this.xcomEntries, xcomCollection.xcomEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xcomEntries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XComCollection {\n");
    sb.append("    xcomEntries: ").append(toIndentedString(xcomEntries)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

