package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
  
		File f=new File("C:\\Multithread.txt");
		Scanner sc =new Scanner(f);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		  
	}

}
