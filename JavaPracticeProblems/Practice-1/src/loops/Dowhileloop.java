package loops;

import java.util.Scanner;

public class Dowhileloop {

	public static void main(String[] args) {
		System.out.println("Enter a Number :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1;
		do {
			System.out.print(i);
			i++;
		}
		while(i<=n);

	}

}
