package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        CustomerData_USB externalDisk = new ExternalDisks();
        System.out.println(externalDisk.getCustomer_USB(1));
        CustomerData_HTTPS restAPI = new REST_API();
        CustomerData_USB adapter = new USBToHTTPSAdapter(restAPI);
        System.out.println(adapter.getCustomer_USB(2));


    }

}
