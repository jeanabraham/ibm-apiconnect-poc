
# TransferInput

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transferCount** | **Integer** |  |  [optional]
**transferDate** | **Object** | Transfer date - format (yyyy-mm-dd). Required for scheduling future dated transfer |  [optional]
**frequency** | **Object** | [&#39;IMMEDIATE&#39; or &#39;ONCE&#39; or &#39;WEEKLY&#39; or &#39;BIWEEKLY&#39; or &#39;TWICEMONTHLY&#39; or &#39;FOURWEEKS&#39; or &#39;MONTHLY&#39; or &#39;BIMONTHLY&#39; or &#39;QUARTERLY&#39; or &#39;SEMIANNUALLY&#39; or &#39;ANNUALLY&#39;]: Frequency of the transfer. If frequency is other than &#39;Immediate&#39; and &#39;Once&#39;, one of open ended flag, transfer count or end date must be provided |  [optional]
**fromAccountId** | **Object** | Unique account identifier of from account |  [optional]
**toAccountId** | **Object** | Unique account identifer of to account |  [optional]
**amount** | [**Money**](Money.md) | Amount of transfer |  [optional]
**openEnded** | **Object** | Flag indicates if the transfer is open ended. If the transfer is not open ended , then either transfer end date or transfer count should be provided |  [optional]
**endDate** | **Object** | Transfer end date - format (yyyy-mm-dd). It is not required if the transfer is open ended or transfer count is provided |  [optional]



