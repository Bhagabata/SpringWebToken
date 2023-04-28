package collections;

import java.util.LinkedList;

public class LinkedListEx {
	public static void main(String[] args) {
		
	
	LinkedList<String> ab=new LinkedList<String>();     //Creating Linkedlist
	  ab.add("Apple");                               //Adding object in Linkedlist  
	  ab.add("Orange");  
	  ab.add("Banana");  
	  ab.add("Guava");
	  
	  
		LinkedList<String> ab1=new LinkedList<String>();     //Creating Linkedlist
		  ab1.add("Apple");                               //Adding object in Linkedlist  
		  ab1.add("dcsd");  
		  ab1.add("Orange");  
		  ab1.add("Gudcvsd");
		  ab1.add("Guava");
		 
		  
		  
	  
		  LinkedList<String> ab3=new LinkedList<String>();
	  
		  for (String e1 : ab)
	             ab3.add(ab1.contains(e1) ? "Yes" : "No");
		  System.out.println(ab3);
	  
	  
	  
	  
	  
}
}