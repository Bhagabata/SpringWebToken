/*
1. Using Exception Handling 

build a program to provide the input String from user and parse it to integer, if it is not a number it will throw 
number format exception Catch it and print "Entered input is not a valid format for an integer."
or else print the square of that number. 


Enter an integer: 13
The square value is 169
The work has been done successfully

Sample input and output 2:
Enter an integer: Rajesh
Entered input is not a valid format for an integer.
*/


package day11;

import java.util.Scanner;

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc =new Scanner(System.in);
	System.out.println("Enter an Integer : ");
	String name=sc.nextLine();
	
	try{
		int ints=Integer.parseInt(name);
		System.out.println("The square value is :"+(ints*ints));
		System.out.println("The work has been done successfully");
	}
	catch(Exception e) {
		System.out.println("Entered input is not a valid format for an integer."+e);
	}
	
	}

	

}
