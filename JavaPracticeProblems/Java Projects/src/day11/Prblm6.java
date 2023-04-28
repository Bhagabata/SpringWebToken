/*6. using Exception Handling: Throw & Used Defined Exception 	

Write a Program to take care of Number Format Exception if user enters values other than integer for calculating average marks of 2 students. 
The name of the students and marks in 3 subjects are taken from the user while executing the program. 
In the same Program write your own Exception classes to take care of Negative values and values out of range (i.e. other than in the range of 0-100)

*/


package day11;

import java.util.Scanner;

public class Prblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter your name : ");
			String name1=sc.nextLine();
			System.out.println("Enter your marks in subject 1 : ");
			int subject1=sc.nextInt();
			System.out.println("Enter your marks in subject 2 : ");
			int subject2=sc.nextInt();
			System.out.println("Enter your marks in subject 3 : ");
			int subject3=sc.nextInt();
	
int total= (subject1+subject2+subject3);
System.out.println("The total Marks of "+name1+" is "+total);

				sc.nextLine();
				System.out.println("Enter your name : ");
				String name2=sc.nextLine();
				System.out.println("Enter your marks in subject 1 : ");
				int subject11=sc.nextInt();
				System.out.println("Enter your marks in subject 2 : ");
				int subject12=sc.nextInt();
				System.out.println("Enter your marks in subject 3 : ");
				int subject13=sc.nextInt();
		
	int total1= (subject11+subject12+subject13);
	System.out.println("The total Marks of "+name2+" is "+total1);
	
	
	if (subject1 < 0) throw new NumberFormatException("negative Error");
	if (subject1 > 100) throw new NumberFormatException();
	
	if (subject2 < 0) throw new NumberFormatException("negative Error");
	if (subject2 > 100) throw new NumberFormatException();
	
	if (subject3 < 0) throw new NumberFormatException("negative Error");
	if (subject3 > 100) throw new NumberFormatException();
	
	if (subject11 < 0) throw new NumberFormatException("negative Error");
	if (subject11 > 100) throw new NumberFormatException();
	
	if (subject12 < 0) throw new NumberFormatException("negative Error");
	if (subject12 > 100) throw new NumberFormatException();
	
	if (subject13 < 0) throw new NumberFormatException("negative Error");
	if (subject13 > 100) throw new NumberFormatException();
	int average=(total+total1)/2;
	System.out.println("The average of this two students is "+average);
	}
	catch (ArithmeticException e) {
		System.out.println(e);
	}
	
		

}}



