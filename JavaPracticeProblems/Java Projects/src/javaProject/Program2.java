package javaProject;

import java.util.Scanner;

public class Program2 {
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
         System.out.println("Enter your Number :");
         int i =sc.nextInt();
         
         long l=i; // implicit conversion
         float f=i;
         
         System.out.println(l);
         System.out.println(f);
         sc.close();  // it is used to close the program or scanner object.
	}
}
