/*4. Using Exception handling: throws 

Write a class MathOperation which accepts integers from command line. 
Create an array using these parameters. 
Loop through the array and obtain the sum 
and average of all the elements. Display the result.
 Check for various exceptions that may arise like ArithmeticException, NumberFormatException, and so on. 
*/






package day11;

import java.util.Scanner;

public class Prblm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; double average =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array you want : ");
		int arraySize=Integer.parseInt(sc.nextLine());
		int arr[]=new int[arraySize];
		System.out.println("Enter a Element in that array :");
		for(int i=0;i<arraySize;i++) {
			arr[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("These are the elements in your array :");
		for(int i=0;i<arraySize;i++) {
			sum=sum+arr[i];
			average=sum/arraySize;
		}
		try {
			System.out.println("The average of this elements : "+average);
			System.out.println("The sum  of this elements : "+sum);
		}
		catch( ArithmeticException e) {
			System.out.println(e);
		}
		catch( NumberFormatException e) {
			System.out.println(e);
		}
	}

}
