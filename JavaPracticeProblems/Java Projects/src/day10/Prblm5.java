/*5.
Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses
namely 'Undergraduate' and 'Postgraduate' each having a method with the same name
that prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by 
creating an object of each of the three classes.*/



package day10;
class Degree{
	void getDegree() {
		System.out.println("I Got Degree");
	}
}
class Undergraduate{
	void getDegree() {
		System.out.println("I am Undergraduate");
	}
}
class Postgraduate{
	void getDegree() {
		System.out.println("I am Postgraduate");
	}
}
public class Prblm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Degree obj1=new Degree();
obj1.getDegree();
Undergraduate obj2=new Undergraduate();
obj2.getDegree();
Postgraduate obj3=new Postgraduate();
obj3.getDegree();
	}

}
