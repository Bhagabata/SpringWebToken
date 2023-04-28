package day3;
import java.util.*;

public class Assignment3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Please enter the third number: ");
		int num3 = sc.nextInt();
		
		
		int average = (num1 + num2 + num3)/3;
		
		System.out.println("Average of three numbers: " + average);
	}
}
		

