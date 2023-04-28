package operators;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome";
	    boolean result;

	    // checks if str is an instance of
	    // the String class
	    result = str instanceof String;
	    System.out.println("Is str an object of String? " + result);
	}

}
