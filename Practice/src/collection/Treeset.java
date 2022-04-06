package collection;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer> T=new TreeSet<>();
		
		T.add(10);
		T.add(5);
		T.add(45);
		T.add(56);
		T.add(12);
		T.add(85);
		
		System.out.println("find size of treeset");
		System.out.println(T.size());
		System.out.println();
		
		System.out.println("print treeeset");
		System.out.println(T);
		System.out.println();
		
		System.out.println("remove element from treeset");
		T.remove(45);
		System.out.println(T);
		System.out.println();
		
		System.out.println("to check if tree set contains");
		System.out.println(T.contains(45));
		System.out.println();
		
		System.out.println("to check if treeset is empty or not");
		System.out.println(T.isEmpty());
		System.out.println();
		
		
		
	}
}
