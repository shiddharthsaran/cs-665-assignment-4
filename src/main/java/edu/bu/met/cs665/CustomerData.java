package edu.bu.met.cs665;

import java.util.Map;
import java.util.HashMap;
public class CustomerData implements CustomerDataInterface{
    public Map<Integer, String> dict= new HashMap<>();
    public CustomerData(){
        this.dict.put(1, "John");
        this.dict.put(2, "Tom");
        this.dict.put(3, "Max");
        this.dict.put(4, "Mrunal");
        this.dict.put(5, "Yashna");

    }




    @Override
    public String searchCustomerData(int customerId) {

        if (this.dict.get(customerId) == null){
            return "Sorry, customerId: " + customerId + " is not found.";
        }
        else{
            return this.dict.get(customerId);
        }

    }

    @Override
    public void updateCustomerData(int customerId, String customerDetails) {
        this.dict.put(customerId, customerDetails);

    }
}
