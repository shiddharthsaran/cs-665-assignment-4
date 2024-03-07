package edu.bu.met.cs665;

public class USBToHTTPSAdapter implements CustomerData_HTTPS{
    public CustomerData_USB externalDisks;
    public USBToHTTPSAdapter(CustomerData_USB externalDisks){
        this.externalDisks = externalDisks;
    }

    @Override
    public void printCustomer(int customerId) {
        System.out.println("Customer Id is " + customerId);
    }

    @Override
    public void getCustomer_HTTPS(int customerId) {
        externalDisks.getCustomer_USB(customerId);
    }
}
