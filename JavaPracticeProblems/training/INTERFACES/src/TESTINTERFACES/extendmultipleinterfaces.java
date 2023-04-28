package TESTINTERFACES;

/*
 * Interface extends multiple interfaces java 
 */

interface A {
	void fa();
}
interface C {
	void fc();
}

interface B extends A,C {
	void fb();
}

//Class will implement methods from all interfaces
//As interface B is also extending interface A and C
class XYZ implements B {

	@Override
	public void fa() {
		System.out.println("XYZ:fa");
	}

	@Override
	public void fb() {
		System.out.println("XYZ:fb");
	}

	@Override
	public void fc() {
		System.out.println("XYZ:fc");
		
	}

}

public class extendmultipleinterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj = new XYZ();
		obj.fa();
		obj.fb();
		obj.fc();
	}

}
