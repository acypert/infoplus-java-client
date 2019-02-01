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
 * ReqManualSubstitutionInputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-31T19:07:25.145-06:00")
public class ReqManualSubstitutionInputAPIModel {
  @SerializedName("orderNoList")
  private List<BigDecimal> orderNoList = null;

  @SerializedName("originalSKU")
  private String originalSKU = null;

  @SerializedName("originalKitSKU")
  private String originalKitSKU = null;

  @SerializedName("originalQuantity")
  private Integer originalQuantity = null;

  @SerializedName("originalComponentSKU")
  private String originalComponentSKU = null;

  @SerializedName("newSKU")
  private String newSKU = null;

  @SerializedName("newQuantity")
  private Integer newQuantity = null;

  @SerializedName("editType")
  private String editType = null;

  public ReqManualSubstitutionInputAPIModel orderNoList(List<BigDecimal> orderNoList) {
    this.orderNoList = orderNoList;
    return this;
  }

  public ReqManualSubstitutionInputAPIModel addOrderNoListItem(BigDecimal orderNoListItem) {
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

  public ReqManualSubstitutionInputAPIModel originalSKU(String originalSKU) {
    this.originalSKU = originalSKU;
    return this;
  }

   /**
   * Get originalSKU
   * @return originalSKU
  **/
  @ApiModelProperty(value = "")
  public String getOriginalSKU() {
    return originalSKU;
  }

  public void setOriginalSKU(String originalSKU) {
    this.originalSKU = originalSKU;
  }

  public ReqManualSubstitutionInputAPIModel originalKitSKU(String originalKitSKU) {
    this.originalKitSKU = originalKitSKU;
    return this;
  }

   /**
   * Get originalKitSKU
   * @return originalKitSKU
  **/
  @ApiModelProperty(value = "")
  public String getOriginalKitSKU() {
    return originalKitSKU;
  }

  public void setOriginalKitSKU(String originalKitSKU) {
    this.originalKitSKU = originalKitSKU;
  }

  public ReqManualSubstitutionInputAPIModel originalQuantity(Integer originalQuantity) {
    this.originalQuantity = originalQuantity;
    return this;
  }

   /**
   * Get originalQuantity
   * @return originalQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getOriginalQuantity() {
    return originalQuantity;
  }

  public void setOriginalQuantity(Integer originalQuantity) {
    this.originalQuantity = originalQuantity;
  }

  public ReqManualSubstitutionInputAPIModel originalComponentSKU(String originalComponentSKU) {
    this.originalComponentSKU = originalComponentSKU;
    return this;
  }

   /**
   * Get originalComponentSKU
   * @return originalComponentSKU
  **/
  @ApiModelProperty(value = "")
  public String getOriginalComponentSKU() {
    return originalComponentSKU;
  }

  public void setOriginalComponentSKU(String originalComponentSKU) {
    this.originalComponentSKU = originalComponentSKU;
  }

  public ReqManualSubstitutionInputAPIModel newSKU(String newSKU) {
    this.newSKU = newSKU;
    return this;
  }

   /**
   * Get newSKU
   * @return newSKU
  **/
  @ApiModelProperty(value = "")
  public String getNewSKU() {
    return newSKU;
  }

  public void setNewSKU(String newSKU) {
    this.newSKU = newSKU;
  }

  public ReqManualSubstitutionInputAPIModel newQuantity(Integer newQuantity) {
    this.newQuantity = newQuantity;
    return this;
  }

   /**
   * Get newQuantity
   * @return newQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getNewQuantity() {
    return newQuantity;
  }

  public void setNewQuantity(Integer newQuantity) {
    this.newQuantity = newQuantity;
  }

  public ReqManualSubstitutionInputAPIModel editType(String editType) {
    this.editType = editType;
    return this;
  }

   /**
   * Get editType
   * @return editType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEditType() {
    return editType;
  }

  public void setEditType(String editType) {
    this.editType = editType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReqManualSubstitutionInputAPIModel reqManualSubstitutionInputAPIModel = (ReqManualSubstitutionInputAPIModel) o;
    return Objects.equals(this.orderNoList, reqManualSubstitutionInputAPIModel.orderNoList) &&
        Objects.equals(this.originalSKU, reqManualSubstitutionInputAPIModel.originalSKU) &&
        Objects.equals(this.originalKitSKU, reqManualSubstitutionInputAPIModel.originalKitSKU) &&
        Objects.equals(this.originalQuantity, reqManualSubstitutionInputAPIModel.originalQuantity) &&
        Objects.equals(this.originalComponentSKU, reqManualSubstitutionInputAPIModel.originalComponentSKU) &&
        Objects.equals(this.newSKU, reqManualSubstitutionInputAPIModel.newSKU) &&
        Objects.equals(this.newQuantity, reqManualSubstitutionInputAPIModel.newQuantity) &&
        Objects.equals(this.editType, reqManualSubstitutionInputAPIModel.editType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNoList, originalSKU, originalKitSKU, originalQuantity, originalComponentSKU, newSKU, newQuantity, editType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReqManualSubstitutionInputAPIModel {\n");
    
    sb.append("    orderNoList: ").append(toIndentedString(orderNoList)).append("\n");
    sb.append("    originalSKU: ").append(toIndentedString(originalSKU)).append("\n");
    sb.append("    originalKitSKU: ").append(toIndentedString(originalKitSKU)).append("\n");
    sb.append("    originalQuantity: ").append(toIndentedString(originalQuantity)).append("\n");
    sb.append("    originalComponentSKU: ").append(toIndentedString(originalComponentSKU)).append("\n");
    sb.append("    newSKU: ").append(toIndentedString(newSKU)).append("\n");
    sb.append("    newQuantity: ").append(toIndentedString(newQuantity)).append("\n");
    sb.append("    editType: ").append(toIndentedString(editType)).append("\n");
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

