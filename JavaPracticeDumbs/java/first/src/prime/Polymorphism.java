package prime;

public class Polymorphism {
   public void driving(){
	   System.out.print("Gayu is driving");
   }
}
 class Benz extends Polymorphism{
	 public void driving(){
		 System.out.print("Gayu is Driving Benz");
	 }
}
 
class main{
	public static void main(String[]args) {
	Polymorphism method=new Polymorphism();
	method.driving();

	}
 }
