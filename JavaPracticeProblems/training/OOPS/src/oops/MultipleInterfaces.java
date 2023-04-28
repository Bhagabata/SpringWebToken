package oops;

interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	// DemoClass "implements" FirstInterface and SecondInterface
	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text..");
	  }
	  public void myOtherMethod() {
	    System.out.println("Some other text...");
	  }
	}
	
public class MultipleInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  DemoClass myObj = new DemoClass();
		    myObj.myMethod();
		    myObj.myOtherMethod();
	}

}
