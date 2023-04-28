package homePractice;

import java.util.Scanner;

public class Int2string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Age : ");
    int ages = sc.nextInt();
    
    String names=String.valueOf(ages); // this is one way
    String namess=Integer.toString(ages); // this is another way!!
    System.out.println(names);
    sc.close();
	}

}
