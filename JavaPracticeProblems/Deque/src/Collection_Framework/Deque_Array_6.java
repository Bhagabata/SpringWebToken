package Collection_Framework;

import java.util.ArrayDeque;

public class Deque_Array_6 {
		public static void main(String[] args) {  
			ArrayDeque<String> deque=new ArrayDeque<String>();  
		    deque.offer("arvind");  
		    deque.offer("vimal");  
		    deque.add("mukul");  
		    deque.offerFirst("jai");  
		    System.out.println("After offerFirst Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
		    //deque.poll();  
		    //deque.pollFirst();//it is same as poll()  
		    deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
		}  
		}  
