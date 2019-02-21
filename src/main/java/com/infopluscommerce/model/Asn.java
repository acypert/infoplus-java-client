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
import com.infopluscommerce.model.ItemReceipt;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Asn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-21T16:51:34.655-06:00")
public class Asn {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("poNo")
  private String poNo = null;

  @SerializedName("vendorId")
  private Integer vendorId = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("orderDate")
  private OffsetDateTime orderDate = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("billingName")
  private String billingName = null;

  @SerializedName("billingAttention")
  private String billingAttention = null;

  @SerializedName("billingStreet1")
  private String billingStreet1 = null;

  @SerializedName("billingStreet2")
  private String billingStreet2 = null;

  @SerializedName("billingCity")
  private String billingCity = null;

  @SerializedName("billingState")
  private String billingState = null;

  @SerializedName("billingZipCode")
  private String billingZipCode = null;

  @SerializedName("billingPhone")
  private String billingPhone = null;

  @SerializedName("shipToName")
  private String shipToName = null;

  @SerializedName("shipToAddress")
  private String shipToAddress = null;

  @SerializedName("shipToStreet1")
  private String shipToStreet1 = null;

  @SerializedName("shipToStreet2")
  private String shipToStreet2 = null;

  @SerializedName("shipToCity")
  private String shipToCity = null;

  @SerializedName("shipToState")
  private String shipToState = null;

  @SerializedName("shipToZipCode")
  private String shipToZipCode = null;

  @SerializedName("shipToPhone")
  private String shipToPhone = null;

  @SerializedName("corporateName")
  private String corporateName = null;

  @SerializedName("corporateAttention")
  private String corporateAttention = null;

  @SerializedName("corporateStreet1")
  private String corporateStreet1 = null;

  @SerializedName("corporateStreet2")
  private String corporateStreet2 = null;

  @SerializedName("corporateCity")
  private String corporateCity = null;

  @SerializedName("corporateState")
  private String corporateState = null;

  @SerializedName("corporateZipCode")
  private String corporateZipCode = null;

  @SerializedName("accountCode")
  private String accountCode = null;

  @SerializedName("buyer")
  private Integer buyer = null;

  @SerializedName("carrier")
  private Integer carrier = null;

  @SerializedName("confTo")
  private String confTo = null;

  @SerializedName("fob")
  private String fob = null;

  @SerializedName("printed")
  private String printed = null;

  @SerializedName("projectNo")
  private Integer projectNo = null;

  @SerializedName("remarks")
  private String remarks = null;

  @SerializedName("requestBy")
  private String requestBy = null;

  @SerializedName("terms")
  private String terms = null;

  @SerializedName("usedBy")
  private String usedBy = null;

  @SerializedName("lineItems")
  private List<ItemReceipt> lineItems = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("transferOrderId")
  private BigDecimal transferOrderId = null;

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

