package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class ListDeque_for_loop_Iteration {
	public static void main(String[] args) {
		
	Queue<String> queueNames = new LinkedList<>();
	 
	queueNames.add("Dale");
	queueNames.add("Bob");
	queueNames.add("Frank");
	queueNames.add("Alice");
	queueNames.add("Eric");
	queueNames.add("Cole");
	queueNames.add("John");
	 
	 
	for (String name : queueNames) {
	    System.out.println(name);
	}
}
}
