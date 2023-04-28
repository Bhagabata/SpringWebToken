package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ArrayDeque_4 {
	public static void main(String[] args) {
		
	Deque<String> queueNames = new ArrayDeque<>();
	 
	queueNames.offerLast("Katherine");
	queueNames.offer("Bob");
	 
	queueNames.addFirst("Jim");
	queueNames.addLast("Tom");
	 
	System.out.println(queueNames);
	}
}

