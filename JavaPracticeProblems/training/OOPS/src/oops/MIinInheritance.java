package oops;
//methodoverriding in inheritance
public class MIinInheritance {
	class Animal {

		  // method in the superclass
		  public void eat() {
		    System.out.println("I can eat");
		  }
		}

		// Dog inherits Animal
		class Dog1 extends Animal {

		  // overriding the eat() method
		 // @Override
		  public void eat() {
		    System.out.println("I eat dog food");
		  }

		  // new method in subclass
		  public void bark() {
		    System.out.println("I can bark");
		  }
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // create an object of the subclass
	    Dog labrador = new Dog();

	    // call the eat() method
	    labrador.eat();
	    labrador.bark();
	}

}
