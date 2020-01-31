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
import java.util.ArrayList;
import java.util.List;

/**
 * ExecuteJobInputAPIModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-01-31T10:21:14.851-06:00")
public class ExecuteJobInputAPIModel {
  @SerializedName("idList")
  private List<Integer> idList = null;

  public ExecuteJobInputAPIModel idList(List<Integer> idList) {
    this.idList = idList;
    return this;
  }

  public ExecuteJobInputAPIModel addIdListItem(Integer idListItem) {
    if (this.idList == null) {
      this.idList = new ArrayList<Integer>();
    }
    this.idList.add(idListItem);
    return this;
  }

   /**
   * Get idList
   * @return idList
  **/
  @ApiModelProperty(value = "")
  public List<Integer> getIdList() {
    return idList;
  }

  public void setIdList(List<Integer> idList) {
    this.idList = idList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecuteJobInputAPIModel executeJobInputAPIModel = (ExecuteJobInputAPIModel) o;
    return Objects.equals(this.idList, executeJobInputAPIModel.idList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecuteJobInputAPIModel {\n");
    
    sb.append("    idList: ").append(toIndentedString(idList)).append("\n");
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

