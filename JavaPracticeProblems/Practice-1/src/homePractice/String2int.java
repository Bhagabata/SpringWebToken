package homePractice;

import java.util.Scanner;

public class String2int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age : ");
		String ages=sc.nextLine();
		
		int names=Integer.parseInt(ages);// this is one way
		int namess=Integer.valueOf(ages);// this is another way!!!
		
		System.out.println(names);
		sc.close();

	}

}
