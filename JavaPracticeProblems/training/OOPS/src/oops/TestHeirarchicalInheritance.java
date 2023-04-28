package oops;

class Animal1{  
void eat1(){System.out.println("eating...");}  
}  
class Dog1 extends Animal1{  
void bark1(){System.out.println("barking...");}  
}  
class Cat1 extends Animal1{  
void meow1(){System.out.println("meowing...");}  
}  

public class TestHeirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 c=new Cat1();  
		c.meow1();  
		c.eat1();  
		//c.bark();//C.T.Error  
	}

}
