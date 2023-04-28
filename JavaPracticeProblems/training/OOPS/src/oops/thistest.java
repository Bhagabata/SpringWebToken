package oops;

public class thistest {
	int instVar;

	thistest(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thistest obj = new thistest(8);
	        System.out.println("object reference = " + obj);
	}

}
