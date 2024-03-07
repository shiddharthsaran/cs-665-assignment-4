package edu.bu.met.cs665;

public interface CustomerDataInterface {
    public String searchCustomerData(int customerId);
    public void updateCustomerData(int customerId, String customerDetails);
}
