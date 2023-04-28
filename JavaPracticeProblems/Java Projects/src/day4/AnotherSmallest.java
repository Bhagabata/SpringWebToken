package day4;

import java.util.Scanner;

public class AnotherSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first number : "); 
		  int n1=sc.nextInt(); // 25
		  System.out.println("Enter Second number : "); 
		  int n2=sc.nextInt(); // 65
		  System.out.println("Enter third number : "); 
		  int n3=sc.nextInt(); // 3
		 int small=0;
		  
		   if(n1<n2 && n1<n3) {
			   small = n1;
		}
		   else if(n2<n3 && n2<n1 ) {
			  small =n2;
		   }
		   else if(n3<n1 && n3<n2) {
			  small = n3;
			  
		  
		  
		   }
		   else {
			   System.out.println("The three numbers are equals");
		   }
		   
		   
		   System.out.println("The smallest number is " + small);
	}
	}


