  public Asn lobId(Integer lobId) {
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

  public Asn poNo(String poNo) {
    this.poNo = poNo;
    return this;
  }

   /**
   * Get poNo
   * @return poNo
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPoNo() {
    return poNo;
  }

  public void setPoNo(String poNo) {
    this.poNo = poNo;
  }

  public Asn vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public Asn warehouseId(Integer warehouseId) {
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

  public Asn orderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Get orderDate
   * @return orderDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(OffsetDateTime orderDate) {
    this.orderDate = orderDate;
  }

  public Asn type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Asn billingName(String billingName) {
    this.billingName = billingName;
    return this;
  }

   /**
   * Get billingName
   * @return billingName
  **/
  @ApiModelProperty(value = "")
  public String getBillingName() {
    return billingName;
  }

  public void setBillingName(String billingName) {
    this.billingName = billingName;
  }

  public Asn billingAttention(String billingAttention) {
    this.billingAttention = billingAttention;
    return this;
  }

   /**
   * Get billingAttention
   * @return billingAttention
  **/
  @ApiModelProperty(value = "")
  public String getBillingAttention() {
    return billingAttention;
  }

  public void setBillingAttention(String billingAttention) {
    this.billingAttention = billingAttention;
  }

  public Asn billingStreet1(String billingStreet1) {
    this.billingStreet1 = billingStreet1;
    return this;
  }

   /**
   * Get billingStreet1
   * @return billingStreet1
  **/
  @ApiModelProperty(value = "")
  public String getBillingStreet1() {
    return billingStreet1;
  }

  public void setBillingStreet1(String billingStreet1) {
    this.billingStreet1 = billingStreet1;
  }

  public Asn billingStreet2(String billingStreet2) {
    this.billingStreet2 = billingStreet2;
    return this;
  }

   /**
   * Get billingStreet2
   * @return billingStreet2
  **/
  @ApiModelProperty(value = "")
  public String getBillingStreet2() {
    return billingStreet2;
  }

  public void setBillingStreet2(String billingStreet2) {
    this.billingStreet2 = billingStreet2;
  }

  public Asn billingCity(String billingCity) {
    this.billingCity = billingCity;
    return this;
  }

   /**
   * Get billingCity
   * @return billingCity
  **/
  @ApiModelProperty(value = "")
  public String getBillingCity() {
    return billingCity;
  }

  public void setBillingCity(String billingCity) {
    this.billingCity = billingCity;
  }

  public Asn billingState(String billingState) {
    this.billingState = billingState;
    return this;
  }

   /**
   * Get billingState
   * @return billingState
  **/
  @ApiModelProperty(value = "")
  public String getBillingState() {
    return billingState;
  }

  public void setBillingState(String billingState) {
    this.billingState = billingState;
  }

  public Asn billingZipCode(String billingZipCode) {
    this.billingZipCode = billingZipCode;
    return this;
  }

   /**
   * Get billingZipCode
   * @return billingZipCode
  **/
  @ApiModelProperty(value = "")
  public String getBillingZipCode() {
    return billingZipCode;
  }

  public void setBillingZipCode(String billingZipCode) {
    this.billingZipCode = billingZipCode;
  }

  public Asn billingPhone(String billingPhone) {
    this.billingPhone = billingPhone;
    return this;
  }

   /**
   * Get billingPhone
   * @return billingPhone
  **/
  @ApiModelProperty(value = "")
  public String getBillingPhone() {
    return billingPhone;
  }

  public void setBillingPhone(String billingPhone) {
    this.billingPhone = billingPhone;
  }

  public Asn shipToName(String shipToName) {
    this.shipToName = shipToName;
    return this;
  }

   /**
   * Get shipToName
   * @return shipToName
  **/
  @ApiModelProperty(value = "")
  public String getShipToName() {
    return shipToName;
  }

  public void setShipToName(String shipToName) {
    this.shipToName = shipToName;
  }

  public Asn shipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
    return this;
  }

   /**
   * Get shipToAddress
   * @return shipToAddress
  **/
  @ApiModelProperty(value = "")
  public String getShipToAddress() {
    return shipToAddress;
  }

  public void setShipToAddress(String shipToAddress) {
    this.shipToAddress = shipToAddress;
  }

  public Asn shipToStreet1(String shipToStreet1) {
    this.shipToStreet1 = shipToStreet1;
    return this;
  }

   /**
   * Get shipToStreet1
   * @return shipToStreet1
  **/
  @ApiModelProperty(value = "")
  public String getShipToStreet1() {
    return shipToStreet1;
  }

  public void setShipToStreet1(String shipToStreet1) {
    this.shipToStreet1 = shipToStreet1;
  }

  public Asn shipToStreet2(String shipToStreet2) {
    this.shipToStreet2 = shipToStreet2;
    return this;
  }

   /**
   * Get shipToStreet2
   * @return shipToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getShipToStreet2() {
    return shipToStreet2;
  }

  public void setShipToStreet2(String shipToStreet2) {
    this.shipToStreet2 = shipToStreet2;
  }

  public Asn shipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
    return this;
  }

   /**
   * Get shipToCity
   * @return shipToCity
  **/
  @ApiModelProperty(value = "")
  public String getShipToCity() {
    return shipToCity;
  }

  public void setShipToCity(String shipToCity) {
    this.shipToCity = shipToCity;
  }

  public Asn shipToState(String shipToState) {
    this.shipToState = shipToState;
    return this;
  }

   /**
   * Get shipToState
   * @return shipToState
  **/
  @ApiModelProperty(value = "")
  public String getShipToState() {
    return shipToState;
  }

  public void setShipToState(String shipToState) {
    this.shipToState = shipToState;
  }

  public Asn shipToZipCode(String shipToZipCode) {
    this.shipToZipCode = shipToZipCode;
    return this;
  }

