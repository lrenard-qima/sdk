// Code generated by go-swagger; DO NOT EDIT.

package models

// This file was generated by the swagger tool.
// Editing this file might prove futile when you re-run the swagger generate command

import (
	"context"

	"github.com/go-openapi/strfmt"
	"github.com/go-openapi/swag"
)

// OryAccessControlPolicyRole oryAccessControlPolicyRole represents a group of users that share the same role. A role could be an administrator, a moderator, a regular
// user or some other sort of role.
//
// swagger:model oryAccessControlPolicyRole
type OryAccessControlPolicyRole struct {

	// ID is the role's unique id.
	ID string `json:"id,omitempty"`

	// Members is who belongs to the role.
	Members []string `json:"members"`
}

// Validate validates this ory access control policy role
func (m *OryAccessControlPolicyRole) Validate(formats strfmt.Registry) error {
	return nil
}

// ContextValidate validates this ory access control policy role based on context it is used
func (m *OryAccessControlPolicyRole) ContextValidate(ctx context.Context, formats strfmt.Registry) error {
	return nil
}

// MarshalBinary interface implementation
func (m *OryAccessControlPolicyRole) MarshalBinary() ([]byte, error) {
	if m == nil {
		return nil, nil
	}
	return swag.WriteJSON(m)
}

// UnmarshalBinary interface implementation
func (m *OryAccessControlPolicyRole) UnmarshalBinary(b []byte) error {
	var res OryAccessControlPolicyRole
	if err := swag.ReadJSON(b, &res); err != nil {
		return err
	}
	*m = res
	return nil
}
