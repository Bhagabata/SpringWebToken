package nNew;

public class Poluy {
	public void driving(){
		   System.out.print("Gayu is driving");
	   }
	}
	 class Benz extends Poluy{
		 public void driving(){
			 System.out.print("Gayu is Driving Benz");
		 }
	}
	 
      class Main{
		public static void main(String[]args) {
		Poluy method=new Benz();
		method.driving();

		}
	 }

