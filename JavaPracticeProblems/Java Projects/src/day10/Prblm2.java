/*2.
Create a class to print an integer and a character with two methods having the same name but different sequence of the 
integer and the character parameters.For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form (char c, int n).
*/



package day10;
class Print{
	void method1(int n,char c) {
		System.out.println("The integer is "+n+" The Character is "+c);
	}
	void method2(char c,int n) {
		System.out.println("The Character is "+c+" The Integer is "+n);
	}
}

public class Prblm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Print obj1=new Print();
 obj1.method1(25,'n');
 obj1.method2('n', 25);
	}

}
