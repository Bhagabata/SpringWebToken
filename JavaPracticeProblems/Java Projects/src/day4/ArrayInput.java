package day4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter any number : ");
		  int ab[]=new int[4];
		  int count=0;
		  while(count<4) {
		  	 ab[count]=sc.nextInt();
		  	count++;
		  }
		  for(int i=0;i<ab.length;i++) {
			  System.out.println("The Array will be : ");
		  }
		  for(int uk:ab) {
			  System.out.println(uk);
		  }
  }
} 