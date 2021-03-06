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
import org.openapitools.client.model.ConnectionAllOf;
import org.openapitools.client.model.ConnectionCollectionItem;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Connection
 */
@JsonPropertyOrder({
  Connection.JSON_PROPERTY_CONNECTION_ID,
  Connection.JSON_PROPERTY_CONN_TYPE,
  Connection.JSON_PROPERTY_HOST,
  Connection.JSON_PROPERTY_LOGIN,
  Connection.JSON_PROPERTY_SCHEMA,
  Connection.JSON_PROPERTY_PORT,
  Connection.JSON_PROPERTY_PASSWORD,
  Connection.JSON_PROPERTY_EXTRA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:14.445Z[GMT]")
public class Connection {
  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CONN_TYPE = "conn_type";
  private String connType;

  public static final String JSON_PROPERTY_HOST = "host";
  private String host;

  public static final String JSON_PROPERTY_LOGIN = "login";
  private String login;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;

  public static final String JSON_PROPERTY_PORT = "port";
  private Integer port;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_EXTRA = "extra";
  private String extra;


  public Connection connectionId(String connectionId) {
    
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public Connection connType(String connType) {
    
    this.connType = connType;
    return this;
  }

   /**
   * Get connType
   * @return connType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnType() {
    return connType;
  }


  public void setConnType(String connType) {
    this.connType = connType;
  }


  public Connection host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public Connection login(String login) {
    
    this.login = login;
    return this;
  }

   /**
   * Get login
   * @return login
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogin() {
    return login;
  }


  public void setLogin(String login) {
    this.login = login;
  }


  public Connection schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchema() {
    return schema;
  }


  public void setSchema(String schema) {
    this.schema = schema;
  }


  public Connection port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public Connection password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public Connection extra(String extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExtra() {
    return extra;
  }


  public void setExtra(String extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.connectionId, connection.connectionId) &&
        Objects.equals(this.connType, connection.connType) &&
        Objects.equals(this.host, connection.host) &&
        Objects.equals(this.login, connection.login) &&
        Objects.equals(this.schema, connection.schema) &&
        Objects.equals(this.port, connection.port) &&
        Objects.equals(this.password, connection.password) &&
        Objects.equals(this.extra, connection.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, connType, host, login, schema, port, password, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    connType: ").append(toIndentedString(connType)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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

