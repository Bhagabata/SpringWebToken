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
		System.out.println("N\t10'N\t100'N\t1000'N");
		System.out.print("1 "+"\t" +(a*10));
		System.out.print("\t" +(a*100));
		System.out.println("\t" +(a*1000));
		
		System.out.print("2 "+"\t" +(b*10));
		System.out.print("\t" +(b*100));
		System.out.println("\t" +(b*1000));
		
		System.out.print("3 "+"\t" +(c*10));
		System.out.print("\t" +(c*100));
		System.out.println("\t" +(c*1000));
		
		System.out.print("4 "+"\t" +(d*10));
		System.out.print("\t" +(d*100));
		System.out.println("\t" +(d*1000));
		
		System.out.print("5 "+"\t" +(e*10));
		System.out.print("\t" +(e*100));
		System.out.println("\t" +(e*1000));
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



