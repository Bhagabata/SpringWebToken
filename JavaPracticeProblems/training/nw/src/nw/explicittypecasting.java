package nw;

import java.util.Scanner;

public class explicittypecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Take input from the user
        // create an object of Scanner class
        Scanner sc = new Scanner(System.in);
        // ask users to enter the number
        System.out.println("Enter the number: ");
        double d=sc.nextDouble();
        // narrowing or explicit type conversion 
        float f=(float)d;
        //explicit type casting 
        long l = (long)d; 
        //explicit type casting  
        int i = (int)l; 
         
        System.out.println("After narrowing or explicit type conversion values are: ");
        System.out.println("Double value: "+d); 
        //fractional part lost
        System.out.println("Float value: "+f);
        System.out.println("Long value: "+l);  
        //fractional part lost 
        System.out.println("Int value: "+i);  
	}

}
