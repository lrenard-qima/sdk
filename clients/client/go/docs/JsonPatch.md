# JsonPatch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Op** | **string** | The JSON Patch operation | 
**Path** | **string** | The JSON Pointer to the target key | 
**Value** | Pointer to **interface{}** | The value to be used. Only available for &#x60;add&#x60; and &#x60;replace&#x60; operations. | [optional] 

## Methods

### NewJsonPatch

`func NewJsonPatch(op string, path string, ) *JsonPatch`

NewJsonPatch instantiates a new JsonPatch object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewJsonPatchWithDefaults

`func NewJsonPatchWithDefaults() *JsonPatch`

NewJsonPatchWithDefaults instantiates a new JsonPatch object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOp

`func (o *JsonPatch) GetOp() string`

GetOp returns the Op field if non-nil, zero value otherwise.

### GetOpOk

`func (o *JsonPatch) GetOpOk() (*string, bool)`

GetOpOk returns a tuple with the Op field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOp

`func (o *JsonPatch) SetOp(v string)`

SetOp sets Op field to given value.


### GetPath

`func (o *JsonPatch) GetPath() string`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *JsonPatch) GetPathOk() (*string, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *JsonPatch) SetPath(v string)`

SetPath sets Path field to given value.


### GetValue

`func (o *JsonPatch) GetValue() interface{}`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *JsonPatch) GetValueOk() (*interface{}, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *JsonPatch) SetValue(v interface{})`

SetValue sets Value field to given value.

### HasValue

`func (o *JsonPatch) HasValue() bool`

HasValue returns a boolean if a field has been set.

### SetValueNil

`func (o *JsonPatch) SetValueNil(b bool)`

 SetValueNil sets the value for Value to be an explicit nil

### UnsetValue
`func (o *JsonPatch) UnsetValue()`

UnsetValue ensures that no value is present for Value, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


