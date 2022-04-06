package Logical;

public class practic2 {
	
	public static int Fib(int n) {
		
		if(n<=1) {
			return n;
		}
		return Fib(n-2)+Fib(n-1);
		
	}
	
	
	public static void main(String[] args) {
		
		//int n=8;
		System.out.println(Fib(8));
	}

}
