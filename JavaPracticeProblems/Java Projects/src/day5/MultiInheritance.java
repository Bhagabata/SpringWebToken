package day5;
interface srihari{
	void vishnu();
}
interface harivishnu{
	void vishnu1();
}
class sriharivishnu implements srihari,harivishnu{
	public void vishnu() {
		System.out.println("hello");
	}
	public void vishnu1() {
		System.out.println("hello");
	}
	
}
public class MultiInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sriharivishnu obj =new sriharivishnu();
obj.vishnu();
obj.vishnu1();
	}

}
