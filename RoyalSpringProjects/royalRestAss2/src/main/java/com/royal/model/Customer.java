package com.royal.model;

public class Customer {
private int Cust_Id;
private String Cust_name;
private String Cust_Add;
private double Sales_Qty;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cust_Id, String cust_name, String cust_Add, double sales_Qty) {
	super();
	Cust_Id = cust_Id;
	Cust_name = cust_name;
	Cust_Add = cust_Add;
	Sales_Qty = sales_Qty;
}
public int getCust_Id() {
	return Cust_Id;
}
public void setCust_Id(int cust_Id) {
	Cust_Id = cust_Id;
}
public String getCust_name() {
	return Cust_name;
}
public void setCust_name(String cust_name) {
	Cust_name = cust_name;
}
public String getCust_Add() {
	return Cust_Add;
}
public void setCust_Add(String cust_Add) {
	Cust_Add = cust_Add;
}
public double getSales_Qty() {
	return Sales_Qty;
}
public void setSales_Qty(double sales_Qty) {
	Sales_Qty = sales_Qty;
}
@Override
public String toString() {
	return "Customer [Cust_Id=" + Cust_Id + ", Cust_name=" + Cust_name + ", Cust_Add=" + Cust_Add + ", Sales_Qty="
			+ Sales_Qty + "]";
}

}
