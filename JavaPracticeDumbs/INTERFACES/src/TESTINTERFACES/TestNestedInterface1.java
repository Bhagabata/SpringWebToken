package TESTINTERFACES;

public class TestNestedInterface1 implements Showable.Message{
	
	public void msg(){System.out.println("Hello nested interface");}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Showable.Message message=new TestNestedInterface1();//upcasting here  
		  message.msg();  
	}

}
