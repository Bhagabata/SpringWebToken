package day7;
abstract class bike{
	abstract void run();
	abstract void sound();
}
 class b extends bike{
 void run() {
		System.out.println("running");
	}

 void sound() {
		System.out.println("sounding");
	}

}


public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();
obj.run();
obj.sound();
	}

}
