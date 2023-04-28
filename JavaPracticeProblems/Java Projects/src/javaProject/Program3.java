package javaProject;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one  Numbers");
		int a=sc.nextInt();
		System.out.println("Enter another  Numbers");
		int b=sc.nextInt();
		//int sum=a+b,sub=a-b,div=a/b,mul=a*b,mod=a%b;
		int sum=a+b;
		int sub=a-b;
		int div=a/b;
		int mul=a*b;
		int mod=a%b;
		
		System.out.println("The sum of two number a+b is :"+sum);
		System.out.println("The substract of two number a-b is :"+sub);
		System.out.println("The multiplication of two number a*b is :"+mul);
		System.out.println("The division of two number a/b is :"+div);
		System.out.println("The modulus of two number a%b is :"+mod);
		
		sc.close();

	}
	
	

}
