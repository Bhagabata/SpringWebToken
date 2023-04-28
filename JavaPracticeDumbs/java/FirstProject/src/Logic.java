import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		System.out.println("i Guys");
        int row;
        int column =5;
        
        System.out.println("Enter a number of row you want ?");
        Scanner scan = new Scanner(System.in);
        row=scan.nextInt();
        
        for(int count=1 ; count <=row ; count++){ 
        	for(int space = 0; space < row-count ; space++) {
        		System.out.print(" ");
        	}
        	for(int counted=count ; counted >=1 ; counted-- ) {     //column
        		System.out.print(counted + " ");
        	}
        	
        	for(int counted=5 ; counted <= count ; counted++ ) {     //column
        		System.out.print(counted + " ");
        	}
        	System.out.println();
        }
     
	 
	}
	

}
