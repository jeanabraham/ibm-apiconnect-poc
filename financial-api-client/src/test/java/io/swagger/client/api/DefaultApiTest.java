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


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.Money;
import io.swagger.client.model.TransferConfirmation;
import io.swagger.client.model.TransferInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
//@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * Immediate Transfer
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void transfersPostTest() throws ApiException {
        TransferInput transferInput = new TransferInput();
        transferInput.setTransferCount(98);
        Money amount = new Money();
        amount.setDollarAmount("2000");
        amount.setCurrency("CAD");
        transferInput.setAmount(amount);
        transferInput.setFromAccountId("233388932");
        transferInput.setToAccountId("928379287");
        
        
        TransferConfirmation response = api.transfersPost(transferInput);
        System.out.print("Transfer complete. Confirmation Code: " + response.getConfirmationCode());
        // TODO: test validations
    }
    
}
