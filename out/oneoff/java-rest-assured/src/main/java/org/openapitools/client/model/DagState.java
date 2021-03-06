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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets DagState
 */
@JsonAdapter(DagState.Adapter.class)
public enum DagState {
  
  SUCCESS("success"),
  
  RUNNING("running"),
  
  FAILED("failed");

  private String value;

  DagState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DagState fromValue(String value) {
    for (DagState b : DagState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DagState> {
    @Override
    public void write(final JsonWriter jsonWriter, final DagState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DagState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DagState.fromValue(value);
    }
  }
}

