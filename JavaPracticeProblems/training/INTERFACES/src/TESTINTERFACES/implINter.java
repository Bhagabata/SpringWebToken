package TESTINTERFACES;

interface Polygon {
	  void getArea(int length, int breadth);
	}

	// implement the Polygon interface
	class Rectangle implements Polygon {

	  // implementation of abstract method
	  public void getArea(int length, int breadth) {
	    System.out.println("The area of the rectangle is " + (length * breadth));
	  }
	}

	
public class implINter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
	    r1.getArea(5, 6);
	}

}
