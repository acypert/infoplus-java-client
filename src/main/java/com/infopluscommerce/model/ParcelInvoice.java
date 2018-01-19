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
 * ParcelInvoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-19T10:00:59.624-06:00")
public class ParcelInvoice {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("invoiceNo")
  private String invoiceNo = null;

  @SerializedName("accountNo")
  private String accountNo = null;

  @SerializedName("invoiceDate")
  private OffsetDateTime invoiceDate = null;

  @SerializedName("invoiceAmount")
  private BigDecimal invoiceAmount = null;

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

  public ParcelInvoice createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ParcelInvoice modifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
    return this;
  }

   /**
   * Get modifyDate
   * @return modifyDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModifyDate() {
    return modifyDate;
  }

  public void setModifyDate(OffsetDateTime modifyDate) {
    this.modifyDate = modifyDate;
  }

  public ParcelInvoice carrier(String carrier) {
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

  public ParcelInvoice invoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * Get invoiceNo
   * @return invoiceNo
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNo() {
    return invoiceNo;
  }

  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }

  public ParcelInvoice accountNo(String accountNo) {
    this.accountNo = accountNo;
    return this;
  }

   /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(value = "")
  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public ParcelInvoice invoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * Get invoiceDate
   * @return invoiceDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getInvoiceDate() {
    return invoiceDate;
  }

  public void setInvoiceDate(OffsetDateTime invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public ParcelInvoice invoiceAmount(BigDecimal invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * Get invoiceAmount
   * @return invoiceAmount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(BigDecimal invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public ParcelInvoice customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ParcelInvoice putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ParcelInvoice parcelInvoice = (ParcelInvoice) o;
    return Objects.equals(this.id, parcelInvoice.id) &&
        Objects.equals(this.createDate, parcelInvoice.createDate) &&
        Objects.equals(this.modifyDate, parcelInvoice.modifyDate) &&
        Objects.equals(this.carrier, parcelInvoice.carrier) &&
        Objects.equals(this.invoiceNo, parcelInvoice.invoiceNo) &&
        Objects.equals(this.accountNo, parcelInvoice.accountNo) &&
        Objects.equals(this.invoiceDate, parcelInvoice.invoiceDate) &&
        Objects.equals(this.invoiceAmount, parcelInvoice.invoiceAmount) &&
        Objects.equals(this.customFields, parcelInvoice.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, carrier, invoiceNo, accountNo, invoiceDate, invoiceAmount, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelInvoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
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

