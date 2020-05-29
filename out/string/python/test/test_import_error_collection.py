# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import airflow_client
from airflow_client.models.import_error_collection import ImportErrorCollection  # noqa: E501
from airflow_client.rest import ApiException

class TestImportErrorCollection(unittest.TestCase):
    """ImportErrorCollection unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ImportErrorCollection
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = airflow_client.models.import_error_collection.ImportErrorCollection()  # noqa: E501
        if include_optional :
            return ImportErrorCollection(
                import_errors = [
                    airflow_client.models.import_error.ImportError(
                        import_error_id = 56, 
                        timestamp = '0', 
                        filename = '0', 
                        stack_trace = '0', )
                    ]
            )
        else :
            return ImportErrorCollection(
        )

    def testImportErrorCollection(self):
        """Test ImportErrorCollection"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()