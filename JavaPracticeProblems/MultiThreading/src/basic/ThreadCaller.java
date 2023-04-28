package basic;

public class ThreadCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ChildThread obj=new ChildThread();
  obj.run();
  
  
  for (int i = 0; i <=5; i++) {
	  System.out.println("Main Thread "+i);
	
}
	}

}
