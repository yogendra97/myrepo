package collection;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet<Integer> H=new HashSet<>();
		
		H.add(10);
		H.add(20);
		H.add(30);
		H.add(40);
		H.add(50);
		H.add(60);
		H.add(20);
		H.add(0);
		
		
		System.out.println("print hashset");
		System.out.println(H);
		System.out.println();
		
		System.out.println("find size of hashset");
		System.out.println(H.size());
		System.out.println();
		
		System.out.println("remove any element in hashset");
		H.remove(50);
		System.out.println(H);
        System.out.println();
        
        System.out.println("find hashset contains ");
        System.out.println(H.contains(60));
        System.out.println();
        
        System.out.println("check if hashset is empty");
        System.out.println(H.isEmpty());
        System.out.println();
        
       
		

	}

}
