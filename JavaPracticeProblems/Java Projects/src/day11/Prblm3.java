/*3. Using Exception Handling: Try-catch Use multiple catch block 	


Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints 
the element at that index. Index starts from zero.

This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.

Sample Input and Output 1: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 1 The array element at index 1 = 80 The array element successfully accessed

Sample Input and Output 2: Enter the number of elements in the array 2 Enter the elements in the array 50 80 Enter the index of the array element you want to access 9 java.lang.ArrayIndexOutOfBoundsException

Sample Input and Output 3: Enter the number of elements in the array 2 Enter the elements in the array 30 j java.lang.NumberFormatException


*/

package day11;

import java.util.Scanner;

public class Prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
		System.out.println("Please enter the index you want to access :");
		int index=sc.nextInt();
		try {
			System.out.println("Your element in that particular index is : "+arr[index]);
			System.out.println("Your element is successfully accessed");
			
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("sorry!! you will get a "+e);
		}
		catch(java.lang.NumberFormatException e) {
			System.out.println("sorry!! you will get a "+e);
		}
	
	
	}

}
