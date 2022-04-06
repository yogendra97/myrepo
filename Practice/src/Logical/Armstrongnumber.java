package Logical;

public class Armstrongnumber {

	
	public static void main(String[] args) {
		
		int n=153;
		int rem;
		int ar=0;
		
		while(n>0) {
			rem=n%10;
			ar=(rem*rem*rem)+ar;
			n=n/10;
			
		}
		System.out.println(ar);
		
	}
}
