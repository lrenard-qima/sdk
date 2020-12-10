# coding: utf-8

"""
    ORY Oathkeeper

    ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.  # noqa: E501

    The version of the OpenAPI document: v0.38.5-beta.1
    Contact: hi@ory.am
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from ory_oathkeeper_client.configuration import Configuration


class Upstream(object):
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
        'preserve_host': 'bool',
        'strip_path': 'str',
        'url': 'str'
    }

    attribute_map = {
        'preserve_host': 'preserve_host',
        'strip_path': 'strip_path',
        'url': 'url'
    }

    def __init__(self, preserve_host=None, strip_path=None, url=None, local_vars_configuration=None):  # noqa: E501
        """Upstream - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._preserve_host = None
        self._strip_path = None
        self._url = None
        self.discriminator = None

        if preserve_host is not None:
            self.preserve_host = preserve_host
        if strip_path is not None:
            self.strip_path = strip_path
        if url is not None:
            self.url = url

    @property
    def preserve_host(self):
        """Gets the preserve_host of this Upstream.  # noqa: E501

        PreserveHost, if false (the default), tells ORY Oathkeeper to set the upstream request's Host header to the hostname of the API's upstream's URL. Setting this flag to true instructs ORY Oathkeeper not to do so.  # noqa: E501

        :return: The preserve_host of this Upstream.  # noqa: E501
        :rtype: bool
        """
        return self._preserve_host

    @preserve_host.setter
    def preserve_host(self, preserve_host):
        """Sets the preserve_host of this Upstream.

        PreserveHost, if false (the default), tells ORY Oathkeeper to set the upstream request's Host header to the hostname of the API's upstream's URL. Setting this flag to true instructs ORY Oathkeeper not to do so.  # noqa: E501

        :param preserve_host: The preserve_host of this Upstream.  # noqa: E501
        :type: bool
        """

        self._preserve_host = preserve_host

    @property
    def strip_path(self):
        """Gets the strip_path of this Upstream.  # noqa: E501

        StripPath if set, replaces the provided path prefix when forwarding the requested URL to the upstream URL.  # noqa: E501

        :return: The strip_path of this Upstream.  # noqa: E501
        :rtype: str
        """
        return self._strip_path

    @strip_path.setter
    def strip_path(self, strip_path):
        """Sets the strip_path of this Upstream.

        StripPath if set, replaces the provided path prefix when forwarding the requested URL to the upstream URL.  # noqa: E501

        :param strip_path: The strip_path of this Upstream.  # noqa: E501
        :type: str
        """

        self._strip_path = strip_path

    @property
    def url(self):
        """Gets the url of this Upstream.  # noqa: E501

        URL is the URL the request will be proxied to.  # noqa: E501

        :return: The url of this Upstream.  # noqa: E501
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url):
        """Sets the url of this Upstream.

        URL is the URL the request will be proxied to.  # noqa: E501

        :param url: The url of this Upstream.  # noqa: E501
        :type: str
        """

        self._url = url

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
        if not isinstance(other, Upstream):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, Upstream):
            return True

        return self.to_dict() != other.to_dict()
