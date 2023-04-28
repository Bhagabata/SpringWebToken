package day7;
class Invoice1{
	private String Part,Description;
	private	int Quantity;
	private	double Price;
	
Invoice1(String Part, String Description, double Price, int Quantity){
		this.Part = Part;
	    this.Description=Description;
	    this.Price=Price;
	    this.Quantity=Quantity;
		}

public String getPart() {
	return Part;
}

public void setPart(String part) {
	Part = part;
}

public String getDescription() {
	return Description;
}

public void setDescription(String description) {
	Description = description;
}

public int getQuantity() {
	return Quantity;
}

public void setQuantity(int quantity) {
	if(Quantity >0) {
	Quantity = quantity;
}
else {
	Quantity=0;
}}

public double getPrice() {
	return Price;
}

public void setPrice(double price) {
	if(Price>0) {
	Price = price;
	}
	else {
		Price=0;
	}
}
public double getInvoiceAmount() {

	return Quantity*Price;
}
 
}

public class Invoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Invoice1 obj=new Invoice1("axe1","good/bad condition",256,2512);
System.out.println("Part numer :"+ obj.getPart()+"; Description : "+ obj.getDescription()+"; Product Price : "+ obj.getPrice()+"; Quantity "+obj.getQuantity());
obj.getDescription();
obj.getPart();
obj.getPrice();
obj.getQuantity();
obj.getInvoiceAmount();
obj.setDescription("good");
obj.setPart("abs123");
obj.setPrice(25.00);
obj.setQuantity(25);
System.out.println("updated!!");
System.out.println("Part numer :"+ obj.getPart()+"; Description : "+ obj.getDescription()+"; Product Price : "+ obj.getPrice()+"; Quantity "+obj.getQuantity()+"; Invoice Amount"+obj.getInvoiceAmount());

	}

}
