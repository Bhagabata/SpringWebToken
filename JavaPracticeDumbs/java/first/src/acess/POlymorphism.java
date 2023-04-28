package acess;

public class POlymorphism {
	public void driving(){
		   System.out.print("Gayu is driving");
	   }
	}
	 class Benz extends POlymorphism{
		 public void driving(){
			 System.out.print("Gayu is Driving Benz");
		 }
	}
	 
	class main{
		public static void main(String[]args) {
		POlymorphism method=new POlymorphism();
		method.driving();

		}
	 }

