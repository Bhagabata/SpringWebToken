package com.example.demoSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpringBoot.bean.Products;
import com.example.demoSpringBoot.service.ProductServices;

@RestController
public class ProductController {
    @Autowired
	ProductServices product;
	
	@GetMapping("/products")
	public List get() {
	return product.finalAll();
	}
	@GetMapping("/product/{id}")
	public Products find(@PathVariable int id) {
		return product.find(id);
	}
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Products prod) {
		
		product.addProduct(prod);
	}
	@PostMapping("addproducts")
	public void addProducts(List<Products> prod) {
		product.addProducts(prod);
	}
	@PutMapping("/updateproducts")
	public Products update(@RequestBody Products prod) {
		return product.update(prod);
	}
	@DeleteMapping("/deleteproduct/{id}")
	public void delete(@PathVariable int id) {
		product.delete(id);
	}
}
