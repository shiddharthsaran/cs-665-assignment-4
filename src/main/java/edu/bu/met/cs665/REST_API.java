package edu.bu.met.cs665;

public class REST_API implements CustomerData_HTTPS{
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Customer Id is "+ customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        System.out.println("Getting " + customerId + " data from Server using REST API through HTTPS.");

    }
}
