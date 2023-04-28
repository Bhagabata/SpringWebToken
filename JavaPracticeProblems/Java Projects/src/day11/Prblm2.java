/*2. Using Exception Handling: Try-catch 	

Write a program that takes as input the size of the array and the elements in the array.
 The program then asks the user to enter a particular index and prints the element at that index.
 This program may generate Array Index Out Of Bounds Exception. Use exception handling mechanisms to handle this exception. 
In the catch block, print the class name of the exception thrown. 

Sample Input and Output 1: 

I/P:

Enter the number of elements in the array 3 
Enter the elements  in the array 20 90 4 

Enter the index of the array element you want to access 2 

The array element at index 2 = 4 

O/P:

The array element successfully accessed

Sample Input and Output 2: 

Enter the number of elements in the array 3 

Enter the elements in the array 20 90 4 

Enter the index of the array element you want to access 6 

o/p:

java.lang.ArrayIndexOutOfBoundsException

 
*/


package day11;

import java.util.Scanner;

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array you want : ");
		int arraySize=sc.nextInt();
		int arr[]=new int[arraySize];
		System.out.println("Enter a Element in that array :");
		for(int i=0;i<arraySize;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("These are the elements in your array :");
		for(int i=0;i<arraySize;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
		System.out.println("Please enter the index you want to access :");
		int index=sc.nextInt();
		try {
			System.out.println("Your element in that particular index is : "+arr[index]);
			System.out.println("Your element is successfully accessed");
			
		}
		catch(Exception e) {
			System.out.println("sorry!! you will get a "+e);
		}
		
	}

}
