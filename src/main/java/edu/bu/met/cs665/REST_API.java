package edu.bu.met.cs665;

public class REST_API implements CustomerData_HTTPS{
    CustomerDataInterface customerData = new CustomerData();
    @Override
    public String printCustomer(int customerId) {
        return("Customer Name is "+ customerData.searchCustomerData(customerId));
    }


    public String getCustomer_HTTPS(int customerId) {
        String custDets =  customerData.searchCustomerData(customerId);
        if (custDets.startsWith("Sorry")){
            return custDets;
        }
        else{
            return ("Getting " + customerData.searchCustomerData(customerId) + " data from Server using REST API through HTTPS.");

        }

    }


    @Override
    public void updateCustomer_HTTPS(int customerId, String customerDetails) {
        customerData.updateCustomerData(customerId, customerDetails);
    }
}
