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
import com.infopluscommerce.model.OrderLineItem;
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
 * OmsOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-10-25T13:15:17.090-05:00")
public class OmsOrder {
  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("omsOrderNo")
  private Integer omsOrderNo = null;

  @SerializedName("total")
  private BigDecimal total = null;

  @SerializedName("orderStatus")
  private String orderStatus = null;

  @SerializedName("orderEntryProgramId")
  private Integer orderEntryProgramId = null;

  @SerializedName("legacyUserId")
  private Integer legacyUserId = null;

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("nextOMSOrderId")
  private Integer nextOMSOrderId = null;

  @SerializedName("customerId")
  private Integer customerId = null;

  @SerializedName("tax")
  private BigDecimal tax = null;

  @SerializedName("shippingHandling")
  private BigDecimal shippingHandling = null;

  @SerializedName("shOverrideAmount")
  private BigDecimal shOverrideAmount = null;

  @SerializedName("integrationPartnerId")
  private Integer integrationPartnerId = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("batchNo")
  private String batchNo = null;

  @SerializedName("isGift")
  private Boolean isGift = false;

  @SerializedName("giftMessage")
  private String giftMessage = null;

  @SerializedName("emailRecipient")
  private Boolean emailRecipient = false;

  @SerializedName("mailRecipient")
  private Boolean mailRecipient = false;

  @SerializedName("keyCode")
  private String keyCode = null;

  @SerializedName("keyCodeDescription")
  private String keyCodeDescription = null;

  @SerializedName("deliverOnDate")
  private OffsetDateTime deliverOnDate = null;

  @SerializedName("distCharges")
  private BigDecimal distCharges = null;

  @SerializedName("subTotal")
  private BigDecimal subTotal = null;

  @SerializedName("shipVia")
  private String shipVia = null;

  @SerializedName("lineItems")
  private List<OrderLineItem> lineItems = null;

  @SerializedName("shipToFirstName")
  private String shipToFirstName = null;

  @SerializedName("shipToLastName")
  private String shipToLastName = null;

  @SerializedName("shipToCompany")
  private String shipToCompany = null;

  @SerializedName("shipToStreet1")
  private String shipToStreet1 = null;

  @SerializedName("shipToStreet2")
  private String shipToStreet2 = null;

  @SerializedName("shipToStreet3")
  private String shipToStreet3 = null;

  @SerializedName("shipToCity")
  private String shipToCity = null;

  @SerializedName("shipToState")
  private String shipToState = null;

  @SerializedName("shipToZip")
  private String shipToZip = null;

  @SerializedName("shipToEmail")
  private String shipToEmail = null;

  @SerializedName("shipToPhone")
  private String shipToPhone = null;

  @SerializedName("billToFirstName")
  private String billToFirstName = null;

  @SerializedName("billToLastName")
  private String billToLastName = null;

  @SerializedName("billToCompany")
  private String billToCompany = null;

  @SerializedName("billToStreet1")
  private String billToStreet1 = null;

  @SerializedName("billToStreet2")
  private String billToStreet2 = null;

  @SerializedName("billToStreet3")
  private String billToStreet3 = null;

  @SerializedName("billToCity")
  private String billToCity = null;

  @SerializedName("billToState")
  private String billToState = null;

  @SerializedName("billToZip")
  private String billToZip = null;

  @SerializedName("billToEmail")
  private String billToEmail = null;

