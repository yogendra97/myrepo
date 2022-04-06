package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {
	
	public static void main(String[] args) {
		
		Vector<Integer> V=new Vector<>();
		
		V.add(10);
		V.add(20);
		V.add(30);
		
		/*System.out.println(V);
		
		V.add(3, 40);
		
		System.out.println(V);
		
		V.remove(0);
		
		System.out.println(V);*/
		
		Enumeration<Integer> E =V.elements();
		
		while(E.hasMoreElements()) {
			System.out.println(E.nextElement());
		}
		
	}

}
