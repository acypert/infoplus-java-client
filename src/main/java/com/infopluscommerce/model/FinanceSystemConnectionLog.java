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
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * FinanceSystemConnectionLog
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-14T22:19:42.980-06:00")
public class FinanceSystemConnectionLog {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("financeSystemConnectionId")
  private Integer financeSystemConnectionId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("financeSystemOrderNo")
  private String financeSystemOrderNo = null;

  @SerializedName("financeSystemOrderId")
  private String financeSystemOrderId = null;

  @SerializedName("asnId")
  private Integer asnId = null;

  @SerializedName("financeSystemPONo")
  private String financeSystemPONo = null;

  @SerializedName("financeSystemPOId")
  private String financeSystemPOId = null;

  @SerializedName("itemReceiptIdId")
  private Integer itemReceiptIdId = null;

  @SerializedName("adjustmentIdId")
  private Integer adjustmentIdId = null;

  @SerializedName("jobIdId")
  private Integer jobIdId = null;

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

  public FinanceSystemConnectionLog financeSystemConnectionId(Integer financeSystemConnectionId) {
    this.financeSystemConnectionId = financeSystemConnectionId;
    return this;
  }

   /**
   * Get financeSystemConnectionId
   * @return financeSystemConnectionId
  **/
  @ApiModelProperty(value = "")
  public Integer getFinanceSystemConnectionId() {
    return financeSystemConnectionId;
  }

  public void setFinanceSystemConnectionId(Integer financeSystemConnectionId) {
    this.financeSystemConnectionId = financeSystemConnectionId;
  }

  public FinanceSystemConnectionLog type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FinanceSystemConnectionLog notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Get notes
   * @return notes
  **/
  @ApiModelProperty(value = "")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public FinanceSystemConnectionLog orderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(BigDecimal orderNo) {
    this.orderNo = orderNo;
  }

  public FinanceSystemConnectionLog financeSystemOrderNo(String financeSystemOrderNo) {
    this.financeSystemOrderNo = financeSystemOrderNo;
    return this;
  }

   /**
   * Get financeSystemOrderNo
   * @return financeSystemOrderNo
  **/
  @ApiModelProperty(value = "")
  public String getFinanceSystemOrderNo() {
    return financeSystemOrderNo;
  }

  public void setFinanceSystemOrderNo(String financeSystemOrderNo) {
    this.financeSystemOrderNo = financeSystemOrderNo;
  }

  public FinanceSystemConnectionLog financeSystemOrderId(String financeSystemOrderId) {
    this.financeSystemOrderId = financeSystemOrderId;
    return this;
  }

   /**
   * Get financeSystemOrderId
   * @return financeSystemOrderId
  **/
  @ApiModelProperty(value = "")
  public String getFinanceSystemOrderId() {
    return financeSystemOrderId;
  }

  public void setFinanceSystemOrderId(String financeSystemOrderId) {
    this.financeSystemOrderId = financeSystemOrderId;
  }

  public FinanceSystemConnectionLog asnId(Integer asnId) {
    this.asnId = asnId;
    return this;
  }

   /**
   * Get asnId
   * @return asnId
  **/
  @ApiModelProperty(value = "")
  public Integer getAsnId() {
    return asnId;
  }

  public void setAsnId(Integer asnId) {
    this.asnId = asnId;
  }

  public FinanceSystemConnectionLog financeSystemPONo(String financeSystemPONo) {
    this.financeSystemPONo = financeSystemPONo;
    return this;
  }

   /**
   * Get financeSystemPONo
   * @return financeSystemPONo
  **/
  @ApiModelProperty(value = "")
  public String getFinanceSystemPONo() {
    return financeSystemPONo;
  }

  public void setFinanceSystemPONo(String financeSystemPONo) {
    this.financeSystemPONo = financeSystemPONo;
  }

  public FinanceSystemConnectionLog financeSystemPOId(String financeSystemPOId) {
    this.financeSystemPOId = financeSystemPOId;
    return this;
  }

   /**
   * Get financeSystemPOId
   * @return financeSystemPOId
  **/
  @ApiModelProperty(value = "")
  public String getFinanceSystemPOId() {
    return financeSystemPOId;
  }

  public void setFinanceSystemPOId(String financeSystemPOId) {
    this.financeSystemPOId = financeSystemPOId;
  }