   /**
   * Get shipToZipCode
   * @return shipToZipCode
  **/
  @ApiModelProperty(value = "")
  public String getShipToZipCode() {
    return shipToZipCode;
  }

  public void setShipToZipCode(String shipToZipCode) {
    this.shipToZipCode = shipToZipCode;
  }

  public Asn shipToPhone(String shipToPhone) {
    this.shipToPhone = shipToPhone;
    return this;
  }

   /**
   * Get shipToPhone
   * @return shipToPhone
  **/
  @ApiModelProperty(value = "")
  public String getShipToPhone() {
    return shipToPhone;
  }

  public void setShipToPhone(String shipToPhone) {
    this.shipToPhone = shipToPhone;
  }

  public Asn corporateName(String corporateName) {
    this.corporateName = corporateName;
    return this;
  }

   /**
   * Get corporateName
   * @return corporateName
  **/
  @ApiModelProperty(value = "")
  public String getCorporateName() {
    return corporateName;
  }

  public void setCorporateName(String corporateName) {
    this.corporateName = corporateName;
  }

  public Asn corporateAttention(String corporateAttention) {
    this.corporateAttention = corporateAttention;
    return this;
  }

   /**
   * Get corporateAttention
   * @return corporateAttention
  **/
  @ApiModelProperty(value = "")
  public String getCorporateAttention() {
    return corporateAttention;
  }

  public void setCorporateAttention(String corporateAttention) {
    this.corporateAttention = corporateAttention;
  }

  public Asn corporateStreet1(String corporateStreet1) {
    this.corporateStreet1 = corporateStreet1;
    return this;
  }

   /**
   * Get corporateStreet1
   * @return corporateStreet1
  **/
  @ApiModelProperty(value = "")
  public String getCorporateStreet1() {
    return corporateStreet1;
  }

  public void setCorporateStreet1(String corporateStreet1) {
    this.corporateStreet1 = corporateStreet1;
  }

  public Asn corporateStreet2(String corporateStreet2) {
    this.corporateStreet2 = corporateStreet2;
    return this;
  }

   /**
   * Get corporateStreet2
   * @return corporateStreet2
  **/
  @ApiModelProperty(value = "")
  public String getCorporateStreet2() {
    return corporateStreet2;
  }

  public void setCorporateStreet2(String corporateStreet2) {
    this.corporateStreet2 = corporateStreet2;
  }

  public Asn corporateCity(String corporateCity) {
    this.corporateCity = corporateCity;
    return this;
  }

   /**
   * Get corporateCity
   * @return corporateCity
  **/
  @ApiModelProperty(value = "")
  public String getCorporateCity() {
    return corporateCity;
  }

  public void setCorporateCity(String corporateCity) {
    this.corporateCity = corporateCity;
  }

  public Asn corporateState(String corporateState) {
    this.corporateState = corporateState;
    return this;
  }

   /**
   * Get corporateState
   * @return corporateState
  **/
  @ApiModelProperty(value = "")
  public String getCorporateState() {
    return corporateState;
  }

  public void setCorporateState(String corporateState) {
    this.corporateState = corporateState;
  }

  public Asn corporateZipCode(String corporateZipCode) {
    this.corporateZipCode = corporateZipCode;
    return this;
  }

   /**
   * Get corporateZipCode
   * @return corporateZipCode
  **/
  @ApiModelProperty(value = "")
  public String getCorporateZipCode() {
    return corporateZipCode;
  }

  public void setCorporateZipCode(String corporateZipCode) {
    this.corporateZipCode = corporateZipCode;
  }

