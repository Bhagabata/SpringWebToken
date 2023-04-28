package com.royalnavghan.royalCustom;

public interface CustomerDAO {
	public abstract void addCustomer(Customer customer);
	public abstract Customer fetchCustomer(int customerId);
	public abstract void updateCustomer(int customerId,String newLocation);
	public abstract void deleteCustomer(Integer customerId);

}
