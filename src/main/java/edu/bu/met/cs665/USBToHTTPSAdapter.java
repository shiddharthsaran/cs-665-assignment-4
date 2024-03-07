package edu.bu.met.cs665;

public class USBToHTTPSAdapter implements CustomerData_HTTPS{
    public CustomerData_USB externalDisks;
    public USBToHTTPSAdapter(CustomerData_USB externalDisks){
        this.externalDisks = externalDisks;
    }

    @Override
    public String printCustomer(int customerId) {
        return ("Customer Id is " + customerId);
    }

    @Override
    public String getCustomer_HTTPS(int customerId) {
        return externalDisks.getCustomer_USB(customerId);
    }

    @Override
    public void updateCustomer_HTTPS(int customerId, String customerDetails) {
        externalDisks.updateCustomer_USB(customerId, customerDetails);
    }
}
