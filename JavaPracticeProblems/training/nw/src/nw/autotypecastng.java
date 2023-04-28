package nw;

import java.util.Scanner;

public class autotypecastng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take input from the user
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // ask users to enter the number
        System.out.println("Enter the number: ");
        int i=sc.nextInt();
        // widening or automatic type conversion 
        long l = i;  
        float f = l;  
        double d= f;
        System.out.println("After widening or automatic type conversion values are: ");
        System.out.println("Int value "+i); 
        System.out.println("Long value "+l); 
        System.out.println("Float value "+f); 
        System.out.println("Double value "+d); 
	}

}
