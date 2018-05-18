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
 * BillOfLadingCarrierInfoLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-18T14:06:17.331-05:00")
public class BillOfLadingCarrierInfoLine {
  @SerializedName("seqNo")
  private Integer seqNo = null;

  @SerializedName("huQuantity")
  private Integer huQuantity = null;

  @SerializedName("huType")
  private String huType = null;

  @SerializedName("packageQuantity")
  private Integer packageQuantity = null;

  @SerializedName("packageType")
  private String packageType = null;

  @SerializedName("weight")
  private Integer weight = null;

  @SerializedName("isHazardousMaterial")
  private Boolean isHazardousMaterial = false;

  @SerializedName("commodityDescription")
  private String commodityDescription = null;

  @SerializedName("nfmcNo")
  private String nfmcNo = null;

  @SerializedName("carrierClass")
  private String carrierClass = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public BillOfLadingCarrierInfoLine seqNo(Integer seqNo) {
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

  public BillOfLadingCarrierInfoLine huQuantity(Integer huQuantity) {
    this.huQuantity = huQuantity;
    return this;
  }

   /**
   * Get huQuantity
   * @return huQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getHuQuantity() {
    return huQuantity;
  }

  public void setHuQuantity(Integer huQuantity) {
    this.huQuantity = huQuantity;
  }

  public BillOfLadingCarrierInfoLine huType(String huType) {
    this.huType = huType;
    return this;
  }

   /**
   * Get huType
   * @return huType
  **/
  @ApiModelProperty(value = "")
  public String getHuType() {
    return huType;
  }

  public void setHuType(String huType) {
    this.huType = huType;
  }

  public BillOfLadingCarrierInfoLine packageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
    return this;
  }

   /**
   * Get packageQuantity
   * @return packageQuantity
  **/
  @ApiModelProperty(value = "")
  public Integer getPackageQuantity() {
    return packageQuantity;
  }

  public void setPackageQuantity(Integer packageQuantity) {
    this.packageQuantity = packageQuantity;
  }

  public BillOfLadingCarrierInfoLine packageType(String packageType) {
    this.packageType = packageType;
    return this;
  }

   /**
   * Get packageType
   * @return packageType
  **/
  @ApiModelProperty(value = "")
  public String getPackageType() {
    return packageType;
  }

  public void setPackageType(String packageType) {
    this.packageType = packageType;
  }

  public BillOfLadingCarrierInfoLine weight(Integer weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(value = "")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public BillOfLadingCarrierInfoLine isHazardousMaterial(Boolean isHazardousMaterial) {
    this.isHazardousMaterial = isHazardousMaterial;
    return this;
  }

   /**
   * Get isHazardousMaterial
   * @return isHazardousMaterial
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsHazardousMaterial() {
    return isHazardousMaterial;
  }

  public void setIsHazardousMaterial(Boolean isHazardousMaterial) {
    this.isHazardousMaterial = isHazardousMaterial;
  }

  public BillOfLadingCarrierInfoLine commodityDescription(String commodityDescription) {
    this.commodityDescription = commodityDescription;
    return this;
  }

   /**
   * Get commodityDescription
   * @return commodityDescription
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCommodityDescription() {
    return commodityDescription;
  }

  public void setCommodityDescription(String commodityDescription) {
    this.commodityDescription = commodityDescription;
  }

  public BillOfLadingCarrierInfoLine nfmcNo(String nfmcNo) {
    this.nfmcNo = nfmcNo;
    return this;
  }

   /**
   * Get nfmcNo
   * @return nfmcNo
  **/
  @ApiModelProperty(value = "")
  public String getNfmcNo() {
    return nfmcNo;
  }

  public void setNfmcNo(String nfmcNo) {
    this.nfmcNo = nfmcNo;
  }

  public BillOfLadingCarrierInfoLine carrierClass(String carrierClass) {
    this.carrierClass = carrierClass;
    return this;
  }

   /**
   * Get carrierClass
   * @return carrierClass
  **/
  @ApiModelProperty(value = "")
  public String getCarrierClass() {
    return carrierClass;
  }

  public void setCarrierClass(String carrierClass) {
    this.carrierClass = carrierClass;
  }

  public BillOfLadingCarrierInfoLine customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public BillOfLadingCarrierInfoLine putCustomFieldsItem(String key, Object customFieldsItem) {
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
    BillOfLadingCarrierInfoLine billOfLadingCarrierInfoLine = (BillOfLadingCarrierInfoLine) o;
    return Objects.equals(this.seqNo, billOfLadingCarrierInfoLine.seqNo) &&
        Objects.equals(this.huQuantity, billOfLadingCarrierInfoLine.huQuantity) &&
        Objects.equals(this.huType, billOfLadingCarrierInfoLine.huType) &&
        Objects.equals(this.packageQuantity, billOfLadingCarrierInfoLine.packageQuantity) &&
        Objects.equals(this.packageType, billOfLadingCarrierInfoLine.packageType) &&
        Objects.equals(this.weight, billOfLadingCarrierInfoLine.weight) &&
        Objects.equals(this.isHazardousMaterial, billOfLadingCarrierInfoLine.isHazardousMaterial) &&
        Objects.equals(this.commodityDescription, billOfLadingCarrierInfoLine.commodityDescription) &&
        Objects.equals(this.nfmcNo, billOfLadingCarrierInfoLine.nfmcNo) &&
        Objects.equals(this.carrierClass, billOfLadingCarrierInfoLine.carrierClass) &&
        Objects.equals(this.customFields, billOfLadingCarrierInfoLine.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seqNo, huQuantity, huType, packageQuantity, packageType, weight, isHazardousMaterial, commodityDescription, nfmcNo, carrierClass, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillOfLadingCarrierInfoLine {\n");
    
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    huQuantity: ").append(toIndentedString(huQuantity)).append("\n");
    sb.append("    huType: ").append(toIndentedString(huType)).append("\n");
    sb.append("    packageQuantity: ").append(toIndentedString(packageQuantity)).append("\n");
    sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    isHazardousMaterial: ").append(toIndentedString(isHazardousMaterial)).append("\n");
    sb.append("    commodityDescription: ").append(toIndentedString(commodityDescription)).append("\n");
    sb.append("    nfmcNo: ").append(toIndentedString(nfmcNo)).append("\n");
    sb.append("    carrierClass: ").append(toIndentedString(carrierClass)).append("\n");
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
