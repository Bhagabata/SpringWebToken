package day6;

import java.util.Scanner;

public class problem1UsingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any number : ");
		int abc =sc.nextInt();
System.out.println("N \t 10'N \t 100'N \t 1000'N");
for(int i=1;i<abc;i++) {
	System.out.println(i+"\t" + (i*10) +"\t"+(i*100)+"\t"+(i*1000));
}
	}

}
