package com.royal.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.royal.dao.CustomerDao;
import com.royal.model.Customer;


@RestController
public class CustomerControl {
	
@Autowired
	private CustomerDao custDao;

	@GetMapping("/customer")
	public List<Customer> getCustomer(){
		return custDao.list();
	}
	@GetMapping(value = "/customer/{id}")
	public ResponseEntity<?>getCustome(@PathVariable("id")int id){
		Customer cust=custDao.get(id);
		if(cust==null) {
			return new ResponseEntity<String>("No customer data",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);

	}
	@PostMapping(value = "/customer")
	public ResponseEntity<?> save(@RequestBody Customer cust) {
		custDao.save(cust);
		return new ResponseEntity<Customer>(cust, HttpStatus.OK);
	}

	@DeleteMapping(value = "/customer/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") int id) {
		if(custDao.delete(id) <= 0) {
			return new ResponseEntity<String>("No Customer Data.", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
}
