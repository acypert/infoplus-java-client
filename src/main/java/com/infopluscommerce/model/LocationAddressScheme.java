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
 * LocationAddressScheme
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-15T10:00:01.315-05:00")
public class LocationAddressScheme {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("formatString")
  private String formatString = null;

  @SerializedName("locationNamingScheme")
  private String locationNamingScheme = null;

  @SerializedName("locationNumberZeroPadded")
  private Boolean locationNumberZeroPadded = false;

  @SerializedName("locationNumberMinimumNumberOfDigits")
  private Integer locationNumberMinimumNumberOfDigits = null;

  @SerializedName("levelNamingScheme")
  private String levelNamingScheme = null;

  @SerializedName("levelNumberZeroPadded")
  private Boolean levelNumberZeroPadded = false;

  @SerializedName("levelNumberMinimumNumberOfDigits")
  private Integer levelNumberMinimumNumberOfDigits = null;

  @SerializedName("aisleNamingScheme")
  private String aisleNamingScheme = null;

  @SerializedName("aisleNumberZeroPadded")
  private Boolean aisleNumberZeroPadded = false;

  @SerializedName("aisleNumberMinimumNumberOfDigits")
  private Integer aisleNumberMinimumNumberOfDigits = null;

  @SerializedName("bayNamingScheme")
  private String bayNamingScheme = null;

  @SerializedName("bayNumberZeroPadded")
  private Boolean bayNumberZeroPadded = false;

  @SerializedName("bayNumberMinimumNumberOfDigits")
  private Integer bayNumberMinimumNumberOfDigits = null;

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

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getClientId() {
    return clientId;
  }

