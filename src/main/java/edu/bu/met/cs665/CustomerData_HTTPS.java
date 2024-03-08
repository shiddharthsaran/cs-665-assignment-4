/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerData_HTTPS.java
 * Description: CustomerData_HTTPS interface defines methods for handling customer data over HTTPS.
 */
package edu.bu.met.cs665;

public interface CustomerData_HTTPS {
    // Method to print customer information
    public String printCustomer(int customerId);
    // Method to retrieve customer data over HTTPS
    public String getCustomer_HTTPS(int customerId);
    // Method to update customer data over HTTPS
    public void updateCustomer_HTTPS(int customerId, String customerDetails);
}
