/*
 * Financial
 * At a high-level: - To execute a transfer immediately, use frequency IMMEDIATE and set the transferDate to the current date (today) - To schedule a transfer to execute once at a specific date, use frequency ONCE and set the transferDate to the desired date. Transfer date must be greater than current date and must not exceed a configurable date such as 1 year from the current date. - To schedule a recurring transfer, use frequency other than IMMEDIATE or ONCE and specify one of openEnded flag, transferCount or endDate.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Money;

/**
 * Transfer Information
 */
@ApiModel(description = "Transfer Information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-15T15:11:11.329-04:00")
public class TransferInput {
  @SerializedName("transferCount")
  private Integer transferCount = null;

  @SerializedName("transferDate")
  private Object transferDate = null;

  @SerializedName("frequency")
  private Object frequency = null;

  @SerializedName("fromAccountId")
  private Object fromAccountId = null;

  @SerializedName("toAccountId")
  private Object toAccountId = null;

  @SerializedName("amount")
  private Money amount = null;

  @SerializedName("openEnded")
  private Object openEnded = null;

  @SerializedName("endDate")
  private Object endDate = null;

  public TransferInput transferCount(Integer transferCount) {
    this.transferCount = transferCount;
    return this;
  }

   /**
   * Get transferCount
   * @return transferCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTransferCount() {
    return transferCount;
  }

  public void setTransferCount(Integer transferCount) {
    this.transferCount = transferCount;
  }

  public TransferInput transferDate(Object transferDate) {
    this.transferDate = transferDate;
    return this;
  }

   /**
   * Transfer date - format (yyyy-mm-dd). Required for scheduling future dated transfer
   * @return transferDate
  **/
  @ApiModelProperty(example = "null", value = "Transfer date - format (yyyy-mm-dd). Required for scheduling future dated transfer")
  public Object getTransferDate() {
    return transferDate;
  }

  public void setTransferDate(Object transferDate) {
    this.transferDate = transferDate;
  }

  public TransferInput frequency(Object frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * ['IMMEDIATE' or 'ONCE' or 'WEEKLY' or 'BIWEEKLY' or 'TWICEMONTHLY' or 'FOURWEEKS' or 'MONTHLY' or 'BIMONTHLY' or 'QUARTERLY' or 'SEMIANNUALLY' or 'ANNUALLY']: Frequency of the transfer. If frequency is other than 'Immediate' and 'Once', one of open ended flag, transfer count or end date must be provided
   * @return frequency
  **/
  @ApiModelProperty(example = "null", value = "['IMMEDIATE' or 'ONCE' or 'WEEKLY' or 'BIWEEKLY' or 'TWICEMONTHLY' or 'FOURWEEKS' or 'MONTHLY' or 'BIMONTHLY' or 'QUARTERLY' or 'SEMIANNUALLY' or 'ANNUALLY']: Frequency of the transfer. If frequency is other than 'Immediate' and 'Once', one of open ended flag, transfer count or end date must be provided")
  public Object getFrequency() {
    return frequency;
  }

  public void setFrequency(Object frequency) {
    this.frequency = frequency;
  }

  public TransferInput fromAccountId(Object fromAccountId) {
    this.fromAccountId = fromAccountId;
    return this;
  }

   /**
   * Unique account identifier of from account
   * @return fromAccountId
  **/
  @ApiModelProperty(example = "null", value = "Unique account identifier of from account")
  public Object getFromAccountId() {
    return fromAccountId;
  }

  public void setFromAccountId(Object fromAccountId) {
    this.fromAccountId = fromAccountId;
  }

  public TransferInput toAccountId(Object toAccountId) {
    this.toAccountId = toAccountId;
    return this;
  }

   /**
   * Unique account identifer of to account
   * @return toAccountId
  **/
  @ApiModelProperty(example = "null", value = "Unique account identifer of to account")
  public Object getToAccountId() {
    return toAccountId;
  }

  public void setToAccountId(Object toAccountId) {
    this.toAccountId = toAccountId;
  }

  public TransferInput amount(Money amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of transfer
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Amount of transfer")
  public Money getAmount() {
    return amount;
  }

  public void setAmount(Money amount) {
    this.amount = amount;
  }

  public TransferInput openEnded(Object openEnded) {
    this.openEnded = openEnded;
    return this;
  }

   /**
   * Flag indicates if the transfer is open ended. If the transfer is not open ended , then either transfer end date or transfer count should be provided
   * @return openEnded
  **/
  @ApiModelProperty(example = "null", value = "Flag indicates if the transfer is open ended. If the transfer is not open ended , then either transfer end date or transfer count should be provided")
  public Object getOpenEnded() {
    return openEnded;
  }

  public void setOpenEnded(Object openEnded) {
    this.openEnded = openEnded;
  }

  public TransferInput endDate(Object endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Transfer end date - format (yyyy-mm-dd). It is not required if the transfer is open ended or transfer count is provided
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "Transfer end date - format (yyyy-mm-dd). It is not required if the transfer is open ended or transfer count is provided")
  public Object getEndDate() {
    return endDate;
  }

  public void setEndDate(Object endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferInput transferInput = (TransferInput) o;
    return Objects.equals(this.transferCount, transferInput.transferCount) &&
        Objects.equals(this.transferDate, transferInput.transferDate) &&
        Objects.equals(this.frequency, transferInput.frequency) &&
        Objects.equals(this.fromAccountId, transferInput.fromAccountId) &&
        Objects.equals(this.toAccountId, transferInput.toAccountId) &&
        Objects.equals(this.amount, transferInput.amount) &&
        Objects.equals(this.openEnded, transferInput.openEnded) &&
        Objects.equals(this.endDate, transferInput.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferCount, transferDate, frequency, fromAccountId, toAccountId, amount, openEnded, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferInput {\n");
    
    sb.append("    transferCount: ").append(toIndentedString(transferCount)).append("\n");
    sb.append("    transferDate: ").append(toIndentedString(transferDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    fromAccountId: ").append(toIndentedString(fromAccountId)).append("\n");
    sb.append("    toAccountId: ").append(toIndentedString(toAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    openEnded: ").append(toIndentedString(openEnded)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

