/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.1
 * 
 * Generated by: https://openapi-generator.tech
 */

/// PluginConfigNetwork : PluginConfigNetwork plugin config network



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct PluginConfigNetwork {
    /// type
    #[serde(rename = "Type")]
    pub _type: String,
}

impl PluginConfigNetwork {
    /// PluginConfigNetwork plugin config network
    pub fn new(_type: String) -> PluginConfigNetwork {
        PluginConfigNetwork {
            _type,
        }
    }
}