  public FinanceSystemConnectionLog itemReceiptIdId(Integer itemReceiptIdId) {
    this.itemReceiptIdId = itemReceiptIdId;
    return this;
  }

   /**
   * Get itemReceiptIdId
   * @return itemReceiptIdId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemReceiptIdId() {
    return itemReceiptIdId;
  }

  public void setItemReceiptIdId(Integer itemReceiptIdId) {
    this.itemReceiptIdId = itemReceiptIdId;
  }

  public FinanceSystemConnectionLog adjustmentIdId(Integer adjustmentIdId) {
    this.adjustmentIdId = adjustmentIdId;
    return this;
  }

   /**
   * Get adjustmentIdId
   * @return adjustmentIdId
  **/
  @ApiModelProperty(value = "")
  public Integer getAdjustmentIdId() {
    return adjustmentIdId;
  }

  public void setAdjustmentIdId(Integer adjustmentIdId) {
    this.adjustmentIdId = adjustmentIdId;
  }

  public FinanceSystemConnectionLog jobIdId(Integer jobIdId) {
    this.jobIdId = jobIdId;
    return this;
  }

   /**
   * Get jobIdId
   * @return jobIdId
  **/
  @ApiModelProperty(value = "")
  public Integer getJobIdId() {
    return jobIdId;
  }

  public void setJobIdId(Integer jobIdId) {
    this.jobIdId = jobIdId;
  }

  public FinanceSystemConnectionLog customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public FinanceSystemConnectionLog putCustomFieldsItem(String key, Object customFieldsItem) {
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
    FinanceSystemConnectionLog financeSystemConnectionLog = (FinanceSystemConnectionLog) o;
    return Objects.equals(this.id, financeSystemConnectionLog.id) &&
        Objects.equals(this.createDate, financeSystemConnectionLog.createDate) &&
        Objects.equals(this.financeSystemConnectionId, financeSystemConnectionLog.financeSystemConnectionId) &&
        Objects.equals(this.type, financeSystemConnectionLog.type) &&
        Objects.equals(this.notes, financeSystemConnectionLog.notes) &&
        Objects.equals(this.orderNo, financeSystemConnectionLog.orderNo) &&
        Objects.equals(this.financeSystemOrderNo, financeSystemConnectionLog.financeSystemOrderNo) &&
        Objects.equals(this.financeSystemOrderId, financeSystemConnectionLog.financeSystemOrderId) &&
        Objects.equals(this.asnId, financeSystemConnectionLog.asnId) &&
        Objects.equals(this.financeSystemPONo, financeSystemConnectionLog.financeSystemPONo) &&
        Objects.equals(this.financeSystemPOId, financeSystemConnectionLog.financeSystemPOId) &&
        Objects.equals(this.itemReceiptIdId, financeSystemConnectionLog.itemReceiptIdId) &&
        Objects.equals(this.adjustmentIdId, financeSystemConnectionLog.adjustmentIdId) &&
        Objects.equals(this.jobIdId, financeSystemConnectionLog.jobIdId) &&
        Objects.equals(this.customFields, financeSystemConnectionLog.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, financeSystemConnectionId, type, notes, orderNo, financeSystemOrderNo, financeSystemOrderId, asnId, financeSystemPONo, financeSystemPOId, itemReceiptIdId, adjustmentIdId, jobIdId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinanceSystemConnectionLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    financeSystemConnectionId: ").append(toIndentedString(financeSystemConnectionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    financeSystemOrderNo: ").append(toIndentedString(financeSystemOrderNo)).append("\n");
    sb.append("    financeSystemOrderId: ").append(toIndentedString(financeSystemOrderId)).append("\n");
    sb.append("    asnId: ").append(toIndentedString(asnId)).append("\n");
    sb.append("    financeSystemPONo: ").append(toIndentedString(financeSystemPONo)).append("\n");
    sb.append("    financeSystemPOId: ").append(toIndentedString(financeSystemPOId)).append("\n");
    sb.append("    itemReceiptIdId: ").append(toIndentedString(itemReceiptIdId)).append("\n");
    sb.append("    adjustmentIdId: ").append(toIndentedString(adjustmentIdId)).append("\n");
    sb.append("    jobIdId: ").append(toIndentedString(jobIdId)).append("\n");
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

