package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arryytolist {
	
	public static void main(String[] args) {
		
		String[] array= {"a","b","c","d","e","f"};
		
		
		//method 1(by using aslist method from Arrays class)
		
		/*List<String> list=Arrays.asList(array);
		
		System.out.println(list);
		
		//Method 2 (by using addall methdod from Collections inteface)
		
		List<String>  list1=new ArrayList<String>();
		
		Collections.addAll(list1, array);
		
		System.out.println(list1);*/
		
		//method 3 by using for each
		
		List<String> list2=new ArrayList<String>();
		
		for(String text : array) {
			list2.add(text);
			
		}
		System.out.println(list2);
		
	}
	
	
	
	

}
