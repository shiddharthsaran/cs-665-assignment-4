package edu.bu.met.cs665;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;
import java.util.HashMap;
public class CustomerData implements CustomerDataInterface{




    @Override
    public String searchCustomerData(int customerId) {
        Map<Integer, String> dict= new HashMap<>();
        dict.put(1, "John");
        dict.put(2, "Tom");
        dict.put(3, "Max");
        dict.put(4, "Mrunal");
        dict.put(5, "Yashna");



        if (dict.get(customerId) == null){
            return "Sorry, customerId: " + customerId + " is not found.";
        }
        else{
            return dict.get(customerId);
        }

    }
}
