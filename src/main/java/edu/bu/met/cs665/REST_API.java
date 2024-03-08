/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: REST_API.java
 * Description: REST_API class implements CustomerData_HTTPS interface to handle customer data
 *              retrieval and updates using REST API over HTTPS.
 */
package edu.bu.met.cs665;

public class REST_API implements CustomerData_HTTPS{
    // Instance of CustomerDataInterface to handle customer data
    CustomerDataInterface customerData = new CustomerData();
    // Method to print customer information
    @Override
    public String printCustomer(int customerId) {
        return("Customer Name is "+ customerData.searchCustomerData(customerId));
    }

    // Method to retrieve customer data over HTTPS
    @Override
    public String getCustomer_HTTPS(int customerId) {
        String custDets =  customerData.searchCustomerData(customerId);
        if (custDets.startsWith("Sorry")){
            return custDets;
        }
        else{
            return ("Getting " + customerData.searchCustomerData(customerId) + " data from Server using REST API through HTTPS.");

        }

    }

    // Method to update customer data over HTTPS
    @Override
    public void updateCustomer_HTTPS(int customerId, String customerDetails) {
        customerData.updateCustomerData(customerId, customerDetails);
    }
}
