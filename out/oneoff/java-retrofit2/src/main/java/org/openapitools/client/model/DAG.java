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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.OneOfScheduleInterval;
import org.openapitools.client.model.Tag;

/**
 * DAG
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:48:14.686Z[GMT]")
public class DAG {
  public static final String SERIALIZED_NAME_DAG_ID = "dag_id";
  @SerializedName(SERIALIZED_NAME_DAG_ID)
  private String dagId;

  public static final String SERIALIZED_NAME_ROOT_DAG_ID = "root_dag_id";
  @SerializedName(SERIALIZED_NAME_ROOT_DAG_ID)
  private String rootDagId;

  public static final String SERIALIZED_NAME_IS_PAUSED = "is_paused";
  @SerializedName(SERIALIZED_NAME_IS_PAUSED)
  private Boolean isPaused;

  public static final String SERIALIZED_NAME_IS_SUBDAG = "is_subdag";
  @SerializedName(SERIALIZED_NAME_IS_SUBDAG)
  private Boolean isSubdag;

  public static final String SERIALIZED_NAME_FILELOC = "fileloc";
  @SerializedName(SERIALIZED_NAME_FILELOC)
  private String fileloc;

  public static final String SERIALIZED_NAME_FILE_TOKEN = "file_token";
  @SerializedName(SERIALIZED_NAME_FILE_TOKEN)
  private String fileToken;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<String> owners = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCHEDULE_INTERVAL = "schedule_interval";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_INTERVAL)
  private OneOfScheduleInterval scheduleInterval = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Tag> tags = null;


   /**
   * Get dagId
   * @return dagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDagId() {
    return dagId;
  }




   /**
   * Get rootDagId
   * @return rootDagId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRootDagId() {
    return rootDagId;
  }




  public DAG isPaused(Boolean isPaused) {
    
    this.isPaused = isPaused;
    return this;
  }

   /**
   * Get isPaused
   * @return isPaused
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPaused() {
    return isPaused;
  }


  public void setIsPaused(Boolean isPaused) {
    this.isPaused = isPaused;
  }


   /**
   * Get isSubdag
   * @return isSubdag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSubdag() {
    return isSubdag;
  }




   /**
   * Get fileloc
   * @return fileloc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileloc() {
    return fileloc;
  }




   /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
   * @return fileToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. ")

  public String getFileToken() {
    return fileToken;
  }




   /**
   * Get owners
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOwners() {
    return owners;
  }




   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }




   /**
   * Get scheduleInterval
   * @return scheduleInterval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OneOfScheduleInterval getScheduleInterval() {
    return scheduleInterval;
  }




   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Tag> getTags() {
    return tags;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAG DAG = (DAG) o;
    return Objects.equals(this.dagId, DAG.dagId) &&
        Objects.equals(this.rootDagId, DAG.rootDagId) &&
        Objects.equals(this.isPaused, DAG.isPaused) &&
        Objects.equals(this.isSubdag, DAG.isSubdag) &&
        Objects.equals(this.fileloc, DAG.fileloc) &&
        Objects.equals(this.fileToken, DAG.fileToken) &&
        Objects.equals(this.owners, DAG.owners) &&
        Objects.equals(this.description, DAG.description) &&
        Objects.equals(this.scheduleInterval, DAG.scheduleInterval) &&
        Objects.equals(this.tags, DAG.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, rootDagId, isPaused, isSubdag, fileloc, fileToken, owners, description, scheduleInterval, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DAG {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    rootDagId: ").append(toIndentedString(rootDagId)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    isSubdag: ").append(toIndentedString(isSubdag)).append("\n");
    sb.append("    fileloc: ").append(toIndentedString(fileloc)).append("\n");
    sb.append("    fileToken: ").append(toIndentedString(fileToken)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

