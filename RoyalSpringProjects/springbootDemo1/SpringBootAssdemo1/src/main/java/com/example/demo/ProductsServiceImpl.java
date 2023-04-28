package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductsServiceImpl {
	ArrayList<Products>arr;
	
	public ProductsServiceImpl(){
		
		arr=new ArrayList<Products>();

	
		
		Products prod1 = new Products(01, "Royal", "235", 1250.3, "256");
		Products prod2 = new Products(02, "logitech-mouse", "235", 1250.3, "256");
		Products prod3 = new Products(03, "Hp-mouse", "235", 1250.3, "256");
		Products prod4 = new Products(04, "Hp-mouse", "235", 1250.3, "256");
		Products prod5 = new Products(05, "I-mouse", "235", 1250.3, "256");

		arr.add(prod1);
		arr.add(prod2);
		arr.add(prod3);
		arr.add(prod4);
		arr.add(prod5);

	}

	public List<Products> findAll() {
		// TODO Auto-generated method stub
		
		return arr;
	}

	public void addProduct(Products prod) {
		// TODO Auto-generated method stub


		arr.add(prod.getProd_id(), prod);

	}

	public void addProducts(List<Products> prod) {
		// TODO Auto-generated method stub

		for (Products product : prod) {
			this.arr.add(product.getProd_id(), product);
		}

	}

	public AddResponse deleteProduct(int id) {
		arr.remove(id);
		AddResponse res = new AddResponse();
		res.setMsg("Product Deleted...!!");
		res.setId(id);
		return null;
	}

	public Products find(int id) {
		Products prod = arr.get(id);
		return prod;
	}

	public Products updateProduct(Products prod) {
		if (prod.getProd_id() > 0)
			arr.add(prod.getProd_id(), prod);
		return prod;
	}
}
