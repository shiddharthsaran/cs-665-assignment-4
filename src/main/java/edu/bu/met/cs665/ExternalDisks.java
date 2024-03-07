package edu.bu.met.cs665;

public class ExternalDisks implements CustomerData_USB{
    CustomerDataInterface customerData = new CustomerData();
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Customer Name is " + customerData.searchCustomerData(customerId));
    }

    @Override
    public void getCustomer_USB(int customerId) {
        System.out.println("Getting " + customerData.searchCustomerData(customerId) + " data from Hard Disks using USB Connection.");

    }
}
