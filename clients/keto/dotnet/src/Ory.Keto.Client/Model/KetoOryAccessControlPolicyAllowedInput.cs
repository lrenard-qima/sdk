/*
 * ORY Keto
 *
 * Ory Keto is a cloud native access control server providing best-practice patterns (RBAC, ABAC, ACL, AWS IAM Policies, Kubernetes Roles, ...) via REST APIs.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.58
 * Contact: hi@ory.sh
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
using OpenAPIDateConverter = Ory.Keto.Client.Client.OpenAPIDateConverter;

namespace Ory.Keto.Client.Model
{
    /// <summary>
    /// KetoOryAccessControlPolicyAllowedInput
    /// </summary>
    [DataContract(Name = "oryAccessControlPolicyAllowedInput")]
    public partial class KetoOryAccessControlPolicyAllowedInput : IEquatable<KetoOryAccessControlPolicyAllowedInput>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="KetoOryAccessControlPolicyAllowedInput" /> class.
        /// </summary>
        /// <param name="action">Action is the action that is requested on the resource..</param>
        /// <param name="context">Context is the request&#39;s environmental context..</param>
        /// <param name="resource">Resource is the resource that access is requested to..</param>
        /// <param name="subject">Subject is the subject that is requesting access..</param>
        public KetoOryAccessControlPolicyAllowedInput(string action = default(string), Object context = default(Object), string resource = default(string), string subject = default(string))
        {
            this.Action = action;
            this.Context = context;
            this.Resource = resource;
            this.Subject = subject;
        }

        /// <summary>
        /// Action is the action that is requested on the resource.
        /// </summary>
        /// <value>Action is the action that is requested on the resource.</value>
        [DataMember(Name = "action", EmitDefaultValue = false)]
        public string Action { get; set; }

        /// <summary>
        /// Context is the request&#39;s environmental context.
        /// </summary>
        /// <value>Context is the request&#39;s environmental context.</value>
        [DataMember(Name = "context", EmitDefaultValue = false)]
        public Object Context { get; set; }

        /// <summary>
        /// Resource is the resource that access is requested to.
        /// </summary>
        /// <value>Resource is the resource that access is requested to.</value>
        [DataMember(Name = "resource", EmitDefaultValue = false)]
        public string Resource { get; set; }

        /// <summary>
        /// Subject is the subject that is requesting access.
        /// </summary>
        /// <value>Subject is the subject that is requesting access.</value>
        [DataMember(Name = "subject", EmitDefaultValue = false)]
        public string Subject { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class KetoOryAccessControlPolicyAllowedInput {\n");
            sb.Append("  Action: ").Append(Action).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  Resource: ").Append(Resource).Append("\n");
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
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as KetoOryAccessControlPolicyAllowedInput);
        }

        /// <summary>
        /// Returns true if KetoOryAccessControlPolicyAllowedInput instances are equal
        /// </summary>
        /// <param name="input">Instance of KetoOryAccessControlPolicyAllowedInput to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(KetoOryAccessControlPolicyAllowedInput input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Action == input.Action ||
                    (this.Action != null &&
                    this.Action.Equals(input.Action))
                ) && 
                (
                    this.Context == input.Context ||
                    (this.Context != null &&
                    this.Context.Equals(input.Context))
                ) && 
                (
                    this.Resource == input.Resource ||
                    (this.Resource != null &&
                    this.Resource.Equals(input.Resource))
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
                if (this.Action != null)
                    hashCode = hashCode * 59 + this.Action.GetHashCode();
                if (this.Context != null)
                    hashCode = hashCode * 59 + this.Context.GetHashCode();
                if (this.Resource != null)
                    hashCode = hashCode * 59 + this.Resource.GetHashCode();
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
