package day5;
class animal{
	void eat() {
		System.out.println("A: animal eating behaviours are like human beings.");
	}
	void sleep() {
		System.out.println("A: Animals sleep considering grass as their bed");
	}
}
class bird{
	void eat() {
		System.out.println("Bird: Different birds eat depending on their need and habitat");
	}
	void sleep() {
		System.out.println("Bird: Most of the birds sleep in their nest");
	}
}
class fly extends bird{
	void fly(){
		System.out.println("Bird: Birds show a special characteristics of flying in the open sky");
	}
}

public class Prblm3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 animal ox =new animal();
	 fly crow =new fly();
	 ox.eat();
	 ox.sleep();
	 crow.sleep();
	 crow.fly();
	 crow.eat();
	 
	 
		}

}
