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
import org.openapitools.client.model.DagState;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DAGRun
 */
@JsonPropertyOrder({
  DAGRun.JSON_PROPERTY_DAG_RUN_ID,
  DAGRun.JSON_PROPERTY_DAG_ID,
  DAGRun.JSON_PROPERTY_EXECUTION_DATE,
  DAGRun.JSON_PROPERTY_START_DATE,
  DAGRun.JSON_PROPERTY_END_DATE,
  DAGRun.JSON_PROPERTY_STATE,
  DAGRun.JSON_PROPERTY_EXTERNAL_TRIGGER,
  DAGRun.JSON_PROPERTY_CONF
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:09.738Z[GMT]")
public class DAGRun {
  public static final String JSON_PROPERTY_DAG_RUN_ID = "dag_run_id";
  private String dagRunId;

  public static final String JSON_PROPERTY_DAG_ID = "dag_id";
  private String dagId;

  public static final String JSON_PROPERTY_EXECUTION_DATE = "execution_date";
  private OffsetDateTime executionDate;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_STATE = "state";
  private DagState state;

  public static final String JSON_PROPERTY_EXTERNAL_TRIGGER = "external_trigger";
  private Boolean externalTrigger = true;

  public static final String JSON_PROPERTY_CONF = "conf";
  private String conf;


  public DAGRun dagRunId(String dagRunId) {
    
    this.dagRunId = dagRunId;
    return this;
  }

   /**
   * Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key. 
   * @return dagRunId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key. ")
  @JsonProperty(JSON_PROPERTY_DAG_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDagRunId() {
    return dagRunId;
  }


  public void setDagRunId(String dagRunId) {
    this.dagRunId = dagRunId;
  }


   /**
   * Get dagId
   * @return dagId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DAG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDagId() {
    return dagId;
  }




  public DAGRun executionDate(OffsetDateTime executionDate) {
    
    this.executionDate = executionDate;
    return this;
  }

   /**
   * The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key. 
   * @return executionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key. ")
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExecutionDate() {
    return executionDate;
  }


  public void setExecutionDate(OffsetDateTime executionDate) {
    this.executionDate = executionDate;
  }


   /**
   * The start time. The time when DAG Run was actually created.. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start time. The time when DAG Run was actually created.. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }




   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }




  public DAGRun state(DagState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DagState getState() {
    return state;
  }


  public void setState(DagState state) {
    this.state = state;
  }


   /**
   * Get externalTrigger
   * @return externalTrigger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExternalTrigger() {
    return externalTrigger;
  }




  public DAGRun conf(String conf) {
    
    this.conf = conf;
    return this;
  }

   /**
   * JSON object describing additional configuration parameters. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. 
   * @return conf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON object describing additional configuration parameters. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. ")
  @JsonProperty(JSON_PROPERTY_CONF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConf() {
    return conf;
  }


  public void setConf(String conf) {
    this.conf = conf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGRun daGRun = (DAGRun) o;
    return Objects.equals(this.dagRunId, daGRun.dagRunId) &&
        Objects.equals(this.dagId, daGRun.dagId) &&
        Objects.equals(this.executionDate, daGRun.executionDate) &&
        Objects.equals(this.startDate, daGRun.startDate) &&
        Objects.equals(this.endDate, daGRun.endDate) &&
        Objects.equals(this.state, daGRun.state) &&
        Objects.equals(this.externalTrigger, daGRun.externalTrigger) &&
        Objects.equals(this.conf, daGRun.conf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagRunId, dagId, executionDate, startDate, endDate, state, externalTrigger, conf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAGRun {\n");
    sb.append("    dagRunId: ").append(toIndentedString(dagRunId)).append("\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    externalTrigger: ").append(toIndentedString(externalTrigger)).append("\n");
    sb.append("    conf: ").append(toIndentedString(conf)).append("\n");
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

