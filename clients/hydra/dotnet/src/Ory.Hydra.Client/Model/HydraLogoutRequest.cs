/* 
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.0-alpha.1
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// HydraLogoutRequest
    /// </summary>
    [DataContract]
    public partial class HydraLogoutRequest :  IEquatable<HydraLogoutRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraLogoutRequest" /> class.
        /// </summary>
        /// <param name="requestUrl">RequestURL is the original Logout URL requested..</param>
        /// <param name="rpInitiated">RPInitiated is set to true if the request was initiated by a Relying Party (RP), also known as an OAuth 2.0 Client..</param>
        /// <param name="sid">SessionID is the login session ID that was requested to log out..</param>
        /// <param name="subject">Subject is the user for whom the logout was request..</param>
        public HydraLogoutRequest(string requestUrl = default(string), bool rpInitiated = default(bool), string sid = default(string), string subject = default(string))
        {
            this.RequestUrl = requestUrl;
            this.RpInitiated = rpInitiated;
            this.Sid = sid;
            this.Subject = subject;
        }
        
        /// <summary>
        /// RequestURL is the original Logout URL requested.
        /// </summary>
        /// <value>RequestURL is the original Logout URL requested.</value>
        [DataMember(Name="request_url", EmitDefaultValue=false)]
        public string RequestUrl { get; set; }

        /// <summary>
        /// RPInitiated is set to true if the request was initiated by a Relying Party (RP), also known as an OAuth 2.0 Client.
        /// </summary>
        /// <value>RPInitiated is set to true if the request was initiated by a Relying Party (RP), also known as an OAuth 2.0 Client.</value>
        [DataMember(Name="rp_initiated", EmitDefaultValue=false)]
        public bool RpInitiated { get; set; }

        /// <summary>
        /// SessionID is the login session ID that was requested to log out.
        /// </summary>
        /// <value>SessionID is the login session ID that was requested to log out.</value>
        [DataMember(Name="sid", EmitDefaultValue=false)]
        public string Sid { get; set; }

        /// <summary>
        /// Subject is the user for whom the logout was request.
        /// </summary>
        /// <value>Subject is the user for whom the logout was request.</value>
        [DataMember(Name="subject", EmitDefaultValue=false)]
        public string Subject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HydraLogoutRequest {\n");
            sb.Append("  RequestUrl: ").Append(RequestUrl).Append("\n");
            sb.Append("  RpInitiated: ").Append(RpInitiated).Append("\n");
            sb.Append("  Sid: ").Append(Sid).Append("\n");
            sb.Append("  Subject: ").Append(Subject).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as HydraLogoutRequest);
        }

        /// <summary>
        /// Returns true if HydraLogoutRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraLogoutRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraLogoutRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestUrl == input.RequestUrl ||
                    (this.RequestUrl != null &&
                    this.RequestUrl.Equals(input.RequestUrl))
                ) && 
                (
                    this.RpInitiated == input.RpInitiated ||
                    this.RpInitiated.Equals(input.RpInitiated)
                ) && 
                (
                    this.Sid == input.Sid ||
                    (this.Sid != null &&
                    this.Sid.Equals(input.Sid))
                ) && 
                (
                    this.Subject == input.Subject ||
                    (this.Subject != null &&
                    this.Subject.Equals(input.Subject))
                );
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
                if (this.RequestUrl != null)
                    hashCode = hashCode * 59 + this.RequestUrl.GetHashCode();
                hashCode = hashCode * 59 + this.RpInitiated.GetHashCode();
                if (this.Sid != null)
                    hashCode = hashCode * 59 + this.Sid.GetHashCode();
                if (this.Subject != null)
                    hashCode = hashCode * 59 + this.Subject.GetHashCode();
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
