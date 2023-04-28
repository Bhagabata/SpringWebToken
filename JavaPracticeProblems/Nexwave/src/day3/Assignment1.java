package day3;
import java.util.*;

public class Assignment1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter second number: ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int difference = num2 - num1;
		int product = num2 * num1;
		int average = num2/num1;
		System.out.println("Sum of two numbers: " + sum);
		System.out.println("Difference between two numbers: "+ difference);
		System.out.println("Product of two numbers: " +product);
		System.out.println("Average of two numbers: "+ average);
		
		if(num1 > num2) {
			System.out.println(num1 + " is the maximum in both the numbers.");
			System.out.println(num2 + " is the minimum in both the numbers.");
		}
		else {
			System.out.println(num2 + " is maximum in two numbers.");
			System.out.println(num1 + " is the minimum in two numbers.");
		}
	}
}
