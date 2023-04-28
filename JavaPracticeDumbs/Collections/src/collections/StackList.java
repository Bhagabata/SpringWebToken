package collections;

import java.util.*;

public class StackList {
	public static void main(String[] args)   
	{  
	                             
	Stack<Integer> stk= new Stack<>(); //creating an instance of Stack class  
	 
	boolean result = stk.empty();  // checking stack is empty or not 
	System.out.println("Is the stack empty? " + result);  
	
	stk.push(78);  // pushing elements into stack
	stk.push(113);  
	stk.push(90);  
	stk.push(120);
	System.out.println(stk.capacity());
	//stk.pop();    //popping elements into stack
	//stk.peek(); // peeking elements into stack
	int number=stk.search(90);
	System.out.println(number);// find the index
	 
	System.out.println("Elements in Stack: " + stk);  //prints elements of the stack 
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);  
	}  
}
