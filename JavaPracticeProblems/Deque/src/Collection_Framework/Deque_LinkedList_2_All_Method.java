package Collection_Framework;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deque_LinkedList_2_All_Method {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();

		// We can add elements to the queue in various ways
		deque.add(1); // add to tail
		deque.addLast(3);
		deque.push(4); // add to head
		deque.offer(5);
		deque.offerLast(7);
		deque.addFirst(2);
		deque.offerFirst(6);
		deque.addFirst(8);

		System.out.println("Deque elements: ");
		System.out.println(deque);
		
		System.out.println("*********************************************");
		// Iterate through the queue elements.
		System.out.println("Iterating over Deque with Standard Iterator");
		Iterator<Integer> iterator1 = deque.iterator();
		while (iterator1.hasNext()) {
			System.out.println("\t" + iterator1.next());
		}
		System.out.println("*********************************************");

		// Reverse order iterator
		Iterator<Integer> iterator2 = deque.descendingIterator();
		System.out.println("Iterating over Deque with Reverse Iterator");
		while (iterator2.hasNext()) {
			System.out.println("\t" + iterator2.next());
		}
		System.out.println("*********************************************");

		// Peek returns the head, without deleting it from the deque
		System.out.println("Peek into the Deque = " + deque.peek());
		System.out.println("After peek: \n");
		System.out.println(deque);
		System.out.println("*********************************************");

		// Pop returns the head, and removes it from the deque
		System.out.println("Pop from Deque = " + deque.pop());
		System.out.println("After pop: \n");
		System.out.println(deque);
		System.out.println("*********************************************");

		// We can check if a specific element exists in the deque
		System.out.println("Contains 3: " + deque.contains(3));
		System.out.println("*********************************************");
		// We can remove the first / last element.
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing first and last: " + deque);
	}

}
