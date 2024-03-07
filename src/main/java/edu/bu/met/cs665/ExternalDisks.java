package edu.bu.met.cs665;

public class ExternalDisks implements CustomerData_USB{
    @Override
    public void printCustomer(int customerId) {
        System.out.println("Customer Id is " + customerId);
    }

    @Override
    public void getCustomer_USB(int customerId) {
        System.out.println("Getting " + customerId + " data from Hard Disks using USB Connection.");

    }
}
