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
import java.util.ArrayList;
import java.util.List;

/**
 * EditLineItemFulfillmentStrategyInputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-10T09:18:50.138-06:00")
public class EditLineItemFulfillmentStrategyInputAPIModel {
  @SerializedName("orderNoList")
  private List<BigDecimal> orderNoList = null;

  @SerializedName("fulfillmentChannelId")
  private Integer fulfillmentChannelId = null;

  @SerializedName("sku")
  private String sku = null;

  public EditLineItemFulfillmentStrategyInputAPIModel orderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
    return this;
  }

  public EditLineItemFulfillmentStrategyInputAPIModel addOrderNoListItem(BigDecimal orderNoListItem) {
    if (this.orderNoList == null) {
      this.orderNoList = new ArrayList<BigDecimal>();
    }
    this.orderNoList.add(orderNoListItem);
    return this;
  }

   /**
   * Get orderNoList
   * @return orderNoList
  **/
  @ApiModelProperty(value = "")
  public List<BigDecimal> getOrderNoList() {
    return orderNoList;
  }

  public void setOrderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
  }

  public EditLineItemFulfillmentStrategyInputAPIModel fulfillmentChannelId(Integer fulfillmentChannelId) {
    this.fulfillmentChannelId = fulfillmentChannelId;
    return this;
  }

   /**
   * Get fulfillmentChannelId
   * @return fulfillmentChannelId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getFulfillmentChannelId() {
    return fulfillmentChannelId;
  }

  public void setFulfillmentChannelId(Integer fulfillmentChannelId) {
    this.fulfillmentChannelId = fulfillmentChannelId;
  }

  public EditLineItemFulfillmentStrategyInputAPIModel sku(String sku) {
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
    EditLineItemFulfillmentStrategyInputAPIModel editLineItemFulfillmentStrategyInputAPIModel = (EditLineItemFulfillmentStrategyInputAPIModel) o;
    return Objects.equals(this.orderNoList, editLineItemFulfillmentStrategyInputAPIModel.orderNoList) &&
        Objects.equals(this.fulfillmentChannelId, editLineItemFulfillmentStrategyInputAPIModel.fulfillmentChannelId) &&
        Objects.equals(this.sku, editLineItemFulfillmentStrategyInputAPIModel.sku);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNoList, fulfillmentChannelId, sku);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditLineItemFulfillmentStrategyInputAPIModel {\n");
    
    sb.append("    orderNoList: ").append(toIndentedString(orderNoList)).append("\n");
    sb.append("    fulfillmentChannelId: ").append(toIndentedString(fulfillmentChannelId)).append("\n");
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

