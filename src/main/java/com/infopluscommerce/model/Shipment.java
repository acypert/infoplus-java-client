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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * Shipment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-18T11:14:53.718-05:00")
public class Shipment {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("shipDate")
  private OffsetDateTime shipDate = null;

  @SerializedName("deliveredDate")
  private OffsetDateTime deliveredDate = null;

  @SerializedName("trackingNo")
  private String trackingNo = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderNo")
  private BigDecimal orderNo = null;

  @SerializedName("cartonNo")
  private Integer cartonNo = null;

  @SerializedName("numberOfCartons")
  private Integer numberOfCartons = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("shipped")
  private Boolean shipped = false;

  @SerializedName("carrierServiceId")
  private Integer carrierServiceId = null;

  @SerializedName("dim1In")
  private BigDecimal dim1In = null;

  @SerializedName("dim2In")
  private BigDecimal dim2In = null;

  @SerializedName("dim3In")
  private BigDecimal dim3In = null;

  @SerializedName("estimatedZone")
  private String estimatedZone = null;

  @SerializedName("parcelAccountNo")
  private String parcelAccountNo = null;

  @SerializedName("thirdPartyParcelAccountNo")
  private String thirdPartyParcelAccountNo = null;

  @SerializedName("shipmentID")
  private String shipmentID = null;

  @SerializedName("manifestId")
  private Integer manifestId = null;

  @SerializedName("residential")
  private Boolean residential = false;

  @SerializedName("billingOption")
  private String billingOption = null;

  @SerializedName("weightLbs")
  private BigDecimal weightLbs = null;

  @SerializedName("dimWeight")
  private BigDecimal dimWeight = null;

  @SerializedName("licensePlateNumber")
  private String licensePlateNumber = null;

  @SerializedName("chargedFreightAmount")
  private BigDecimal chargedFreightAmount = null;

  @SerializedName("publishedFreightAmount")
  private BigDecimal publishedFreightAmount = null;

  @SerializedName("retailFreightAmount")
  private BigDecimal retailFreightAmount = null;

  @SerializedName("externalShippingSystemId")
  private Integer externalShippingSystemId = null;

  @SerializedName("shipmentType")
  private String shipmentType = null;

  @SerializedName("carrierCompany")
  private String carrierCompany = null;

  @SerializedName("customFields")
  private Map<String, Object> customFields = null;

  public Shipment id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

   /**
   * Get shipDate
   * @return shipDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getShipDate() {
    return shipDate;
  }

   /**
   * Get deliveredDate
   * @return deliveredDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDeliveredDate() {
    return deliveredDate;
  }

   /**
   * Get trackingNo
   * @return trackingNo
  **/
  @ApiModelProperty(value = "")
  public String getTrackingNo() {
    return trackingNo;
  }

  public Shipment warehouseId(Integer warehouseId) {
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

   /**
   * Get lobId
   * @return lobId
  **/
  @ApiModelProperty(value = "")
  public Integer getLobId() {
    return lobId;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOrderNo() {
    return orderNo;
  }

  public Shipment cartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
    return this;
  }

   /**
   * Get cartonNo
   * @return cartonNo
  **/
  @ApiModelProperty(value = "")
  public Integer getCartonNo() {
    return cartonNo;
  }

  public void setCartonNo(Integer cartonNo) {
    this.cartonNo = cartonNo;
  }

  public Shipment numberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
    return this;
  }

   /**
   * Get numberOfCartons
   * @return numberOfCartons
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfCartons() {
    return numberOfCartons;
  }

  public void setNumberOfCartons(Integer numberOfCartons) {
    this.numberOfCartons = numberOfCartons;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public Shipment shipped(Boolean shipped) {
    this.shipped = shipped;
    return this;
  }

   /**
   * Get shipped
   * @return shipped
  **/
  @ApiModelProperty(value = "")
  public Boolean isShipped() {
    return shipped;
  }

  public void setShipped(Boolean shipped) {
    this.shipped = shipped;
  }

