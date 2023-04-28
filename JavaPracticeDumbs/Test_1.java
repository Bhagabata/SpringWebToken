package practiceday10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*1.  create a new array list, add some colors (string) and print out the collection.
2.   iterate through all elements in a array list.
3.  insert an element in the array list at the first position
4.   update specific array element by given element.
5.   remove the third element from a array list
6.  search an element in a array list.
7.    sort a given array list.
8.  copy one array list in another.
9.  reverse elements in a array list.
10.  extract a portion of a array list.
11. of swap two elements in an array list
12.   join two array lists.
13.   empty an array list.
14.   increase the size of an array list.
15.  replace the second element of a ArrayList with the specified element.*/

public class Test_1 {
	public static void main(String[] args) {

		// 1. create a new array list, add some colors (string) and print out the
		// collection.

		ArrayList<String> l = new ArrayList<String>();

		l.add("Purple");
		l.add("Red");
		l.add("Brown");
		l.add("Yellow");
		l.add("Green");

		System.out.println(l);

		System.out.println("..............................................................");

		// 2. iterate through all elements in a array list.

		Iterator<String> itr = l.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		// 3. insert an element in the array list at the first position
		System.out.println("..............................................................");
		l.add(0, "Black");

//		4.   update specific array element by given element.
		System.out.println("Updated array List = " + l);
		System.out.println("..............................................................");

//		5.   remove the third element from a array list

		l.remove(2);
		System.out.println("removed 3rd array List element = " + l);
		System.out.println("..............................................................");

//		6.  search an element in a array list.
		System.out.println(l.contains("Green"));
		System.out.println("..............................................................");

//		7.    sort a given array list.
		Collections.sort(l);
		System.out.println("Sorted = " + l);
		System.out.println("..............................................................");

//		8.  copy one array list in another.
		ArrayList<String> l1 = new ArrayList<String>(l);

		System.out.println("Copied ArrayList = " + l1);
		System.out.println("..............................................................");

//		9.  reverse elements in a array list.
		Collections.reverse(l1);
		System.out.println("Reversed  = " + l1);
		System.out.println("..............................................................");

//		10.  extract a portion of a array list.

		System.out.println("extracted position 3 = " + l.get(2));
		System.out.println("..............................................................");

//		11. of swap two elements in an array list

		Collections.swap(l1, 1, 2);
		System.out.println("swaped 2 element = " + l1);
		System.out.println("..............................................................");

//		12.   join two array lists.

		l.addAll(l1);
		System.out.println(l);
		System.out.println("..............................................................");

//		13.   empty an array list.
		l.removeAll(l);
		System.out.println("Array list is empty = " + l);
		System.out.println("..............................................................");

//		14.   increase the size of an array list.
		System.out.println("size of the array (l) = "+l.size());
		l.ensureCapacity(50);
		System.out.println("Increased the Capacity by 50.");
		System.out.println("..............................................................");
		
//		15.  replace the second element of a ArrayList with the specified element.*/
		
		Collections.swap(l1, 1, 3);
		System.out.println("replaced the 2nd element with 5th element = "+l1);
		
		System.out.println("..............................................................");


	}

}
