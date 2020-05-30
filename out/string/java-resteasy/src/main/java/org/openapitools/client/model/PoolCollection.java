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
import org.openapitools.client.model.Pool;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PoolCollection
 */
@JsonPropertyOrder({
  PoolCollection.JSON_PROPERTY_POOLS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:04.995Z[GMT]")
public class PoolCollection {
  public static final String JSON_PROPERTY_POOLS = "pools";
  private List<Pool> pools = null;


  public PoolCollection pools(List<Pool> pools) {
    
    this.pools = pools;
    return this;
  }

  public PoolCollection addPoolsItem(Pool poolsItem) {
    if (this.pools == null) {
      this.pools = new ArrayList<Pool>();
    }
    this.pools.add(poolsItem);
    return this;
  }

   /**
   * Get pools
   * @return pools
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Pool> getPools() {
    return pools;
  }


  public void setPools(List<Pool> pools) {
    this.pools = pools;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolCollection poolCollection = (PoolCollection) o;
    return Objects.equals(this.pools, poolCollection.pools);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pools);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolCollection {\n");
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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

