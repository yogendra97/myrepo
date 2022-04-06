package collection;

import java.util.LinkedList;


public class Linkedlist {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> Ll=new LinkedList<>();
		
		Ll.add(10);
		Ll.add(20);
		Ll.add(30);
		Ll.add(40);
		
		System.out.println(Ll);
		
		System.out.println(Ll.get(2));
		
		Ll.set(2, 60);
		System.out.println(Ll);
		
		Ll.remove(1);
		
		System.out.println(Ll);
		
		
		
		
	
		
		
	}

}