  @SerializedName("billToPhone")
  private String billToPhone = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public OmsOrder lobId(Integer lobId) {
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

  public OmsOrder externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public OmsOrder omsOrderNo(Integer omsOrderNo) {
    this.omsOrderNo = omsOrderNo;
    return this;
  }

   /**
   * Get omsOrderNo
   * @return omsOrderNo
  **/
  @ApiModelProperty(value = "")
  public Integer getOmsOrderNo() {
    return omsOrderNo;
  }

  public void setOmsOrderNo(Integer omsOrderNo) {
    this.omsOrderNo = omsOrderNo;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTotal() {
    return total;
  }

  public OmsOrder orderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }

   /**
   * Get orderEntryProgramId
   * @return orderEntryProgramId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderEntryProgramId() {
    return orderEntryProgramId;
  }

   /**
   * Get legacyUserId
   * @return legacyUserId
  **/
  @ApiModelProperty(value = "")
  public Integer getLegacyUserId() {
    return legacyUserId;
  }

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

  public OmsOrder nextOMSOrderId(Integer nextOMSOrderId) {
    this.nextOMSOrderId = nextOMSOrderId;
    return this;
  }

   /**
   * Get nextOMSOrderId
   * @return nextOMSOrderId
  **/
  @ApiModelProperty(value = "")
  public Integer getNextOMSOrderId() {
    return nextOMSOrderId;
  }

  public void setNextOMSOrderId(Integer nextOMSOrderId) {
    this.nextOMSOrderId = nextOMSOrderId;
  }

  public OmsOrder customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")
  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public OmsOrder tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

   /**
   * Get shippingHandling
   * @return shippingHandling
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getShippingHandling() {
    return shippingHandling;
  }

  public OmsOrder shOverrideAmount(BigDecimal shOverrideAmount) {
    this.shOverrideAmount = shOverrideAmount;
    return this;
  }

   /**
   * Get shOverrideAmount
   * @return shOverrideAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getShOverrideAmount() {
    return shOverrideAmount;
  }

  public void setShOverrideAmount(BigDecimal shOverrideAmount) {
    this.shOverrideAmount = shOverrideAmount;
  }

   /**
   * Get integrationPartnerId
   * @return integrationPartnerId
  **/
  @ApiModelProperty(value = "")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }

  public OmsOrder orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

  public OmsOrder batchNo(String batchNo) {
    this.batchNo = batchNo;
    return this;
  }

   /**
   * Get batchNo
   * @return batchNo
  **/
  @ApiModelProperty(value = "")
  public String getBatchNo() {
    return batchNo;
  }

  public void setBatchNo(String batchNo) {
    this.batchNo = batchNo;
  }

  public OmsOrder isGift(Boolean isGift) {
    this.isGift = isGift;
    return this;
  }

   /**
   * Get isGift
   * @return isGift
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsGift() {
    return isGift;
  }

  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }

  public OmsOrder giftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
    return this;
  }

   /**
   * Get giftMessage
   * @return giftMessage
  **/
  @ApiModelProperty(value = "")
  public String getGiftMessage() {
    return giftMessage;
  }

  public void setGiftMessage(String giftMessage) {
    this.giftMessage = giftMessage;
  }

  public OmsOrder emailRecipient(Boolean emailRecipient) {
    this.emailRecipient = emailRecipient;
    return this;
  }

   /**
   * Get emailRecipient
   * @return emailRecipient
  **/
  @ApiModelProperty(value = "")
  public Boolean isEmailRecipient() {
    return emailRecipient;
  }

  public void setEmailRecipient(Boolean emailRecipient) {
    this.emailRecipient = emailRecipient;
  }

  public OmsOrder mailRecipient(Boolean mailRecipient) {
    this.mailRecipient = mailRecipient;
    return this;
  }

   /**
   * Get mailRecipient
   * @return mailRecipient
  **/
  @ApiModelProperty(value = "")
  public Boolean isMailRecipient() {
    return mailRecipient;
  }

  public void setMailRecipient(Boolean mailRecipient) {
    this.mailRecipient = mailRecipient;
  }

  public OmsOrder keyCode(String keyCode) {
    this.keyCode = keyCode;
    return this;
  }

   /**
   * Get keyCode
   * @return keyCode
  **/
  @ApiModelProperty(value = "")
  public String getKeyCode() {
    return keyCode;
  }

  public void setKeyCode(String keyCode) {
    this.keyCode = keyCode;
  }

   /**
   * Get keyCodeDescription
   * @return keyCodeDescription
  **/
  @ApiModelProperty(value = "")
  public String getKeyCodeDescription() {
    return keyCodeDescription;
  }

  public OmsOrder deliverOnDate(OffsetDateTime deliverOnDate) {
    this.deliverOnDate = deliverOnDate;
    return this;
  }

   /**
   * Get deliverOnDate
   * @return deliverOnDate
  **/
  @ApiModelProperty(required = true, value = "")
  public OffsetDateTime getDeliverOnDate() {
    return deliverOnDate;
  }

  public void setDeliverOnDate(OffsetDateTime deliverOnDate) {
    this.deliverOnDate = deliverOnDate;
  }

