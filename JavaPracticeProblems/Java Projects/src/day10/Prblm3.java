/*3.
Create a class to print the area of a square and a rectangle. The class has two methods with the same name 
but different number of parameters. The method for printing area of rectangle has two parameters which are 
length and breadth respetively while the other method for printing area of square has one parameter which is side of square.
*/



package day10;
class Rectangle{
	void rectangle(int length, int breadth) {
		System.out.println("Area of Rectangle is "+(length*breadth));
	}
	void Square(int area) {
		System.out.println("Area of Square "+(area*area));
	}
}

public class Prblm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Rectangle obj1=new Rectangle();
 obj1.rectangle(20, 40);
 obj1.Square(12);
	}

}
