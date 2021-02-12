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
 * CustomField
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-12T01:37:31.327-06:00")
public class CustomField {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("enabled")
  private Boolean enabled = false;

  @SerializedName("fieldType")
  private String fieldType = null;

  @SerializedName("searchable")
  private Boolean searchable = false;

  @SerializedName("tooltip")
  private String tooltip = null;

  @SerializedName("tabLabel")
  private String tabLabel = null;

  @SerializedName("recordType")
  private String recordType = null;

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

  public CustomField name(String name) {
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

  public CustomField label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CustomField enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomField fieldType(String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getFieldType() {
    return fieldType;
  }

  public void setFieldType(String fieldType) {
    this.fieldType = fieldType;
  }

  public CustomField searchable(Boolean searchable) {
    this.searchable = searchable;
    return this;
  }

   /**
   * Get searchable
   * @return searchable
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSearchable() {
    return searchable;
  }

  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }

  public CustomField tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * Get tooltip
   * @return tooltip
  **/
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public CustomField tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * Get tabLabel
   * @return tabLabel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public CustomField recordType(String recordType) {
    this.recordType = recordType;
    return this;
  }

   /**
   * Get recordType
   * @return recordType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getRecordType() {
    return recordType;
  }

  public void setRecordType(String recordType) {
    this.recordType = recordType;
  }

  public CustomField customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CustomField putCustomFieldsItem(String key, Object customFieldsItem) {
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
    CustomField customField = (CustomField) o;
    return Objects.equals(this.id, customField.id) &&
        Objects.equals(this.createDate, customField.createDate) &&
        Objects.equals(this.modifyDate, customField.modifyDate) &&
        Objects.equals(this.name, customField.name) &&
        Objects.equals(this.label, customField.label) &&
        Objects.equals(this.enabled, customField.enabled) &&
        Objects.equals(this.fieldType, customField.fieldType) &&
        Objects.equals(this.searchable, customField.searchable) &&
        Objects.equals(this.tooltip, customField.tooltip) &&
        Objects.equals(this.tabLabel, customField.tabLabel) &&
        Objects.equals(this.recordType, customField.recordType) &&
        Objects.equals(this.customFields, customField.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, name, label, enabled, fieldType, searchable, tooltip, tabLabel, recordType, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomField {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
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

