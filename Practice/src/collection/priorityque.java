package collection;

import java.util.PriorityQueue;

public class priorityque {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> P = new PriorityQueue<>();
		
		P.offer(25);
		P.offer(20);
		P.offer(30);
		P.offer(5);
		
		System.out.println("print queue");
		System.out.println(P);
		System.out.println();
		
		System.out.println("remove first item");
		System.out.println(P.poll());
		System.out.println(P);
		System.out.println();
		
		System.out.println("check first item in priority");
		System.out.println(P.peek());
	    System.out.println();
	    
	    System.out.println("check if queue is empty");
	    System.out.println(P.isEmpty());
	    System.out.println();
	    
	    System.out.println("to clear the queue");
	    P.clear();
	    System.out.println(P);
	    ;
		
		
	}

	
	
	
}
