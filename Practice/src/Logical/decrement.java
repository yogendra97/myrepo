package Logical;

public class decrement {
public static void main(String[] args) {
	
	
	int i;
	int j;
	
	for(i=1;i<=4;i++)
	{
		for(j=4;j>=i;j--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}