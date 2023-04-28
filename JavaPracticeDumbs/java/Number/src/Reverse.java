import java.util.Scanner;

public class Reverse {
	public static void main(String[]args) {
		String a;
		String b;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number a: ");
		int num = sc.nextInt();
		System.out.println("Enter your Second number b: ");
		int num1 = sc.nextInt();
		
		
		int t=num;
		num=num1;
		num1=t;
		
		System.out.println("After swapping A and B is " + num + num1);
		
		
	}

}
