
///fibonacci series= 0 ,1 ,1, 2 ,3 ,5 ,8 ,13, 21....so on


package Logical;

public class Fibonacci {

	public static int Fib(int n) {
		
		if(n<=1) {
			
			return n;
		}
		
			return Fib(n-1)+Fib(n-2);
		}
		
	public static void main(String[] args) {
		
		int n=7;
		
		System.out.println(Fib(n));
	}
	
	
}
