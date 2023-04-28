package day7;

import java.util.Scanner;

public class Larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter any number 1 : ");
int num1=sc.nextInt();
System.out.println(" Enter any number 2 : ");
int num2=sc.nextInt();

if(num1>num2) {
	System.out.println(num1 + " is Larger");
}
else if(num1==num2) {
	System.out.println("Both are Equal");
}
else {
	System.out.println(num2 + " is Larger");
}

	}

}
