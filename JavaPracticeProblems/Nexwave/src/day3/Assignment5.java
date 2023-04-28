package day3;
import java.util.*;

public class Assignment5 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String  name = sc.nextLine();
		for(int i = name.length()-1; i>= 0; i--) {
			char ch = name.charAt(i);
			System.out.print(ch);
		}
	}
}
