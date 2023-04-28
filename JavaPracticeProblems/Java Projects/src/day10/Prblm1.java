/*1.Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with
the same name 'printn' having a parameter for each datatype.*/


package day10;

import java.util.Scanner;

class PrintNumber{
	void printn(int a) {
		System.out.println("The Integer of given number is: "+a);
	}
	void printn(double b) {
		System.out.println("The double of given numberr is: "+b);
	}
	void printn(float c) {
		System.out.println("The float of given number is :"+c);
	}
	void printn(char d) {
		System.out.println("The character of given name : "+d);
	}
	void printn(String e){
		System.out.println("The given String is :"+e);
	}
	void printn(byte f) {
		System.out.println("The Byte of given number : "+f);
	}
}

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a any Number :");
	double ints =sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter any name :");
	String name=sc.nextLine();
PrintNumber obj1=new PrintNumber();
obj1.printn(ints);
obj1.printn(ints);
obj1.printn(ints);
obj1.printn(ints);
obj1.printn(name);
obj1.printn(name);
	}

}
