/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: ExternalDisks.java
 * Description: ExternalDisks class implements CustomerData_USB interface to handle customer data using USB connection.
 */
package edu.bu.met.cs665;

public class ExternalDisks implements CustomerData_USB{
    // Instance of CustomerDataInterface to handle customer data
    CustomerDataInterface customerData = new CustomerData();
    // Method to print customer information
    @Override
    public String printCustomer(int customerId) {
        return ("Customer Name is " + customerData.searchCustomerData(customerId));
    }
    // Method to retrieve customer data over USB
    @Override
    public String getCustomer_USB(int customerId) {
        String custDets =  customerData.searchCustomerData(customerId);
        if (custDets.startsWith("Sorry")){
            return custDets;
        }
        else{
            return ("Getting " + custDets + " data from Hard Disks using USB Connection.");

        }

    }
    // Method to update customer data over USB
    @Override
    public void updateCustomer_USB(int customerId, String customerDetails) {
        customerData.updateCustomerData(customerId, customerDetails);
    }
}
