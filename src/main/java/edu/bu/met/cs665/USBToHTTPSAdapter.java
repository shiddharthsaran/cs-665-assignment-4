/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: USBToHTTPSAdapter.java
 * Description: USBToHTTPSAdapter class adapts CustomerData_HTTPS interface to CustomerData_USB interface
 *              to handle customer data retrieval and updates over USB connection using HTTPS.
 */

package edu.bu.met.cs665;

public class USBToHTTPSAdapter implements CustomerData_USB{
    // Instance of CustomerData_HTTPS to be adapted
    public CustomerData_HTTPS restAPI;
    // Constructor to initialize the adapter with a CustomerData_HTTPS instance
    public USBToHTTPSAdapter(CustomerData_HTTPS restAPI){
        this.restAPI = restAPI;
    }
    /**
     * Method to print customer information.
     * @param customerId The ID of the customer whose information needs to be printed.
     * @return The printed customer information.
     */
    @Override
    public String printCustomer(int customerId) {
        return restAPI.printCustomer(customerId);
    }
    /**
     * Method to retrieve customer data over USB using HTTPS.
     * @param customerId The ID of the customer whose data needs to be retrieved.
     * @return The retrieved customer data over USB using HTTPS.
     */
    @Override
    public String getCustomer_USB(int customerId) {
        return restAPI.getCustomer_HTTPS(customerId);
    }
    /**
     * Method to update customer data over USB using HTTPS.
     * @param customerId The ID of the customer whose data needs to be updated.
     * @param customerDetails The updated details of the customer.
     */
    @Override
    public void updateCustomer_USB(int customerId, String customerDetails) {
        restAPI.updateCustomer_HTTPS(customerId, customerDetails);
    }
}
