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
 * ScheduledPlanLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T19:07:25.145-06:00")
public class ScheduledPlanLog {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("scheduledPlanId")
  private Integer scheduledPlanId = null;

  @SerializedName("plan")
  private String plan = null;

  @SerializedName("startTime")
  private OffsetDateTime startTime = null;

  @SerializedName("endTime")
  private OffsetDateTime endTime = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("linkURL")
  private String linkURL = null;

  @SerializedName("linkText")
  private String linkText = null;

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

   /**
   * Get scheduledPlanId
   * @return scheduledPlanId
  **/
  @ApiModelProperty(value = "")
  public Integer getScheduledPlanId() {
    return scheduledPlanId;
  }

  public ScheduledPlanLog plan(String plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public ScheduledPlanLog status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

   /**
   * Get linkURL
   * @return linkURL
  **/
  @ApiModelProperty(value = "")
  public String getLinkURL() {
    return linkURL;
  }

   /**
   * Get linkText
   * @return linkText
  **/
  @ApiModelProperty(value = "")
  public String getLinkText() {
    return linkText;
  }

  public ScheduledPlanLog customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ScheduledPlanLog putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ScheduledPlanLog scheduledPlanLog = (ScheduledPlanLog) o;
    return Objects.equals(this.id, scheduledPlanLog.id) &&
        Objects.equals(this.createDate, scheduledPlanLog.createDate) &&
        Objects.equals(this.modifyDate, scheduledPlanLog.modifyDate) &&
        Objects.equals(this.scheduledPlanId, scheduledPlanLog.scheduledPlanId) &&
        Objects.equals(this.plan, scheduledPlanLog.plan) &&
        Objects.equals(this.startTime, scheduledPlanLog.startTime) &&
        Objects.equals(this.endTime, scheduledPlanLog.endTime) &&
        Objects.equals(this.status, scheduledPlanLog.status) &&
        Objects.equals(this.message, scheduledPlanLog.message) &&
        Objects.equals(this.linkURL, scheduledPlanLog.linkURL) &&
        Objects.equals(this.linkText, scheduledPlanLog.linkText) &&
        Objects.equals(this.customFields, scheduledPlanLog.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, scheduledPlanId, plan, startTime, endTime, status, message, linkURL, linkText, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledPlanLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    scheduledPlanId: ").append(toIndentedString(scheduledPlanId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    linkURL: ").append(toIndentedString(linkURL)).append("\n");
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
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
