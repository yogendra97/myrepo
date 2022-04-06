package Ifelse;

public class Prime {
	
	
	public static void main(String[] args) {
		
		int A=7; int temp=0;
		
		for( int i=2;i<=A/2;i++)
		{
			if(A%i==0)
			{
				temp=temp+1;
			}
		
				
		}
		if(temp==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}

}
