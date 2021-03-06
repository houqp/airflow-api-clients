# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model_ import Model
from openapi_server.models.dag_state import DagState
from openapi_server.models.one_ofobjectstring import OneOfobjectstring
from openapi_server import util

from openapi_server.models.dag_state import DagState  # noqa: E501
from openapi_server.models.one_ofobjectstring import OneOfobjectstring  # noqa: E501

class DAGRun(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dag_run_id=None, dag_id=None, execution_date=None, start_date=None, end_date=None, state=None, external_trigger=True, conf=None):  # noqa: E501
        """DAGRun - a model defined in OpenAPI

        :param dag_run_id: The dag_run_id of this DAGRun.  # noqa: E501
        :type dag_run_id: str
        :param dag_id: The dag_id of this DAGRun.  # noqa: E501
        :type dag_id: str
        :param execution_date: The execution_date of this DAGRun.  # noqa: E501
        :type execution_date: datetime
        :param start_date: The start_date of this DAGRun.  # noqa: E501
        :type start_date: datetime
        :param end_date: The end_date of this DAGRun.  # noqa: E501
        :type end_date: datetime
        :param state: The state of this DAGRun.  # noqa: E501
        :type state: DagState
        :param external_trigger: The external_trigger of this DAGRun.  # noqa: E501
        :type external_trigger: bool
        :param conf: The conf of this DAGRun.  # noqa: E501
        :type conf: OneOfobjectstring
        """
        self.openapi_types = {
            'dag_run_id': str,
            'dag_id': str,
            'execution_date': datetime,
            'start_date': datetime,
            'end_date': datetime,
            'state': DagState,
            'external_trigger': bool,
            'conf': OneOfobjectstring
        }

        self.attribute_map = {
            'dag_run_id': 'dag_run_id',
            'dag_id': 'dag_id',
            'execution_date': 'execution_date',
            'start_date': 'start_date',
            'end_date': 'end_date',
            'state': 'state',
            'external_trigger': 'external_trigger',
            'conf': 'conf'
        }

        self._dag_run_id = dag_run_id
        self._dag_id = dag_id
        self._execution_date = execution_date
        self._start_date = start_date
        self._end_date = end_date
        self._state = state
        self._external_trigger = external_trigger
        self._conf = conf

    @classmethod
    def from_dict(cls, dikt) -> 'DAGRun':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The DAGRun of this DAGRun.  # noqa: E501
        :rtype: DAGRun
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dag_run_id(self):
        """Gets the dag_run_id of this DAGRun.

        Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.   # noqa: E501

        :return: The dag_run_id of this DAGRun.
        :rtype: str
        """
        return self._dag_run_id

    @dag_run_id.setter
    def dag_run_id(self, dag_run_id):
        """Sets the dag_run_id of this DAGRun.

        Run ID. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. If not provided, a value will be generated based on execution_date. If the specified dag_run_id is in use, the creation request fails with an ALREADY_EXISTS error. This together with DAG_ID are a unique key.   # noqa: E501

        :param dag_run_id: The dag_run_id of this DAGRun.
        :type dag_run_id: str
        """

        self._dag_run_id = dag_run_id

    @property
    def dag_id(self):
        """Gets the dag_id of this DAGRun.


        :return: The dag_id of this DAGRun.
        :rtype: str
        """
        return self._dag_id

    @dag_id.setter
    def dag_id(self, dag_id):
        """Sets the dag_id of this DAGRun.


        :param dag_id: The dag_id of this DAGRun.
        :type dag_id: str
        """
        if dag_id is None:
            raise ValueError("Invalid value for `dag_id`, must not be `None`")  # noqa: E501

        self._dag_id = dag_id

    @property
    def execution_date(self):
        """Gets the execution_date of this DAGRun.

        The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.   # noqa: E501

        :return: The execution_date of this DAGRun.
        :rtype: datetime
        """
        return self._execution_date

    @execution_date.setter
    def execution_date(self, execution_date):
        """Sets the execution_date of this DAGRun.

        The execution date. This is the time when the DAG run should be started according to the DAG definition. The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error. This together with DAG_ID are a unique key.   # noqa: E501

        :param execution_date: The execution_date of this DAGRun.
        :type execution_date: datetime
        """

        self._execution_date = execution_date

    @property
    def start_date(self):
        """Gets the start_date of this DAGRun.

        The start time. The time when DAG Run was actually created..   # noqa: E501

        :return: The start_date of this DAGRun.
        :rtype: datetime
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """Sets the start_date of this DAGRun.

        The start time. The time when DAG Run was actually created..   # noqa: E501

        :param start_date: The start_date of this DAGRun.
        :type start_date: datetime
        """

        self._start_date = start_date

    @property
    def end_date(self):
        """Gets the end_date of this DAGRun.


        :return: The end_date of this DAGRun.
        :rtype: datetime
        """
        return self._end_date

    @end_date.setter
    def end_date(self, end_date):
        """Sets the end_date of this DAGRun.


        :param end_date: The end_date of this DAGRun.
        :type end_date: datetime
        """

        self._end_date = end_date

    @property
    def state(self):
        """Gets the state of this DAGRun.


        :return: The state of this DAGRun.
        :rtype: DagState
        """
        return self._state

    @state.setter
    def state(self, state):
        """Sets the state of this DAGRun.


        :param state: The state of this DAGRun.
        :type state: DagState
        """

        self._state = state

    @property
    def external_trigger(self):
        """Gets the external_trigger of this DAGRun.


        :return: The external_trigger of this DAGRun.
        :rtype: bool
        """
        return self._external_trigger

    @external_trigger.setter
    def external_trigger(self, external_trigger):
        """Sets the external_trigger of this DAGRun.


        :param external_trigger: The external_trigger of this DAGRun.
        :type external_trigger: bool
        """

        self._external_trigger = external_trigger

    @property
    def conf(self):
        """Gets the conf of this DAGRun.


        :return: The conf of this DAGRun.
        :rtype: OneOfobjectstring
        """
        return self._conf

    @conf.setter
    def conf(self, conf):
        """Sets the conf of this DAGRun.


        :param conf: The conf of this DAGRun.
        :type conf: OneOfobjectstring
        """

        self._conf = conf
