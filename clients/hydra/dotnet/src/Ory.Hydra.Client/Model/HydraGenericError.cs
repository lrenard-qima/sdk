/*
 * ORY Hydra
 *
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.9.1
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
using OpenAPIDateConverter = Ory.Hydra.Client.Client.OpenAPIDateConverter;

namespace Ory.Hydra.Client.Model
{
    /// <summary>
    /// Error responses are sent when an error (e.g. unauthorized, bad request, ...) occurred.
    /// </summary>
    [DataContract(Name = "genericError")]
    public partial class HydraGenericError : IEquatable<HydraGenericError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraGenericError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected HydraGenericError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="HydraGenericError" /> class.
        /// </summary>
        /// <param name="debug">Debug contains debug information. This is usually not available and has to be enabled..</param>
        /// <param name="error">Name is the error name. (required).</param>
        /// <param name="errorDescription">Description contains further information on the nature of the error..</param>
        /// <param name="statusCode">Code represents the error status code (404, 403, 401, ...)..</param>
        public HydraGenericError(string debug = default(string), string error = default(string), string errorDescription = default(string), long statusCode = default(long))
        {
            // to ensure "error" is required (not null)
            this.Error = error ?? throw new ArgumentNullException("error is a required property for HydraGenericError and cannot be null");
            this.Debug = debug;
            this.ErrorDescription = errorDescription;
            this.StatusCode = statusCode;
        }

        /// <summary>
        /// Debug contains debug information. This is usually not available and has to be enabled.
        /// </summary>
        /// <value>Debug contains debug information. This is usually not available and has to be enabled.</value>
        [DataMember(Name = "debug", EmitDefaultValue = false)]
        public string Debug { get; set; }

        /// <summary>
        /// Name is the error name.
        /// </summary>
        /// <value>Name is the error name.</value>
        [DataMember(Name = "error", IsRequired = true, EmitDefaultValue = false)]
        public string Error { get; set; }

        /// <summary>
        /// Description contains further information on the nature of the error.
        /// </summary>
        /// <value>Description contains further information on the nature of the error.</value>
        [DataMember(Name = "error_description", EmitDefaultValue = false)]
        public string ErrorDescription { get; set; }

        /// <summary>
        /// Code represents the error status code (404, 403, 401, ...).
        /// </summary>
        /// <value>Code represents the error status code (404, 403, 401, ...).</value>
        [DataMember(Name = "status_code", EmitDefaultValue = false)]
        public long StatusCode { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class HydraGenericError {\n");
            sb.Append("  Debug: ").Append(Debug).Append("\n");
            sb.Append("  Error: ").Append(Error).Append("\n");
            sb.Append("  ErrorDescription: ").Append(ErrorDescription).Append("\n");
            sb.Append("  StatusCode: ").Append(StatusCode).Append("\n");
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
            return this.Equals(input as HydraGenericError);
        }

        /// <summary>
        /// Returns true if HydraGenericError instances are equal
        /// </summary>
        /// <param name="input">Instance of HydraGenericError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HydraGenericError input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Debug == input.Debug ||
                    (this.Debug != null &&
                    this.Debug.Equals(input.Debug))
                ) && 
                (
                    this.Error == input.Error ||
                    (this.Error != null &&
                    this.Error.Equals(input.Error))
                ) && 
                (
                    this.ErrorDescription == input.ErrorDescription ||
                    (this.ErrorDescription != null &&
                    this.ErrorDescription.Equals(input.ErrorDescription))
                ) && 
                (
                    this.StatusCode == input.StatusCode ||
                    this.StatusCode.Equals(input.StatusCode)
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
                if (this.Debug != null)
                    hashCode = hashCode * 59 + this.Debug.GetHashCode();
                if (this.Error != null)
                    hashCode = hashCode * 59 + this.Error.GetHashCode();
                if (this.ErrorDescription != null)
                    hashCode = hashCode * 59 + this.ErrorDescription.GetHashCode();
                hashCode = hashCode * 59 + this.StatusCode.GetHashCode();
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
