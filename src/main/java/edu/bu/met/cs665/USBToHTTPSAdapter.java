package edu.bu.met.cs665;

public class USBToHTTPSAdapter implements CustomerData_USB{
    public CustomerData_HTTPS restAPI;
    public USBToHTTPSAdapter(CustomerData_HTTPS restAPI){
        this.restAPI = restAPI;
    }

    @Override
    public String printCustomer(int customerId) {
        return restAPI.printCustomer(customerId);
    }

    @Override
    public String getCustomer_USB(int customerId) {
        return restAPI.getCustomer_HTTPS(customerId);
    }

    @Override
    public void updateCustomer_USB(int customerId, String customerDetails) {
        restAPI.updateCustomer_HTTPS(customerId, customerDetails);
    }
}
