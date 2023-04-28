package day4;

import java.util.Scanner;

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first number : "); 
		  int num1=sc.nextInt();
		  System.out.println("Enter Second number : "); 
		  int num2=sc.nextInt();
		  System.out.println("Enter third number : "); 
		  int num3=sc.nextInt();
		   if(num1<num2 && num2<num3 ) {
			   System.out.println("All three numbers are Increasing!!");
		   }
		   else if(num1<num3) {
			   System.out.println("All three numbers either decreasing or Increasing!!");
		   }
		   else {
			   System.out.println("All three numbers are Decreasing");
			   sc.close();
		   }
	}

}
