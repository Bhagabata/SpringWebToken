package PracticePrblm;

import java.util.Scanner;

public class Program3 {
 public static void main(String[]args){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first Number : ");
	 int num1=sc.nextInt();
	 System.out.println("Enter Second  Number : ");
	 int num2=sc.nextInt();
	 System.out.println("Enter Third Number : ");
	 int num3=sc.nextInt();
	 int num4;
	 num4=(num1+num2+num3)/3;
	 System.out.println("The average of three number will be : "+ num4);
 }
}
