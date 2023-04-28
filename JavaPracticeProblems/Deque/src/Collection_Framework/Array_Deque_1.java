package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Deque_1 {

	    public static void main(String[] args) {
	        // Creating Deque using the ArrayDeque class
	        Deque<Integer> numbers = new ArrayDeque<>();

	        // add elements to the Deque
	        numbers.offer(1);
	        numbers.offerLast(2);
	        numbers.offerFirst(3);
	        System.out.println("Deque: " + numbers);
	        System.out.println("*********************************************");

	        // Access elements of the Deque
	        int firstElement = numbers.peekFirst();
	        System.out.println("First Element: " + firstElement);

	        int lastElement = numbers.peekLast();
	        System.out.println("Last Element: " + lastElement);
	        System.out.println("*********************************************");

	        // Remove elements from the Deque
	        int removedNumber1 = numbers.pollFirst();
	        System.out.println("Removed First Element: " + removedNumber1);

	        int removedNumber2 = numbers.pollLast();
	        System.out.println("Removed Last Element: " + removedNumber2);
	        System.out.println("*********************************************");

	        System.out.println("Updated Deque: " + numbers);
	    }
	}


