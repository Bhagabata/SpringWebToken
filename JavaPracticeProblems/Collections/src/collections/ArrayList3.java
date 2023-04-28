package collections;

import java.util.ArrayList;
import java.util.Iterator;

/*
1.Create ArrayList with list of all possible vegetables using ArrayList() constructor and you perform below actions

Part-1:

to check if an ArrayList is empty using the isEmpty() method.
to find the size of an ArrayList using the size() method.
to access the element at a particular index in an ArrayList using the get() method.
to modify the element at a particular index in an ArrayList using the set() method.*/
public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(null);
		a.add("sonu");
		a.add("sed");
		a.add("Ram");
//		System.out.println(a.isEmpty());
//		System.out.println(a.size());
//		System.out.println(a.get(2));
//		System.out.println(a.set(3, "Sita"));
//		System.out.println(a);
		Iterator iterator = a.iterator();  
		while (iterator.hasNext())  
		{  
		Object a1=iterator.next();
		System.out.println(a1);
		  
		} 
		/*Part-2:

Implement List Iterations using :

Iterate using for loop with index

Iterate using simple for-each loop


Iterate using an iterator() iterator(),

Iterate using a listIterator() to traverse in both directions  */
		/*
		 * for(int i=0;i<a.size();i++) { System.out.println(a);//Iterate using for loop
		 * with index }
		 */
//	for (Object a1 : a) {
//		System.out.println(a1);
//	}
		//Iterator a1=new Iterator();
		
	}

}
