/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerData_HTTPS.java
 * Description: CustomerData_HTTPS interface defines methods for handling customer data over HTTPS.
 */
package edu.bu.met.cs665;

public interface CustomerData_HTTPS {
    /**
     * Method to print customer information.
     * @param customerId The ID of the customer whose information needs to be printed.
     * @return The printed customer information.
     */
    public String printCustomer(int customerId);
    /**
     * Method to retrieve customer data over HTTPS.
     * @param customerId The ID of the customer whose data needs to be retrieved.
     * @return The retrieved customer data over HTTPS.
     */
    public String getCustomer_HTTPS(int customerId);
    /**
     * Method to update customer data over HTTPS.
     * @param customerId The ID of the customer whose data needs to be updated.
     * @param customerDetails The updated details of the customer.
     */
    public void updateCustomer_HTTPS(int customerId, String customerDetails);
}
