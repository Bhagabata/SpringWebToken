
package day5;
class Inheritance{
	int a=10;
	int b=20;
	
  void method1() {
			System.out.println("The sum of the given numbers:"+ (a+b));
			System.out.println("The substraction of the given numbers:"+ (a-b));
	}}
  
  class multi extends Inheritance{
	  void method2() {
		  System.out.println("The Product of the given numbers:"+ (a*b));
	  }
  }



public class Prblm2 {
	public static void main(String[] args) {

		//Inheritance ob1=new Inheritance();
		//ob1.method1();
		multi ob2 =new multi();
		ob2.method1();
		ob2.method2();
	}

}
