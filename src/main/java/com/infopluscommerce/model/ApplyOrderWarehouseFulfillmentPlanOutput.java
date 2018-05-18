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
import com.infopluscommerce.model.Order;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplyOrderWarehouseFulfillmentPlanOutput
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-18T11:14:53.718-05:00")
public class ApplyOrderWarehouseFulfillmentPlanOutput {
  @SerializedName("orderList")
  private List<Order> orderList = null;

  public ApplyOrderWarehouseFulfillmentPlanOutput orderList(List<Order> orderList) {
    this.orderList = orderList;
    return this;
  }

  public ApplyOrderWarehouseFulfillmentPlanOutput addOrderListItem(Order orderListItem) {
    if (this.orderList == null) {
      this.orderList = new ArrayList<Order>();
    }
    this.orderList.add(orderListItem);
    return this;
  }

   /**
   * Get orderList
   * @return orderList
  **/
  @ApiModelProperty(value = "")
  public List<Order> getOrderList() {
    return orderList;
  }

  public void setOrderList(List<Order> orderList) {
    this.orderList = orderList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplyOrderWarehouseFulfillmentPlanOutput applyOrderWarehouseFulfillmentPlanOutput = (ApplyOrderWarehouseFulfillmentPlanOutput) o;
    return Objects.equals(this.orderList, applyOrderWarehouseFulfillmentPlanOutput.orderList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyOrderWarehouseFulfillmentPlanOutput {\n");
    
    sb.append("    orderList: ").append(toIndentedString(orderList)).append("\n");
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

