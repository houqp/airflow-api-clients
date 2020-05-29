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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ListDagRunsForm
 */
@JsonPropertyOrder({
  ListDagRunsForm.JSON_PROPERTY_PAGE_OFFSET,
  ListDagRunsForm.JSON_PROPERTY_PAGE_LIMIT,
  ListDagRunsForm.JSON_PROPERTY_DAG_IDS,
  ListDagRunsForm.JSON_PROPERTY_EXECUTION_DATE_GTE,
  ListDagRunsForm.JSON_PROPERTY_EXECUTION_DATE_LTE,
  ListDagRunsForm.JSON_PROPERTY_START_DATE_GTE,
  ListDagRunsForm.JSON_PROPERTY_START_DATE_LTE,
  ListDagRunsForm.JSON_PROPERTY_END_DATE_GTE,
  ListDagRunsForm.JSON_PROPERTY_END_DATE_LTE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:01:10.438Z[GMT]")
public class ListDagRunsForm {
  public static final String JSON_PROPERTY_PAGE_OFFSET = "page_offset";
  private Integer pageOffset;

  public static final String JSON_PROPERTY_PAGE_LIMIT = "page_limit";
  private Integer pageLimit = 100;

  public static final String JSON_PROPERTY_DAG_IDS = "dag_ids";
  private List<String> dagIds = null;

  public static final String JSON_PROPERTY_EXECUTION_DATE_GTE = "execution_date_gte";
  private OffsetDateTime executionDateGte;

  public static final String JSON_PROPERTY_EXECUTION_DATE_LTE = "execution_date_lte";
  private OffsetDateTime executionDateLte;

  public static final String JSON_PROPERTY_START_DATE_GTE = "start_date_gte";
  private OffsetDateTime startDateGte;

  public static final String JSON_PROPERTY_START_DATE_LTE = "start_date_lte";
  private OffsetDateTime startDateLte;

  public static final String JSON_PROPERTY_END_DATE_GTE = "end_date_gte";
  private OffsetDateTime endDateGte;

  public static final String JSON_PROPERTY_END_DATE_LTE = "end_date_lte";
  private OffsetDateTime endDateLte;


  public ListDagRunsForm pageOffset(Integer pageOffset) {
    
    this.pageOffset = pageOffset;
    return this;
  }

   /**
   * The number of items to skip before starting to collect the result set.
   * minimum: 0
   * @return pageOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items to skip before starting to collect the result set.")
  @JsonProperty(JSON_PROPERTY_PAGE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageOffset() {
    return pageOffset;
  }


  public void setPageOffset(Integer pageOffset) {
    this.pageOffset = pageOffset;
  }


  public ListDagRunsForm pageLimit(Integer pageLimit) {
    
    this.pageLimit = pageLimit;
    return this;
  }

   /**
   * The numbers of items to return.
   * minimum: 1
   * @return pageLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The numbers of items to return.")
  @JsonProperty(JSON_PROPERTY_PAGE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPageLimit() {
    return pageLimit;
  }


  public void setPageLimit(Integer pageLimit) {
    this.pageLimit = pageLimit;
  }


  public ListDagRunsForm dagIds(List<String> dagIds) {
    
    this.dagIds = dagIds;
    return this;
  }

  public ListDagRunsForm addDagIdsItem(String dagIdsItem) {
    if (this.dagIds == null) {
      this.dagIds = new ArrayList<String>();
    }
    this.dagIds.add(dagIdsItem);
    return this;
  }

   /**
   * Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).
   * @return dagIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return objects with specific DAG IDs. The value can be repeated to retrieve multiple matching values (OR condition).")
  @JsonProperty(JSON_PROPERTY_DAG_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDagIds() {
    return dagIds;
  }


  public void setDagIds(List<String> dagIds) {
    this.dagIds = dagIds;
  }


  public ListDagRunsForm executionDateGte(OffsetDateTime executionDateGte) {
    
    this.executionDateGte = executionDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period. 
   * @return executionDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal to the specified date. This can be combined with execution_date_lte key to receive only the selected period. ")
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExecutionDateGte() {
    return executionDateGte;
  }


  public void setExecutionDateGte(OffsetDateTime executionDateGte) {
    this.executionDateGte = executionDateGte;
  }


  public ListDagRunsForm executionDateLte(OffsetDateTime executionDateLte) {
    
    this.executionDateLte = executionDateLte;
    return this;
  }

   /**
   * Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period. 
   * @return executionDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less than or equal to the specified date. This can be combined with execution_date_gte key to receive only the selected period. ")
  @JsonProperty(JSON_PROPERTY_EXECUTION_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExecutionDateLte() {
    return executionDateLte;
  }


  public void setExecutionDateLte(OffsetDateTime executionDateLte) {
    this.executionDateLte = executionDateLte;
  }


  public ListDagRunsForm startDateGte(OffsetDateTime startDateGte) {
    
    this.startDateGte = startDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period. 
   * @return startDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal the specified date. This can be combined with start_date_lte key to receive only the selected period. ")
  @JsonProperty(JSON_PROPERTY_START_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateGte() {
    return startDateGte;
  }


  public void setStartDateGte(OffsetDateTime startDateGte) {
    this.startDateGte = startDateGte;
  }


  public ListDagRunsForm startDateLte(OffsetDateTime startDateLte) {
    
    this.startDateLte = startDateLte;
    return this;
  }

   /**
   * Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period 
   * @return startDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period ")
  @JsonProperty(JSON_PROPERTY_START_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateLte() {
    return startDateLte;
  }


  public void setStartDateLte(OffsetDateTime startDateLte) {
    this.startDateLte = startDateLte;
  }


  public ListDagRunsForm endDateGte(OffsetDateTime endDateGte) {
    
    this.endDateGte = endDateGte;
    return this;
  }

   /**
   * Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period. 
   * @return endDateGte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects greater or equal the specified date. This can be combined with end_date_lte parameter to receive only the selected period. ")
  @JsonProperty(JSON_PROPERTY_END_DATE_GTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDateGte() {
    return endDateGte;
  }


  public void setEndDateGte(OffsetDateTime endDateGte) {
    this.endDateGte = endDateGte;
  }


  public ListDagRunsForm endDateLte(OffsetDateTime endDateLte) {
    
    this.endDateLte = endDateLte;
    return this;
  }

   /**
   * Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period. 
   * @return endDateLte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns objects less than or equal to the specified date. This can be combined with end_date_gte parameter to receive only the selected period. ")
  @JsonProperty(JSON_PROPERTY_END_DATE_LTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDateLte() {
    return endDateLte;
  }


  public void setEndDateLte(OffsetDateTime endDateLte) {
    this.endDateLte = endDateLte;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListDagRunsForm listDagRunsForm = (ListDagRunsForm) o;
    return Objects.equals(this.pageOffset, listDagRunsForm.pageOffset) &&
        Objects.equals(this.pageLimit, listDagRunsForm.pageLimit) &&
        Objects.equals(this.dagIds, listDagRunsForm.dagIds) &&
        Objects.equals(this.executionDateGte, listDagRunsForm.executionDateGte) &&
        Objects.equals(this.executionDateLte, listDagRunsForm.executionDateLte) &&
        Objects.equals(this.startDateGte, listDagRunsForm.startDateGte) &&
        Objects.equals(this.startDateLte, listDagRunsForm.startDateLte) &&
        Objects.equals(this.endDateGte, listDagRunsForm.endDateGte) &&
        Objects.equals(this.endDateLte, listDagRunsForm.endDateLte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageOffset, pageLimit, dagIds, executionDateGte, executionDateLte, startDateGte, startDateLte, endDateGte, endDateLte);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListDagRunsForm {\n");
    sb.append("    pageOffset: ").append(toIndentedString(pageOffset)).append("\n");
    sb.append("    pageLimit: ").append(toIndentedString(pageLimit)).append("\n");
    sb.append("    dagIds: ").append(toIndentedString(dagIds)).append("\n");
    sb.append("    executionDateGte: ").append(toIndentedString(executionDateGte)).append("\n");
    sb.append("    executionDateLte: ").append(toIndentedString(executionDateLte)).append("\n");
    sb.append("    startDateGte: ").append(toIndentedString(startDateGte)).append("\n");
    sb.append("    startDateLte: ").append(toIndentedString(startDateLte)).append("\n");
    sb.append("    endDateGte: ").append(toIndentedString(endDateGte)).append("\n");
    sb.append("    endDateLte: ").append(toIndentedString(endDateLte)).append("\n");
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
