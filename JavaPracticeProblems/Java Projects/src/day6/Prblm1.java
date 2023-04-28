package day6;
interface a{
	void print();
}
interface b1 extends a{
	void print3();
}
interface c1{
	void print4();
}

class b implements b1,c1{
	
	public void print() {
		System.out.println("helloo1");
	}
	public void print3() {
		System.out.println("Heloo3");
	}
	public void print4() {
		System.out.println("hello4");
	}
}
public class Prblm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  b obj=new b();
  obj.print();
  obj.print3();
  obj.print4();
	}

}





