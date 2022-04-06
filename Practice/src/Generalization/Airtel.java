package Generalization;

public class Airtel implements Plans {

	
	public void Internet() {
		System.out.println("1GB/Day");
		
		
	}


	public void Calling() {
		System.out.println("Unlimited");
		
	}

	
	public void Sms() {
		System.out.println("100/Day");
		
	}
public static void main(String[] args) {
	Airtel A=new Airtel();
	A.Internet();
	A.Calling();
	A.Sms();
	
}
}
