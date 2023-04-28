package com.example.demoSpringBoot.bean;

public class Products {
	int Prod_id;
	String Prod_name;
	String Prod_code;
	double Prod_price;
	String Prod_qty;



	public Products(int prod_id, String prod_name, String prod_code, double prod_price, String prod_qty) {
		super();
		Prod_id = prod_id;
		Prod_name = prod_name;
		Prod_code = prod_code;
		Prod_price = prod_price;
		Prod_qty = prod_qty;
	}


	public int getProd_id() {
		return Prod_id;
	}
	public void setProd_id(int prod_id) {
		Prod_id = prod_id;
	}
	public String getProd_name() {
		return Prod_name;
	}
	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}
	public String getProd_code() {
		return Prod_code;
	}
	public void setProd_code(String prod_code) {
		Prod_code = prod_code;
	}
	public String getProd_qty() {
		return Prod_qty;
	}
	public void setProd_qty(String prod_qty) {
		Prod_qty = prod_qty;
	}
	public double getProd_price() {
		return Prod_price;
	}


	public void setProd_price(double prod_price) {
		Prod_price = prod_price;
	}
}
