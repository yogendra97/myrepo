package array;

public class Array1D {

	public static void main(String[] args) {
		 int[] A= {10,20,30};
		 
		 for(int i=0;i<A.length;i++)
		 {
			 System.out.print(A[i]+" ");
		 }
		 System.out.println();
		 
		 int [][] B= {{10,20,30},{40,50,60}};
		 
		 for(int k=0;k<B.length;k++)
		 {
			 for(int l=0;l<B[k].length;l++)
			 {
				 System.out.print(B[k][l]+" ");
			 }
			 System.out.println();
		 }
	}
}
