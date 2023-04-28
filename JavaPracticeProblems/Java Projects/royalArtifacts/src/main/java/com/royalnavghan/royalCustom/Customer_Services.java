package com.royalnavghan.royalCustom;

public interface Customer_Services {
public abstract void createCustomer(Customer customer);
public abstract Customer getCustomer(int customerId);
public abstract void updateCustomer(int customerId,String newLocation);
public abstract void deleteCustomer(Integer customerId);


}
