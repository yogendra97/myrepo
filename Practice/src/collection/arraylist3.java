package collection;

import java.util.ArrayList;

public class arraylist3 {

	public static void main(String[] args) {
		
		ArrayList<String> A=new ArrayList<>();
		
		A.add("Yogendra");
		A.add("Vilas");
		A.add("Chaudhari");
		
	//	System.out.println(A);
		
		A.add(3, "Yogendra");
	
		
		System.out.println(A);
		
		for(int i=0;i<A.size();i++)
		{
			for (int j=i+1;i<A.size();j++)
			{
				String C=A.get(i);
				String D=A.get(j);
				
				if(C==D) {
					System.out.println(D);
				}
				
			
			}
		}
		
	}
}
