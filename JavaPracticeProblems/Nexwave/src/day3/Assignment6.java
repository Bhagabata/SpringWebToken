package day3;
//
//class WhatIsIt{
//	int letCounter = 0;
//	int isLetter(char ch) {
//		if(Character.isLetter(ch)) {
//			letCounter++;
//		}
//		return letCounter;
//	}
//}

public class Assignment6 {
	public static void main(String[] args) {
		String input = "The string is :  hi there, welcome to nexwave 21092022 !!!!!!";
		
		int letCounter = 0;
		int numCounter = 0;
		int spaceCounter = 0;
		int otherCounter = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isLetter(ch)) {
				letCounter++;
			}
			else if(Character.isDigit(ch)) {
				numCounter++;
			}else if(ch == ' ') {
				spaceCounter++;
			}
			else{
				otherCounter++;
			}
		}
		
		System.out.println(letCounter);
		System.out.println(numCounter);
		System.out.println(spaceCounter);
		System.out.println(otherCounter);
	}
}
