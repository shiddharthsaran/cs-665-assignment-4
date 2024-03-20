/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerDataInterface.java
 * Description: CustomerDataInterface interface defines methods for searching and updating customer data.
 */
package edu.bu.met.cs665;

public interface CustomerDataInterface {
    /**
     * Method to search for customer data by customer ID.
     * @param customerId The ID of the customer to search for.
     * @return The customer data corresponding to the provided ID, or an error message if not found.
     */
    public String searchCustomerData(int customerId);
    /**
     * Method to update customer data by customer ID.
     * @param customerId The ID of the customer whose data needs to be updated.
     * @param customerDetails The updated details of the customer.
     */
    public void updateCustomerData(int customerId, String customerDetails);
}
