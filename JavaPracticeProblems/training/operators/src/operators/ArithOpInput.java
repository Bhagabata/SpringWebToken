package operators;

import java.util.Scanner;

public class ArithOpInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner readme = new Scanner(System.in);
		   System.out.println("Enter Two Numbers (Press Enter after each):");
		   //two variables to hold numbers
		   //double n1, n2, n3;
		 //  n1 = readme.nextDouble();
		  // n2 = readme.nextDouble();
		   Integer n1,n2,n3;
		   n1 = readme.nextInt();
		   n2 = readme.nextInt();
		   n3 = n1 + n2;
		   System.out.println("Total = " + n3);
	}

}
