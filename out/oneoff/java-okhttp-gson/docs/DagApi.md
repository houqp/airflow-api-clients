# DagApi

All URIs are relative to *http://localhost/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearTaskInstance**](DagApi.md#clearTaskInstance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
[**getDag**](DagApi.md#getDag) | **GET** /dags/{dag_id} | Get basic information about a DAG
[**getDagDetail**](DagApi.md#getDagDetail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
[**getDagSource**](DagApi.md#getDagSource) | **GET** /dagSources/{file_token} | Get source code using file token
[**getDags**](DagApi.md#getDags) | **GET** /dags | Get all DAGs
[**getTask**](DagApi.md#getTask) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
[**getTasks**](DagApi.md#getTasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
[**updateDag**](DagApi.md#updateDag) | **PATCH** /dags/{dag_id} | Update a DAG


<a name="clearTaskInstance"></a>
# **clearTaskInstance**
> TaskInstanceReferenceCollection clearTaskInstance(dagId, clearTaskInstance)

Clears a set of task instances associated with the DAG for a specified date range.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    ClearTaskInstance clearTaskInstance = new ClearTaskInstance(); // ClearTaskInstance | Parameters of action
    try {
      TaskInstanceReferenceCollection result = apiInstance.clearTaskInstance(dagId, clearTaskInstance);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#clearTaskInstance");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **clearTaskInstance** | [**ClearTaskInstance**](ClearTaskInstance.md)| Parameters of action |

### Return type

[**TaskInstanceReferenceCollection**](TaskInstanceReferenceCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A list of cleared task references |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="getDag"></a>
# **getDag**
> DAG getDag(dagId)

Get basic information about a DAG

Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/detail. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    try {
      DAG result = apiInstance.getDag(dagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getDag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |

### Return type

[**DAG**](DAG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="getDagDetail"></a>
# **getDagDetail**
> DAGDetail getDagDetail(dagId)

Get a simplified representation of DAG.

The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    try {
      DAGDetail result = apiInstance.getDagDetail(dagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getDagDetail");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |

### Return type

[**DAGDetail**](DAGDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="getDagSource"></a>
# **getDagSource**
> InlineResponse2001 getDagSource(fileToken)

Get source code using file token

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String fileToken = "fileToken_example"; // String | The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
    try {
      InlineResponse2001 result = apiInstance.getDagSource(fileToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getDagSource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileToken** | **String**| The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change.  |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="getDags"></a>
# **getDags**
> DAGCollection getDags(limit, offset)

Get all DAGs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    Integer limit = 100; // Integer | The numbers of items to return.
    Integer offset = 56; // Integer | The number of items to skip before starting to collect the result set.
    try {
      DAGCollection result = apiInstance.getDags(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getDags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| The numbers of items to return. | [optional] [default to 100]
 **offset** | **Integer**| The number of items to skip before starting to collect the result set. | [optional]

### Return type

[**DAGCollection**](DAGCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of DAGs. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |

<a name="getTask"></a>
# **getTask**
> Task getTask(dagId, taskId)

Get simplified representation of a task.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    String taskId = "taskId_example"; // String | The Task ID.
    try {
      Task result = apiInstance.getTask(dagId, taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **taskId** | **String**| The Task ID. |

### Return type

[**Task**](Task.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="getTasks"></a>
# **getTasks**
> TaskCollection getTasks(dagId)

Get tasks for DAG

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    try {
      TaskCollection result = apiInstance.getTasks(dagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#getTasks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |

### Return type

[**TaskCollection**](TaskCollection.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

<a name="updateDag"></a>
# **updateDag**
> DAG updateDag(dagId, DAG)

Update a DAG

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DagApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api/v1");

    DagApi apiInstance = new DagApi(defaultClient);
    String dagId = "dagId_example"; // String | The DAG ID.
    DAG DAG = new DAG(); // DAG | 
    try {
      DAG result = apiInstance.updateDag(dagId, DAG);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DagApi#updateDag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dagId** | **String**| The DAG ID. |
 **DAG** | [**DAG**](DAG.md)|  |

### Return type

[**DAG**](DAG.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response. |  -  |
**401** | Request not authenticated due to missing, invalid, authentication info. |  -  |
**403** | Client does not have sufficient permission. |  -  |
**404** | A specified resource is not found. |  -  |

