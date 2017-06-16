## API Connect Proof-of-Concept Setup Instructions

There are 4 stakeholders in the API lifecycle:  ([See Page 22](http://www.redbooks.ibm.com/redpapers/pdfs/redp5349.pdf)):
* API Developer
* Application Developer
* API owner/Product Manager
* API IT Operations

This POC largely focuses on the API Developer and Application Developer.

#### Prereq

* [Sign up](https://console.ng.bluemix.net/registration/) for a bluemix account.


#### API Developer

Option#1: Using API Designer (On Bluemix)

* Create new API Connect service instance from the 'APIs' option. Name it as 'apiconnect-poc'
* Click on newly create API Connect Bluemix Service
* 'Add' a new catalog with name 'poc'
* Create a new API. Either a brand new API can be created from scratch, or an existing Swagger API Spec (such as Financial.yaml) can be imported. 
* Create a new Product to contain the API
* Publish the Product
* Go to 'Settings > Portal' and enable 'IBM Developer Portal' (a new portal URL will be provisioned for developers to access)

Option#2:  Using Development Toolkit (Local)

See [Toolkit Setup Documentation](https://www.ibm.com/support/knowledgecenter/en/SSFS6T/com.ibm.apic.toolkit.doc/capim_cli_working_with.html)


#### Application Developer

Note: If you want to skip the below steps, you can directly use 'financial-api-client' project in this repo.

* Create project folder for API client application 

`mkdir financial-api-client`

`cd financial-api-client`

* Generate Java project from Swagger API Spec using swagger-gen

`brew install swagger-codegen`

`swagger-codegen generate -i financial.yaml -l java`

* Import generated project into Eclipse (General -> Projects from Folder or Archive)

* Make the following updates to Unit Test - io.swagger.client.api.DefaultApiTest.java:

1. Comment @Ignore annotation

2. Populate input request: 

Class: io.swagger.client.api.DefaultApiTest.java
~~~~
TransferInput transferInput = new TransferInput();
transferInput.setTransferCount(1);
Money amount = new Money();
amount.setDollarAmount("2000");
amount.setCurrency("CAD");
transferInput.setAmount(amount);
transferInput.setFromAccountId("233388932");
transferInput.setToAccountId("928379287");
~~~~     

3. Update client configuration with URI and Client Authentication parameters:


Class: io.swagger.client.api.DefaultApi.java
~~~~
public DefaultApi() {
    this(Configuration.getDefaultApiClient());
    apiClient.setBasePath("https://api.us.apiconnect.ibmcloud.com/jeanabrahamibmcom-sandbox/sb/v1/financial");
    apiClient.addDefaultHeader("x-ibm-client-id", "f1fba292-c9d5-4dfb-94ee-bf47166d44ae");
    apiClient.addDefaultHeader("x-ibm-client-secret", "S3jG1nL7nQ8qG8eG4fG4uL8sQ5yY2iB2rF3vS3rN7aJ8fB2iT4");
}
~~~~     

* Run DefaultApiTest.java unit test