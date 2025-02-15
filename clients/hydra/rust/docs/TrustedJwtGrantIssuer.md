# TrustedJwtGrantIssuer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | Option<**String**> | The \"created_at\" indicates, when grant was created. | [optional]
**expires_at** | Option<**String**> | The \"expires_at\" indicates, when grant will expire, so we will reject assertion from \"issuer\" targeting \"subject\". | [optional]
**id** | Option<**String**> |  | [optional]
**issuer** | Option<**String**> | The \"issuer\" identifies the principal that issued the JWT assertion (same as \"iss\" claim in JWT). | [optional]
**public_key** | Option<[**crate::models::TrustedJsonWebKey**](trustedJsonWebKey.md)> |  | [optional]
**scope** | Option<**Vec<String>**> | The \"scope\" contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749]) | [optional]
**subject** | Option<**String**> | The \"subject\" identifies the principal that is the subject of the JWT. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


