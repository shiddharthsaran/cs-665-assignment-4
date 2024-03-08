/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: CustomerData.java
 * Description: CustomerData class provides functionality to store and manipulate customer data.
 */

package edu.bu.met.cs665;

import java.util.Map;
import java.util.HashMap;
public class CustomerData implements CustomerDataInterface{
    // Dictionary to store customer data
    public Map<Integer, String> dict= new HashMap<>();
    // Constructor to initialize customer data
    public CustomerData(){
        this.dict.put(1, "John");
        this.dict.put(2, "Tom");
        this.dict.put(3, "Max");
        this.dict.put(4, "Mrunal");
        this.dict.put(5, "Yashna");

    }



    // Method to search for customer data by customer ID
    @Override
    public String searchCustomerData(int customerId) {

        if (this.dict.get(customerId) == null){
            return "Sorry, customerId: " + customerId + " is not found.";
        }
        else{
            return this.dict.get(customerId);
        }

    }
    // Method to update customer data by customer ID
    @Override
    public void updateCustomerData(int customerId, String customerDetails) {
        this.dict.put(customerId, customerDetails);

    }
}
