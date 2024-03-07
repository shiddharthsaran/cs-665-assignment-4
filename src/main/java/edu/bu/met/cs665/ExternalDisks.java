package edu.bu.met.cs665;

public class ExternalDisks implements CustomerData_USB{
    CustomerDataInterface customerData = new CustomerData();
    @Override
    public String printCustomer(int customerId) {
        return ("Customer Name is " + customerData.searchCustomerData(customerId));
    }

    @Override
    public String getCustomer_USB(int customerId) {
        String custDets =  customerData.searchCustomerData(customerId);
        if (custDets.startsWith("Sorry")){
            return custDets;
        }
        else{
            return ("Getting " + custDets + " data from Hard Disks using USB Connection.");

        }

    }

    @Override
    public void updateCustomer_USB(int customerId, String customerDetails) {
        customerData.updateCustomerData(customerId, customerDetails);
    }
}
