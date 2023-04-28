import java.util.*;

public class String {
 public static void main(String[]args) {
	 Scanner scan =new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num=scan.nextInt();
	 
	
	 StringBuffer sb = new StringBuffer(String.valueOf());
	 StringBuffer rev=sb.reverse();
	 
	 System.out.println("Reverse number is: "+ rev);
	 
}
	 

}
