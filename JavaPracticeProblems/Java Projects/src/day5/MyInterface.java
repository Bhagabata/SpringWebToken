package day5;
interface MInterface{
	public void method1();
	public void method();
}
class Demo implements MInterface{ // You didn't create this only thats why u can't get output!!!
	public void method1() {
		System.out.println("implementation of method 1");
	}
	public void method() {
		System.out.println("implementation of method 2");
	}
}
public class MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo obj =new Demo();
obj.method1();
obj.method();
	}

}