   /**
   * Get distCharges
   * @return distCharges
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDistCharges() {
    return distCharges;
  }

   /**
   * Get subTotal
   * @return subTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSubTotal() {
    return subTotal;
  }

  public OmsOrder shipVia(String shipVia) {
    this.shipVia = shipVia;
    return this;
  }

   /**
   * Get shipVia
   * @return shipVia
  **/
  @ApiModelProperty(value = "")
  public String getShipVia() {
    return shipVia;
  }

  public void setShipVia(String shipVia) {
    this.shipVia = shipVia;
  }

  public OmsOrder lineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public OmsOrder addLineItemsItem(OrderLineItem lineItemsItem) {
    if (this.lineItems == null) {
      this.lineItems = new ArrayList<OrderLineItem>();
    }
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * Get lineItems
   * @return lineItems
  **/
  @ApiModelProperty(value = "")
  public List<OrderLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<OrderLineItem> lineItems) {
    this.lineItems = lineItems;
  }

   /**
   * Get shipToFirstName
   * @return shipToFirstName
  **/
  @ApiModelProperty(value = "")
  public String getShipToFirstName() {
    return shipToFirstName;
  }

   /**
   * Get shipToLastName
   * @return shipToLastName
  **/
  @ApiModelProperty(value = "")
  public String getShipToLastName() {
    return shipToLastName;
  }

   /**
   * Get shipToCompany
   * @return shipToCompany
  **/
  @ApiModelProperty(value = "")
  public String getShipToCompany() {
    return shipToCompany;
  }

   /**
   * Get shipToStreet1
   * @return shipToStreet1
  **/
  @ApiModelProperty(value = "")
  public String getShipToStreet1() {
    return shipToStreet1;
  }

   /**
   * Get shipToStreet2
   * @return shipToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getShipToStreet2() {
    return shipToStreet2;
  }

   /**
   * Get shipToStreet3
   * @return shipToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getShipToStreet3() {
    return shipToStreet3;
  }

   /**
   * Get shipToCity
   * @return shipToCity
  **/
  @ApiModelProperty(value = "")
  public String getShipToCity() {
    return shipToCity;
  }

   /**
   * Get shipToState
   * @return shipToState
  **/
  @ApiModelProperty(value = "")
  public String getShipToState() {
    return shipToState;
  }

   /**
   * Get shipToZip
   * @return shipToZip
  **/
  @ApiModelProperty(value = "")
  public String getShipToZip() {
    return shipToZip;
  }

   /**
   * Get shipToEmail
   * @return shipToEmail
  **/
  @ApiModelProperty(value = "")
  public String getShipToEmail() {
    return shipToEmail;
  }

   /**
   * Get shipToPhone
   * @return shipToPhone
  **/
  @ApiModelProperty(value = "")
  public String getShipToPhone() {
    return shipToPhone;
  }

   /**
   * Get billToFirstName
   * @return billToFirstName
  **/
  @ApiModelProperty(value = "")
  public String getBillToFirstName() {
    return billToFirstName;
  }

   /**
   * Get billToLastName
   * @return billToLastName
  **/
  @ApiModelProperty(value = "")
  public String getBillToLastName() {
    return billToLastName;
  }

   /**
   * Get billToCompany
   * @return billToCompany
  **/
  @ApiModelProperty(value = "")
  public String getBillToCompany() {
    return billToCompany;
  }

   /**
   * Get billToStreet1
   * @return billToStreet1
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet1() {
    return billToStreet1;
  }

   /**
   * Get billToStreet2
   * @return billToStreet2
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet2() {
    return billToStreet2;
  }

   /**
   * Get billToStreet3
   * @return billToStreet3
  **/
  @ApiModelProperty(value = "")
  public String getBillToStreet3() {
    return billToStreet3;
  }

   /**
   * Get billToCity
   * @return billToCity
  **/
  @ApiModelProperty(value = "")
  public String getBillToCity() {
    return billToCity;
  }

   /**
   * Get billToState
   * @return billToState
  **/
  @ApiModelProperty(value = "")
  public String getBillToState() {
    return billToState;
  }

   /**
   * Get billToZip
   * @return billToZip
  **/
  @ApiModelProperty(value = "")
  public String getBillToZip() {
    return billToZip;
  }

   /**
   * Get billToEmail
   * @return billToEmail
  **/
  @ApiModelProperty(value = "")
  public String getBillToEmail() {
    return billToEmail;
  }

