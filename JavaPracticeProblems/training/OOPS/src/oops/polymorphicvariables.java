package oops;
class ProgrammingLanguage {
	  public void display() {
	    System.out.println("I am Programming Language.");
	  }
	}

class testing extends ProgrammingLanguage {
	  //@Override
	  public void display() {
	    System.out.println("I am Object-Oriented Programming Language.");
	  }
	}
public class polymorphicvariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declare an object variable
	    ProgrammingLanguage pl;

	    // create object of ProgrammingLanguage
	    pl = new ProgrammingLanguage();
	    pl.display();

	    // create object of testing class
	    pl = new testing();
	    pl.display();
	}

}
