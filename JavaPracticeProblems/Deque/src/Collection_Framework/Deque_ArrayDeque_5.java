package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ArrayDeque_5 {
	public static void main(String[] args) {
		Deque<String> queueCustomers = new ArrayDeque<>();
		
	 
	queueCustomers.offer("Bill");
	queueCustomers.offer("Kim");
	queueCustomers.offer("Lee");
	queueCustomers.offer("Peter");
	queueCustomers.offer("Sam");
	 
	System.out.println("Queue before: " + queueCustomers);
	System.out.println("First comes: " + queueCustomers.pollFirst());
	System.out.println("Last comes: " + queueCustomers.pollLast());
	System.out.println("Queue after: " + queueCustomers);
}
}
