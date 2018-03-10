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
 * JobTime
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T09:21:00.319-06:00")
public class JobTime {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("secondDuration")
  private Integer secondDuration = null;

  @SerializedName("date")
  private OffsetDateTime date = null;

  @SerializedName("userId")
  private Integer userId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("jobTypeId")
  private Integer jobTypeId = null;

  @SerializedName("note")
  private String note = null;

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

  public JobTime secondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
    return this;
  }

   /**
   * Get secondDuration
   * @return secondDuration
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getSecondDuration() {
    return secondDuration;
  }

  public void setSecondDuration(Integer secondDuration) {
    this.secondDuration = secondDuration;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDate() {
    return date;
  }

  public JobTime userId(Integer userId) {
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

  public JobTime lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public JobTime jobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
    return this;
  }

   /**
   * Get jobTypeId
   * @return jobTypeId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getJobTypeId() {
    return jobTypeId;
  }

  public void setJobTypeId(Integer jobTypeId) {
    this.jobTypeId = jobTypeId;
  }

  public JobTime note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public JobTime customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public JobTime putCustomFieldsItem(String key, Object customFieldsItem) {
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
    JobTime jobTime = (JobTime) o;
    return Objects.equals(this.id, jobTime.id) &&
        Objects.equals(this.createDate, jobTime.createDate) &&
        Objects.equals(this.modifyDate, jobTime.modifyDate) &&
        Objects.equals(this.secondDuration, jobTime.secondDuration) &&
        Objects.equals(this.date, jobTime.date) &&
        Objects.equals(this.userId, jobTime.userId) &&
        Objects.equals(this.lobId, jobTime.lobId) &&
        Objects.equals(this.jobTypeId, jobTime.jobTypeId) &&
        Objects.equals(this.note, jobTime.note) &&
        Objects.equals(this.customFields, jobTime.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, secondDuration, date, userId, lobId, jobTypeId, note, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobTime {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    secondDuration: ").append(toIndentedString(secondDuration)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

