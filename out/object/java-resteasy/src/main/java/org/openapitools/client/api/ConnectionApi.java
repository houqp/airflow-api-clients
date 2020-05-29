package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import org.openapitools.client.model.Connection;
import org.openapitools.client.model.ConnectionCollection;
import org.openapitools.client.model.Error;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-29T12:06:20.430Z[GMT]")
public class ConnectionApi {
  private ApiClient apiClient;

  public ConnectionApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConnectionApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create connection entry
   * 
   * @param connection  (required)
   * @return a {@code Connection}
   * @throws ApiException if fails to make API call
   */
  public Connection createConnection(Connection connection) throws ApiException {
    Object localVarPostBody = connection;
    
    // verify the required parameter 'connection' is set
    if (connection == null) {
      throw new ApiException(400, "Missing the required parameter 'connection' when calling createConnection");
    }
    
    // create path and map variables
    String localVarPath = "/connections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Connection> localVarReturnType = new GenericType<Connection>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteConnection(Integer connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling deleteConnection");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{connection_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Get a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @return a {@code Connection}
   * @throws ApiException if fails to make API call
   */
  public Connection getConnection(Integer connectionId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling getConnection");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{connection_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Connection> localVarReturnType = new GenericType<Connection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get all connection entries
   * 
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return a {@code ConnectionCollection}
   * @throws ApiException if fails to make API call
   */
  public ConnectionCollection getConnections(Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/connections".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ConnectionCollection> localVarReturnType = new GenericType<ConnectionCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a connection entry
   * 
   * @param connectionId The Connection ID. (required)
   * @param connection  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional, default to new ArrayList&lt;String&gt;())
   * @return a {@code Connection}
   * @throws ApiException if fails to make API call
   */
  public Connection updateConnection(Integer connectionId, Connection connection, List<String> updateMask) throws ApiException {
    Object localVarPostBody = connection;
    
    // verify the required parameter 'connectionId' is set
    if (connectionId == null) {
      throw new ApiException(400, "Missing the required parameter 'connectionId' when calling updateConnection");
    }
    
    // verify the required parameter 'connection' is set
    if (connection == null) {
      throw new ApiException(400, "Missing the required parameter 'connection' when calling updateConnection");
    }
    
    // create path and map variables
    String localVarPath = "/connections/{connection_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "connection_id" + "\\}", apiClient.escapeString(connectionId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "update_mask", updateMask));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<Connection> localVarReturnType = new GenericType<Connection>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}