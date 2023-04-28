package day4;

import java.util.Scanner;
class getNum{
	public void number(int n1, int n2, int n3) {
		 int small=0;
		  
		   if(n1<n2) {
			   small = n1;
		   }
		   else if(n2<n3) {
			  small =n2;
		   }
		   else if(n3<n1) {
			  small = n3;
			  
		   }
		      System.out.println("The smallest number is " + small);
} 

}

public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first number : "); 
		  int num1=sc.nextInt();
		  System.out.println("Enter Second number : "); 
		  int num2=sc.nextInt();
		  System.out.println("Enter third number : ");
		  int num3=sc.nextInt();
		getNum ob =new getNum();
		  ob.number(num1, num2, num3);
			 sc.close();
		   }
		 
	}


