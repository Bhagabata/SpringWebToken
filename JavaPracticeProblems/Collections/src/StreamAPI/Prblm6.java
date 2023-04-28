package StreamAPI;

import java.util.stream.*;  
public class Prblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Stream.iterate(1, element->element+1)  
	        .filter(element->element%5==0)  
	        .limit(5)  
	        .forEach(System.out::println);  
	}

}