  public LocationAddressScheme name(String name) {
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

  public LocationAddressScheme formatString(String formatString) {
    this.formatString = formatString;
    return this;
  }

   /**
   * Get formatString
   * @return formatString
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFormatString() {
    return formatString;
  }

  public void setFormatString(String formatString) {
    this.formatString = formatString;
  }

  public LocationAddressScheme locationNamingScheme(String locationNamingScheme) {
    this.locationNamingScheme = locationNamingScheme;
    return this;
  }

   /**
   * Get locationNamingScheme
   * @return locationNamingScheme
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLocationNamingScheme() {
    return locationNamingScheme;
  }

  public void setLocationNamingScheme(String locationNamingScheme) {
    this.locationNamingScheme = locationNamingScheme;
  }

  public LocationAddressScheme locationNumberZeroPadded(Boolean locationNumberZeroPadded) {
    this.locationNumberZeroPadded = locationNumberZeroPadded;
    return this;
  }

   /**
   * Get locationNumberZeroPadded
   * @return locationNumberZeroPadded
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isLocationNumberZeroPadded() {
    return locationNumberZeroPadded;
  }

  public void setLocationNumberZeroPadded(Boolean locationNumberZeroPadded) {
    this.locationNumberZeroPadded = locationNumberZeroPadded;
  }

  public LocationAddressScheme locationNumberMinimumNumberOfDigits(Integer locationNumberMinimumNumberOfDigits) {
    this.locationNumberMinimumNumberOfDigits = locationNumberMinimumNumberOfDigits;
    return this;
  }

   /**
   * Get locationNumberMinimumNumberOfDigits
   * @return locationNumberMinimumNumberOfDigits
  **/
  @ApiModelProperty(value = "")
  public Integer getLocationNumberMinimumNumberOfDigits() {
    return locationNumberMinimumNumberOfDigits;
  }

  public void setLocationNumberMinimumNumberOfDigits(Integer locationNumberMinimumNumberOfDigits) {
    this.locationNumberMinimumNumberOfDigits = locationNumberMinimumNumberOfDigits;
  }

  public LocationAddressScheme levelNamingScheme(String levelNamingScheme) {
    this.levelNamingScheme = levelNamingScheme;
    return this;
  }

   /**
   * Get levelNamingScheme
   * @return levelNamingScheme
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLevelNamingScheme() {
    return levelNamingScheme;
  }

  public void setLevelNamingScheme(String levelNamingScheme) {
    this.levelNamingScheme = levelNamingScheme;
  }

  public LocationAddressScheme levelNumberZeroPadded(Boolean levelNumberZeroPadded) {
    this.levelNumberZeroPadded = levelNumberZeroPadded;
    return this;
  }

   /**
   * Get levelNumberZeroPadded
   * @return levelNumberZeroPadded
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isLevelNumberZeroPadded() {
    return levelNumberZeroPadded;
  }

  public void setLevelNumberZeroPadded(Boolean levelNumberZeroPadded) {
    this.levelNumberZeroPadded = levelNumberZeroPadded;
  }

  public LocationAddressScheme levelNumberMinimumNumberOfDigits(Integer levelNumberMinimumNumberOfDigits) {
    this.levelNumberMinimumNumberOfDigits = levelNumberMinimumNumberOfDigits;
    return this;
  }

   /**
   * Get levelNumberMinimumNumberOfDigits
   * @return levelNumberMinimumNumberOfDigits
  **/
  @ApiModelProperty(value = "")
  public Integer getLevelNumberMinimumNumberOfDigits() {
    return levelNumberMinimumNumberOfDigits;
  }

  public void setLevelNumberMinimumNumberOfDigits(Integer levelNumberMinimumNumberOfDigits) {
    this.levelNumberMinimumNumberOfDigits = levelNumberMinimumNumberOfDigits;
  }

  public LocationAddressScheme aisleNamingScheme(String aisleNamingScheme) {
    this.aisleNamingScheme = aisleNamingScheme;
    return this;
  }

   /**
   * Get aisleNamingScheme
   * @return aisleNamingScheme
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAisleNamingScheme() {
    return aisleNamingScheme;
  }

  public void setAisleNamingScheme(String aisleNamingScheme) {
    this.aisleNamingScheme = aisleNamingScheme;
  }

  public LocationAddressScheme aisleNumberZeroPadded(Boolean aisleNumberZeroPadded) {
    this.aisleNumberZeroPadded = aisleNumberZeroPadded;
    return this;
  }

   /**
   * Get aisleNumberZeroPadded
   * @return aisleNumberZeroPadded
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAisleNumberZeroPadded() {
    return aisleNumberZeroPadded;
  }

  public void setAisleNumberZeroPadded(Boolean aisleNumberZeroPadded) {
    this.aisleNumberZeroPadded = aisleNumberZeroPadded;
  }

  public LocationAddressScheme aisleNumberMinimumNumberOfDigits(Integer aisleNumberMinimumNumberOfDigits) {
    this.aisleNumberMinimumNumberOfDigits = aisleNumberMinimumNumberOfDigits;
    return this;
  }

   /**
   * Get aisleNumberMinimumNumberOfDigits
   * @return aisleNumberMinimumNumberOfDigits
  **/
  @ApiModelProperty(value = "")
  public Integer getAisleNumberMinimumNumberOfDigits() {
    return aisleNumberMinimumNumberOfDigits;
  }

  public void setAisleNumberMinimumNumberOfDigits(Integer aisleNumberMinimumNumberOfDigits) {
    this.aisleNumberMinimumNumberOfDigits = aisleNumberMinimumNumberOfDigits;
  }

  public LocationAddressScheme bayNamingScheme(String bayNamingScheme) {
    this.bayNamingScheme = bayNamingScheme;
    return this;
  }

   /**
   * Get bayNamingScheme
   * @return bayNamingScheme
  **/
  @ApiModelProperty(value = "")
  public String getBayNamingScheme() {
    return bayNamingScheme;
  }

  public void setBayNamingScheme(String bayNamingScheme) {
    this.bayNamingScheme = bayNamingScheme;
  }

  public LocationAddressScheme bayNumberZeroPadded(Boolean bayNumberZeroPadded) {
    this.bayNumberZeroPadded = bayNumberZeroPadded;
    return this;
  }

   /**
   * Get bayNumberZeroPadded
   * @return bayNumberZeroPadded
  **/
  @ApiModelProperty(value = "")
  public Boolean isBayNumberZeroPadded() {
    return bayNumberZeroPadded;
  }

  public void setBayNumberZeroPadded(Boolean bayNumberZeroPadded) {
    this.bayNumberZeroPadded = bayNumberZeroPadded;
  }

  public LocationAddressScheme bayNumberMinimumNumberOfDigits(Integer bayNumberMinimumNumberOfDigits) {
    this.bayNumberMinimumNumberOfDigits = bayNumberMinimumNumberOfDigits;
    return this;
  }

   /**
   * Get bayNumberMinimumNumberOfDigits
   * @return bayNumberMinimumNumberOfDigits
  **/
  @ApiModelProperty(value = "")
  public Integer getBayNumberMinimumNumberOfDigits() {
    return bayNumberMinimumNumberOfDigits;
  }

  public void setBayNumberMinimumNumberOfDigits(Integer bayNumberMinimumNumberOfDigits) {
    this.bayNumberMinimumNumberOfDigits = bayNumberMinimumNumberOfDigits;
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

  public LocationAddressScheme customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LocationAddressScheme putCustomFieldsItem(String key, Object customFieldsItem) {
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
    LocationAddressScheme locationAddressScheme = (LocationAddressScheme) o;
    return Objects.equals(this.id, locationAddressScheme.id) &&
        Objects.equals(this.clientId, locationAddressScheme.clientId) &&
        Objects.equals(this.name, locationAddressScheme.name) &&
        Objects.equals(this.formatString, locationAddressScheme.formatString) &&
        Objects.equals(this.locationNamingScheme, locationAddressScheme.locationNamingScheme) &&
        Objects.equals(this.locationNumberZeroPadded, locationAddressScheme.locationNumberZeroPadded) &&
        Objects.equals(this.locationNumberMinimumNumberOfDigits, locationAddressScheme.locationNumberMinimumNumberOfDigits) &&
        Objects.equals(this.levelNamingScheme, locationAddressScheme.levelNamingScheme) &&
        Objects.equals(this.levelNumberZeroPadded, locationAddressScheme.levelNumberZeroPadded) &&
        Objects.equals(this.levelNumberMinimumNumberOfDigits, locationAddressScheme.levelNumberMinimumNumberOfDigits) &&
        Objects.equals(this.aisleNamingScheme, locationAddressScheme.aisleNamingScheme) &&
        Objects.equals(this.aisleNumberZeroPadded, locationAddressScheme.aisleNumberZeroPadded) &&
        Objects.equals(this.aisleNumberMinimumNumberOfDigits, locationAddressScheme.aisleNumberMinimumNumberOfDigits) &&
        Objects.equals(this.bayNamingScheme, locationAddressScheme.bayNamingScheme) &&
        Objects.equals(this.bayNumberZeroPadded, locationAddressScheme.bayNumberZeroPadded) &&
        Objects.equals(this.bayNumberMinimumNumberOfDigits, locationAddressScheme.bayNumberMinimumNumberOfDigits) &&
        Objects.equals(this.createDate, locationAddressScheme.createDate) &&
        Objects.equals(this.modifyDate, locationAddressScheme.modifyDate) &&
        Objects.equals(this.customFields, locationAddressScheme.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, name, formatString, locationNamingScheme, locationNumberZeroPadded, locationNumberMinimumNumberOfDigits, levelNamingScheme, levelNumberZeroPadded, levelNumberMinimumNumberOfDigits, aisleNamingScheme, aisleNumberZeroPadded, aisleNumberMinimumNumberOfDigits, bayNamingScheme, bayNumberZeroPadded, bayNumberMinimumNumberOfDigits, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationAddressScheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    formatString: ").append(toIndentedString(formatString)).append("\n");
    sb.append("    locationNamingScheme: ").append(toIndentedString(locationNamingScheme)).append("\n");
    sb.append("    locationNumberZeroPadded: ").append(toIndentedString(locationNumberZeroPadded)).append("\n");
    sb.append("    locationNumberMinimumNumberOfDigits: ").append(toIndentedString(locationNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    levelNamingScheme: ").append(toIndentedString(levelNamingScheme)).append("\n");
    sb.append("    levelNumberZeroPadded: ").append(toIndentedString(levelNumberZeroPadded)).append("\n");
    sb.append("    levelNumberMinimumNumberOfDigits: ").append(toIndentedString(levelNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    aisleNamingScheme: ").append(toIndentedString(aisleNamingScheme)).append("\n");
    sb.append("    aisleNumberZeroPadded: ").append(toIndentedString(aisleNumberZeroPadded)).append("\n");
    sb.append("    aisleNumberMinimumNumberOfDigits: ").append(toIndentedString(aisleNumberMinimumNumberOfDigits)).append("\n");
    sb.append("    bayNamingScheme: ").append(toIndentedString(bayNamingScheme)).append("\n");
    sb.append("    bayNumberZeroPadded: ").append(toIndentedString(bayNumberZeroPadded)).append("\n");
    sb.append("    bayNumberMinimumNumberOfDigits: ").append(toIndentedString(bayNumberMinimumNumberOfDigits)).append("\n");
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

