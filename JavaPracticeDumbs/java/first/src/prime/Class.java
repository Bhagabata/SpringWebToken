package prime;
import java.util.*;
public class Class {
  String brand; //instant variables
  int size;
  String color;
  int price;
  
  void walking() {
	  System.out.print("It is for walking");
  }
  
  void running() {
	  System.out.print("It is for Running");
  }
  
  public static void main(String[]args) {
	  Class shoe1=new Class();
	  Class shoe2=new Class();
	  shoe1.brand="adidas";
	  shoe1.color="white";
	  shoe1.price=2499;
	  shoe1.size=10;
	  shoe1.running();
	 System.out.println("Your brand is "+ shoe1.brand + shoe1.price + shoe1.color + shoe1.size); 
	  
	  shoe2.brand="nike";
	  shoe2.color="Red";
	  shoe2.price=2599;
	  shoe2.size=10;
	  shoe2.walking();
	  
	  System.out.println("Your Brand is "+ shoe2.brand + shoe2.price + shoe2.color + shoe2.size);
  }
}
