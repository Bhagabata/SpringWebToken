package PracticePrblm;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number : ");
  int a =sc.nextInt();
  System.out.println("Enter Second number : ");
  int b=sc.nextInt();
  
  if(a!=b){
	  System.out.println(a + " != " + b);
  }
  else{
	  System.out.println(a + " == " + b);
  }
  if(a<b){
	  System.out.println(a +  " < " + b);
  }
  else{
	  System.out.println(a +  " > " + b);
  }
  if(a<=b){
	  System.out.println(a +  " <= " + b);
  }
  else{
	  System.out.println(a +  " >= " + b);
  }
  
  sc.close();
  
  
  
  
	  }
  }
	


