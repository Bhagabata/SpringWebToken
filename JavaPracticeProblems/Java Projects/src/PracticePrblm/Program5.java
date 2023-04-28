package PracticePrblm;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
  Scanner sc=new Scanner(System.in);
  
 System.out.println("Enter your name : ");
 String rev = sc.nextLine();
   for(int i=rev.length()-1;i>=0;i--){
	   char ch=rev.charAt(i);
	   System.out.print(ch);
   }
	}

}
