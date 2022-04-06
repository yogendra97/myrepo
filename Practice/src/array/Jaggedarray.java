package array;

public class Jaggedarray {
	
	public static void main(String[] args) {
		
		//variable declaration
		int [][] A=new int[2][];
		
		//details of jaggged array
		
		A[0]= new int[4];
		A[1]=new int[2];
		
		//array initialization
		
		A[0][0]=10;
		A[0][1]=20;
		A[0][2]=30;
		A[0][3]=40;
		
		A[1][0]=50;
		A[1][1]=60;
		
		//retrieve array
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.print(A[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
