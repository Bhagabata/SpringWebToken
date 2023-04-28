package PracticePrblm;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter some words : ");
String word=sc.nextLine();
int len;
int spaces =0;
int numbers=0;
int others=0;
int letters=0;
 len=word.length();
 for(int i=0;i<len;i++){
	 char ch=word.charAt(i);
	 if(Character.isLetter(ch)){
		 letters++;
	 }
	 else if(Character.isDigit(ch)){
		 numbers++;
	 }
	 else if(Character.isSpace(ch)){
		 spaces++;
	 }
	 else
		others++;
	 }
	 System.out.println("Count : " + numbers);
	 System.out.println("letters : " + letters);
	 System.out.println("spaces : " + spaces);
	 System.out.println("Others : " + others);
 }
 
 
 

}
