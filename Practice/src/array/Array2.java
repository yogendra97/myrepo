package array;

public class Array2 {
	
	public static void main(String[] args) {
		
		//2D array declaration
		
		int [][] A=new int[2][3];
		
		//array initialization
		
		A[0][0]=10;
		A[0][1]=20;
		A[0][2]=30;
		A[1][0]=40;
		A[1][1]=50;
		A[1][2]=60;
		
		
		//array retrieve
		
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
