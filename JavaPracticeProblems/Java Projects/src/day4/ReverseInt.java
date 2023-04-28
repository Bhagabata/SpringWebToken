package day4;
import java.util.Scanner;

public class ReverseInt {
	int n;
	public void names() {
		n=90;
		System.out.println(n);
	}

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter Any two digit number or above : ");
	int num=sc.nextInt(); 
	int num1;
	int sum=0;
		while(num!=0) {
			num1=num%10;   
			sum=sum*10+num1;
			num=num/10;
			
	}
		System.out.println("The Reverse of the integer is : " +  sum);
		sc.close();
		}
		
		
}


