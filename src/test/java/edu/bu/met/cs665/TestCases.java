/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: TestCases.java
 * Description: TestCases class contains unit tests for the program.
 */
package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestCases {

    public TestCases() {
    }
    // Test case for USB connection
    @Test
    public void testUSB(){
        CustomerData_USB externalDisks = new ExternalDisks();

        assertEquals("Getting Tom data from Hard Disks using USB Connection.", externalDisks.getCustomer_USB(2));
        externalDisks.updateCustomer_USB(2, "Jim");
        assertEquals("Getting Jim data from Hard Disks using USB Connection.", externalDisks.getCustomer_USB(2));

    }
    // Test case for HTTPS connection
    @Test
    public void testHTTPS(){
        CustomerData_HTTPS restAPI = new REST_API();

        assertEquals("Getting Mrunal data from Server using REST API through HTTPS.", restAPI.getCustomer_HTTPS(4));
        restAPI.updateCustomer_HTTPS(4, "Sita");
        assertEquals("Getting Sita data from Server using REST API through HTTPS.", restAPI.getCustomer_HTTPS(4));

    }
    // Test case for adapter
    @Test
    public void testAdapter(){
        CustomerData_HTTPS restAPI = new REST_API();
        CustomerData_USB adapter = new USBToHTTPSAdapter(restAPI);

        assertEquals("Sorry, customerId: 6 is not found.", adapter.getCustomer_USB(6));
        adapter.updateCustomer_USB(6, "Sita");
        assertEquals("Getting Sita data from Server using REST API through HTTPS.", adapter.getCustomer_USB(6));

    }

}