  public Shipment carrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
    return this;
  }

   /**
   * Get carrierServiceId
   * @return carrierServiceId
  **/
  @ApiModelProperty(value = "")
  public Integer getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(Integer carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  public Shipment dim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
    return this;
  }

   /**
   * Get dim1In
   * @return dim1In
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDim1In() {
    return dim1In;
  }

  public void setDim1In(BigDecimal dim1In) {
    this.dim1In = dim1In;
  }

  public Shipment dim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
    return this;
  }

   /**
   * Get dim2In
   * @return dim2In
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDim2In() {
    return dim2In;
  }

  public void setDim2In(BigDecimal dim2In) {
    this.dim2In = dim2In;
  }

  public Shipment dim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
    return this;
  }

   /**
   * Get dim3In
   * @return dim3In
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDim3In() {
    return dim3In;
  }

  public void setDim3In(BigDecimal dim3In) {
    this.dim3In = dim3In;
  }

  public Shipment estimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
    return this;
  }

   /**
   * Get estimatedZone
   * @return estimatedZone
  **/
  @ApiModelProperty(value = "")
  public String getEstimatedZone() {
    return estimatedZone;
  }

  public void setEstimatedZone(String estimatedZone) {
    this.estimatedZone = estimatedZone;
  }

   /**
   * Get parcelAccountNo
   * @return parcelAccountNo
  **/
  @ApiModelProperty(value = "")
  public String getParcelAccountNo() {
    return parcelAccountNo;
  }

   /**
   * Get thirdPartyParcelAccountNo
   * @return thirdPartyParcelAccountNo
  **/
  @ApiModelProperty(value = "")
  public String getThirdPartyParcelAccountNo() {
    return thirdPartyParcelAccountNo;
  }

   /**
   * Get shipmentID
   * @return shipmentID
  **/
  @ApiModelProperty(value = "")
  public String getShipmentID() {
    return shipmentID;
  }

   /**
   * Get manifestId
   * @return manifestId
  **/
  @ApiModelProperty(value = "")
  public Integer getManifestId() {
    return manifestId;
  }

   /**
   * Get residential
   * @return residential
  **/
  @ApiModelProperty(value = "")
  public Boolean isResidential() {
    return residential;
  }

   /**
   * Get billingOption
   * @return billingOption
  **/
  @ApiModelProperty(value = "")
  public String getBillingOption() {
    return billingOption;
  }

   /**
   * Get weightLbs
   * @return weightLbs
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWeightLbs() {
    return weightLbs;
  }

   /**
   * Get dimWeight
   * @return dimWeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDimWeight() {
    return dimWeight;
  }

   /**
   * Get licensePlateNumber
   * @return licensePlateNumber
  **/
  @ApiModelProperty(value = "")
  public String getLicensePlateNumber() {
    return licensePlateNumber;
  }

   /**
   * Get chargedFreightAmount
   * @return chargedFreightAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getChargedFreightAmount() {
    return chargedFreightAmount;
  }

   /**
   * Get publishedFreightAmount
   * @return publishedFreightAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPublishedFreightAmount() {
    return publishedFreightAmount;
  }

   /**
   * Get retailFreightAmount
   * @return retailFreightAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRetailFreightAmount() {
    return retailFreightAmount;
  }

   /**
   * Get externalShippingSystemId
   * @return externalShippingSystemId
  **/
  @ApiModelProperty(value = "")
  public Integer getExternalShippingSystemId() {
    return externalShippingSystemId;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(value = "")
  public String getShipmentType() {
    return shipmentType;
  }

  public Shipment carrierCompany(String carrierCompany) {
    this.carrierCompany = carrierCompany;
    return this;
  }

   /**
   * Get carrierCompany
   * @return carrierCompany
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCarrierCompany() {
    return carrierCompany;
  }

  public void setCarrierCompany(String carrierCompany) {
    this.carrierCompany = carrierCompany;
  }

  public Shipment customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Shipment putCustomFieldsItem(String key, Object customFieldsItem) {
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
    Shipment shipment = (Shipment) o;
    return Objects.equals(this.id, shipment.id) &&
        Objects.equals(this.createDate, shipment.createDate) &&
        Objects.equals(this.modifyDate, shipment.modifyDate) &&
        Objects.equals(this.shipDate, shipment.shipDate) &&
        Objects.equals(this.deliveredDate, shipment.deliveredDate) &&
        Objects.equals(this.trackingNo, shipment.trackingNo) &&
        Objects.equals(this.warehouseId, shipment.warehouseId) &&
        Objects.equals(this.lobId, shipment.lobId) &&
        Objects.equals(this.orderNo, shipment.orderNo) &&
        Objects.equals(this.cartonNo, shipment.cartonNo) &&
        Objects.equals(this.numberOfCartons, shipment.numberOfCartons) &&
        Objects.equals(this.status, shipment.status) &&
        Objects.equals(this.shipped, shipment.shipped) &&
        Objects.equals(this.carrierServiceId, shipment.carrierServiceId) &&
        Objects.equals(this.dim1In, shipment.dim1In) &&
        Objects.equals(this.dim2In, shipment.dim2In) &&
        Objects.equals(this.dim3In, shipment.dim3In) &&
        Objects.equals(this.estimatedZone, shipment.estimatedZone) &&
        Objects.equals(this.parcelAccountNo, shipment.parcelAccountNo) &&
        Objects.equals(this.thirdPartyParcelAccountNo, shipment.thirdPartyParcelAccountNo) &&
        Objects.equals(this.shipmentID, shipment.shipmentID) &&
        Objects.equals(this.manifestId, shipment.manifestId) &&
        Objects.equals(this.residential, shipment.residential) &&
        Objects.equals(this.billingOption, shipment.billingOption) &&
        Objects.equals(this.weightLbs, shipment.weightLbs) &&
        Objects.equals(this.dimWeight, shipment.dimWeight) &&
        Objects.equals(this.licensePlateNumber, shipment.licensePlateNumber) &&
        Objects.equals(this.chargedFreightAmount, shipment.chargedFreightAmount) &&
        Objects.equals(this.publishedFreightAmount, shipment.publishedFreightAmount) &&
        Objects.equals(this.retailFreightAmount, shipment.retailFreightAmount) &&
        Objects.equals(this.externalShippingSystemId, shipment.externalShippingSystemId) &&
        Objects.equals(this.shipmentType, shipment.shipmentType) &&
        Objects.equals(this.carrierCompany, shipment.carrierCompany) &&
        Objects.equals(this.customFields, shipment.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, shipDate, deliveredDate, trackingNo, warehouseId, lobId, orderNo, cartonNo, numberOfCartons, status, shipped, carrierServiceId, dim1In, dim2In, dim3In, estimatedZone, parcelAccountNo, thirdPartyParcelAccountNo, shipmentID, manifestId, residential, billingOption, weightLbs, dimWeight, licensePlateNumber, chargedFreightAmount, publishedFreightAmount, retailFreightAmount, externalShippingSystemId, shipmentType, carrierCompany, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Shipment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    deliveredDate: ").append(toIndentedString(deliveredDate)).append("\n");
    sb.append("    trackingNo: ").append(toIndentedString(trackingNo)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    cartonNo: ").append(toIndentedString(cartonNo)).append("\n");
    sb.append("    numberOfCartons: ").append(toIndentedString(numberOfCartons)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    shipped: ").append(toIndentedString(shipped)).append("\n");
    sb.append("    carrierServiceId: ").append(toIndentedString(carrierServiceId)).append("\n");
    sb.append("    dim1In: ").append(toIndentedString(dim1In)).append("\n");
    sb.append("    dim2In: ").append(toIndentedString(dim2In)).append("\n");
    sb.append("    dim3In: ").append(toIndentedString(dim3In)).append("\n");
    sb.append("    estimatedZone: ").append(toIndentedString(estimatedZone)).append("\n");
    sb.append("    parcelAccountNo: ").append(toIndentedString(parcelAccountNo)).append("\n");
    sb.append("    thirdPartyParcelAccountNo: ").append(toIndentedString(thirdPartyParcelAccountNo)).append("\n");
    sb.append("    shipmentID: ").append(toIndentedString(shipmentID)).append("\n");
    sb.append("    manifestId: ").append(toIndentedString(manifestId)).append("\n");
    sb.append("    residential: ").append(toIndentedString(residential)).append("\n");
    sb.append("    billingOption: ").append(toIndentedString(billingOption)).append("\n");
    sb.append("    weightLbs: ").append(toIndentedString(weightLbs)).append("\n");
    sb.append("    dimWeight: ").append(toIndentedString(dimWeight)).append("\n");
    sb.append("    licensePlateNumber: ").append(toIndentedString(licensePlateNumber)).append("\n");
    sb.append("    chargedFreightAmount: ").append(toIndentedString(chargedFreightAmount)).append("\n");
    sb.append("    publishedFreightAmount: ").append(toIndentedString(publishedFreightAmount)).append("\n");
    sb.append("    retailFreightAmount: ").append(toIndentedString(retailFreightAmount)).append("\n");
    sb.append("    externalShippingSystemId: ").append(toIndentedString(externalShippingSystemId)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    carrierCompany: ").append(toIndentedString(carrierCompany)).append("\n");
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

