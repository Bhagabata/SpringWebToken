package day3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name : ");
			String  name = sc.nextLine();
			String rstr="";
			for(int i = 0; i<name.length(); i++) {
				char ch = name.charAt(i);
				rstr=ch+rstr;// this is another reverse method of java!!
				
			}
			System.out.print(rstr);
		}
	
	}


