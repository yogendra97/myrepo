package inheritance;

public class Father extends grandfather {

	public void House() {
		
		System.out.println("MyHouse");
	}
	
	public void Money() {
		
		System.out.println("Money");
		
		
	}
	
	
	public static void main(String[] args) {
		Father f=new Father();
		f.House();
		f.Bungalow();
	}
}
