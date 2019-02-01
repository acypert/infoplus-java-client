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
 * LoggedTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T19:07:25.145-06:00")
public class LoggedTime {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("client")
  private Integer client = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("loggedTimeTypeId")
  private Integer loggedTimeTypeId = null;

  @SerializedName("appId")
  private Integer appId = null;

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

  public LoggedTime start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public LoggedTime end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public LoggedTime duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public LoggedTime description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LoggedTime client(Integer client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getClient() {
    return client;
  }

  public void setClient(Integer client) {
    this.client = client;
  }

  public LoggedTime userId(Integer userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public LoggedTime warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public LoggedTime loggedTimeTypeId(Integer loggedTimeTypeId) {
    this.loggedTimeTypeId = loggedTimeTypeId;
    return this;
  }

   /**
   * Get loggedTimeTypeId
   * @return loggedTimeTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLoggedTimeTypeId() {
    return loggedTimeTypeId;
  }

  public void setLoggedTimeTypeId(Integer loggedTimeTypeId) {
    this.loggedTimeTypeId = loggedTimeTypeId;
  }

  public LoggedTime appId(Integer appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getAppId() {
    return appId;
  }

  public void setAppId(Integer appId) {
    this.appId = appId;
  }

  public LoggedTime customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public LoggedTime putCustomFieldsItem(String key, Object customFieldsItem) {
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
    LoggedTime loggedTime = (LoggedTime) o;
    return Objects.equals(this.id, loggedTime.id) &&
        Objects.equals(this.createDate, loggedTime.createDate) &&
        Objects.equals(this.modifyDate, loggedTime.modifyDate) &&
        Objects.equals(this.start, loggedTime.start) &&
        Objects.equals(this.end, loggedTime.end) &&
        Objects.equals(this.duration, loggedTime.duration) &&
        Objects.equals(this.description, loggedTime.description) &&
        Objects.equals(this.client, loggedTime.client) &&
        Objects.equals(this.userId, loggedTime.userId) &&
        Objects.equals(this.lobId, loggedTime.lobId) &&
        Objects.equals(this.warehouseId, loggedTime.warehouseId) &&
        Objects.equals(this.loggedTimeTypeId, loggedTime.loggedTimeTypeId) &&
        Objects.equals(this.appId, loggedTime.appId) &&
        Objects.equals(this.customFields, loggedTime.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, start, end, duration, description, client, userId, lobId, warehouseId, loggedTimeTypeId, appId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoggedTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    loggedTimeTypeId: ").append(toIndentedString(loggedTimeTypeId)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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
