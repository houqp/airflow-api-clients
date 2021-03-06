package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.ExtraLinkCollection;
import org.openapitools.client.model.InlineResponse200;
import org.openapitools.client.model.ListTaskInstanceForm;
import org.threeten.bp.OffsetDateTime;
import org.openapitools.client.model.TaskInstance;
import org.openapitools.client.model.TaskInstanceCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-05-30T18:46:04.995Z[GMT]")
public class TaskInstanceApi {
  private ApiClient apiClient;

  public TaskInstanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TaskInstanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get extra links for task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return a {@code ExtraLinkCollection}
   * @throws ApiException if fails to make API call
   */
  public ExtraLinkCollection getExtraLinks(String dagId, String dagRunId, String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getExtraLinks");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getExtraLinks");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getExtraLinks");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<ExtraLinkCollection> localVarReturnType = new GenericType<ExtraLinkCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get logs for a task instance
   * Get logs for a specific task instance and its try number
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @param taskTryNumber The Task Try Number. (required)
   * @param fullContent A full content will be returned. By default, only the first fragment will be returned.  (optional)
   * @param token A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued.  (optional)
   * @return a {@code InlineResponse200}
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 getLogs(String dagId, String dagRunId, String taskId, Integer taskTryNumber, Boolean fullContent, String token) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getLogs");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getLogs");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getLogs");
    }
    
    // verify the required parameter 'taskTryNumber' is set
    if (taskTryNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'taskTryNumber' when calling getLogs");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()))
      .replaceAll("\\{" + "task_try_number" + "\\}", apiClient.escapeString(taskTryNumber.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "full_content", fullContent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));

    
    
    
    final String[] localVarAccepts = {
      "application/json", "text/plain"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a task instance
   * 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param taskId The Task ID. (required)
   * @return a {@code TaskInstance}
   * @throws ApiException if fails to make API call
   */
  public TaskInstance getTaskInstance(String dagId, String dagRunId, String taskId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTaskInstance");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getTaskInstance");
    }
    
    // verify the required parameter 'taskId' is set
    if (taskId == null) {
      throw new ApiException(400, "Missing the required parameter 'taskId' when calling getTaskInstance");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()))
      .replaceAll("\\{" + "task_id" + "\\}", apiClient.escapeString(taskId.toString()));

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

    GenericType<TaskInstance> localVarReturnType = new GenericType<TaskInstance>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a list of task instance of DAG.
   * This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG Runs for all DAGs and DAG Runs. 
   * @param dagId The DAG ID. (required)
   * @param dagRunId The DAG Run ID. (required)
   * @param executionDateGte Returns objects greater or equal to the specified date. This can be combined with execution_date_lte parameter to receive only the selected period.  (optional)
   * @param executionDateLte Returns objects less than or equal to the specified date. This can be combined with execution_date_gte parameter to receive only the selected period.  (optional)
   * @param startDateGte Returns objects greater or equal the specified date. This can be combined with startd_ate_lte parameter to receive only the selected period.  (optional)
   * @param startDateLte Returns objects less or equal the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param endDateGte Returns objects greater or equal the specified date. This can be combined with start_date_lte parameter to receive only the selected period.  (optional)
   * @param endDateLte Returns objects less than or equal to the specified date. This can be combined with start_date_gte parameter to receive only the selected period.  (optional)
   * @param durationGte Returns objects greater than or equal to the specified values. This can be combined with duration_lte parameter to receive only the selected period.  (optional)
   * @param durationLte Returns objects less than or equal to the specified values. This can be combined with duration_gte parameter to receive only the selected range.  (optional)
   * @param state The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param pool The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param queue The value can be repeated to retrieve multiple matching values (OR condition). (optional, default to new ArrayList&lt;String&gt;())
   * @param limit The numbers of items to return. (optional, default to 100)
   * @param offset The number of items to skip before starting to collect the result set. (optional)
   * @return a {@code TaskInstanceCollection}
   * @throws ApiException if fails to make API call
   */
  public TaskInstanceCollection getTaskInstances(String dagId, String dagRunId, OffsetDateTime executionDateGte, OffsetDateTime executionDateLte, OffsetDateTime startDateGte, OffsetDateTime startDateLte, OffsetDateTime endDateGte, OffsetDateTime endDateLte, BigDecimal durationGte, BigDecimal durationLte, List<String> state, List<String> pool, List<String> queue, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'dagId' is set
    if (dagId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagId' when calling getTaskInstances");
    }
    
    // verify the required parameter 'dagRunId' is set
    if (dagRunId == null) {
      throw new ApiException(400, "Missing the required parameter 'dagRunId' when calling getTaskInstances");
    }
    
    // create path and map variables
    String localVarPath = "/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "dag_id" + "\\}", apiClient.escapeString(dagId.toString()))
      .replaceAll("\\{" + "dag_run_id" + "\\}", apiClient.escapeString(dagRunId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_gte", executionDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "execution_date_lte", executionDateLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_gte", startDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_lte", startDateLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_gte", endDateGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_lte", endDateLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_gte", durationGte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration_lte", durationLte));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "pool", pool));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "Queue", queue));
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

    GenericType<TaskInstanceCollection> localVarReturnType = new GenericType<TaskInstanceCollection>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get list of task instances from all DAGs and DAG Runs.
   * This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL lengthlimits 
   * @param listTaskInstanceForm  (required)
   * @return a {@code TaskInstanceCollection}
   * @throws ApiException if fails to make API call
   */
  public TaskInstanceCollection getTaskInstancesBatch(ListTaskInstanceForm listTaskInstanceForm) throws ApiException {
    Object localVarPostBody = listTaskInstanceForm;
    
    // verify the required parameter 'listTaskInstanceForm' is set
    if (listTaskInstanceForm == null) {
      throw new ApiException(400, "Missing the required parameter 'listTaskInstanceForm' when calling getTaskInstancesBatch");
    }
    
    // create path and map variables
    String localVarPath = "/dags/~/dagRuns/~/taskInstances/list".replaceAll("\\{format\\}","json");

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

    GenericType<TaskInstanceCollection> localVarReturnType = new GenericType<TaskInstanceCollection>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
