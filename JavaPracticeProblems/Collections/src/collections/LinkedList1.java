package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	 public static void main(String args[]){  
		  
		  LinkedList<String> ab=new LinkedList<String>();     //Creating Linkedlist
		  ab.add("Rajasekhar");                               //Adding object in Linkedlist  
		  ab.add("Suraj");  
		  ab.add("Mounika");  
		  ab.add("Nikhil");
		  ab.addAll(2, ab);
		  System.out.println(ab.size());
		  
		 
		  System.out.println(ab);                            //Printing the Linkedlist objec
		 }  
}
