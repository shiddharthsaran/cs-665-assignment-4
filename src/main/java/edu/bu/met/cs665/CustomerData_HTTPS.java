package edu.bu.met.cs665;

public interface CustomerData_HTTPS {
    public String printCustomer(int customerId);
    public String getCustomer_HTTPS(int customerId);
    public void updateCustomer_HTTPS(int customerId, String customerDetails);
}
