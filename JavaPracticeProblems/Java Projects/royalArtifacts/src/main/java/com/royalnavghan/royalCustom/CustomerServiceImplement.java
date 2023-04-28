package com.royalnavghan.royalCustom;

public class CustomerServiceImplement implements Customer_Services {

	@Override
	public void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		new CustomerDAOimpl().addCustomer(customer);
	}

	@Override
	public Customer getCustomer(int customerId) {
		// TODO Auto-generated method stub
		return new CustomerDAOimpl().fetchCustomer(customerId);
	}

	@Override
	public void updateCustomer(int customerId, String newLocation) {
		// TODO Auto-generated method stub
		new CustomerDAOimpl().updateCustomer(customerId, newLocation);
	}

	@Override
	public void deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		new CustomerDAOimpl().deleteCustomer(customerId);
	}

}

