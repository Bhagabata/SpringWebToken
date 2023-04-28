package oops;
class Person {

	  // private field
	  private int age;

	  // getter method
	  public int getAge() {
	    return age;
	  }

	  // setter method
	  public void setAge(int age) {
	    this.age = age;
	  }
	}
public class datahidingusngprivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // create an object of Person
	    Person p1 = new Person();

	    // change age using setter
	    p1.setAge(24);
	    
	 // error: age has private access in Person
	    //p1.age = 24;
	    // access age using getter
	    System.out.println("My age is " + p1.getAge());
	}

}
