package collection;

import java.util.LinkedHashSet;

public class Linkedhashset {
	
	public static void main(String[] args) {
		
	LinkedHashSet<Integer> L=new LinkedHashSet<>();
	
	L.add(40);
	L.add(50);
	L.add(10);
    L.add(60);
    L.add(70);
    
	
	System.out.println("Print linked hashset");
	System.out.println(L);
	System.out.println();
	
	System.out.println("remove any element in linked hashset");
	L.remove(50);
    System.out.println(L);
    System.out.println();
    
    System.out.println("find if it contains 10");
    System.out.println(L.contains(10));
    System.out.println();
    
    System.out.println("find size of linkedhashset");
    System.out.println(L.size());
    System.out.println();
    
    System.out.println("check if set is empty");
    System.out.println(L.isEmpty());
    System.out.println();
    
    
    
    
    
	
	}

}
