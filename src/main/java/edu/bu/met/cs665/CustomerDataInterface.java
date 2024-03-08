/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerDataInterface.java
 * Description: CustomerDataInterface interface defines methods for searching and updating customer data.
 */
package edu.bu.met.cs665;

public interface CustomerDataInterface {
    // Method to search for customer data by customer ID
    public String searchCustomerData(int customerId);
    // Method to update customer data by customer ID
    public void updateCustomerData(int customerId, String customerDetails);
}
