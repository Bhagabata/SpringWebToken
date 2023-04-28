package TESTINTERFACES;


	interface FirstInterface {
		  public void myMethod(); // interface method
		}

		interface SecondInterface {
		  public void myOtherMethod(); // interface method
		}

	public	class multipleInter implements FirstInterface, SecondInterface {
		  public void myMethod() {
		    System.out.println("Some text..");
		  }
		  public void myOtherMethod() {
		    System.out.println("Some other text...");
		  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleInter myObj = new multipleInter();
	    myObj.myMethod();
	    myObj.myOtherMethod();
	}

}
