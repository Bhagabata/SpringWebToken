package day4;

import java.util.Scanner;

public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter positive/negative number : "); 
		  int num1=sc.nextInt();
		   if(num1>0) {
			   System.out.println("Your number is positive");
		   }
		   else {
			   System.out.println("your number will be negative");
			   sc.close();
		   }
			}
	}


