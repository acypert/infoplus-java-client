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

/**
 * OrderSourceStockStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-31T10:21:14.851-06:00")
public class OrderSourceStockStatus {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("totalReservedQuantity")
  private Integer totalReservedQuantity = null;

  @SerializedName("demand")
  private Integer demand = null;

  @SerializedName("reservedQuantity")
  private Integer reservedQuantity = null;

  @SerializedName("quantityAvailable")
  private Integer quantityAvailable = null;

  @SerializedName("orderableQuantity")
  private Integer orderableQuantity = null;

  @SerializedName("unreservedQuantityAvailable")
  private Integer unreservedQuantityAvailable = null;

  @SerializedName("netReservation")
  private Integer netReservation = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  @SerializedName("sku")
  private String sku = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public OrderSourceStockStatus orderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
    return this;
  }

   /**
   * Get orderSourceId
   * @return orderSourceId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getOrderSourceId() {
    return orderSourceId;
  }

  public void setOrderSourceId(Integer orderSourceId) {
    this.orderSourceId = orderSourceId;
  }

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

   /**
   * Get totalReservedQuantity
   * @return totalReservedQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalReservedQuantity() {
    return totalReservedQuantity;
  }

   /**
   * Get demand
   * @return demand
  **/
  @ApiModelProperty(value = "")
  public Integer getDemand() {
    return demand;
  }

   /**
   * Get reservedQuantity
   * @return reservedQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getReservedQuantity() {
    return reservedQuantity;
  }

   /**
   * Get quantityAvailable
   * @return quantityAvailable
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityAvailable() {
    return quantityAvailable;
  }

   /**
   * Get orderableQuantity
   * @return orderableQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOrderableQuantity() {
    return orderableQuantity;
  }

   /**
   * Get unreservedQuantityAvailable
   * @return unreservedQuantityAvailable
  **/
  @ApiModelProperty(value = "")
  public Integer getUnreservedQuantityAvailable() {
    return unreservedQuantityAvailable;
  }

   /**
   * Get netReservation
   * @return netReservation
  **/
  @ApiModelProperty(value = "")
  public Integer getNetReservation() {
    return netReservation;
  }

  public OrderSourceStockStatus customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public OrderSourceStockStatus putCustomFieldsItem(String key, Object customFieldsItem) {
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

  public OrderSourceStockStatus sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSourceStockStatus orderSourceStockStatus = (OrderSourceStockStatus) o;
    return Objects.equals(this.id, orderSourceStockStatus.id) &&
        Objects.equals(this.orderSourceId, orderSourceStockStatus.orderSourceId) &&
        Objects.equals(this.lobId, orderSourceStockStatus.lobId) &&
        Objects.equals(this.totalReservedQuantity, orderSourceStockStatus.totalReservedQuantity) &&
        Objects.equals(this.demand, orderSourceStockStatus.demand) &&
        Objects.equals(this.reservedQuantity, orderSourceStockStatus.reservedQuantity) &&
        Objects.equals(this.quantityAvailable, orderSourceStockStatus.quantityAvailable) &&
        Objects.equals(this.orderableQuantity, orderSourceStockStatus.orderableQuantity) &&
        Objects.equals(this.unreservedQuantityAvailable, orderSourceStockStatus.unreservedQuantityAvailable) &&
        Objects.equals(this.netReservation, orderSourceStockStatus.netReservation) &&
        Objects.equals(this.customFields, orderSourceStockStatus.customFields) &&
        Objects.equals(this.sku, orderSourceStockStatus.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderSourceId, lobId, totalReservedQuantity, demand, reservedQuantity, quantityAvailable, orderableQuantity, unreservedQuantityAvailable, netReservation, customFields, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSourceStockStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    totalReservedQuantity: ").append(toIndentedString(totalReservedQuantity)).append("\n");
    sb.append("    demand: ").append(toIndentedString(demand)).append("\n");
    sb.append("    reservedQuantity: ").append(toIndentedString(reservedQuantity)).append("\n");
    sb.append("    quantityAvailable: ").append(toIndentedString(quantityAvailable)).append("\n");
    sb.append("    orderableQuantity: ").append(toIndentedString(orderableQuantity)).append("\n");
    sb.append("    unreservedQuantityAvailable: ").append(toIndentedString(unreservedQuantityAvailable)).append("\n");
    sb.append("    netReservation: ").append(toIndentedString(netReservation)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
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

