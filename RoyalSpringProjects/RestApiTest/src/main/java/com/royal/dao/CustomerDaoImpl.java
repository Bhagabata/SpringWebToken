package com.royal.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.royal.model.Customer;
@Component
public class CustomerDaoImpl implements CustomerDao {

	private static List<Customer> customers;
	{
		customers = new ArrayList<Customer>();
		customers.add(new Customer(101, "Srihari", "Coimbatore", 165.0));
		customers.add(new Customer(102, "Srihari", "Coimbatore", 165.0));
		customers.add(new Customer(103, "Srihari", "Coimbatore", 165.0));
		customers.add(new Customer(104, "Srihari", "Coimbatore", 165.0));
	}

	public void save(Customer customer) {
		// TODO Auto-generated method stub
		int oldId = 0;
		if (customer != null && customer.getCust_Id() > 0) {
			oldId = customer.getCust_Id();
			Customer cus = get(oldId);
			customers.remove(cus);
		}
		customer.setCust_Id(oldId);
		customers.add(customer);

	}

	public int delete(int id) {
		// TODO Auto-generated method stub
		for (Customer cust : customers) {
			if (cust.getCust_Id() == id) {
				customers.remove(cust);
				return id;

			}
		}
		return 0;
	}

	public Customer create(Customer customer) {

		customer.setCust_Id((int) System.currentTimeMillis());
		customers.add(customer);
		return customer;
	}

	public Customer get(int id) {
		// TODO Auto-generated method stub
		for (Customer customer : customers) {
			if (customer.getCust_Id() == id) {
				return customer;
			}
		}
		return null;
	}

	public List<Customer> list() {
		// TODO Auto-generated method stub
		return customers;
	}

}
