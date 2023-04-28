package loops;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int i=20;
		while(i<=n) {
      System.out.println(i);
      i++;
	}
	}
}
