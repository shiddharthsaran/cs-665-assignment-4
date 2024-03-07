package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        CustomerData_HTTPS restAPI = new REST_API();
        restAPI.getCustomer_HTTPS(1);
        CustomerData_USB externalDisks = new ExternalDisks();
        CustomerData_HTTPS adapter = new USBToHTTPSAdapter(externalDisks);
        adapter.getCustomer_HTTPS(2);


    }

}
