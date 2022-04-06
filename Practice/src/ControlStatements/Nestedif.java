package ControlStatements;

public class Nestedif {
	
	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		if(i==10)
		{
			if (j==20)
			{
				System.out.println("Yogendra");
			}
			else
			{
				System.out.println("Chaudhari");
			}
		}
		else
		{
			System.out.println("didnt enter in nested if");
		}
	}

}
