package prime;
import java.util.*;
public class Contructor {
	static void marks(int mark) {  //static method with parameterized
		if(mark>=60) {
			System.out.println("You're Elligible");
		}
		else {
			System.out.println("You're not elligible");
		}
	}
	public static void main(String[]args) {
		marks(60);
	}
}