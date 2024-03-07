package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestCases {

    public TestCases() {
    }

    @Test
    public void testUSB(){
        CustomerData_USB externalDisks = new ExternalDisks();

        assertEquals("Getting Tom data from Hard Disks using USB Connection.", externalDisks.getCustomer_USB(2));
        externalDisks.updateCustomer_USB(2, "Jim");
        assertEquals("Getting Jim data from Hard Disks using USB Connection.", externalDisks.getCustomer_USB(2));

    }

    @Test
    public void testHTTPS(){
        CustomerData_HTTPS restAPI = new REST_API();

        assertEquals("Getting Mrunal data from Server using REST API through HTTPS.", restAPI.getCustomer_HTTPS(4));
        restAPI.updateCustomer_HTTPS(4, "Sita");
        assertEquals("Getting Sita data from Server using REST API through HTTPS.", restAPI.getCustomer_HTTPS(4));

    }

    @Test
    public void testAdapter(){
        CustomerData_USB externalDisks = new ExternalDisks();
        CustomerData_HTTPS adapter = new USBToHTTPSAdapter(externalDisks);

        assertEquals("Sorry, customerId: 6 is not found.", adapter.getCustomer_HTTPS(6));
        adapter.updateCustomer_HTTPS(6, "Sita");
        assertEquals("Getting Sita data from Hard Disks using USB Connection.", adapter.getCustomer_HTTPS(6));

    }

}
