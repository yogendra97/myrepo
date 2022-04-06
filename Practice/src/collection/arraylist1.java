package collection;

import java.util.ArrayList;

public class arraylist1 {

	
	public static void main(String[] args) {
		
		ArrayList<Integer> A=new ArrayList<>();
		
		A.add(10);
		A.add(20);
		A.add(30);
		A.add(40);
		A.add(50);
		A.add(60);
		A.add(70);
		A.add(80);
		A.add(90);
		A.add(100);
		A.add(110);
		
		System.out.println("print total array list");
		System.out.println(A);
		
		System.out.println();
		System.out.println("getting size of arraylist");
		System.out.println(A.size());
		
		System.out.println();
		System.out.println("get element in 2nd index");
		int B= A.get(2);
		System.out.println(B);
		System.out.println();
		
		System.out.println("removing element in 5th index");
		A.remove(5);
		System.out.println(A);
		System.out.println();
		
		System.out.println("Replace index 3rd element by 120");
		A.set(3,120);
		System.out.println(A);
	    System.out.println();
	    
	    System.out.println("add 130 in 2nd index");
	    A.add(2,130);
	    System.out.println(A);
	    System.out.println();
	    
	    System.out.println("check if array list contains 90");
	    System.out.println(A.contains(90));
	    System.out.println();
	    
	    System.out.println("check if array list is empty or not");
	    System.out.println(A.isEmpty());
	    System.out.println();
	    
	    System.out.println("clear array list");
	    A.clear();
	    System.out.println(A);
	    
	    
	    A.addAll(A);
	    System.out.println(A);
	    
	    
	    
	   
		
		
		
	
	}
}
