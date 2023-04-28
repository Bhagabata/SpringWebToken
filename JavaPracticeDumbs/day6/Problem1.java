package day6;

import java.util.Scanner;

public class Problem1 {
	
//	static	int a=1;
//    static int b=2;
//    static int c=3;
//    static int d=4;
//    static int e=5;
	
	      // static int age1=10;
	     //  static double height1=5.0;
	    //   static double weight1=65.0;
	Problem1(int a, int b,int c,int d,int e){
		System.out.println("N        10'N         100'N       1000'N");
		System.out.print("1 "+"         " +(a*10));
		System.out.print("         " +(a*100));
		System.out.println("         " +(a*1000));
		
		System.out.print("2 "+"         " +(b*10));
		System.out.print("         " +(b*100));
		System.out.println("         " +(b*1000));
		
		System.out.print("3 "+"         " +(c*10));
		System.out.print("         " +(c*100));
		System.out.println("         " +(c*1000));
		
		System.out.print("4 "+"         " +(d*10));
		System.out.print("         " +(d*100));
		System.out.println("         " +(d*1000));
		
		System.out.print("5 "+"         " +(e*10));
		System.out.print("         " +(e*100));
		System.out.println("         " +(e*1000));
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int d =sc.nextInt();
		int e =sc.nextInt();
   Problem1 obj=new Problem1(a,b,c,d,e);
	}

}
