package loops;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {

		System.out.println("Enter Limit : ");
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt();
		for( int i=0; i<s; i++) {
			System.out.print(i);
			}
    System.out.println();
	}

}
