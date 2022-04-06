package array;

public class Array1 {

	public static void main(String[] args) {
	
		//declaration of array
		int[] A= new int[5];
		
		
		//Initialization of array
		
		A[0]=10;
		A[1]=20;
		A[2]=30;
		A[3]=40;
		A[4]=50;
		
	int B=A.length;
	System.out.println(B);
	
		
		//reverting of array by for loop method
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+",");
			
		}
		//reverting the array by foreach method
		
		for(int i:A)
		{
			System.out.print(i+ " ");
			
		}
		
	}
}
