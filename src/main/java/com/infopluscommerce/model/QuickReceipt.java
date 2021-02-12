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
 * QuickReceipt
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-02-12T01:37:31.327-06:00")
public class QuickReceipt {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("warehouseId")
  private Integer warehouseId = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("locationId")
  private Integer locationId = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("vendorId")
  private Integer vendorId = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("unitCode")
  private String unitCode = null;

  @SerializedName("wrapCode")
  private String wrapCode = null;

  @SerializedName("weightPerWrap")
  private BigDecimal weightPerWrap = null;

  @SerializedName("unitsPerWrap")
  private Integer unitsPerWrap = null;

  @SerializedName("quantityPerInnerPack")
  private Integer quantityPerInnerPack = null;

  @SerializedName("unitsPerCase")
  private Integer unitsPerCase = null;

  @SerializedName("quantityPerPallet")
  private Integer quantityPerPallet = null;

  @SerializedName("caseWeight")
  private BigDecimal caseWeight = null;

  @SerializedName("productionLot")
  private String productionLot = null;

  @SerializedName("revisionDate")
  private String revisionDate = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("cartonLength")
  private BigDecimal cartonLength = null;

  @SerializedName("cartonWidth")
  private BigDecimal cartonWidth = null;

  @SerializedName("cartonHeight")
  private BigDecimal cartonHeight = null;

  @SerializedName("cost")
  private BigDecimal cost = null;

  @SerializedName("sellPrice")
  private BigDecimal sellPrice = null;

  @SerializedName("pricingPer")
  private String pricingPer = null;

  @SerializedName("generatedItemReceiptId")
  private Integer generatedItemReceiptId = null;

  @SerializedName("generatedASNId")
  private Integer generatedASNId = null;

  @SerializedName("dockDate")
  private OffsetDateTime dockDate = null;

  @SerializedName("productIdTag")
  private String productIdTag = null;

  @SerializedName("expirationDate")
  private OffsetDateTime expirationDate = null;

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
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
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

  public QuickReceipt warehouseId(Integer warehouseId) {
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

  public QuickReceipt lobId(Integer lobId) {
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

  public QuickReceipt sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Get sku
   * @return sku
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public QuickReceipt locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * Get locationId
   * @return locationId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public QuickReceipt quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public QuickReceipt vendorId(Integer vendorId) {
    this.vendorId = vendorId;
    return this;
  }

   /**
   * Get vendorId
   * @return vendorId
  **/
  @ApiModelProperty(value = "")
  public Integer getVendorId() {
    return vendorId;
  }

  public void setVendorId(Integer vendorId) {
    this.vendorId = vendorId;
  }

  public QuickReceipt carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Get carrier
   * @return carrier
  **/
  @ApiModelProperty(value = "")
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
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
   * Get unitCode
   * @return unitCode
  **/
  @ApiModelProperty(value = "")
  public String getUnitCode() {
    return unitCode;
  }

  public QuickReceipt wrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
    return this;
  }

   /**
   * Get wrapCode
   * @return wrapCode
  **/
  @ApiModelProperty(value = "")
  public String getWrapCode() {
    return wrapCode;
  }

  public void setWrapCode(String wrapCode) {
    this.wrapCode = wrapCode;
  }

  public QuickReceipt weightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
    return this;
  }

   /**
   * Get weightPerWrap
   * @return weightPerWrap
  **/
  @ApiModelProperty(required = true, value = "")
  public BigDecimal getWeightPerWrap() {
    return weightPerWrap;
  }

  public void setWeightPerWrap(BigDecimal weightPerWrap) {
    this.weightPerWrap = weightPerWrap;
  }

