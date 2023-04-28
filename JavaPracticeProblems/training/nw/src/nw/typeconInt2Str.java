package nw;

import java.util.Scanner;

public class typeconInt2Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Take input from the user
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // ask users to enter the number
        System.out.println("Enter the integer value: ");
        int num=sc.nextInt();
      
       String data = String.valueOf(num);
       System.out.println("The string value is: " + data);
	}

}
