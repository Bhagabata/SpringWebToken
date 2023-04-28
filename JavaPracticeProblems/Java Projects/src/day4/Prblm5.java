package day4;

import java.util.Scanner;

public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Any two digit number or above : ");
		int num=sc.nextInt(); 
		int num1;
		int sum=0;

			while(num>0) {
				num1=num%10;
				sum=sum+num1;
				num=num/10;
				
		}
			System.out.println("The sum, of the digit of the integer is : " +  sum);
			sc.close();
			}
			
	}


