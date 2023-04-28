package collections;
import java.util.*;
public class AbstractionList {
	public static void main(String args[]) 
    { 
		
       
        AbstractList<String> list = new LinkedList<String>();  // Creating an empty AbstractList 
  
         
        list.add("Badam"); // Use add() method to add elements in the list
        list.add("Good for"); 
        list.add("Health"); 
        list.add("10"); 
        list.add("20");
        list.add("20");
       // String last=list.remove(2);
       
         
        System.out.println("AbstractList:" + list); // Displaying the AbstractList
    } 
}
