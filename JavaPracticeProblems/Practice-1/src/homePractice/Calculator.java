package homePractice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Your Number 1 : ");
	int num1=sc.nextInt();
	
	System.out.println("Enter Your Number 2 : ");
	int num2=sc.nextInt();
	
	Scanner scc =new Scanner(System.in);
	System.out.println("Enter the valid operation (+,-,*,/) : ");
	String num3=scc.nextLine();
int i;
	  if(num3.equals("+")) {
		i= num1+num2;
		  System.out.println(i);
	  }
	  else if (num3.equals("-")) {
		  i=num1-num2;
		  System.out.println(i);
	  }
	  else if(num3.equals("*")) {
		  i=num1*num2;
		  System.out.println(i);
	  }
	  else if(num3.equals("/")) {
		  i=num1/num2;
		  System.out.println(i);
	  }
	  else {
		  System.out.println("Enter a Valid Operator !");
	  }
	}

}
