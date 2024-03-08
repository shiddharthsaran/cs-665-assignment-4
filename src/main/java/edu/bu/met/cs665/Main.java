/**
 * Name: Shiddharth Saran M
 * Course: CS-665 Software Design & Patterns
 * Date: 03/08/2024
 * File Name: Main.java
 * Description: Main class demonstrates the usage of CustomerData_USB and CustomerData_HTTPS interfaces
 *              by creating instances of ExternalDisks, REST_API, and USBToHTTPSAdapter and printing
 *              customer data retrieved over USB and HTTPS connections.
 */

package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args){
        // Instantiate ExternalDisks to handle customer data over USB
        CustomerData_USB externalDisk = new ExternalDisks();
        System.out.println(externalDisk.getCustomer_USB(1));
        // Instantiate REST_API to handle customer data over HTTPS
        CustomerData_HTTPS restAPI = new REST_API();
        // Instantiate USBToHTTPSAdapter to adapt CustomerData_HTTPS to CustomerData_USB interface
        CustomerData_USB adapter = new USBToHTTPSAdapter(restAPI);
        System.out.println(adapter.getCustomer_USB(2));


    }

}
