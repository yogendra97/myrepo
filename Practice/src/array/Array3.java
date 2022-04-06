package array;

public class Array3 {
	
	public static void main(String[] args) {
		
		int [][][] A=new int[2][3][2];
		
		A[0][0][0]=10;
		A[0][0][1]=20;
		A[0][1][0]=30;
		A[0][1][1]=40;
		A[0][2][0]=50;
		A[0][2][1]=60;
		
		A[1][0][0]=70;
		A[1][0][1]=80;
		A[1][1][0]=90;
		A[1][1][1]=100;
		A[1][2][0]=110;
		A[1][2][1]=120;
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				
				for(int k=0;k<A[i][j].length;k++)
				{
					System.out.print(A[i][j][k]+" ");
				}

			}
			System.out.println();

		}
	
			}
				
			
		
		
		
	}


