/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.188
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

/**
 * ProvisionMockSubscriptionPayload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T13:48:24.946825497Z[Etc/UTC]")
public class ProvisionMockSubscriptionPayload {
  public static final String SERIALIZED_NAME_IDENTITY_ID = "identity_id";
  @SerializedName(SERIALIZED_NAME_IDENTITY_ID)
  private UUID identityId;

  public static final String SERIALIZED_NAME_PLAN_OR_PRICE = "plan_or_price";
  @SerializedName(SERIALIZED_NAME_PLAN_OR_PRICE)
  private String planOrPrice;

  public ProvisionMockSubscriptionPayload() { 
  }

  public ProvisionMockSubscriptionPayload identityId(UUID identityId) {
    
    this.identityId = identityId;
    return this;
  }

   /**
   * Get identityId
   * @return identityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getIdentityId() {
    return identityId;
  }


  public void setIdentityId(UUID identityId) {
    this.identityId = identityId;
  }


  public ProvisionMockSubscriptionPayload planOrPrice(String planOrPrice) {
    
    this.planOrPrice = planOrPrice;
    return this;
  }

   /**
   * Get planOrPrice
   * @return planOrPrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPlanOrPrice() {
    return planOrPrice;
  }


  public void setPlanOrPrice(String planOrPrice) {
    this.planOrPrice = planOrPrice;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionMockSubscriptionPayload provisionMockSubscriptionPayload = (ProvisionMockSubscriptionPayload) o;
    return Objects.equals(this.identityId, provisionMockSubscriptionPayload.identityId) &&
        Objects.equals(this.planOrPrice, provisionMockSubscriptionPayload.planOrPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, planOrPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionMockSubscriptionPayload {\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    planOrPrice: ").append(toIndentedString(planOrPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

