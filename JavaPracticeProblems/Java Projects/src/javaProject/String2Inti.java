package javaProject;

import java.util.Scanner;

public class String2Inti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String intnum = sc.nextLine();
		
		int age =Integer.parseInt(intnum);
		System.out.println(intnum);

	}

}
