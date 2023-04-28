package collections;
import java.util.*;
public class VectorList {
    public static void main(String args[]) {  
        //Create a vector  
        Vector<String> vec = new Vector<String>();  
        //Adding elements using add() method of List  
        vec.add("Tiger");    
         System.out.println(vec.capacity()); 
        System.out.println("Elements are: "+vec);  
     }  
}
