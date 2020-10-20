# coding: utf-8

"""
    ORY Hydra

    Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.  # noqa: E501

    The version of the OpenAPI document: v1.9.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_hydra_client.configuration import Configuration


class PluginConfigUser(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'gid': 'int',
        'uid': 'int'
    }

    attribute_map = {
        'gid': 'GID',
        'uid': 'UID'
    }

    def __init__(self, gid=None, uid=None, local_vars_configuration=None):  # noqa: E501
        """PluginConfigUser - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._gid = None
        self._uid = None
        self.discriminator = None

        if gid is not None:
            self.gid = gid
        if uid is not None:
            self.uid = uid

    @property
    def gid(self):
        """Gets the gid of this PluginConfigUser.  # noqa: E501

        g ID  # noqa: E501

        :return: The gid of this PluginConfigUser.  # noqa: E501
        :rtype: int
        """
        return self._gid

    @gid.setter
    def gid(self, gid):
        """Sets the gid of this PluginConfigUser.

        g ID  # noqa: E501

        :param gid: The gid of this PluginConfigUser.  # noqa: E501
        :type: int
        """

        self._gid = gid

    @property
    def uid(self):
        """Gets the uid of this PluginConfigUser.  # noqa: E501

        UID  # noqa: E501

        :return: The uid of this PluginConfigUser.  # noqa: E501
        :rtype: int
        """
        return self._uid

    @uid.setter
    def uid(self, uid):
        """Sets the uid of this PluginConfigUser.

        UID  # noqa: E501

        :param uid: The uid of this PluginConfigUser.  # noqa: E501
        :type: int
        """

        self._uid = uid

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, PluginConfigUser):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PluginConfigUser):
            return True

        return self.to_dict() != other.to_dict()