  public Asn accountCode(String accountCode) {
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

  public Asn buyer(Integer buyer) {
    this.buyer = buyer;
    return this;
  }

   /**
   * Get buyer
   * @return buyer
  **/
  @ApiModelProperty(value = "")
  public Integer getBuyer() {
    return buyer;
  }

  public void setBuyer(Integer buyer) {
    this.buyer = buyer;
  }

  public Asn carrier(Integer carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(value = "")
  public Integer getCarrier() {
    return carrier;
  }

  public void setCarrier(Integer carrier) {
    this.carrier = carrier;
  }

  public Asn confTo(String confTo) {
    this.confTo = confTo;
    return this;
  }

   /**
   * Get confTo
   * @return confTo
  **/
  @ApiModelProperty(value = "")
  public String getConfTo() {
    return confTo;
  }

  public void setConfTo(String confTo) {
    this.confTo = confTo;
  }

  public Asn fob(String fob) {
    this.fob = fob;
    return this;
  }

   /**
   * Get fob
   * @return fob
  **/
  @ApiModelProperty(value = "")
  public String getFob() {
    return fob;
  }

  public void setFob(String fob) {
    this.fob = fob;
  }

   /**
   * Get printed
   * @return printed
  **/
  @ApiModelProperty(value = "")
  public String getPrinted() {
    return printed;
  }

  public Asn projectNo(Integer projectNo) {
    this.projectNo = projectNo;
    return this;
  }

   /**
   * Get projectNo
   * @return projectNo
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectNo() {
    return projectNo;
  }

  public void setProjectNo(Integer projectNo) {
    this.projectNo = projectNo;
  }

  public Asn remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * Get remarks
   * @return remarks
  **/
  @ApiModelProperty(value = "")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Asn requestBy(String requestBy) {
    this.requestBy = requestBy;
    return this;
  }

   /**
   * Get requestBy
   * @return requestBy
  **/
  @ApiModelProperty(value = "")
  public String getRequestBy() {
    return requestBy;
  }

  public void setRequestBy(String requestBy) {
    this.requestBy = requestBy;
  }

  public Asn terms(String terms) {
    this.terms = terms;
    return this;
  }

   /**
   * Get terms
   * @return terms
  **/
  @ApiModelProperty(value = "")
  public String getTerms() {
    return terms;
  }

  public void setTerms(String terms) {
    this.terms = terms;
  }

  public Asn usedBy(String usedBy) {
    this.usedBy = usedBy;
    return this;
  }

   /**
   * Get usedBy
   * @return usedBy
  **/
  @ApiModelProperty(value = "")
  public String getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(String usedBy) {
    this.usedBy = usedBy;
  }

  public Asn lineItems(List<ItemReceipt> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public Asn addLineItemsItem(ItemReceipt lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<ItemReceipt>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<ItemReceipt> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<ItemReceipt> lineItems) {
    this.lineItems = lineItems;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

   /**
   * Get transferOrderId
   * @return transferOrderId
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTransferOrderId() {
    return transferOrderId;
  }

  public Asn customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Asn putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Asn asn = (Asn) o;
    return Objects.equals(this.id, asn.id) &&
        Objects.equals(this.createDate, asn.createDate) &&
        Objects.equals(this.modifyDate, asn.modifyDate) &&
        Objects.equals(this.lobId, asn.lobId) &&
        Objects.equals(this.poNo, asn.poNo) &&
        Objects.equals(this.vendorId, asn.vendorId) &&
        Objects.equals(this.warehouseId, asn.warehouseId) &&
        Objects.equals(this.orderDate, asn.orderDate) &&
        Objects.equals(this.type, asn.type) &&
        Objects.equals(this.billingName, asn.billingName) &&
        Objects.equals(this.billingAttention, asn.billingAttention) &&
        Objects.equals(this.billingStreet1, asn.billingStreet1) &&
        Objects.equals(this.billingStreet2, asn.billingStreet2) &&
        Objects.equals(this.billingCity, asn.billingCity) &&
        Objects.equals(this.billingState, asn.billingState) &&
        Objects.equals(this.billingZipCode, asn.billingZipCode) &&
        Objects.equals(this.billingPhone, asn.billingPhone) &&
        Objects.equals(this.shipToName, asn.shipToName) &&
        Objects.equals(this.shipToAddress, asn.shipToAddress) &&
        Objects.equals(this.shipToStreet1, asn.shipToStreet1) &&
        Objects.equals(this.shipToStreet2, asn.shipToStreet2) &&
        Objects.equals(this.shipToCity, asn.shipToCity) &&
        Objects.equals(this.shipToState, asn.shipToState) &&
        Objects.equals(this.shipToZipCode, asn.shipToZipCode) &&
        Objects.equals(this.shipToPhone, asn.shipToPhone) &&
        Objects.equals(this.corporateName, asn.corporateName) &&
        Objects.equals(this.corporateAttention, asn.corporateAttention) &&
        Objects.equals(this.corporateStreet1, asn.corporateStreet1) &&
        Objects.equals(this.corporateStreet2, asn.corporateStreet2) &&
        Objects.equals(this.corporateCity, asn.corporateCity) &&
        Objects.equals(this.corporateState, asn.corporateState) &&
        Objects.equals(this.corporateZipCode, asn.corporateZipCode) &&
        Objects.equals(this.accountCode, asn.accountCode) &&
        Objects.equals(this.buyer, asn.buyer) &&
        Objects.equals(this.carrier, asn.carrier) &&
        Objects.equals(this.confTo, asn.confTo) &&
        Objects.equals(this.fob, asn.fob) &&
        Objects.equals(this.printed, asn.printed) &&
        Objects.equals(this.projectNo, asn.projectNo) &&
        Objects.equals(this.remarks, asn.remarks) &&
        Objects.equals(this.requestBy, asn.requestBy) &&
        Objects.equals(this.terms, asn.terms) &&
        Objects.equals(this.usedBy, asn.usedBy) &&
        Objects.equals(this.lineItems, asn.lineItems) &&
        Objects.equals(this.status, asn.status) &&
        Objects.equals(this.transferOrderId, asn.transferOrderId) &&
        Objects.equals(this.customFields, asn.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, lobId, poNo, vendorId, warehouseId, orderDate, type, billingName, billingAttention, billingStreet1, billingStreet2, billingCity, billingState, billingZipCode, billingPhone, shipToName, shipToAddress, shipToStreet1, shipToStreet2, shipToCity, shipToState, shipToZipCode, shipToPhone, corporateName, corporateAttention, corporateStreet1, corporateStreet2, corporateCity, corporateState, corporateZipCode, accountCode, buyer, carrier, confTo, fob, printed, projectNo, remarks, requestBy, terms, usedBy, lineItems, status, transferOrderId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Asn {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    poNo: ").append(toIndentedString(poNo)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    billingName: ").append(toIndentedString(billingName)).append("\n");
    sb.append("    billingAttention: ").append(toIndentedString(billingAttention)).append("\n");
    sb.append("    billingStreet1: ").append(toIndentedString(billingStreet1)).append("\n");
    sb.append("    billingStreet2: ").append(toIndentedString(billingStreet2)).append("\n");
    sb.append("    billingCity: ").append(toIndentedString(billingCity)).append("\n");
    sb.append("    billingState: ").append(toIndentedString(billingState)).append("\n");
    sb.append("    billingZipCode: ").append(toIndentedString(billingZipCode)).append("\n");
    sb.append("    billingPhone: ").append(toIndentedString(billingPhone)).append("\n");
    sb.append("    shipToName: ").append(toIndentedString(shipToName)).append("\n");
    sb.append("    shipToAddress: ").append(toIndentedString(shipToAddress)).append("\n");
    sb.append("    shipToStreet1: ").append(toIndentedString(shipToStreet1)).append("\n");
    sb.append("    shipToStreet2: ").append(toIndentedString(shipToStreet2)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZipCode: ").append(toIndentedString(shipToZipCode)).append("\n");
    sb.append("    shipToPhone: ").append(toIndentedString(shipToPhone)).append("\n");
    sb.append("    corporateName: ").append(toIndentedString(corporateName)).append("\n");
    sb.append("    corporateAttention: ").append(toIndentedString(corporateAttention)).append("\n");
    sb.append("    corporateStreet1: ").append(toIndentedString(corporateStreet1)).append("\n");
    sb.append("    corporateStreet2: ").append(toIndentedString(corporateStreet2)).append("\n");
    sb.append("    corporateCity: ").append(toIndentedString(corporateCity)).append("\n");
    sb.append("    corporateState: ").append(toIndentedString(corporateState)).append("\n");
    sb.append("    corporateZipCode: ").append(toIndentedString(corporateZipCode)).append("\n");
    sb.append("    accountCode: ").append(toIndentedString(accountCode)).append("\n");
    sb.append("    buyer: ").append(toIndentedString(buyer)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    confTo: ").append(toIndentedString(confTo)).append("\n");
    sb.append("    fob: ").append(toIndentedString(fob)).append("\n");
    sb.append("    printed: ").append(toIndentedString(printed)).append("\n");
    sb.append("    projectNo: ").append(toIndentedString(projectNo)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    requestBy: ").append(toIndentedString(requestBy)).append("\n");
    sb.append("    terms: ").append(toIndentedString(terms)).append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferOrderId: ").append(toIndentedString(transferOrderId)).append("\n");
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

