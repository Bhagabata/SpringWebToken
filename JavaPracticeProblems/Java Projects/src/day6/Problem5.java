package day6;

class Dog{
	void animal() {
		System.out.println("Animal Shout!!");
	}
}
class Cat extends Dog{
	void cat() {
		System.out.println("Meow! Meow!");
	}
}
class Animal extends Dog{
	void animal() {
		System.out.println("BOW!! BOW!!");
	}

}
public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Animal obj1=new Animal();
   Cat obj2 =new Cat();
  obj2.animal();
  obj1.animal();
  obj2.cat();
   
	}

}

