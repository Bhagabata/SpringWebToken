package day3;

class Animal{
	void eat(){
		System.out.println("eating");
	}
}
	class Dog extends Animal{
		
		int nums(){
			int num=2;
			System.out.println(num);
		return num;
		}
	}


public class Inheritance {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog sc=new Dog();
		sc.eat();
		int numk= sc.nums();
  System.out.println(numk);
	}

}
