package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {
		
	
		
		
		ArrayList<Integer> Al=new ArrayList<>();
		
		Al.add(10);
		Al.add(20);
		Al.add(30);
		Al.add(40);
		Al.add(50);
		
		
		
		/*System.out.println(Al);
		
		
		// to find size of array list
		
		System.out.println(Al.size());
		
		//to remove element at particular index
		
		System.out.println(Al.remove(2));
		
		//to print remaining array list
		
		System.out.println(Al);
		
		//to add any value at particular index
		
		Al.add(2, 60);
		
		System.out.println(Al);
		
		//to get the value at particular index
		
		System.out.println(Al.get(4));
		
		//to change any value in index
		
		Al.set(0, 70);
		System.out.println(Al);
		
		
		//to find if array list contains mentioned data
		
		System.out.println(Al.contains(70));
		
		//to check if array list is empty or not
		
		System.out.println(Al.isEmpty());
		
		Al.add(80);
		
		System.out.println(Al);
		
		//to clear all the array list
		
		Al.clear();
		
	System.out.println(Al);*/
	
	Iterator it=Al.iterator();
	
	boolean Result = it.hasNext();
	System.out.println(Result);
	
	while(Result) {
		System.out.println(it.next());
		
		//ListIterator<Integer> LI=Al.listIterator();
		
		
	}

	
	}
}
