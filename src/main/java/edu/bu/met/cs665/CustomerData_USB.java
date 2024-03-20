/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerData_USB.java
 * Description: CustomerData_USB interface defines methods for handling customer data over USB.
 */
package edu.bu.met.cs665;

public interface CustomerData_USB {
    /**
     * Method to print customer information.
     * @param customerId The ID of the customer whose information needs to be printed.
     * @return The printed customer information.
     */
    public String printCustomer(int customerId);
    /**
     * Method to retrieve customer data over USB.
     * @param customerId The ID of the customer whose data needs to be retrieved.
     * @return The retrieved customer data over USB.
     */
    public String getCustomer_USB(int customerId);
    /**
     * Method to update customer data over USB.
     * @param customerId The ID of the customer whose data needs to be updated.
     * @param customerDetails The updated details of the customer.
     */
    public void updateCustomer_USB(int customerId, String customerDetails);
}
