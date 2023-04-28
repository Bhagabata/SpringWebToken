package day5;


interface pritable{
	void print();
}
class abc implements pritable {
	public void print()
	{System.out.println("Hello");} 
}
		
	

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj = new abc();  
		obj.print();  
		 }
	}

