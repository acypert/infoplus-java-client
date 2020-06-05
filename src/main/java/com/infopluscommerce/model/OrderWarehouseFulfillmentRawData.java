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
import com.infopluscommerce.model.OrderWarehouseFulfillmentRawSkuData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderWarehouseFulfillmentRawData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-06-04T22:54:34.594-05:00")
public class OrderWarehouseFulfillmentRawData {
  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("canFulfill")
  private Boolean canFulfill = false;

  @SerializedName("skuMap")
  private Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap = null;

  public OrderWarehouseFulfillmentRawData warehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

   /**
   * Get warehouseId
   * @return warehouseId
  **/
  @ApiModelProperty(value = "")
  public Integer getWarehouseId() {
    return warehouseId;
  }

  public void setWarehouseId(Integer warehouseId) {
    this.warehouseId = warehouseId;
  }

  public OrderWarehouseFulfillmentRawData canFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
    return this;
  }

   /**
   * Get canFulfill
   * @return canFulfill
  **/
  @ApiModelProperty(value = "")
  public Boolean isCanFulfill() {
    return canFulfill;
  }

  public void setCanFulfill(Boolean canFulfill) {
    this.canFulfill = canFulfill;
  }

  public OrderWarehouseFulfillmentRawData skuMap(Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap) {
    this.skuMap = skuMap;
    return this;
  }

  public OrderWarehouseFulfillmentRawData putSkuMapItem(String key, OrderWarehouseFulfillmentRawSkuData skuMapItem) {
    if (this.skuMap == null) {
      this.skuMap = new HashMap<String, OrderWarehouseFulfillmentRawSkuData>();
    }
    this.skuMap.put(key, skuMapItem);
    return this;
  }

   /**
   * Get skuMap
   * @return skuMap
  **/
  @ApiModelProperty(value = "")
  public Map<String, OrderWarehouseFulfillmentRawSkuData> getSkuMap() {
    return skuMap;
  }

  public void setSkuMap(Map<String, OrderWarehouseFulfillmentRawSkuData> skuMap) {
    this.skuMap = skuMap;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderWarehouseFulfillmentRawData orderWarehouseFulfillmentRawData = (OrderWarehouseFulfillmentRawData) o;
    return Objects.equals(this.warehouseId, orderWarehouseFulfillmentRawData.warehouseId) &&
        Objects.equals(this.canFulfill, orderWarehouseFulfillmentRawData.canFulfill) &&
        Objects.equals(this.skuMap, orderWarehouseFulfillmentRawData.skuMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseId, canFulfill, skuMap);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderWarehouseFulfillmentRawData {\n");
    
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
    sb.append("    skuMap: ").append(toIndentedString(skuMap)).append("\n");
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

