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
import com.infopluscommerce.model.Warehouse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;

/**
 * ShoppingCartConnection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-13T11:01:29.332-05:00")
public class ShoppingCartConnection {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("createDate")
  private OffsetDateTime createDate = null;

  @SerializedName("modifyDate")
  private OffsetDateTime modifyDate = null;

  @SerializedName("clientId")
  private Integer clientId = null;

  @SerializedName("nonce")
  private String nonce = null;

  @SerializedName("lobId")
  private Integer lobId = null;

  @SerializedName("orderSourceId")
  private Integer orderSourceId = null;

  @SerializedName("integrationPartnerId")
  private Integer integrationPartnerId = null;

  @SerializedName("connectionType")
  private String connectionType = null;

  @SerializedName("itemFilterId")
  private Integer itemFilterId = null;

  @SerializedName("infoplusSKUFieldToMap")
  private String infoplusSKUFieldToMap = null;

  @SerializedName("shoppingCartSKUFieldToMap")
  private String shoppingCartSKUFieldToMap = null;

  @SerializedName("scriptId")
  private Integer scriptId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("shoppingCartStoreURL")
  private String shoppingCartStoreURL = null;

  @SerializedName("accessCode")
  private String accessCode = null;

  @SerializedName("accessToken")
  private String accessToken = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("defaultCarrierId")
  private Integer defaultCarrierId = null;

  @SerializedName("orderShipmentLevel")
  private String orderShipmentLevel = null;

  @SerializedName("createInvoices")
  private Boolean createInvoices = false;

  @SerializedName("syncOrders")
  private Boolean syncOrders = false;

  @SerializedName("syncInventory")
  private Boolean syncInventory = false;

  @SerializedName("syncTrackingData")
  private Boolean syncTrackingData = false;

  @SerializedName("fulfillAllItems")
  private Boolean fulfillAllItems = false;

  @SerializedName("syncInventoryLevelsLastRunTime")
  private OffsetDateTime syncInventoryLevelsLastRunTime = null;

  @SerializedName("syncOrdersLastRunTime")
  private OffsetDateTime syncOrdersLastRunTime = null;

  @SerializedName("inventoryLevelWarehouseControls")
  private String inventoryLevelWarehouseControls = null;

  @SerializedName("warehouseList")
  private List<Warehouse> warehouseList = null;

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
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(value = "")
  public Integer getClientId() {
    return clientId;
  }

   /**
   * Get nonce
   * @return nonce
  **/
  @ApiModelProperty(value = "")
  public String getNonce() {
    return nonce;
  }

  public ShoppingCartConnection lobId(Integer lobId) {
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

  public ShoppingCartConnection orderSourceId(Integer orderSourceId) {
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

  public ShoppingCartConnection integrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
    return this;
  }

   /**
   * Get integrationPartnerId
   * @return integrationPartnerId
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getIntegrationPartnerId() {
    return integrationPartnerId;
  }

  public void setIntegrationPartnerId(Integer integrationPartnerId) {
    this.integrationPartnerId = integrationPartnerId;
  }

  public ShoppingCartConnection connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Get connectionType
   * @return connectionType
  **/
  @ApiModelProperty(required = true, value = "")
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
  }

  public ShoppingCartConnection itemFilterId(Integer itemFilterId) {
    this.itemFilterId = itemFilterId;
    return this;
  }

   /**
   * Get itemFilterId
   * @return itemFilterId
  **/
  @ApiModelProperty(value = "")
  public Integer getItemFilterId() {
    return itemFilterId;
  }

  public void setItemFilterId(Integer itemFilterId) {
    this.itemFilterId = itemFilterId;
  }

  public ShoppingCartConnection infoplusSKUFieldToMap(String infoplusSKUFieldToMap) {
    this.infoplusSKUFieldToMap = infoplusSKUFieldToMap;
    return this;
  }

   /**
   * Get infoplusSKUFieldToMap
   * @return infoplusSKUFieldToMap
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInfoplusSKUFieldToMap() {
    return infoplusSKUFieldToMap;
  }

  public void setInfoplusSKUFieldToMap(String infoplusSKUFieldToMap) {
    this.infoplusSKUFieldToMap = infoplusSKUFieldToMap;
  }

  public ShoppingCartConnection shoppingCartSKUFieldToMap(String shoppingCartSKUFieldToMap) {
    this.shoppingCartSKUFieldToMap = shoppingCartSKUFieldToMap;
    return this;
  }

   /**
   * Get shoppingCartSKUFieldToMap
   * @return shoppingCartSKUFieldToMap
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShoppingCartSKUFieldToMap() {
    return shoppingCartSKUFieldToMap;
  }

  public void setShoppingCartSKUFieldToMap(String shoppingCartSKUFieldToMap) {
    this.shoppingCartSKUFieldToMap = shoppingCartSKUFieldToMap;
  }

  public ShoppingCartConnection scriptId(Integer scriptId) {
    this.scriptId = scriptId;
    return this;
  }

   /**
   * Get scriptId
   * @return scriptId
  **/
  @ApiModelProperty(value = "")
  public Integer getScriptId() {
    return scriptId;
  }

  public void setScriptId(Integer scriptId) {
    this.scriptId = scriptId;
  }

  public ShoppingCartConnection name(String name) {
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

  public ShoppingCartConnection shoppingCartStoreURL(String shoppingCartStoreURL) {
    this.shoppingCartStoreURL = shoppingCartStoreURL;
    return this;
  }

   /**
   * Get shoppingCartStoreURL
   * @return shoppingCartStoreURL
  **/
  @ApiModelProperty(required = true, value = "")
  public String getShoppingCartStoreURL() {
    return shoppingCartStoreURL;
  }

  public void setShoppingCartStoreURL(String shoppingCartStoreURL) {
    this.shoppingCartStoreURL = shoppingCartStoreURL;
  }

  public ShoppingCartConnection accessCode(String accessCode) {
    this.accessCode = accessCode;
    return this;
  }

   /**
   * Get accessCode
   * @return accessCode
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessCode() {
    return accessCode;
  }

  public void setAccessCode(String accessCode) {
    this.accessCode = accessCode;
  }

  public ShoppingCartConnection accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public ShoppingCartConnection username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public ShoppingCartConnection password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ShoppingCartConnection defaultCarrierId(Integer defaultCarrierId) {
    this.defaultCarrierId = defaultCarrierId;
    return this;
  }

   /**
   * Get defaultCarrierId
   * @return defaultCarrierId
  **/
  @ApiModelProperty(value = "")
  public Integer getDefaultCarrierId() {
    return defaultCarrierId;
  }

  public void setDefaultCarrierId(Integer defaultCarrierId) {
    this.defaultCarrierId = defaultCarrierId;
  }

  public ShoppingCartConnection orderShipmentLevel(String orderShipmentLevel) {
    this.orderShipmentLevel = orderShipmentLevel;
    return this;
  }

   /**
   * Get orderShipmentLevel
   * @return orderShipmentLevel
  **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderShipmentLevel() {
    return orderShipmentLevel;
  }

  public void setOrderShipmentLevel(String orderShipmentLevel) {
    this.orderShipmentLevel = orderShipmentLevel;
  }

  public ShoppingCartConnection createInvoices(Boolean createInvoices) {
    this.createInvoices = createInvoices;
    return this;
  }

   /**
   * Get createInvoices
   * @return createInvoices
  **/
  @ApiModelProperty(value = "")
  public Boolean isCreateInvoices() {
    return createInvoices;
  }

  public void setCreateInvoices(Boolean createInvoices) {
    this.createInvoices = createInvoices;
  }

  public ShoppingCartConnection syncOrders(Boolean syncOrders) {
    this.syncOrders = syncOrders;
    return this;
  }

   /**
   * Get syncOrders
   * @return syncOrders
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSyncOrders() {
    return syncOrders;
  }

  public void setSyncOrders(Boolean syncOrders) {
    this.syncOrders = syncOrders;
  }

  public ShoppingCartConnection syncInventory(Boolean syncInventory) {
    this.syncInventory = syncInventory;
    return this;
  }

   /**
   * Get syncInventory
   * @return syncInventory
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSyncInventory() {
    return syncInventory;
  }

  public void setSyncInventory(Boolean syncInventory) {
    this.syncInventory = syncInventory;
  }

  public ShoppingCartConnection syncTrackingData(Boolean syncTrackingData) {
    this.syncTrackingData = syncTrackingData;
    return this;
  }

   /**
   * Get syncTrackingData
   * @return syncTrackingData
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isSyncTrackingData() {
    return syncTrackingData;
  }

  public void setSyncTrackingData(Boolean syncTrackingData) {
    this.syncTrackingData = syncTrackingData;
  }

  public ShoppingCartConnection fulfillAllItems(Boolean fulfillAllItems) {
    this.fulfillAllItems = fulfillAllItems;
    return this;
  }

   /**
   * Get fulfillAllItems
   * @return fulfillAllItems
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isFulfillAllItems() {
    return fulfillAllItems;
  }

  public void setFulfillAllItems(Boolean fulfillAllItems) {
    this.fulfillAllItems = fulfillAllItems;
  }

   /**
   * Get syncInventoryLevelsLastRunTime
   * @return syncInventoryLevelsLastRunTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSyncInventoryLevelsLastRunTime() {
    return syncInventoryLevelsLastRunTime;
  }

   /**
   * Get syncOrdersLastRunTime
   * @return syncOrdersLastRunTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSyncOrdersLastRunTime() {
    return syncOrdersLastRunTime;
  }

  public ShoppingCartConnection inventoryLevelWarehouseControls(String inventoryLevelWarehouseControls) {
    this.inventoryLevelWarehouseControls = inventoryLevelWarehouseControls;
    return this;
  }

   /**
   * Get inventoryLevelWarehouseControls
   * @return inventoryLevelWarehouseControls
  **/
  @ApiModelProperty(required = true, value = "")
  public String getInventoryLevelWarehouseControls() {
    return inventoryLevelWarehouseControls;
  }

  public void setInventoryLevelWarehouseControls(String inventoryLevelWarehouseControls) {
    this.inventoryLevelWarehouseControls = inventoryLevelWarehouseControls;
  }

  public ShoppingCartConnection warehouseList(List<Warehouse> warehouseList) {
    this.warehouseList = warehouseList;
    return this;
  }

  public ShoppingCartConnection addWarehouseListItem(Warehouse warehouseListItem) {
    if (this.warehouseList == null) {
      this.warehouseList = new ArrayList<Warehouse>();
    }
    this.warehouseList.add(warehouseListItem);
    return this;
  }

   /**
   * Get warehouseList
   * @return warehouseList
  **/
  @ApiModelProperty(value = "")
  public List<Warehouse> getWarehouseList() {
    return warehouseList;
  }

  public void setWarehouseList(List<Warehouse> warehouseList) {
    this.warehouseList = warehouseList;
  }

  public ShoppingCartConnection customFields(Map<String, Object> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ShoppingCartConnection putCustomFieldsItem(String key, Object customFieldsItem) {
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
    ShoppingCartConnection shoppingCartConnection = (ShoppingCartConnection) o;
    return Objects.equals(this.id, shoppingCartConnection.id) &&
        Objects.equals(this.createDate, shoppingCartConnection.createDate) &&
        Objects.equals(this.modifyDate, shoppingCartConnection.modifyDate) &&
        Objects.equals(this.clientId, shoppingCartConnection.clientId) &&
        Objects.equals(this.nonce, shoppingCartConnection.nonce) &&
        Objects.equals(this.lobId, shoppingCartConnection.lobId) &&
        Objects.equals(this.orderSourceId, shoppingCartConnection.orderSourceId) &&
        Objects.equals(this.integrationPartnerId, shoppingCartConnection.integrationPartnerId) &&
        Objects.equals(this.connectionType, shoppingCartConnection.connectionType) &&
        Objects.equals(this.itemFilterId, shoppingCartConnection.itemFilterId) &&
        Objects.equals(this.infoplusSKUFieldToMap, shoppingCartConnection.infoplusSKUFieldToMap) &&
        Objects.equals(this.shoppingCartSKUFieldToMap, shoppingCartConnection.shoppingCartSKUFieldToMap) &&
        Objects.equals(this.scriptId, shoppingCartConnection.scriptId) &&
        Objects.equals(this.name, shoppingCartConnection.name) &&
        Objects.equals(this.shoppingCartStoreURL, shoppingCartConnection.shoppingCartStoreURL) &&
        Objects.equals(this.accessCode, shoppingCartConnection.accessCode) &&
        Objects.equals(this.accessToken, shoppingCartConnection.accessToken) &&
        Objects.equals(this.username, shoppingCartConnection.username) &&
        Objects.equals(this.password, shoppingCartConnection.password) &&
        Objects.equals(this.defaultCarrierId, shoppingCartConnection.defaultCarrierId) &&
        Objects.equals(this.orderShipmentLevel, shoppingCartConnection.orderShipmentLevel) &&
        Objects.equals(this.createInvoices, shoppingCartConnection.createInvoices) &&
        Objects.equals(this.syncOrders, shoppingCartConnection.syncOrders) &&
        Objects.equals(this.syncInventory, shoppingCartConnection.syncInventory) &&
        Objects.equals(this.syncTrackingData, shoppingCartConnection.syncTrackingData) &&
        Objects.equals(this.fulfillAllItems, shoppingCartConnection.fulfillAllItems) &&
        Objects.equals(this.syncInventoryLevelsLastRunTime, shoppingCartConnection.syncInventoryLevelsLastRunTime) &&
        Objects.equals(this.syncOrdersLastRunTime, shoppingCartConnection.syncOrdersLastRunTime) &&
        Objects.equals(this.inventoryLevelWarehouseControls, shoppingCartConnection.inventoryLevelWarehouseControls) &&
        Objects.equals(this.warehouseList, shoppingCartConnection.warehouseList) &&
        Objects.equals(this.customFields, shoppingCartConnection.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createDate, modifyDate, clientId, nonce, lobId, orderSourceId, integrationPartnerId, connectionType, itemFilterId, infoplusSKUFieldToMap, shoppingCartSKUFieldToMap, scriptId, name, shoppingCartStoreURL, accessCode, accessToken, username, password, defaultCarrierId, orderShipmentLevel, createInvoices, syncOrders, syncInventory, syncTrackingData, fulfillAllItems, syncInventoryLevelsLastRunTime, syncOrdersLastRunTime, inventoryLevelWarehouseControls, warehouseList, customFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    modifyDate: ").append(toIndentedString(modifyDate)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    lobId: ").append(toIndentedString(lobId)).append("\n");
    sb.append("    orderSourceId: ").append(toIndentedString(orderSourceId)).append("\n");
    sb.append("    integrationPartnerId: ").append(toIndentedString(integrationPartnerId)).append("\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    itemFilterId: ").append(toIndentedString(itemFilterId)).append("\n");
    sb.append("    infoplusSKUFieldToMap: ").append(toIndentedString(infoplusSKUFieldToMap)).append("\n");
    sb.append("    shoppingCartSKUFieldToMap: ").append(toIndentedString(shoppingCartSKUFieldToMap)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shoppingCartStoreURL: ").append(toIndentedString(shoppingCartStoreURL)).append("\n");
    sb.append("    accessCode: ").append(toIndentedString(accessCode)).append("\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    defaultCarrierId: ").append(toIndentedString(defaultCarrierId)).append("\n");
    sb.append("    orderShipmentLevel: ").append(toIndentedString(orderShipmentLevel)).append("\n");
    sb.append("    createInvoices: ").append(toIndentedString(createInvoices)).append("\n");
    sb.append("    syncOrders: ").append(toIndentedString(syncOrders)).append("\n");
    sb.append("    syncInventory: ").append(toIndentedString(syncInventory)).append("\n");
    sb.append("    syncTrackingData: ").append(toIndentedString(syncTrackingData)).append("\n");
    sb.append("    fulfillAllItems: ").append(toIndentedString(fulfillAllItems)).append("\n");
    sb.append("    syncInventoryLevelsLastRunTime: ").append(toIndentedString(syncInventoryLevelsLastRunTime)).append("\n");
    sb.append("    syncOrdersLastRunTime: ").append(toIndentedString(syncOrdersLastRunTime)).append("\n");
    sb.append("    inventoryLevelWarehouseControls: ").append(toIndentedString(inventoryLevelWarehouseControls)).append("\n");
    sb.append("    warehouseList: ").append(toIndentedString(warehouseList)).append("\n");
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

