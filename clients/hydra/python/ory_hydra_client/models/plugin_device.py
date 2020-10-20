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


class PluginDevice(object):
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
        'description': 'str',
        'name': 'str',
        'path': 'str',
        'settable': 'list[str]'
    }

    attribute_map = {
        'description': 'Description',
        'name': 'Name',
        'path': 'Path',
        'settable': 'Settable'
    }

    def __init__(self, description=None, name=None, path=None, settable=None, local_vars_configuration=None):  # noqa: E501
        """PluginDevice - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._description = None
        self._name = None
        self._path = None
        self._settable = None
        self.discriminator = None

        self.description = description
        self.name = name
        self.path = path
        self.settable = settable

    @property
    def description(self):
        """Gets the description of this PluginDevice.  # noqa: E501

        description  # noqa: E501

        :return: The description of this PluginDevice.  # noqa: E501
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """Sets the description of this PluginDevice.

        description  # noqa: E501

        :param description: The description of this PluginDevice.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and description is None:  # noqa: E501
            raise ValueError("Invalid value for `description`, must not be `None`")  # noqa: E501

        self._description = description

    @property
    def name(self):
        """Gets the name of this PluginDevice.  # noqa: E501

        name  # noqa: E501

        :return: The name of this PluginDevice.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this PluginDevice.

        name  # noqa: E501

        :param name: The name of this PluginDevice.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and name is None:  # noqa: E501
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def path(self):
        """Gets the path of this PluginDevice.  # noqa: E501

        path  # noqa: E501

        :return: The path of this PluginDevice.  # noqa: E501
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path):
        """Sets the path of this PluginDevice.

        path  # noqa: E501

        :param path: The path of this PluginDevice.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and path is None:  # noqa: E501
            raise ValueError("Invalid value for `path`, must not be `None`")  # noqa: E501

        self._path = path

    @property
    def settable(self):
        """Gets the settable of this PluginDevice.  # noqa: E501

        settable  # noqa: E501

        :return: The settable of this PluginDevice.  # noqa: E501
        :rtype: list[str]
        """
        return self._settable

    @settable.setter
    def settable(self, settable):
        """Sets the settable of this PluginDevice.

        settable  # noqa: E501

        :param settable: The settable of this PluginDevice.  # noqa: E501
        :type: list[str]
        """
        if self.local_vars_configuration.client_side_validation and settable is None:  # noqa: E501
            raise ValueError("Invalid value for `settable`, must not be `None`")  # noqa: E501

        self._settable = settable

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
        if not isinstance(other, PluginDevice):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, PluginDevice):
            return True

        return self.to_dict() != other.to_dict()
