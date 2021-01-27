// Code generated by go-swagger; DO NOT EDIT.

package admin

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"fmt"
	"io"

	"github.com/go-openapi/runtime"
	"github.com/go-openapi/strfmt"

	"github.com/ory/hydra-client-go/models"
)

// AcceptLogoutRequestReader is a Reader for the AcceptLogoutRequest structure.
type AcceptLogoutRequestReader struct {
	formats strfmt.Registry
}

// ReadResponse reads a server response into the received o.
func (o *AcceptLogoutRequestReader) ReadResponse(response runtime.ClientResponse, consumer runtime.Consumer) (interface{}, error) {
	switch response.Code() {
	case 200:
		result := NewAcceptLogoutRequestOK()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return result, nil
	case 404:
		result := NewAcceptLogoutRequestNotFound()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	case 500:
		result := NewAcceptLogoutRequestInternalServerError()
		if err := result.readResponse(response, consumer, o.formats); err != nil {
			return nil, err
		}
		return nil, result
	default:
		return nil, runtime.NewAPIError("response status code does not match any response statuses defined for this endpoint in the swagger spec", response, response.Code())
	}
}

// NewAcceptLogoutRequestOK creates a AcceptLogoutRequestOK with default headers values
func NewAcceptLogoutRequestOK() *AcceptLogoutRequestOK {
	return &AcceptLogoutRequestOK{}
}

/* AcceptLogoutRequestOK describes a response with status code 200, with default header values.

completedRequest
*/
type AcceptLogoutRequestOK struct {
	Payload *models.CompletedRequest
}

func (o *AcceptLogoutRequestOK) Error() string {
	return fmt.Sprintf("[PUT /oauth2/auth/requests/logout/accept][%d] acceptLogoutRequestOK  %+v", 200, o.Payload)
}
func (o *AcceptLogoutRequestOK) GetPayload() *models.CompletedRequest {
	return o.Payload
}

func (o *AcceptLogoutRequestOK) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.CompletedRequest)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAcceptLogoutRequestNotFound creates a AcceptLogoutRequestNotFound with default headers values
func NewAcceptLogoutRequestNotFound() *AcceptLogoutRequestNotFound {
	return &AcceptLogoutRequestNotFound{}
}

/* AcceptLogoutRequestNotFound describes a response with status code 404, with default header values.

genericError
*/
type AcceptLogoutRequestNotFound struct {
	Payload *models.GenericError
}

func (o *AcceptLogoutRequestNotFound) Error() string {
	return fmt.Sprintf("[PUT /oauth2/auth/requests/logout/accept][%d] acceptLogoutRequestNotFound  %+v", 404, o.Payload)
}
func (o *AcceptLogoutRequestNotFound) GetPayload() *models.GenericError {
	return o.Payload
}

func (o *AcceptLogoutRequestNotFound) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.GenericError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}

// NewAcceptLogoutRequestInternalServerError creates a AcceptLogoutRequestInternalServerError with default headers values
func NewAcceptLogoutRequestInternalServerError() *AcceptLogoutRequestInternalServerError {
	return &AcceptLogoutRequestInternalServerError{}
}

/* AcceptLogoutRequestInternalServerError describes a response with status code 500, with default header values.

genericError
*/
type AcceptLogoutRequestInternalServerError struct {
	Payload *models.GenericError
}

func (o *AcceptLogoutRequestInternalServerError) Error() string {
	return fmt.Sprintf("[PUT /oauth2/auth/requests/logout/accept][%d] acceptLogoutRequestInternalServerError  %+v", 500, o.Payload)
}
func (o *AcceptLogoutRequestInternalServerError) GetPayload() *models.GenericError {
	return o.Payload
}

func (o *AcceptLogoutRequestInternalServerError) readResponse(response runtime.ClientResponse, consumer runtime.Consumer, formats strfmt.Registry) error {

	o.Payload = new(models.GenericError)

	// response payload
	if err := consumer.Consume(response.Body(), o.Payload); err != nil && err != io.EOF {
		return err
	}

	return nil
}
