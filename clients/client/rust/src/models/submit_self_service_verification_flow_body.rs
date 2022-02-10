/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.88
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// SubmitSelfServiceVerificationFlowBody : nolint:deadcode,unused


#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "method")]
pub enum SubmitSelfServiceVerificationFlowBody {
    #[serde(rename="link")]
    SubmitSelfServiceVerificationFlowWithLinkMethodBody {
        /// Sending the anti-csrf token is only required for browser login flows.
        #[serde(rename = "csrf_token", skip_serializing_if = "Option::is_none")]
        csrf_token: Option<String>,
        /// Email to Verify  Needs to be set when initiating the flow. If the email is a registered verification email, a verification link will be sent. If the email is not known, a email with details on what happened will be sent instead.  format: email
        #[serde(rename = "email")]
        email: String,
    },
}




