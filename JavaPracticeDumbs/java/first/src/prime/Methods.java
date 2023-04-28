package prime;
import java.util.*;
public class Methods {
 static void calling(String network, int numbers) { //static method // inside bracket mention string or int or something called paramater
	 System.out.println(network + numbers + " sim 1 is calling");
 }
 
void ringing() { // not a static method
	System.out.println("Sim 2 is ringing");
}
 
 public static void main(String[]args) {
	 calling("jio",5);  // static method call rightaway
	 Methods newobj=new Methods(); // we need to create a object for non static methods
	 newobj.ringing();
 }
}
