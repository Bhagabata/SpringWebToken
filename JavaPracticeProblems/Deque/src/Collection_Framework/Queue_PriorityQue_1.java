package Collection_Framework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQue_1 {
	public static void main(String[] args) {
		Queue<String> queueNames = new PriorityQueue<>();
		 
		queueNames.add("Dale");
		queueNames.add("Bob");
		queueNames.add("Frank");
		queueNames.add("Alice");
		queueNames.add("Eric");
		queueNames.add("Cole");
		queueNames.add("John");
		 
		queueNames.forEach(n -> System.out.println(n));
		System.out.println(queueNames);
		
		PriorityQueue<Integer> queueNumber = new PriorityQueue<Integer>();
		 
		queueNumber.add(3);
		queueNumber.add(1);
		queueNumber.add(2);
		queueNumber.add(4);
		queueNumber.add(7);
		queueNumber.add(9);
		queueNumber.add(5);
		queueNumber.forEach(num -> System.out.println(num));
		
		System.out.println("***********************************");
		 PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		    pq.add(2);
		    pq.add(4);
		    System.out.println(pq);
		    pq.offer(1);
		    System.out.println(pq);
		    pq.add(3);
		    System.out.println(pq);
		}
	}

