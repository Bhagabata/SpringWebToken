package PracticePrblm;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter number 1: ");
    int num1=sc.nextInt();
    System.out.println("Enter number 2: ");
    int num2=sc.nextInt();
    int sum= num1+num2;
    int sub= num1-num2;
    int mul= num1*num2;
    int div= num1/num2;
  System.out.println("Addition of two number is : "+ sum);
  System.out.println("Substraction of two number is : "+ sub);
  System.out.println("Multiple of two number is : "+ mul);
  System.out.println("Division or Average of two number is : "+ div);
    sc.close();
    
    
    
	}

}
