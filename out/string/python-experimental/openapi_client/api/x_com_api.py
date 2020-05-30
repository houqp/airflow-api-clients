# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import re  # noqa: F401
import sys  # noqa: F401

# python 2 and python 3 compatibility library
import six

from openapi_client.api_client import ApiClient
from openapi_client.exceptions import (
    ApiTypeError,
    ApiValueError
)
from openapi_client.model_utils import (  # noqa: F401
    check_allowed_values,
    check_validations,
    date,
    datetime,
    file_type,
    int,
    none_type,
    str,
    validate_and_convert_types
)
from openapi_client.models import error
from openapi_client.models import x_com_collection
from openapi_client.models import x_com


class XComApi(object):
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None):
        if api_client is None:
            api_client = ApiClient()
        self.api_client = api_client

        def __delete_x_com_value(
            self,
            dag_id,
            dag_run_id,
            task_id,
            xcom_key,
            **kwargs
        ):
            """Delete an XCom entry  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True
            >>> thread = api.delete_x_com_value(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
            >>> result = thread.get()

            Args:
                dag_id (str): The DAG ID.
                dag_run_id (str): The DAG Run ID.
                task_id (str): The Task ID.
                xcom_key (str): The XCom Key.

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int): specifies the index of the server
                    that we want to use.
                    Default is 0.
                async_req (bool): execute request asynchronously

            Returns:
                None
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index', 0)
            kwargs['dag_id'] = \
                dag_id
            kwargs['dag_run_id'] = \
                dag_run_id
            kwargs['task_id'] = \
                task_id
            kwargs['xcom_key'] = \
                xcom_key
            return self.call_with_http_info(**kwargs)

        self.delete_x_com_value = Endpoint(
            settings={
                'response_type': None,
                'auth': [],
                'endpoint_path': '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}',
                'operation_id': 'delete_x_com_value',
                'http_method': 'DELETE',
                'servers': [],
            },
            params_map={
                'all': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                ],
                'required': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'dag_id':
                        (str,),
                    'dag_run_id':
                        (str,),
                    'task_id':
                        (str,),
                    'xcom_key':
                        (str,),
                },
                'attribute_map': {
                    'dag_id': 'dag_id',
                    'dag_run_id': 'dag_run_id',
                    'task_id': 'task_id',
                    'xcom_key': 'xcom_key',
                },
                'location_map': {
                    'dag_id': 'path',
                    'dag_run_id': 'path',
                    'task_id': 'path',
                    'xcom_key': 'path',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__delete_x_com_value
        )

        def __get_x_com_entry(
            self,
            dag_id,
            dag_run_id,
            task_id,
            **kwargs
        ):
            """Get all XCom entries  # noqa: E501

            This endpoint allows specifying `~` as the dag_id, dag_run_id, task_id to retrieve XCOM entries for for all DAGs, DAG Runs and task instances.  # noqa: E501
            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True
            >>> thread = api.get_x_com_entry(dag_id, dag_run_id, task_id, async_req=True)
            >>> result = thread.get()

            Args:
                dag_id (str): The DAG ID.
                dag_run_id (str): The DAG Run ID.
                task_id (str): The Task ID.

            Keyword Args:
                limit (int): The numbers of items to return.. [optional] if omitted the server will use the default value of 100
                offset (int): The number of items to skip before starting to collect the result set.. [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int): specifies the index of the server
                    that we want to use.
                    Default is 0.
                async_req (bool): execute request asynchronously

            Returns:
                x_com_collection.XComCollection
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index', 0)
            kwargs['dag_id'] = \
                dag_id
            kwargs['dag_run_id'] = \
                dag_run_id
            kwargs['task_id'] = \
                task_id
            return self.call_with_http_info(**kwargs)

        self.get_x_com_entry = Endpoint(
            settings={
                'response_type': (x_com_collection.XComCollection,),
                'auth': [],
                'endpoint_path': '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries',
                'operation_id': 'get_x_com_entry',
                'http_method': 'GET',
                'servers': [],
            },
            params_map={
                'all': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'limit',
                    'offset',
                ],
                'required': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                    'limit',
                    'offset',
                ]
            },
            root_map={
                'validations': {
                    ('limit',): {

                        'inclusive_minimum': 1,
                    },
                    ('offset',): {

                        'inclusive_minimum': 0,
                    },
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'dag_id':
                        (str,),
                    'dag_run_id':
                        (str,),
                    'task_id':
                        (str,),
                    'limit':
                        (int,),
                    'offset':
                        (int,),
                },
                'attribute_map': {
                    'dag_id': 'dag_id',
                    'dag_run_id': 'dag_run_id',
                    'task_id': 'task_id',
                    'limit': 'limit',
                    'offset': 'offset',
                },
                'location_map': {
                    'dag_id': 'path',
                    'dag_run_id': 'path',
                    'task_id': 'path',
                    'limit': 'query',
                    'offset': 'query',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_x_com_entry
        )

        def __get_x_com_value(
            self,
            dag_id,
            dag_run_id,
            task_id,
            xcom_key,
            **kwargs
        ):
            """Get an XCom entry  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True
            >>> thread = api.get_x_com_value(dag_id, dag_run_id, task_id, xcom_key, async_req=True)
            >>> result = thread.get()

            Args:
                dag_id (str): The DAG ID.
                dag_run_id (str): The DAG Run ID.
                task_id (str): The Task ID.
                xcom_key (str): The XCom Key.

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int): specifies the index of the server
                    that we want to use.
                    Default is 0.
                async_req (bool): execute request asynchronously

            Returns:
                x_com.XCom
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index', 0)
            kwargs['dag_id'] = \
                dag_id
            kwargs['dag_run_id'] = \
                dag_run_id
            kwargs['task_id'] = \
                task_id
            kwargs['xcom_key'] = \
                xcom_key
            return self.call_with_http_info(**kwargs)

        self.get_x_com_value = Endpoint(
            settings={
                'response_type': (x_com.XCom,),
                'auth': [],
                'endpoint_path': '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}',
                'operation_id': 'get_x_com_value',
                'http_method': 'GET',
                'servers': [],
            },
            params_map={
                'all': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                ],
                'required': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'dag_id':
                        (str,),
                    'dag_run_id':
                        (str,),
                    'task_id':
                        (str,),
                    'xcom_key':
                        (str,),
                },
                'attribute_map': {
                    'dag_id': 'dag_id',
                    'dag_run_id': 'dag_run_id',
                    'task_id': 'task_id',
                    'xcom_key': 'xcom_key',
                },
                'location_map': {
                    'dag_id': 'path',
                    'dag_run_id': 'path',
                    'task_id': 'path',
                    'xcom_key': 'path',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [],
            },
            api_client=api_client,
            callable=__get_x_com_value
        )

        def __update_x_com_entry(
            self,
            dag_id,
            dag_run_id,
            task_id,
            x_com_x_com,
            **kwargs
        ):
            """Create an XCom entry  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True
            >>> thread = api.update_x_com_entry(dag_id, dag_run_id, task_id, x_com_x_com, async_req=True)
            >>> result = thread.get()

            Args:
                dag_id (str): The DAG ID.
                dag_run_id (str): The DAG Run ID.
                task_id (str): The Task ID.
                x_com_x_com (x_com.XCom):

            Keyword Args:
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int): specifies the index of the server
                    that we want to use.
                    Default is 0.
                async_req (bool): execute request asynchronously

            Returns:
                x_com.XCom
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index', 0)
            kwargs['dag_id'] = \
                dag_id
            kwargs['dag_run_id'] = \
                dag_run_id
            kwargs['task_id'] = \
                task_id
            kwargs['x_com_x_com'] = \
                x_com_x_com
            return self.call_with_http_info(**kwargs)

        self.update_x_com_entry = Endpoint(
            settings={
                'response_type': (x_com.XCom,),
                'auth': [],
                'endpoint_path': '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries',
                'operation_id': 'update_x_com_entry',
                'http_method': 'POST',
                'servers': [],
            },
            params_map={
                'all': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'x_com_x_com',
                ],
                'required': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'x_com_x_com',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'dag_id':
                        (str,),
                    'dag_run_id':
                        (str,),
                    'task_id':
                        (str,),
                    'x_com_x_com':
                        (x_com.XCom,),
                },
                'attribute_map': {
                    'dag_id': 'dag_id',
                    'dag_run_id': 'dag_run_id',
                    'task_id': 'task_id',
                },
                'location_map': {
                    'dag_id': 'path',
                    'dag_run_id': 'path',
                    'task_id': 'path',
                    'x_com_x_com': 'body',
                },
                'collection_format_map': {
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__update_x_com_entry
        )

        def __update_x_com_value(
            self,
            dag_id,
            dag_run_id,
            task_id,
            xcom_key,
            x_com_x_com,
            **kwargs
        ):
            """Update an XCom entry  # noqa: E501

            This method makes a synchronous HTTP request by default. To make an
            asynchronous HTTP request, please pass async_req=True
            >>> thread = api.update_x_com_value(dag_id, dag_run_id, task_id, xcom_key, x_com_x_com, async_req=True)
            >>> result = thread.get()

            Args:
                dag_id (str): The DAG ID.
                dag_run_id (str): The DAG Run ID.
                task_id (str): The Task ID.
                xcom_key (str): The XCom Key.
                x_com_x_com (x_com.XCom):

            Keyword Args:
                update_mask ([str]): The fields to update on the connection (connection, pool etc). If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. . [optional]
                _return_http_data_only (bool): response data without head status
                    code and headers. Default is True.
                _preload_content (bool): if False, the urllib3.HTTPResponse object
                    will be returned without reading/decoding response data.
                    Default is True.
                _request_timeout (float/tuple): timeout setting for this request. If one
                    number provided, it will be total request timeout. It can also
                    be a pair (tuple) of (connection, read) timeouts.
                    Default is None.
                _check_input_type (bool): specifies if type checking
                    should be done one the data sent to the server.
                    Default is True.
                _check_return_type (bool): specifies if type checking
                    should be done one the data received from the server.
                    Default is True.
                _host_index (int): specifies the index of the server
                    that we want to use.
                    Default is 0.
                async_req (bool): execute request asynchronously

            Returns:
                x_com.XCom
                    If the method is called asynchronously, returns the request
                    thread.
            """
            kwargs['async_req'] = kwargs.get(
                'async_req', False
            )
            kwargs['_return_http_data_only'] = kwargs.get(
                '_return_http_data_only', True
            )
            kwargs['_preload_content'] = kwargs.get(
                '_preload_content', True
            )
            kwargs['_request_timeout'] = kwargs.get(
                '_request_timeout', None
            )
            kwargs['_check_input_type'] = kwargs.get(
                '_check_input_type', True
            )
            kwargs['_check_return_type'] = kwargs.get(
                '_check_return_type', True
            )
            kwargs['_host_index'] = kwargs.get('_host_index', 0)
            kwargs['dag_id'] = \
                dag_id
            kwargs['dag_run_id'] = \
                dag_run_id
            kwargs['task_id'] = \
                task_id
            kwargs['xcom_key'] = \
                xcom_key
            kwargs['x_com_x_com'] = \
                x_com_x_com
            return self.call_with_http_info(**kwargs)

        self.update_x_com_value = Endpoint(
            settings={
                'response_type': (x_com.XCom,),
                'auth': [],
                'endpoint_path': '/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/xcomEntries/{key}',
                'operation_id': 'update_x_com_value',
                'http_method': 'PATCH',
                'servers': [],
            },
            params_map={
                'all': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                    'x_com_x_com',
                    'update_mask',
                ],
                'required': [
                    'dag_id',
                    'dag_run_id',
                    'task_id',
                    'xcom_key',
                    'x_com_x_com',
                ],
                'nullable': [
                ],
                'enum': [
                ],
                'validation': [
                ]
            },
            root_map={
                'validations': {
                },
                'allowed_values': {
                },
                'openapi_types': {
                    'dag_id':
                        (str,),
                    'dag_run_id':
                        (str,),
                    'task_id':
                        (str,),
                    'xcom_key':
                        (str,),
                    'x_com_x_com':
                        (x_com.XCom,),
                    'update_mask':
                        ([str],),
                },
                'attribute_map': {
                    'dag_id': 'dag_id',
                    'dag_run_id': 'dag_run_id',
                    'task_id': 'task_id',
                    'xcom_key': 'xcom_key',
                    'update_mask': 'update_mask',
                },
                'location_map': {
                    'dag_id': 'path',
                    'dag_run_id': 'path',
                    'task_id': 'path',
                    'xcom_key': 'path',
                    'x_com_x_com': 'body',
                    'update_mask': 'query',
                },
                'collection_format_map': {
                    'update_mask': 'csv',
                }
            },
            headers_map={
                'accept': [
                    'application/json'
                ],
                'content_type': [
                    'application/json'
                ]
            },
            api_client=api_client,
            callable=__update_x_com_value
        )


