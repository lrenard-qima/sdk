/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.30
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientProjectWebAuthnConfig
    /// </summary>
    [DataContract(Name = "projectWebAuthnConfig")]
    public partial class ClientProjectWebAuthnConfig : IEquatable<ClientProjectWebAuthnConfig>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectWebAuthnConfig" /> class.
        /// </summary>
        /// <param name="enabled">Set to true to enable the WebAuthn authentication method..</param>
        /// <param name="rpDisplayName">The display name to show in the authenticator..</param>
        /// <param name="rpIcon">A URL to an icon which might be shown in the authenticator..</param>
        /// <param name="rpId">This must be the hostname of the login page..</param>
        /// <param name="rpOrigin">This must be the scheme://hostname of the login page..</param>
        public ClientProjectWebAuthnConfig(bool enabled = default(bool), string rpDisplayName = default(string), string rpIcon = default(string), string rpId = default(string), string rpOrigin = default(string))
        {
            this.Enabled = enabled;
            this.RpDisplayName = rpDisplayName;
            this.RpIcon = rpIcon;
            this.RpId = rpId;
            this.RpOrigin = rpOrigin;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Set to true to enable the WebAuthn authentication method.
        /// </summary>
        /// <value>Set to true to enable the WebAuthn authentication method.</value>
        [DataMember(Name = "enabled", EmitDefaultValue = true)]
        public bool Enabled { get; set; }

        /// <summary>
        /// The display name to show in the authenticator.
        /// </summary>
        /// <value>The display name to show in the authenticator.</value>
        [DataMember(Name = "rp_display_name", EmitDefaultValue = false)]
        public string RpDisplayName { get; set; }

        /// <summary>
        /// A URL to an icon which might be shown in the authenticator.
        /// </summary>
        /// <value>A URL to an icon which might be shown in the authenticator.</value>
        [DataMember(Name = "rp_icon", EmitDefaultValue = false)]
        public string RpIcon { get; set; }

        /// <summary>
        /// This must be the hostname of the login page.
        /// </summary>
        /// <value>This must be the hostname of the login page.</value>
        [DataMember(Name = "rp_id", EmitDefaultValue = false)]
        public string RpId { get; set; }

        /// <summary>
        /// This must be the scheme://hostname of the login page.
        /// </summary>
        /// <value>This must be the scheme://hostname of the login page.</value>
        [DataMember(Name = "rp_origin", EmitDefaultValue = false)]
        public string RpOrigin { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ClientProjectWebAuthnConfig {\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  RpDisplayName: ").Append(RpDisplayName).Append("\n");
            sb.Append("  RpIcon: ").Append(RpIcon).Append("\n");
            sb.Append("  RpId: ").Append(RpId).Append("\n");
            sb.Append("  RpOrigin: ").Append(RpOrigin).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientProjectWebAuthnConfig);
        }

        /// <summary>
        /// Returns true if ClientProjectWebAuthnConfig instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientProjectWebAuthnConfig to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientProjectWebAuthnConfig input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Enabled == input.Enabled ||
                    this.Enabled.Equals(input.Enabled)
                ) && 
                (
                    this.RpDisplayName == input.RpDisplayName ||
                    (this.RpDisplayName != null &&
                    this.RpDisplayName.Equals(input.RpDisplayName))
                ) && 
                (
                    this.RpIcon == input.RpIcon ||
                    (this.RpIcon != null &&
                    this.RpIcon.Equals(input.RpIcon))
                ) && 
                (
                    this.RpId == input.RpId ||
                    (this.RpId != null &&
                    this.RpId.Equals(input.RpId))
                ) && 
                (
                    this.RpOrigin == input.RpOrigin ||
                    (this.RpOrigin != null &&
                    this.RpOrigin.Equals(input.RpOrigin))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                hashCode = hashCode * 59 + this.Enabled.GetHashCode();
                if (this.RpDisplayName != null)
                    hashCode = hashCode * 59 + this.RpDisplayName.GetHashCode();
                if (this.RpIcon != null)
                    hashCode = hashCode * 59 + this.RpIcon.GetHashCode();
                if (this.RpId != null)
                    hashCode = hashCode * 59 + this.RpId.GetHashCode();
                if (this.RpOrigin != null)
                    hashCode = hashCode * 59 + this.RpOrigin.GetHashCode();
                if (this.AdditionalProperties != null)
                    hashCode = hashCode * 59 + this.AdditionalProperties.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
