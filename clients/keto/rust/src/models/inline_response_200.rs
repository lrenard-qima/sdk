/*
 * Ory Keto API
 *
 * Documentation for all of Ory Keto's REST APIs. gRPC is documented separately. 
 *
 * The version of the OpenAPI document: v0.8.0-alpha.2
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse200 {
    /// Always \"ok\".
    #[serde(rename = "status")]
    pub status: String,
}

impl InlineResponse200 {
    pub fn new(status: String) -> InlineResponse200 {
        InlineResponse200 {
            status,
        }
    }
}


