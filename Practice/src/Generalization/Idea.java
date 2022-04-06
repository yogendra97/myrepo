package Generalization;

public class Idea implements Plans {

	
	public void Internet() {

		System.out.println("1.5GB/day");
	}

	
	public void Calling() {
	
		System.out.println("Unlimited");
	}

	
	public void Sms() {
		
		System.out.println("3000/Month");
	}
	public static void main(String[] args) {
		Idea I=new Idea();
		I.Internet();
		I.Calling();I.Sms();
	}
}