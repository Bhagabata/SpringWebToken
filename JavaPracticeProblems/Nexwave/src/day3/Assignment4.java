package day3;
import java.util.*;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter second number: ");
		int num2 = sc.nextInt();		
		
		if(num1 != num2) {
			System.out.println(num1 + " != " + num2);
		}
		else{
			System.out.println(num1 + " == " + num2);
		}
		
		
		if(num1 < num2) {
			System.out.println(num1 + " < " + num2);
		}
		else {
			System.out.println(num1 + " > " + num2);
		}
		
		if(num1 <= num2) {
			System.out.println(num1 + " <= " +num2);
		}
		else{
			System.out.println(num2 + " > " + num1);
		}
	}
}
