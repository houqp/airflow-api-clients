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
from airflow_client.models.extra_link_collection import ExtraLinkCollection  # noqa: E501
from airflow_client.rest import ApiException

class TestExtraLinkCollection(unittest.TestCase):
    """ExtraLinkCollection unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test ExtraLinkCollection
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = airflow_client.models.extra_link_collection.ExtraLinkCollection()  # noqa: E501
        if include_optional :
            return ExtraLinkCollection(
                extra_links = [
                    airflow_client.models.extra_link.ExtraLink(
                        class_ref = airflow_client.models.class_reference.ClassReference(
                            module_path = '0', 
                            class_name = '0', ), 
                        name = '0', 
                        href = '0', )
                    ]
            )
        else :
            return ExtraLinkCollection(
        )

    def testExtraLinkCollection(self):
        """Test ExtraLinkCollection"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()