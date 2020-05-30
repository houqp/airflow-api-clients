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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * [RFC7807](https://tools.ietf.org/html/rfc7807) compliant response 
 */
@ApiModel(description = "[RFC7807](https://tools.ietf.org/html/rfc7807) compliant response ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:45:55.582Z[GMT]")
public class Error {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BigDecimal status;

  public static final String SERIALIZED_NAME_DETAILS = "details";
  @SerializedName(SERIALIZED_NAME_DETAILS)
  private String details;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;


  public Error type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A URI reference [RFC3986] that identifies the problem type. This specification encourages that, when dereferenced, it provide human-readable documentation for the problem type. 
   * @return type
  **/
  @ApiModelProperty(required = true, value = "A URI reference [RFC3986] that identifies the problem type. This specification encourages that, when dereferenced, it provide human-readable documentation for the problem type. ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Error title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem  type.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "A short, human-readable summary of the problem  type.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Error status(BigDecimal status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code generated by the API server for this occurrence of the problem.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The HTTP status code generated by the API server for this occurrence of the problem.")

  public BigDecimal getStatus() {
    return status;
  }


  public void setStatus(BigDecimal status) {
    this.status = status;
  }


  public Error details(String details) {
    
    this.details = details;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem.")

  public String getDetails() {
    return details;
  }


  public void setDetails(String details) {
    this.details = details;
  }


  public Error instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced. 
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI reference that identifies the specific occurrence of the problem. It may or may not yield further information if dereferenced. ")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.details, error.details) &&
        Objects.equals(this.instance, error.instance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, details, instance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

