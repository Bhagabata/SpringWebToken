/*5. using throws  :

Write a Program with a division method who receives two integer numbers and performs the division operation. 
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
*/

package day11;

import java.util.Scanner;

public class Prblm5 {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first Integer : ");
    int div=sc.nextInt();
    System.out.println("Enter first Integer : ");
    int div1=sc.nextInt();
    Prblm5 obj=new Prblm5();
    obj.division(div, div1);
    
	}
    
    void division(int div12,int div13) {
        int divisions=div12/div13;
        
        System.out.println("The divisible of two integer is : "+divisions);
    }
	


  
		
	}


