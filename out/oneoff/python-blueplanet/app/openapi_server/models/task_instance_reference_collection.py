# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.task_instance_reference import TaskInstanceReference  # noqa: F401,E501
from openapi_server import util


class TaskInstanceReferenceCollection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, task_instances: List[TaskInstanceReference]=None):  # noqa: E501
        """TaskInstanceReferenceCollection - a model defined in Swagger

        :param task_instances: The task_instances of this TaskInstanceReferenceCollection.  # noqa: E501
        :type task_instances: List[TaskInstanceReference]
        """
        self.swagger_types = {
            'task_instances': List[TaskInstanceReference]
        }

        self.attribute_map = {
            'task_instances': 'task_instances'
        }

        self._task_instances = task_instances

    @classmethod
    def from_dict(cls, dikt) -> 'TaskInstanceReferenceCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskInstanceReferenceCollection of this TaskInstanceReferenceCollection.  # noqa: E501
        :rtype: TaskInstanceReferenceCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def task_instances(self) -> List[TaskInstanceReference]:
        """Gets the task_instances of this TaskInstanceReferenceCollection.


        :return: The task_instances of this TaskInstanceReferenceCollection.
        :rtype: List[TaskInstanceReference]
        """
        return self._task_instances

    @task_instances.setter
    def task_instances(self, task_instances: List[TaskInstanceReference]):
        """Sets the task_instances of this TaskInstanceReferenceCollection.


        :param task_instances: The task_instances of this TaskInstanceReferenceCollection.
        :type task_instances: List[TaskInstanceReference]
        """

        self._task_instances = task_instances
