import java.util.Scanner;

public class NUmber {
	

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		 
			
		 StringBuffer sb = new StringBuffer(String.valueOf(num));
		 StringBuffer rev=sb.reverse();
		 
		 System.out.println("Reverse number is: "+ rev);

	}

}
