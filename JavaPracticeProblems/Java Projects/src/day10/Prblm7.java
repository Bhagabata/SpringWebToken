/*7.
A class has an integer data member 'i' and a method named 'printNum' to print thevalue of 'i'. Its subclass also has an integer 
data member 'j' and a method named 'printNum' to print the value of 'j'. Make an object of the subclass and use it to assign 
a value to 'i' and to 'j'. Now call the method 'printNum' by this object.*/





package day10;

class Integer{
	void printNum(int i) {
		System.out.println("Hi this is value of i "+i);
	}
}
class Integer1 extends Integer{
	void printNum(int j) {
		super.printNum(j);
		System.out.println("Hi this is value of j "+j);
	}
}

public class Prblm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Integer1 obj1=new Integer1();
 obj1.printNum(6);
	}

}