class Endpoint(object):
    def __init__(self, settings=None, params_map=None, root_map=None,
                 headers_map=None, api_client=None, callable=None):
        """Creates an endpoint

        Args:
            settings (dict): see below key value pairs
                'response_type' (tuple/None): response type
                'auth' (list): a list of auth type keys
                'endpoint_path' (str): the endpoint path
                'operation_id' (str): endpoint string identifier
                'http_method' (str): POST/PUT/PATCH/GET etc
                'servers' (list): list of str servers that this endpoint is at
            params_map (dict): see below key value pairs
                'all' (list): list of str endpoint parameter names
                'required' (list): list of required parameter names
                'nullable' (list): list of nullable parameter names
                'enum' (list): list of parameters with enum values
                'validation' (list): list of parameters with validations
            root_map
                'validations' (dict): the dict mapping endpoint parameter tuple
                    paths to their validation dictionaries
                'allowed_values' (dict): the dict mapping endpoint parameter
                    tuple paths to their allowed_values (enum) dictionaries
                'openapi_types' (dict): param_name to openapi type
                'attribute_map' (dict): param_name to camelCase name
                'location_map' (dict): param_name to  'body', 'file', 'form',
                    'header', 'path', 'query'
                collection_format_map (dict): param_name to `csv` etc.
            headers_map (dict): see below key value pairs
                'accept' (list): list of Accept header strings
                'content_type' (list): list of Content-Type header strings
            api_client (ApiClient) api client instance
            callable (function): the function which is invoked when the
                Endpoint is called
        """
        self.settings = settings
        self.params_map = params_map
        self.params_map['all'].extend([
            'async_req',
            '_host_index',
            '_preload_content',
            '_request_timeout',
            '_return_http_data_only',
            '_check_input_type',
            '_check_return_type'
        ])
        self.params_map['nullable'].extend(['_request_timeout'])
        self.validations = root_map['validations']
        self.allowed_values = root_map['allowed_values']
        self.openapi_types = root_map['openapi_types']
        extra_types = {
            'async_req': (bool,),
            '_host_index': (int,),
            '_preload_content': (bool,),
            '_request_timeout': (none_type, int, (int,), [int]),
            '_return_http_data_only': (bool,),
            '_check_input_type': (bool,),
            '_check_return_type': (bool,)
        }
        self.openapi_types.update(extra_types)
        self.attribute_map = root_map['attribute_map']
        self.location_map = root_map['location_map']
        self.collection_format_map = root_map['collection_format_map']
        self.headers_map = headers_map
        self.api_client = api_client
        self.callable = callable

    def __validate_inputs(self, kwargs):
        for param in self.params_map['enum']:
            if param in kwargs:
                check_allowed_values(
                    self.allowed_values,
                    (param,),
                    kwargs[param]
                )

        for param in self.params_map['validation']:
            if param in kwargs:
                check_validations(
                    self.validations,
                    (param,),
                    kwargs[param],
                    configuration=self.api_client.configuration
                )

        if kwargs['_check_input_type'] is False:
            return

        for key, value in six.iteritems(kwargs):
            fixed_val = validate_and_convert_types(
                value,
                self.openapi_types[key],
                [key],
                False,
                kwargs['_check_input_type'],
                configuration=self.api_client.configuration
            )
            kwargs[key] = fixed_val

    def __gather_params(self, kwargs):
        params = {
            'body': None,
            'collection_format': {},
            'file': {},
            'form': [],
            'header': {},
            'path': {},
            'query': []
        }

        for param_name, param_value in six.iteritems(kwargs):
            param_location = self.location_map.get(param_name)
            if param_location is None:
                continue
            if param_location:
                if param_location == 'body':
                    params['body'] = param_value
                    continue
                base_name = self.attribute_map[param_name]
                if (param_location == 'form' and
                        self.openapi_types[param_name] == (file_type,)):
                    params['file'][param_name] = [param_value]
                elif (param_location == 'form' and
                        self.openapi_types[param_name] == ([file_type],)):
                    # param_value is already a list
                    params['file'][param_name] = param_value
                elif param_location in {'form', 'query'}:
                    param_value_full = (base_name, param_value)
                    params[param_location].append(param_value_full)
                if param_location not in {'form', 'query'}:
                    params[param_location][base_name] = param_value
                collection_format = self.collection_format_map.get(param_name)
                if collection_format:
                    params['collection_format'][base_name] = collection_format

        return params

    def __call__(self, *args, **kwargs):
        """ This method is invoked when endpoints are called
        Example:
        pet_api = PetApi()
        pet_api.add_pet  # this is an instance of the class Endpoint
        pet_api.add_pet()  # this invokes pet_api.add_pet.__call__()
        which then invokes the callable functions stored in that endpoint at
        pet_api.add_pet.callable or self.callable in this class
        """
        return self.callable(self, *args, **kwargs)

    def call_with_http_info(self, **kwargs):

        try:
            _host = self.settings['servers'][kwargs['_host_index']]
        except IndexError:
            if self.settings['servers']:
                raise ApiValueError(
                    "Invalid host index. Must be 0 <= index < %s" %
                    len(self.settings['servers'])
                )
            _host = None

        for key, value in six.iteritems(kwargs):
            if key not in self.params_map['all']:
                raise ApiTypeError(
                    "Got an unexpected parameter '%s'"
                    " to method `%s`" %
                    (key, self.settings['operation_id'])
                )
            # only throw this nullable ApiValueError if _check_input_type
            # is False, if _check_input_type==True we catch this case
            # in self.__validate_inputs
            if (key not in self.params_map['nullable'] and value is None
                    and kwargs['_check_input_type'] is False):
                raise ApiValueError(
                    "Value may not be None for non-nullable parameter `%s`"
                    " when calling `%s`" %
                    (key, self.settings['operation_id'])
                )

        for key in self.params_map['required']:
            if key not in kwargs.keys():
                raise ApiValueError(
                    "Missing the required parameter `%s` when calling "
                    "`%s`" % (key, self.settings['operation_id'])
                )

        self.__validate_inputs(kwargs)

        params = self.__gather_params(kwargs)

        accept_headers_list = self.headers_map['accept']
        if accept_headers_list:
            params['header']['Accept'] = self.api_client.select_header_accept(
                accept_headers_list)

        content_type_headers_list = self.headers_map['content_type']
        if content_type_headers_list:
            header_list = self.api_client.select_header_content_type(
                content_type_headers_list)
            params['header']['Content-Type'] = header_list

        return self.api_client.call_api(
            self.settings['endpoint_path'], self.settings['http_method'],
            params['path'],
            params['query'],
            params['header'],
            body=params['body'],
            post_params=params['form'],
            files=params['file'],
            response_type=self.settings['response_type'],
            auth_settings=self.settings['auth'],
            async_req=kwargs['async_req'],
            _check_type=kwargs['_check_return_type'],
            _return_http_data_only=kwargs['_return_http_data_only'],
            _preload_content=kwargs['_preload_content'],
            _request_timeout=kwargs['_request_timeout'],
            _host=_host,
            collection_formats=params['collection_format'])
