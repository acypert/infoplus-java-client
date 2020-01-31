/*
 * Infoplus API
 * Infoplus API.
 *
 * OpenAPI spec version: beta
 * Contact: api@infopluscommerce.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.infopluscommerce.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ExternalShippingSystem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-31T10:21:14.851-06:00")
public class ExternalShippingSystem {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("systemType")
  private String systemType = null;

  @SerializedName("scriptId")
  private Integer scriptId = null;

  @SerializedName("explodeAllKitContents")
  private Boolean explodeAllKitContents = false;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("apiSecret")
  private String apiSecret = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public ExternalShippingSystem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalShippingSystem systemType(String systemType) {
    this.systemType = systemType;
    return this;
  }

   /**
   * Get systemType
   * @return systemType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSystemType() {
    return systemType;
  }

  public void setSystemType(String systemType) {
    this.systemType = systemType;
  }

  public ExternalShippingSystem scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  @ApiModelProperty(value = "")
  public Integer getScriptId() {
    return scriptId;
  }

  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  public ExternalShippingSystem explodeAllKitContents(Boolean explodeAllKitContents) {
    this.explodeAllKitContents = explodeAllKitContents;
    return this;
  }

   /**
   * Get explodeAllKitContents
   * @return explodeAllKitContents
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isExplodeAllKitContents() {
    return explodeAllKitContents;
  }

  public void setExplodeAllKitContents(Boolean explodeAllKitContents) {
    this.explodeAllKitContents = explodeAllKitContents;
  }

  public ExternalShippingSystem apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(required = true, value = "")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public ExternalShippingSystem apiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
    return this;
  }

   /**
   * Get apiSecret
   * @return apiSecret
  **/
  @ApiModelProperty(required = true, value = "")
  public String getApiSecret() {
    return apiSecret;
  }

  public void setApiSecret(String apiSecret) {
    this.apiSecret = apiSecret;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public ExternalShippingSystem customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ExternalShippingSystem putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalShippingSystem externalShippingSystem = (ExternalShippingSystem) o;
    return Objects.equals(this.id, externalShippingSystem.id) &&
        Objects.equals(this.name, externalShippingSystem.name) &&
        Objects.equals(this.systemType, externalShippingSystem.systemType) &&
        Objects.equals(this.scriptId, externalShippingSystem.scriptId) &&
        Objects.equals(this.explodeAllKitContents, externalShippingSystem.explodeAllKitContents) &&
        Objects.equals(this.apiKey, externalShippingSystem.apiKey) &&
        Objects.equals(this.apiSecret, externalShippingSystem.apiSecret) &&
        Objects.equals(this.createDate, externalShippingSystem.createDate) &&
        Objects.equals(this.modifyDate, externalShippingSystem.modifyDate) &&
        Objects.equals(this.customFields, externalShippingSystem.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, systemType, scriptId, explodeAllKitContents, apiKey, apiSecret, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalShippingSystem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    systemType: ").append(toIndentedString(systemType)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    explodeAllKitContents: ").append(toIndentedString(explodeAllKitContents)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    apiSecret: ").append(toIndentedString(apiSecret)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

