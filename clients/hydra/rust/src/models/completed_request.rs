/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.1
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct CompletedRequest {
    /// RedirectURL is the URL which you should redirect the user to once the authentication process is completed.
    #[serde(rename = "redirect_to")]
    pub redirect_to: String,
}

impl CompletedRequest {
    pub fn new(redirect_to: String) -> CompletedRequest {
        CompletedRequest {
            redirect_to,
        }
    }
}


