package array;

public class duplicate {

	public static void main(String[] args) {
		
		int[] A=new int[5];
		
		A[0]=10;
		A[1]=20;
		A[2]=30;
		A[3]=40;
		A[4]=10;
		
		
		int i;
		int j;
		
		for(i=0;i<A.length;i++)
		{
			for(j=i+1;j<A.length;j++)
			{
				if ((A[i]==A[j]) && (i!=j))
				{
					System.out.print(A[j]);
				}
			}
			
		}
	}
}
