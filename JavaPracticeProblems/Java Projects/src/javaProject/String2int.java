package javaProject;

public class String2int {
	public static void main(String []args){
	 String age ="26";
	 int nu = 29;
	 int  name=Integer.parseInt(age); // String to int conversion
	 int namess=Integer.valueOf(age); // This is also String to int
	 String neww=String.valueOf(nu); // int to string conversion
	 String newww = Integer.toString(nu); // this is also int to String conversion
	 //System.out.println( nu+2 );  // if u want to concatenate u can .
	 System.out.println( name + 2);
	}
	  
	}