  public QuickReceipt unitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
    return this;
  }

   /**
   * Get unitsPerWrap
   * @return unitsPerWrap
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitsPerWrap() {
    return unitsPerWrap;
  }

  public void setUnitsPerWrap(Integer unitsPerWrap) {
    this.unitsPerWrap = unitsPerWrap;
  }

  public QuickReceipt quantityPerInnerPack(Integer quantityPerInnerPack) {
    this.quantityPerInnerPack = quantityPerInnerPack;
    return this;
  }

   /**
   * Get quantityPerInnerPack
   * @return quantityPerInnerPack
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerInnerPack() {
    return quantityPerInnerPack;
  }

  public void setQuantityPerInnerPack(Integer quantityPerInnerPack) {
    this.quantityPerInnerPack = quantityPerInnerPack;
  }

  public QuickReceipt unitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
    return this;
  }

   /**
   * Get unitsPerCase
   * @return unitsPerCase
  **/
  @ApiModelProperty(value = "")
  public Integer getUnitsPerCase() {
    return unitsPerCase;
  }

  public void setUnitsPerCase(Integer unitsPerCase) {
    this.unitsPerCase = unitsPerCase;
  }

  public QuickReceipt quantityPerPallet(Integer quantityPerPallet) {
    this.quantityPerPallet = quantityPerPallet;
    return this;
  }

   /**
   * Get quantityPerPallet
   * @return quantityPerPallet
  **/
  @ApiModelProperty(value = "")
  public Integer getQuantityPerPallet() {
    return quantityPerPallet;
  }

  public void setQuantityPerPallet(Integer quantityPerPallet) {
    this.quantityPerPallet = quantityPerPallet;
  }

  public QuickReceipt caseWeight(BigDecimal caseWeight) {
    this.caseWeight = caseWeight;
    return this;
  }

   /**
   * Get caseWeight
   * @return caseWeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCaseWeight() {
    return caseWeight;
  }

  public void setCaseWeight(BigDecimal caseWeight) {
    this.caseWeight = caseWeight;
  }

  public QuickReceipt productionLot(String productionLot) {
    this.productionLot = productionLot;
    return this;
  }

   /**
   * Get productionLot
   * @return productionLot
  **/
  @ApiModelProperty(value = "")
  public String getProductionLot() {
    return productionLot;
  }

  public void setProductionLot(String productionLot) {
    this.productionLot = productionLot;
  }

  public QuickReceipt revisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
    return this;
  }

   /**
   * Get revisionDate
   * @return revisionDate
  **/
  @ApiModelProperty(value = "")
  public String getRevisionDate() {
    return revisionDate;
  }

  public void setRevisionDate(String revisionDate) {
    this.revisionDate = revisionDate;
  }

  public QuickReceipt origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public QuickReceipt cartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
    return this;
  }

   /**
   * Get cartonLength
   * @return cartonLength
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonLength() {
    return cartonLength;
  }

  public void setCartonLength(BigDecimal cartonLength) {
    this.cartonLength = cartonLength;
  }

  public QuickReceipt cartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
    return this;
  }

   /**
   * Get cartonWidth
   * @return cartonWidth
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonWidth() {
    return cartonWidth;
  }

  public void setCartonWidth(BigDecimal cartonWidth) {
    this.cartonWidth = cartonWidth;
  }

  public QuickReceipt cartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
    return this;
  }

   /**
   * Get cartonHeight
   * @return cartonHeight
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCartonHeight() {
    return cartonHeight;
  }

  public void setCartonHeight(BigDecimal cartonHeight) {
    this.cartonHeight = cartonHeight;
  }

  public QuickReceipt cost(BigDecimal cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getCost() {
    return cost;
  }

  public void setCost(BigDecimal cost) {
    this.cost = cost;
  }

  public QuickReceipt sellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
    return this;
  }

   /**
   * Get sellPrice
   * @return sellPrice
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getSellPrice() {
    return sellPrice;
  }

  public void setSellPrice(BigDecimal sellPrice) {
    this.sellPrice = sellPrice;
  }

  public QuickReceipt pricingPer(String pricingPer) {
    this.pricingPer = pricingPer;
    return this;
  }

   /**
   * Get pricingPer
   * @return pricingPer
  **/
  @ApiModelProperty(value = "")
  public String getPricingPer() {
    return pricingPer;
  }

  public void setPricingPer(String pricingPer) {
    this.pricingPer = pricingPer;
  }

   /**
   * Get generatedItemReceiptId
   * @return generatedItemReceiptId
  **/
  @ApiModelProperty(value = "")
  public Integer getGeneratedItemReceiptId() {
    return generatedItemReceiptId;
  }

   /**
   * Get generatedASNId
   * @return generatedASNId
  **/
  @ApiModelProperty(value = "")
  public Integer getGeneratedASNId() {
    return generatedASNId;
  }

  public QuickReceipt dockDate(OffsetDateTime dockDate) {
    this.dockDate = dockDate;
    return this;
  }

   /**
   * Get dockDate
   * @return dockDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDockDate() {
    return dockDate;
  }

  public void setDockDate(OffsetDateTime dockDate) {
    this.dockDate = dockDate;
  }

  public QuickReceipt productIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
    return this;
  }

   /**
   * Get productIdTag
   * @return productIdTag
  **/
  @ApiModelProperty(value = "")
  public String getProductIdTag() {
    return productIdTag;
  }

  public void setProductIdTag(String productIdTag) {
    this.productIdTag = productIdTag;
  }

  public QuickReceipt expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public QuickReceipt customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public QuickReceipt putCustomFieldsItem(String key, Object customFieldsItem) {
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
    QuickReceipt quickReceipt = (QuickReceipt) o;
    return Objects.equals(this.id, quickReceipt.id) &&
        Objects.equals(this.createdBy, quickReceipt.createdBy) &&
        Objects.equals(this.createDate, quickReceipt.createDate) &&
        Objects.equals(this.modifyDate, quickReceipt.modifyDate) &&
        Objects.equals(this.warehouseId, quickReceipt.warehouseId) &&
        Objects.equals(this.lobId, quickReceipt.lobId) &&
        Objects.equals(this.sku, quickReceipt.sku) &&
        Objects.equals(this.locationId, quickReceipt.locationId) &&
        Objects.equals(this.quantity, quickReceipt.quantity) &&
        Objects.equals(this.vendorId, quickReceipt.vendorId) &&
        Objects.equals(this.carrier, quickReceipt.carrier) &&
        Objects.equals(this.status, quickReceipt.status) &&
        Objects.equals(this.unitCode, quickReceipt.unitCode) &&
        Objects.equals(this.wrapCode, quickReceipt.wrapCode) &&
        Objects.equals(this.weightPerWrap, quickReceipt.weightPerWrap) &&
        Objects.equals(this.unitsPerWrap, quickReceipt.unitsPerWrap) &&
        Objects.equals(this.quantityPerInnerPack, quickReceipt.quantityPerInnerPack) &&
        Objects.equals(this.unitsPerCase, quickReceipt.unitsPerCase) &&
        Objects.equals(this.quantityPerPallet, quickReceipt.quantityPerPallet) &&
        Objects.equals(this.caseWeight, quickReceipt.caseWeight) &&
        Objects.equals(this.productionLot, quickReceipt.productionLot) &&
        Objects.equals(this.revisionDate, quickReceipt.revisionDate) &&
        Objects.equals(this.origin, quickReceipt.origin) &&
        Objects.equals(this.cartonLength, quickReceipt.cartonLength) &&
        Objects.equals(this.cartonWidth, quickReceipt.cartonWidth) &&
        Objects.equals(this.cartonHeight, quickReceipt.cartonHeight) &&
        Objects.equals(this.cost, quickReceipt.cost) &&
        Objects.equals(this.sellPrice, quickReceipt.sellPrice) &&
        Objects.equals(this.pricingPer, quickReceipt.pricingPer) &&
        Objects.equals(this.generatedItemReceiptId, quickReceipt.generatedItemReceiptId) &&
        Objects.equals(this.generatedASNId, quickReceipt.generatedASNId) &&
        Objects.equals(this.dockDate, quickReceipt.dockDate) &&
        Objects.equals(this.productIdTag, quickReceipt.productIdTag) &&
        Objects.equals(this.expirationDate, quickReceipt.expirationDate) &&
        Objects.equals(this.customFields, quickReceipt.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdBy, createDate, modifyDate, warehouseId, lobId, sku, locationId, quantity, vendorId, carrier, status, unitCode, wrapCode, weightPerWrap, unitsPerWrap, quantityPerInnerPack, unitsPerCase, quantityPerPallet, caseWeight, productionLot, revisionDate, origin, cartonLength, cartonWidth, cartonHeight, cost, sellPrice, pricingPer, generatedItemReceiptId, generatedASNId, dockDate, productIdTag, expirationDate, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuickReceipt {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    warehouseId: ").append(toIndentedString(warehouseId)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    unitCode: ").append(toIndentedString(unitCode)).append("\n");
    sb.append("    wrapCode: ").append(toIndentedString(wrapCode)).append("\n");
    sb.append("    weightPerWrap: ").append(toIndentedString(weightPerWrap)).append("\n");
    sb.append("    unitsPerWrap: ").append(toIndentedString(unitsPerWrap)).append("\n");
    sb.append("    quantityPerInnerPack: ").append(toIndentedString(quantityPerInnerPack)).append("\n");
    sb.append("    unitsPerCase: ").append(toIndentedString(unitsPerCase)).append("\n");
    sb.append("    quantityPerPallet: ").append(toIndentedString(quantityPerPallet)).append("\n");
    sb.append("    caseWeight: ").append(toIndentedString(caseWeight)).append("\n");
    sb.append("    productionLot: ").append(toIndentedString(productionLot)).append("\n");
    sb.append("    revisionDate: ").append(toIndentedString(revisionDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    cartonLength: ").append(toIndentedString(cartonLength)).append("\n");
    sb.append("    cartonWidth: ").append(toIndentedString(cartonWidth)).append("\n");
    sb.append("    cartonHeight: ").append(toIndentedString(cartonHeight)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    sellPrice: ").append(toIndentedString(sellPrice)).append("\n");
    sb.append("    pricingPer: ").append(toIndentedString(pricingPer)).append("\n");
    sb.append("    generatedItemReceiptId: ").append(toIndentedString(generatedItemReceiptId)).append("\n");
    sb.append("    generatedASNId: ").append(toIndentedString(generatedASNId)).append("\n");
    sb.append("    dockDate: ").append(toIndentedString(dockDate)).append("\n");
    sb.append("    productIdTag: ").append(toIndentedString(productIdTag)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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