   /**
   * Get billToPhone
   * @return billToPhone
  **/
  @ApiModelProperty(value = "")
  public String getBillToPhone() {
    return billToPhone;
  }

  public OmsOrder customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OmsOrder putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OmsOrder omsOrder = (OmsOrder) o;
    return Objects.equals(this.lobId, omsOrder.lobId) &&
        Objects.equals(this.externalId, omsOrder.externalId) &&
        Objects.equals(this.omsOrderNo, omsOrder.omsOrderNo) &&
        Objects.equals(this.total, omsOrder.total) &&
        Objects.equals(this.orderStatus, omsOrder.orderStatus) &&
        Objects.equals(this.orderEntryProgramId, omsOrder.orderEntryProgramId) &&
        Objects.equals(this.legacyUserId, omsOrder.legacyUserId) &&
        Objects.equals(this.id, omsOrder.id) &&
        Objects.equals(this.createDate, omsOrder.createDate) &&
        Objects.equals(this.modifyDate, omsOrder.modifyDate) &&
        Objects.equals(this.nextOMSOrderId, omsOrder.nextOMSOrderId) &&
        Objects.equals(this.customerId, omsOrder.customerId) &&
        Objects.equals(this.tax, omsOrder.tax) &&
        Objects.equals(this.shippingHandling, omsOrder.shippingHandling) &&
        Objects.equals(this.shOverrideAmount, omsOrder.shOverrideAmount) &&
        Objects.equals(this.integrationPartnerId, omsOrder.integrationPartnerId) &&
        Objects.equals(this.orderSourceId, omsOrder.orderSourceId) &&
        Objects.equals(this.batchNo, omsOrder.batchNo) &&
        Objects.equals(this.isGift, omsOrder.isGift) &&
        Objects.equals(this.giftMessage, omsOrder.giftMessage) &&
        Objects.equals(this.emailRecipient, omsOrder.emailRecipient) &&
        Objects.equals(this.mailRecipient, omsOrder.mailRecipient) &&
        Objects.equals(this.keyCode, omsOrder.keyCode) &&
        Objects.equals(this.keyCodeDescription, omsOrder.keyCodeDescription) &&
        Objects.equals(this.deliverOnDate, omsOrder.deliverOnDate) &&
        Objects.equals(this.distCharges, omsOrder.distCharges) &&
        Objects.equals(this.subTotal, omsOrder.subTotal) &&
        Objects.equals(this.shipVia, omsOrder.shipVia) &&
        Objects.equals(this.lineItems, omsOrder.lineItems) &&
        Objects.equals(this.shipToFirstName, omsOrder.shipToFirstName) &&
        Objects.equals(this.shipToLastName, omsOrder.shipToLastName) &&
        Objects.equals(this.shipToCompany, omsOrder.shipToCompany) &&
        Objects.equals(this.shipToStreet1, omsOrder.shipToStreet1) &&
        Objects.equals(this.shipToStreet2, omsOrder.shipToStreet2) &&
        Objects.equals(this.shipToStreet3, omsOrder.shipToStreet3) &&
        Objects.equals(this.shipToCity, omsOrder.shipToCity) &&
        Objects.equals(this.shipToState, omsOrder.shipToState) &&
        Objects.equals(this.shipToZip, omsOrder.shipToZip) &&
        Objects.equals(this.shipToEmail, omsOrder.shipToEmail) &&
        Objects.equals(this.shipToPhone, omsOrder.shipToPhone) &&
        Objects.equals(this.billToFirstName, omsOrder.billToFirstName) &&
        Objects.equals(this.billToLastName, omsOrder.billToLastName) &&
        Objects.equals(this.billToCompany, omsOrder.billToCompany) &&
        Objects.equals(this.billToStreet1, omsOrder.billToStreet1) &&
        Objects.equals(this.billToStreet2, omsOrder.billToStreet2) &&
        Objects.equals(this.billToStreet3, omsOrder.billToStreet3) &&
        Objects.equals(this.billToCity, omsOrder.billToCity) &&
        Objects.equals(this.billToState, omsOrder.billToState) &&
        Objects.equals(this.billToZip, omsOrder.billToZip) &&
        Objects.equals(this.billToEmail, omsOrder.billToEmail) &&
        Objects.equals(this.billToPhone, omsOrder.billToPhone) &&
        Objects.equals(this.customFields, omsOrder.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lobId, externalId, omsOrderNo, total, orderStatus, orderEntryProgramId, legacyUserId, id, createDate, modifyDate, nextOMSOrderId, customerId, tax, shippingHandling, shOverrideAmount, integrationPartnerId, orderSourceId, batchNo, isGift, giftMessage, emailRecipient, mailRecipient, keyCode, keyCodeDescription, deliverOnDate, distCharges, subTotal, shipVia, lineItems, shipToFirstName, shipToLastName, shipToCompany, shipToStreet1, shipToStreet2, shipToStreet3, shipToCity, shipToState, shipToZip, shipToEmail, shipToPhone, billToFirstName, billToLastName, billToCompany, billToStreet1, billToStreet2, billToStreet3, billToCity, billToState, billToZip, billToEmail, billToPhone, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OmsOrder {\n");
    
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    omsOrderNo: ").append(toIndentedString(omsOrderNo)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    orderEntryProgramId: ").append(toIndentedString(orderEntryProgramId)).append("\n");
    sb.append("    legacyUserId: ").append(toIndentedString(legacyUserId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    nextOMSOrderId: ").append(toIndentedString(nextOMSOrderId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    shippingHandling: ").append(toIndentedString(shippingHandling)).append("\n");
    sb.append("    shOverrideAmount: ").append(toIndentedString(shOverrideAmount)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    batchNo: ").append(toIndentedString(batchNo)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    giftMessage: ").append(toIndentedString(giftMessage)).append("\n");
    sb.append("    emailRecipient: ").append(toIndentedString(emailRecipient)).append("\n");
    sb.append("    mailRecipient: ").append(toIndentedString(mailRecipient)).append("\n");
    sb.append("    keyCode: ").append(toIndentedString(keyCode)).append("\n");
    sb.append("    keyCodeDescription: ").append(toIndentedString(keyCodeDescription)).append("\n");
    sb.append("    deliverOnDate: ").append(toIndentedString(deliverOnDate)).append("\n");
    sb.append("    distCharges: ").append(toIndentedString(distCharges)).append("\n");
    sb.append("    subTotal: ").append(toIndentedString(subTotal)).append("\n");
    sb.append("    shipVia: ").append(toIndentedString(shipVia)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    shipToFirstName: ").append(toIndentedString(shipToFirstName)).append("\n");
    sb.append("    shipToLastName: ").append(toIndentedString(shipToLastName)).append("\n");
    sb.append("    shipToCompany: ").append(toIndentedString(shipToCompany)).append("\n");
    sb.append("    shipToStreet1: ").append(toIndentedString(shipToStreet1)).append("\n");
    sb.append("    shipToStreet2: ").append(toIndentedString(shipToStreet2)).append("\n");
    sb.append("    shipToStreet3: ").append(toIndentedString(shipToStreet3)).append("\n");
    sb.append("    shipToCity: ").append(toIndentedString(shipToCity)).append("\n");
    sb.append("    shipToState: ").append(toIndentedString(shipToState)).append("\n");
    sb.append("    shipToZip: ").append(toIndentedString(shipToZip)).append("\n");
    sb.append("    shipToEmail: ").append(toIndentedString(shipToEmail)).append("\n");
    sb.append("    shipToPhone: ").append(toIndentedString(shipToPhone)).append("\n");
    sb.append("    billToFirstName: ").append(toIndentedString(billToFirstName)).append("\n");
    sb.append("    billToLastName: ").append(toIndentedString(billToLastName)).append("\n");
    sb.append("    billToCompany: ").append(toIndentedString(billToCompany)).append("\n");
    sb.append("    billToStreet1: ").append(toIndentedString(billToStreet1)).append("\n");
    sb.append("    billToStreet2: ").append(toIndentedString(billToStreet2)).append("\n");
    sb.append("    billToStreet3: ").append(toIndentedString(billToStreet3)).append("\n");
    sb.append("    billToCity: ").append(toIndentedString(billToCity)).append("\n");
    sb.append("    billToState: ").append(toIndentedString(billToState)).append("\n");
    sb.append("    billToZip: ").append(toIndentedString(billToZip)).append("\n");
    sb.append("    billToEmail: ").append(toIndentedString(billToEmail)).append("\n");
    sb.append("    billToPhone: ").append(toIndentedString(billToPhone)).append("\n");
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

