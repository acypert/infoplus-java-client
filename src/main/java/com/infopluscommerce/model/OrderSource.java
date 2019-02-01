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
 * OrderSource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T19:07:25.145-06:00")
public class OrderSource {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("packingNotes")
  private String packingNotes = null;

  @SerializedName("requireCartonizedASN")
  private Boolean requireCartonizedASN = false;

  @SerializedName("usesReservations")
  private Boolean usesReservations = false;

  @SerializedName("requireGS1128Label")
  private Boolean requireGS1128Label = false;

  @SerializedName("shippingNotes")
  private String shippingNotes = null;

  @SerializedName("packingSlipId")
  private Integer packingSlipId = null;

  @SerializedName("orderInvoiceId")
  private Integer orderInvoiceId = null;

  @SerializedName("orderConfirmationEmailId")
  private Integer orderConfirmationEmailId = null;

  @SerializedName("shipmentConfirmationEmailId")
  private Integer shipmentConfirmationEmailId = null;

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

  public OrderSource lobId(Integer lobId) {
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

  public OrderSource name(String name) {
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

  public OrderSource packingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
    return this;
  }

   /**
   * Get packingNotes
   * @return packingNotes
  **/
  @ApiModelProperty(value = "")
  public String getPackingNotes() {
    return packingNotes;
  }

  public void setPackingNotes(String packingNotes) {
    this.packingNotes = packingNotes;
  }

  public OrderSource requireCartonizedASN(Boolean requireCartonizedASN) {
    this.requireCartonizedASN = requireCartonizedASN;
    return this;
  }

   /**
   * Get requireCartonizedASN
   * @return requireCartonizedASN
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireCartonizedASN() {
    return requireCartonizedASN;
  }

  public void setRequireCartonizedASN(Boolean requireCartonizedASN) {
    this.requireCartonizedASN = requireCartonizedASN;
  }

  public OrderSource usesReservations(Boolean usesReservations) {
    this.usesReservations = usesReservations;
    return this;
  }

   /**
   * Get usesReservations
   * @return usesReservations
  **/
  @ApiModelProperty(value = "")
  public Boolean isUsesReservations() {
    return usesReservations;
  }

  public void setUsesReservations(Boolean usesReservations) {
    this.usesReservations = usesReservations;
  }

  public OrderSource requireGS1128Label(Boolean requireGS1128Label) {
    this.requireGS1128Label = requireGS1128Label;
    return this;
  }

   /**
   * Get requireGS1128Label
   * @return requireGS1128Label
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireGS1128Label() {
    return requireGS1128Label;
  }

  public void setRequireGS1128Label(Boolean requireGS1128Label) {
    this.requireGS1128Label = requireGS1128Label;
  }

  public OrderSource shippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
    return this;
  }

   /**
   * Get shippingNotes
   * @return shippingNotes
  **/
  @ApiModelProperty(value = "")
  public String getShippingNotes() {
    return shippingNotes;
  }

  public void setShippingNotes(String shippingNotes) {
    this.shippingNotes = shippingNotes;
  }

  public OrderSource packingSlipId(Integer packingSlipId) {
    this.packingSlipId = packingSlipId;
    return this;
  }

   /**
   * Get packingSlipId
   * @return packingSlipId
  **/
  @ApiModelProperty(value = "")
  public Integer getPackingSlipId() {
    return packingSlipId;
  }

  public void setPackingSlipId(Integer packingSlipId) {
    this.packingSlipId = packingSlipId;
  }

  public OrderSource orderInvoiceId(Integer orderInvoiceId) {
    this.orderInvoiceId = orderInvoiceId;
    return this;
  }

   /**
   * Get orderInvoiceId
   * @return orderInvoiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderInvoiceId() {
    return orderInvoiceId;
  }

  public void setOrderInvoiceId(Integer orderInvoiceId) {
    this.orderInvoiceId = orderInvoiceId;
  }

  public OrderSource orderConfirmationEmailId(Integer orderConfirmationEmailId) {
    this.orderConfirmationEmailId = orderConfirmationEmailId;
    return this;
  }

   /**
   * Get orderConfirmationEmailId
   * @return orderConfirmationEmailId
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderConfirmationEmailId() {
    return orderConfirmationEmailId;
  }

  public void setOrderConfirmationEmailId(Integer orderConfirmationEmailId) {
    this.orderConfirmationEmailId = orderConfirmationEmailId;
  }

  public OrderSource shipmentConfirmationEmailId(Integer shipmentConfirmationEmailId) {
    this.shipmentConfirmationEmailId = shipmentConfirmationEmailId;
    return this;
  }

   /**
   * Get shipmentConfirmationEmailId
   * @return shipmentConfirmationEmailId
  **/
  @ApiModelProperty(value = "")
  public Integer getShipmentConfirmationEmailId() {
    return shipmentConfirmationEmailId;
  }

  public void setShipmentConfirmationEmailId(Integer shipmentConfirmationEmailId) {
    this.shipmentConfirmationEmailId = shipmentConfirmationEmailId;
  }

  public OrderSource customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OrderSource putCustomFieldsItem(String key, Object customFieldsItem) {
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
    OrderSource orderSource = (OrderSource) o;
    return Objects.equals(this.id, orderSource.id) &&
        Objects.equals(this.lobId, orderSource.lobId) &&
        Objects.equals(this.name, orderSource.name) &&
        Objects.equals(this.createDate, orderSource.createDate) &&
        Objects.equals(this.modifyDate, orderSource.modifyDate) &&
        Objects.equals(this.packingNotes, orderSource.packingNotes) &&
        Objects.equals(this.requireCartonizedASN, orderSource.requireCartonizedASN) &&
        Objects.equals(this.usesReservations, orderSource.usesReservations) &&
        Objects.equals(this.requireGS1128Label, orderSource.requireGS1128Label) &&
        Objects.equals(this.shippingNotes, orderSource.shippingNotes) &&
        Objects.equals(this.packingSlipId, orderSource.packingSlipId) &&
        Objects.equals(this.orderInvoiceId, orderSource.orderInvoiceId) &&
        Objects.equals(this.orderConfirmationEmailId, orderSource.orderConfirmationEmailId) &&
        Objects.equals(this.shipmentConfirmationEmailId, orderSource.shipmentConfirmationEmailId) &&
        Objects.equals(this.customFields, orderSource.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lobId, name, createDate, modifyDate, packingNotes, requireCartonizedASN, usesReservations, requireGS1128Label, shippingNotes, packingSlipId, orderInvoiceId, orderConfirmationEmailId, shipmentConfirmationEmailId, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSource {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    packingNotes: ").append(toIndentedString(packingNotes)).append("\n");
    sb.append("    requireCartonizedASN: ").append(toIndentedString(requireCartonizedASN)).append("\n");
    sb.append("    usesReservations: ").append(toIndentedString(usesReservations)).append("\n");
    sb.append("    requireGS1128Label: ").append(toIndentedString(requireGS1128Label)).append("\n");
    sb.append("    shippingNotes: ").append(toIndentedString(shippingNotes)).append("\n");
    sb.append("    packingSlipId: ").append(toIndentedString(packingSlipId)).append("\n");
    sb.append("    orderInvoiceId: ").append(toIndentedString(orderInvoiceId)).append("\n");
    sb.append("    orderConfirmationEmailId: ").append(toIndentedString(orderConfirmationEmailId)).append("\n");
    sb.append("    shipmentConfirmationEmailId: ").append(toIndentedString(shipmentConfirmationEmailId)).append("\n");
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
