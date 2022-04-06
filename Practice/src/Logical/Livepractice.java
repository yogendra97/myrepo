package Logical;

public class Livepractice {

	public static void main(String[] args) {
		
		int i;
		int j;
		int k;
		
		for(i=1;i<=3;i++)
		{
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=3;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
