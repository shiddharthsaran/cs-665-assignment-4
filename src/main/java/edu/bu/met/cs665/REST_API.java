package edu.bu.met.cs665;

public class REST_API implements CustomerData_HTTPS{
    CustomerDataInterface customerData = new CustomerData();
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Customer Name is "+ customerData.searchCustomerData(customerId));
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        System.out.println("Getting " + customerData.searchCustomerData(customerId) + " data from Server using REST API through HTTPS.");

    }
}
