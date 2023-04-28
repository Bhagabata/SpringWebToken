package com.example.demoSpringBoot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demoSpringBoot.bean.Products;
@Component
public class ProductServices {
HashMap<Integer,Products>hm;
	public ProductServices() {
		hm=new HashMap<Integer,Products>();
		
	Products prod1=new Products(1,"laptop","BD132",75000.00,"25");
	Products prod2=new Products(122,"Mobile","Galaxy23",25000.00,"43");
	Products prod3=new Products(758,"Printer","AZ104",35000.00,"11");
	Products prod4=new Products(95,"TV","T8",85000.00,"19");
	Products prod5=new Products(741,"Washing Machine","SAM657",35000.00,"07");
	
		
	hm.put(1, prod1);
	hm.put(2, prod2);
	hm.put(3, prod3);
	hm.put(4, prod4);
	hm.put(5, prod5);
	
	}
public List<Products> finalAll() {
    List get=new ArrayList(hm.values());
    return get;
}
public Products find(int id) {
	Products pro=hm.get(id);
	return pro;
}
public void addProduct(Products pro) {
    hm.put(pro.getProd_id(), pro);
}

public void addProducts(List<Products> prods) {
	
	for(Products pro:prods){
		this.hm.put(pro.getProd_id(), pro);
	}
}

public Products update(Products prod) {
	if(prod.getProd_id()>0) {
		hm.put(prod.getProd_id(), prod);
	}
	return prod;
}
public void delete(int id) {
	hm.remove(id);
}
}
