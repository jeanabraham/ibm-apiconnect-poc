# DefaultApi

All URIs are relative to *https://localhost/v1/financial*

Method | HTTP request | Description
------------- | ------------- | -------------
[**transfersPost**](DefaultApi.md#transfersPost) | **POST** /transfers | Immediate Transfer


<a name="transfersPost"></a>
# **transfersPost**
> TransferConfirmation transfersPost(transferInput)

Immediate Transfer

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: clientIdHeader
ApiKeyAuth clientIdHeader = (ApiKeyAuth) defaultClient.getAuthentication("clientIdHeader");
clientIdHeader.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//clientIdHeader.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
TransferInput transferInput = new TransferInput(); // TransferInput | 
try {
    TransferConfirmation result = apiInstance.transfersPost(transferInput);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#transfersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transferInput** | [**TransferInput**](TransferInput.md)|  |

### Return type

[**TransferConfirmation**](TransferConfirmation.md)

### Authorization

[clientIdHeader](../README.md#clientIdHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

