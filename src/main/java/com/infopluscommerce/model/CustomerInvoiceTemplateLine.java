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
import com.infopluscommerce.model.InvoiceTemplateLinePriceLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * CustomerInvoiceTemplateLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T16:51:34.655-06:00")
public class CustomerInvoiceTemplateLine {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("seqNo")
  private Integer seqNo = null;

  @SerializedName("accountCode")
  private String accountCode = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("includeIfZero")
  private Boolean includeIfZero = false;

  @SerializedName("department")
  private String department = null;

  @SerializedName("itemCode")
  private String itemCode = null;

  @SerializedName("invoiceTemplateId")
  private Integer invoiceTemplateId = null;

  @SerializedName("billingRuleId")
  private Integer billingRuleId = null;

  @SerializedName("priceLevelMode")
  private String priceLevelMode = null;

  @SerializedName("scriptId")
  private Integer scriptId = null;

  @SerializedName("priceLevelList")
  private List<InvoiceTemplateLinePriceLevel> priceLevelList = null;

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

  public CustomerInvoiceTemplateLine lobId(Integer lobId) {
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

  public CustomerInvoiceTemplateLine description(String description) {
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

  public CustomerInvoiceTemplateLine seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }

   /**
   * Get seqNo
   * @return seqNo
  **/
  @ApiModelProperty(value = "")
  public Integer getSeqNo() {
    return seqNo;
  }

  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }

  public CustomerInvoiceTemplateLine accountCode(String accountCode) {
    this.accountCode = accountCode;
    return this;
  }

   /**
   * Get accountCode
   * @return accountCode
  **/
  @ApiModelProperty(value = "")
  public String getAccountCode() {
    return accountCode;
  }

  public void setAccountCode(String accountCode) {
    this.accountCode = accountCode;
  }

  public CustomerInvoiceTemplateLine active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public CustomerInvoiceTemplateLine includeIfZero(Boolean includeIfZero) {
    this.includeIfZero = includeIfZero;
    return this;
  }

   /**
   * Get includeIfZero
   * @return includeIfZero
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIncludeIfZero() {
    return includeIfZero;
  }

  public void setIncludeIfZero(Boolean includeIfZero) {
    this.includeIfZero = includeIfZero;
  }

  public CustomerInvoiceTemplateLine department(String department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public CustomerInvoiceTemplateLine itemCode(String itemCode) {
    this.itemCode = itemCode;
    return this;
  }

   /**
   * Get itemCode
   * @return itemCode
  **/
  @ApiModelProperty(value = "")
  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public CustomerInvoiceTemplateLine invoiceTemplateId(Integer invoiceTemplateId) {
    this.invoiceTemplateId = invoiceTemplateId;
    return this;
  }

   /**
   * Get invoiceTemplateId
   * @return invoiceTemplateId
  **/
  @ApiModelProperty(value = "")
  public Integer getInvoiceTemplateId() {
    return invoiceTemplateId;
  }

  public void setInvoiceTemplateId(Integer invoiceTemplateId) {
    this.invoiceTemplateId = invoiceTemplateId;
  }

  public CustomerInvoiceTemplateLine billingRuleId(Integer billingRuleId) {
    this.billingRuleId = billingRuleId;
    return this;
  }

   /**
   * Get billingRuleId
   * @return billingRuleId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getBillingRuleId() {
    return billingRuleId;
  }

  public void setBillingRuleId(Integer billingRuleId) {
    this.billingRuleId = billingRuleId;
  }

  public CustomerInvoiceTemplateLine priceLevelMode(String priceLevelMode) {
    this.priceLevelMode = priceLevelMode;
    return this;
  }

   /**
   * Get priceLevelMode
   * @return priceLevelMode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPriceLevelMode() {
    return priceLevelMode;
  }

  public void setPriceLevelMode(String priceLevelMode) {
    this.priceLevelMode = priceLevelMode;
  }

  public CustomerInvoiceTemplateLine scriptId(Integer scriptId) {
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

  public CustomerInvoiceTemplateLine priceLevelList(List<InvoiceTemplateLinePriceLevel> priceLevelList) {
    this.priceLevelList = priceLevelList;
    return this;
  }

  public CustomerInvoiceTemplateLine addPriceLevelListItem(InvoiceTemplateLinePriceLevel priceLevelListItem) {
    if (this.priceLevelList == null) {
      this.priceLevelList = new ArrayList<InvoiceTemplateLinePriceLevel>();
    }
    this.priceLevelList.add(priceLevelListItem);
    return this;
  }

   /**
   * Get priceLevelList
   * @return priceLevelList
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceTemplateLinePriceLevel> getPriceLevelList() {
    return priceLevelList;
  }

  public void setPriceLevelList(List<InvoiceTemplateLinePriceLevel> priceLevelList) {
    this.priceLevelList = priceLevelList;
  }

  public CustomerInvoiceTemplateLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public CustomerInvoiceTemplateLine putCustomFieldsItem(String key, Object customFieldsItem) {
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
    CustomerInvoiceTemplateLine customerInvoiceTemplateLine = (CustomerInvoiceTemplateLine) o;
    return Objects.equals(this.id, customerInvoiceTemplateLine.id) &&
        Objects.equals(this.createDate, customerInvoiceTemplateLine.createDate) &&
        Objects.equals(this.modifyDate, customerInvoiceTemplateLine.modifyDate) &&
        Objects.equals(this.lobId, customerInvoiceTemplateLine.lobId) &&
        Objects.equals(this.description, customerInvoiceTemplateLine.description) &&
        Objects.equals(this.seqNo, customerInvoiceTemplateLine.seqNo) &&
        Objects.equals(this.accountCode, customerInvoiceTemplateLine.accountCode) &&
        Objects.equals(this.active, customerInvoiceTemplateLine.active) &&
        Objects.equals(this.includeIfZero, customerInvoiceTemplateLine.includeIfZero) &&
        Objects.equals(this.department, customerInvoiceTemplateLine.department) &&
        Objects.equals(this.itemCode, customerInvoiceTemplateLine.itemCode) &&
        Objects.equals(this.invoiceTemplateId, customerInvoiceTemplateLine.invoiceTemplateId) &&
        Objects.equals(this.billingRuleId, customerInvoiceTemplateLine.billingRuleId) &&
        Objects.equals(this.priceLevelMode, customerInvoiceTemplateLine.priceLevelMode) &&
        Objects.equals(this.scriptId, customerInvoiceTemplateLine.scriptId) &&
        Objects.equals(this.priceLevelList, customerInvoiceTemplateLine.priceLevelList) &&
        Objects.equals(this.customFields, customerInvoiceTemplateLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, description, seqNo, accountCode, active, includeIfZero, department, itemCode, invoiceTemplateId, billingRuleId, priceLevelMode, scriptId, priceLevelList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerInvoiceTemplateLine {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    includeIfZero: ").append(toIndentedString(includeIfZero)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    itemCode: ").append(toIndentedString(itemCode)).append("\n");
    sb.append("    invoiceTemplateId: ").append(toIndentedString(invoiceTemplateId)).append("\n");
    sb.append("    billingRuleId: ").append(toIndentedString(billingRuleId)).append("\n");
    sb.append("    priceLevelMode: ").append(toIndentedString(priceLevelMode)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    priceLevelList: ").append(toIndentedString(priceLevelList)).append("\n");
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

