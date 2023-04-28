package com.royal.dao;

import java.util.List;

import com.royal.model.Customer;

public interface CustomerDao {
public void save(Customer customer);
public int delete(int id);
public Customer get(int id);
public List<Customer>list();

	
}
