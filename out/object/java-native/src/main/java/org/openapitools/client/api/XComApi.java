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

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Pair;

import org.openapitools.client.model.Error;
import org.openapitools.client.model.XCom;
import org.openapitools.client.model.XComCollection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;


@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:47:23.675Z[GMT]")
public class XComApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  
  public XComApi() {
    this(new ApiClient());
  }

  public XComApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  /**
   * Delete an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteXComValue (String dagId, String dagRunId, String taskId, String xcomKey) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling deleteXComValue");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling deleteXComValue");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling deleteXComValue");
    }
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
        throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling deleteXComValue");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()))
        .replace("{xcom_key}", ApiClient.urlEncode(xcomKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "deleteXComValue call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get all XCom entries
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return XComCollection
   * @throws ApiException if fails to make API call
   */
  public XComCollection getXComEntry (String dagId, String dagRunId, String taskId, Integer limit, Integer offset) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getXComEntry");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getXComEntry");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling getXComEntry");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("limit", limit));
    localVarQueryParams.addAll(ApiClient.parameterToPairs("offset", offset));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getXComEntry call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<XComCollection>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Get an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @return XCom
   * @throws ApiException if fails to make API call
   */
  public XCom getXComValue (String dagId, String dagRunId, String taskId, String xcomKey) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling getXComValue");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getXComValue");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling getXComValue");
    }
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
        throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling getXComValue");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()))
        .replace("{xcom_key}", ApiClient.urlEncode(xcomKey.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    try {
      localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "getXComValue call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<XCom>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Create an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcom  (required)
   * @return XCom
   * @throws ApiException if fails to make API call
   */
  public XCom updateXComEntry (String dagId, String dagRunId, String taskId, XCom xcom) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateXComEntry");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling updateXComEntry");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling updateXComEntry");
    }
    // verify the required parameter 'xcom' is set
    if (xcom == null) {
        throw new ApiException(400, "Missing the required parameter 'xcom' when calling updateXComEntry");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(xcom);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "updateXComEntry call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<XCom>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
  /**
   * Update an XCom entry
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param xcomKey The XCom Key. (required)
   * @param xcom  (required)
   * @param updateMask The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional
   * @return XCom
   * @throws ApiException if fails to make API call
   */
  public XCom updateXComValue (String dagId, String dagRunId, String taskId, String xcomKey, XCom xcom, List<String> updateMask) throws ApiException {
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagId' when calling updateXComValue");
    }
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
        throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling updateXComValue");
    }
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
        throw new ApiException(400, "Missing the required parameter 'taskId' when calling updateXComValue");
    }
    // verify the required parameter 'xcomKey' is set
    if (xcomKey == null) {
        throw new ApiException(400, "Missing the required parameter 'xcomKey' when calling updateXComValue");
    }
    // verify the required parameter 'xcom' is set
    if (xcom == null) {
        throw new ApiException(400, "Missing the required parameter 'xcom' when calling updateXComValue");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}"
        .replace("{dag_id}", ApiClient.urlEncode(dagId.toString()))
        .replace("{dag_run_id}", ApiClient.urlEncode(dagRunId.toString()))
        .replace("{task_id}", ApiClient.urlEncode(taskId.toString()))
        .replace("{xcom_key}", ApiClient.urlEncode(xcomKey.toString()));

    List<Pair> localVarQueryParams = new ArrayList<>();
    localVarQueryParams.addAll(ApiClient.parameterToPairs("csv", "update_mask", updateMask));

    if (!localVarQueryParams.isEmpty()) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(xcom);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
      if (memberVarReadTimeout != null) {
        localVarRequestBuilder.timeout(memberVarReadTimeout);
      }
      if (memberVarInterceptor != null) {
        memberVarInterceptor.accept(localVarRequestBuilder);
      }
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
      localVarRequestBuilder.build(),
      HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }          
      if (localVarResponse.statusCode()/ 100 != 2) {
          throw new ApiException(localVarResponse.statusCode(),
              "updateXComValue call received non-success response",
              localVarResponse.headers(),
              localVarResponse.body() == null ? null : new String(localVarResponse.body().readAllBytes()));
      }
      return memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<XCom>() {});
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }
}
