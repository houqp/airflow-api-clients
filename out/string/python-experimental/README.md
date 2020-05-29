# openapi-client
Apache Airflow management API.

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonClientExperimentalCodegen
For more information, please visit [https://airflow.apache.org](https://airflow.apache.org)

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function

import time
import openapi_client
from pprint import pprint

# Defining the host is optional and defaults to http://localhost/api/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost/api/v1"
)



# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.ConfigApi(api_client)
    limit = 100 # int | The numbers of items to return. (optional) (default to 100)
offset = 56 # int | The number of items to skip before starting to collect the result set. (optional)

    try:
        # Get current configuration
        api_response = api_instance.get_config(limit=limit, offset=offset)
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling ConfigApi->get_config: %s\n" % e)
    
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConfigApi* | [**get_config**](docs/ConfigApi.md#get_config) | **GET** /config | Get current configuration
*ConnectionApi* | [**create_connection**](docs/ConnectionApi.md#create_connection) | **POST** /connections | Create connection entry
*ConnectionApi* | [**delete_connection**](docs/ConnectionApi.md#delete_connection) | **DELETE** /connections/{connection_id} | Delete a connection entry
*ConnectionApi* | [**get_connection**](docs/ConnectionApi.md#get_connection) | **GET** /connections/{connection_id} | Get a connection entry
*ConnectionApi* | [**get_connections**](docs/ConnectionApi.md#get_connections) | **GET** /connections | Get all connection entries
*ConnectionApi* | [**update_connection**](docs/ConnectionApi.md#update_connection) | **PATCH** /connections/{connection_id} | Update a connection entry
*DAGApi* | [**clear_task_instance**](docs/DAGApi.md#clear_task_instance) | **POST** /dags/{dag_id}/clearTaskInstances | Clears a set of task instances associated with the DAG for a specified date range.
*DAGApi* | [**get_dag**](docs/DAGApi.md#get_dag) | **GET** /dags/{dag_id} | Get basic information about a DAG
*DAGApi* | [**get_dag_detail**](docs/DAGApi.md#get_dag_detail) | **GET** /dags/{dag_id}/details | Get a simplified representation of DAG.
*DAGApi* | [**get_dag_source**](docs/DAGApi.md#get_dag_source) | **GET** /dagSources/{file_token} | Get source code using file token
*DAGApi* | [**get_dags**](docs/DAGApi.md#get_dags) | **GET** /dags | Get all DAGs
*DAGApi* | [**get_task**](docs/DAGApi.md#get_task) | **GET** /dags/{dag_id}/tasks/{task_id} | Get simplified representation of a task.
*DAGApi* | [**get_tasks**](docs/DAGApi.md#get_tasks) | **GET** /dags/{dag_id}/tasks | Get tasks for DAG
*DAGApi* | [**update_dag**](docs/DAGApi.md#update_dag) | **PATCH** /dags/{dag_id} | Update a DAG
*DAGRunApi* | [**create_dag_run**](docs/DAGRunApi.md#create_dag_run) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id} | Trigger a DAG Run
*DAGRunApi* | [**delete_dag_run**](docs/DAGRunApi.md#delete_dag_run) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id} | Delete a DAG Run
*DAGRunApi* | [**get_dag_run**](docs/DAGRunApi.md#get_dag_run) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id} | Get a DAG Run
*DAGRunApi* | [**get_dag_runs**](docs/DAGRunApi.md#get_dag_runs) | **GET** /dags/{dag_id}/dagRuns | Get all DAG Runs
*DAGRunApi* | [**get_dag_runs_batch**](docs/DAGRunApi.md#get_dag_runs_batch) | **POST** /dags/~/dagRuns/list | Get all DAG Runs from aall DAGs.
*DAGRunApi* | [**update_dag_run**](docs/DAGRunApi.md#update_dag_run) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id} | Update a DAG Run
*EventLogApi* | [**get_event_log**](docs/EventLogApi.md#get_event_log) | **GET** /eventLogs | Get all log entries from event log
*EventLogApi* | [**get_event_log_entry**](docs/EventLogApi.md#get_event_log_entry) | **GET** /eventLogs/{event_log_id} | Get a log entry
*ImportErrorApi* | [**delete_import_error**](docs/ImportErrorApi.md#delete_import_error) | **DELETE** /importErrors/{import_error_id} | Delete an import error
*ImportErrorApi* | [**get_import_error**](docs/ImportErrorApi.md#get_import_error) | **GET** /importErrors/{import_error_id} | Get an import error
*ImportErrorApi* | [**get_import_errors**](docs/ImportErrorApi.md#get_import_errors) | **GET** /importErrors | Get all import errors
*PoolApi* | [**create_pool**](docs/PoolApi.md#create_pool) | **POST** /pools | Create a pool
*PoolApi* | [**delete_pool**](docs/PoolApi.md#delete_pool) | **DELETE** /pools/{pool_name} | Delete a pool
*PoolApi* | [**get_pool**](docs/PoolApi.md#get_pool) | **GET** /pools/{pool_name} | Get a pool
*PoolApi* | [**get_pools**](docs/PoolApi.md#get_pools) | **GET** /pools | Get all pools
*PoolApi* | [**update_pool**](docs/PoolApi.md#update_pool) | **PATCH** /pools/{pool_name} | Update a pool
*TaskInstanceApi* | [**get_extra_links**](docs/TaskInstanceApi.md#get_extra_links) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links | Get extra links for task instance
*TaskInstanceApi* | [**get_logs**](docs/TaskInstanceApi.md#get_logs) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number} | Get logs for a task instance
*TaskInstanceApi* | [**get_task_instance**](docs/TaskInstanceApi.md#get_task_instance) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id} | Get a task instance
*TaskInstanceApi* | [**get_task_instances**](docs/TaskInstanceApi.md#get_task_instances) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances | Get a list of task instance of DAG.
*TaskInstanceApi* | [**get_task_instances_batch**](docs/TaskInstanceApi.md#get_task_instances_batch) | **POST** /dags/~/dagRuns/~/taskInstances/list | Get list of task instances from all DAGs and DAG Runs.
*VariableApi* | [**create_variable**](docs/VariableApi.md#create_variable) | **POST** /variables | Create a variable
*VariableApi* | [**delete_variable**](docs/VariableApi.md#delete_variable) | **DELETE** /variables/{variable_key} | Delete variable
*VariableApi* | [**get_variable**](docs/VariableApi.md#get_variable) | **GET** /variables/{variable_key} | Get a variable by key
*VariableApi* | [**get_variables**](docs/VariableApi.md#get_variables) | **GET** /variables | Get all variables
*VariableApi* | [**update_variable**](docs/VariableApi.md#update_variable) | **PATCH** /variables/{variable_key} | Update a variable by key
*XComApi* | [**delete_x_com_value**](docs/XComApi.md#delete_x_com_value) | **DELETE** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Delete an XCom entry
*XComApi* | [**get_x_com_entry**](docs/XComApi.md#get_x_com_entry) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Get all XCom entries
*XComApi* | [**get_x_com_value**](docs/XComApi.md#get_x_com_value) | **GET** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Get an XCom entry
*XComApi* | [**update_x_com_entry**](docs/XComApi.md#update_x_com_entry) | **POST** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries | Create an XCom entry
*XComApi* | [**update_x_com_value**](docs/XComApi.md#update_x_com_value) | **PATCH** /dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key} | Update an XCom entry


## Documentation For Models

 - [class_reference.ClassReference](docs/ClassReference.md)
 - [clear_task_instance.ClearTaskInstance](docs/ClearTaskInstance.md)
 - [collection_info.CollectionInfo](docs/CollectionInfo.md)
 - [color.Color](docs/Color.md)
 - [config.Config](docs/Config.md)
 - [config_option.ConfigOption](docs/ConfigOption.md)
 - [config_section.ConfigSection](docs/ConfigSection.md)
 - [connection.Connection](docs/Connection.md)
 - [connection_all_of.ConnectionAllOf](docs/ConnectionAllOf.md)
 - [connection_collection.ConnectionCollection](docs/ConnectionCollection.md)
 - [connection_collection_item.ConnectionCollectionItem](docs/ConnectionCollectionItem.md)
 - [cron_expression.CronExpression](docs/CronExpression.md)
 - [dag.DAG](docs/DAG.md)
 - [dag_collection.DAGCollection](docs/DAGCollection.md)
 - [dag_detail.DAGDetail](docs/DAGDetail.md)
 - [dag_detail_all_of.DAGDetailAllOf](docs/DAGDetailAllOf.md)
 - [dag_run.DAGRun](docs/DAGRun.md)
 - [dag_run_collection.DAGRunCollection](docs/DAGRunCollection.md)
 - [dag_state.DagState](docs/DagState.md)
 - [error.Error](docs/Error.md)
 - [event_log.EventLog](docs/EventLog.md)
 - [event_log_collection.EventLogCollection](docs/EventLogCollection.md)
 - [extra_link.ExtraLink](docs/ExtraLink.md)
 - [extra_link_collection.ExtraLinkCollection](docs/ExtraLinkCollection.md)
 - [import_error.ImportError](docs/ImportError.md)
 - [import_error_collection.ImportErrorCollection](docs/ImportErrorCollection.md)
 - [inline_response200.InlineResponse200](docs/InlineResponse200.md)
 - [inline_response2001.InlineResponse2001](docs/InlineResponse2001.md)
 - [list_dag_runs_form.ListDagRunsForm](docs/ListDagRunsForm.md)
 - [list_task_instance_form.ListTaskInstanceForm](docs/ListTaskInstanceForm.md)
 - [pool.Pool](docs/Pool.md)
 - [pool_collection.PoolCollection](docs/PoolCollection.md)
 - [relative_delta.RelativeDelta](docs/RelativeDelta.md)
 - [schedule_interval.ScheduleInterval](docs/ScheduleInterval.md)
 - [sla_miss.SLAMiss](docs/SLAMiss.md)
 - [sla_miss_collection.SLAMissCollection](docs/SLAMissCollection.md)
 - [tag.Tag](docs/Tag.md)
 - [task.Task](docs/Task.md)
 - [task_collection.TaskCollection](docs/TaskCollection.md)
 - [task_extra_links.TaskExtraLinks](docs/TaskExtraLinks.md)
 - [task_fail.TaskFail](docs/TaskFail.md)
 - [task_instance.TaskInstance](docs/TaskInstance.md)
 - [task_instance_collection.TaskInstanceCollection](docs/TaskInstanceCollection.md)
 - [task_instance_reference.TaskInstanceReference](docs/TaskInstanceReference.md)
 - [task_instance_reference_collection.TaskInstanceReferenceCollection](docs/TaskInstanceReferenceCollection.md)
 - [task_state.TaskState](docs/TaskState.md)
 - [time_delta.TimeDelta](docs/TimeDelta.md)
 - [trigger_rule.TriggerRule](docs/TriggerRule.md)
 - [variable.Variable](docs/Variable.md)
 - [variable_all_of.VariableAllOf](docs/VariableAllOf.md)
 - [variable_collection.VariableCollection](docs/VariableCollection.md)
 - [variable_collection_item.VariableCollectionItem](docs/VariableCollectionItem.md)
 - [weight_rule.WeightRule](docs/WeightRule.md)
 - [x_com.XCom](docs/XCom.md)
 - [x_com_collection.XComCollection](docs/XComCollection.md)
 - [x_com_collection_item.XComCollectionItem](docs/XComCollectionItem.md)


## Documentation For Authorization

 All endpoints do not require authorization.

## Author

dev@airflow.apache.org

