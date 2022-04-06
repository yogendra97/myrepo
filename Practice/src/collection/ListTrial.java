package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTrial {
	
	public static void main(String[] args) {
		
	
	
	List<Integer> A = new ArrayList<>();
	
	A.add(10);
	A.add(20);
	A.add(30);
	A.add(40);
	A.add(50);
	
	System.out.println(A.size());
	
	
	int B=A.get(A.size()-2);
	
	System.out.println(B);
	
	
	
	
	
	
}
}