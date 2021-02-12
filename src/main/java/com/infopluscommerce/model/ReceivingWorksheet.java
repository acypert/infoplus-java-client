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
import com.infopluscommerce.model.ReceivingWorksheetLineItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ReceivingWorksheet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-12T01:37:31.327-06:00")
public class ReceivingWorksheet {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("poNoId")
  private Integer poNoId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("vendorId")
  private Integer vendorId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("serviceLevel")
  private String serviceLevel = null;

  @SerializedName("receivingProcessId")
  private Integer receivingProcessId = null;

  @SerializedName("dockDate")
  private OffsetDateTime dockDate = null;

  @SerializedName("createdBy")
  private Integer createdBy = null;

  @SerializedName("worksheetName")
  private String worksheetName = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("onTheDock")
  private Boolean onTheDock = false;

  @SerializedName("autoCommit")
  private Boolean autoCommit = false;

  @SerializedName("lineItems")
  private List<ReceivingWorksheetLineItem> lineItems = null;

  @SerializedName("notes")
  private String notes = null;

  @SerializedName("workBatchId")
  private Integer workBatchId = null;

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

  public ReceivingWorksheet warehouseId(Integer warehouseId) {
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

  public ReceivingWorksheet poNoId(Integer poNoId) {
    this.poNoId = poNoId;
    return this;
  }

   /**
   * Get poNoId
   * @return poNoId
  **/
  @ApiModelProperty(value = "")
  public Integer getPoNoId() {
    return poNoId;
  }

  public void setPoNoId(Integer poNoId) {
    this.poNoId = poNoId;
  }

  public ReceivingWorksheet lobId(Integer lobId) {
    this.lobId = lobId;
    return this;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

  public void setLobId(Integer lobId) {
    this.lobId = lobId;
  }

  public ReceivingWorksheet vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public ReceivingWorksheet serviceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }

   /**
   * Get serviceLevel
   * @return serviceLevel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getServiceLevel() {
    return serviceLevel;
  }

  public void setServiceLevel(String serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  public ReceivingWorksheet receivingProcessId(Integer receivingProcessId) {
    this.receivingProcessId = receivingProcessId;
    return this;
  }

   /**
   * Get receivingProcessId
   * @return receivingProcessId
  **/
  @ApiModelProperty(value = "")
  public Integer getReceivingProcessId() {
    return receivingProcessId;
  }

  public void setReceivingProcessId(Integer receivingProcessId) {
    this.receivingProcessId = receivingProcessId;
  }

  public ReceivingWorksheet dockDate(OffsetDateTime dockDate) {
    this.dockDate = dockDate;
    return this;
  }

   /**
   * Get dockDate
   * @return dockDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDockDate() {
    return dockDate;
  }

  public void setDockDate(OffsetDateTime dockDate) {
    this.dockDate = dockDate;
  }

  public ReceivingWorksheet createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public ReceivingWorksheet worksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
    return this;
  }

   /**
   * Get worksheetName
   * @return worksheetName
  **/
  @ApiModelProperty(required = true, value = "")
  public String getWorksheetName() {
    return worksheetName;
  }

  public void setWorksheetName(String worksheetName) {
    this.worksheetName = worksheetName;
  }

  public ReceivingWorksheet carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(value = "")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public ReceivingWorksheet onTheDock(Boolean onTheDock) {
    this.onTheDock = onTheDock;
    return this;
  }

   /**
   * Get onTheDock
   * @return onTheDock
  **/
  @ApiModelProperty(value = "")
  public Boolean isOnTheDock() {
    return onTheDock;
  }

  public void setOnTheDock(Boolean onTheDock) {
    this.onTheDock = onTheDock;
  }

  public ReceivingWorksheet autoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

   /**
   * Get autoCommit
   * @return autoCommit
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isAutoCommit() {
    return autoCommit;
  }

  public void setAutoCommit(Boolean autoCommit) {
    this.autoCommit = autoCommit;
  }

  public ReceivingWorksheet lineItems(List<ReceivingWorksheetLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public ReceivingWorksheet addLineItemsItem(ReceivingWorksheetLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<ReceivingWorksheetLineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<ReceivingWorksheetLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ReceivingWorksheetLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public ReceivingWorksheet notes(String notes) {
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

   /**
   * Get workBatchId
   * @return workBatchId
  **/
  @ApiModelProperty(value = "")
  public Integer getWorkBatchId() {
    return workBatchId;
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

  public ReceivingWorksheet customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ReceivingWorksheet putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ReceivingWorksheet receivingWorksheet = (ReceivingWorksheet) o;
    return Objects.equals(this.id, receivingWorksheet.id) &&
        Objects.equals(this.warehouseId, receivingWorksheet.warehouseId) &&
        Objects.equals(this.poNoId, receivingWorksheet.poNoId) &&
        Objects.equals(this.lobId, receivingWorksheet.lobId) &&
        Objects.equals(this.vendorId, receivingWorksheet.vendorId) &&
        Objects.equals(this.status, receivingWorksheet.status) &&
        Objects.equals(this.serviceLevel, receivingWorksheet.serviceLevel) &&
        Objects.equals(this.receivingProcessId, receivingWorksheet.receivingProcessId) &&
        Objects.equals(this.dockDate, receivingWorksheet.dockDate) &&
        Objects.equals(this.createdBy, receivingWorksheet.createdBy) &&
        Objects.equals(this.worksheetName, receivingWorksheet.worksheetName) &&
        Objects.equals(this.carrier, receivingWorksheet.carrier) &&
        Objects.equals(this.onTheDock, receivingWorksheet.onTheDock) &&
        Objects.equals(this.autoCommit, receivingWorksheet.autoCommit) &&
        Objects.equals(this.lineItems, receivingWorksheet.lineItems) &&
        Objects.equals(this.notes, receivingWorksheet.notes) &&
        Objects.equals(this.workBatchId, receivingWorksheet.workBatchId) &&
        Objects.equals(this.createDate, receivingWorksheet.createDate) &&
        Objects.equals(this.modifyDate, receivingWorksheet.modifyDate) &&
        Objects.equals(this.customFields, receivingWorksheet.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warehouseId, poNoId, lobId, vendorId, status, serviceLevel, receivingProcessId, dockDate, createdBy, worksheetName, carrier, onTheDock, autoCommit, lineItems, notes, workBatchId, createDate, modifyDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingWorksheet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    poNoId: ").append(toIndentedString(poNoId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    receivingProcessId: ").append(toIndentedString(receivingProcessId)).append("\n");
    sb.append("    dockDate: ").append(toIndentedString(dockDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    worksheetName: ").append(toIndentedString(worksheetName)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    onTheDock: ").append(toIndentedString(onTheDock)).append("\n");
    sb.append("    autoCommit: ").append(toIndentedString(autoCommit)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    workBatchId: ").append(toIndentedString(workBatchId)).append("\n");
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

