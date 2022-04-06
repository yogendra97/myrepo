package inheritance;

public class Output {

	public static void main(String[] args) {
		
	/*	System.out.println("calling son properties");
		Son S=new Son();
		S.House();
		S.Building();
		S.Land();
		S.Bike();
		
		
		System.out.println();
		System.out.println("Calling Son 1 properties");
		
		Son1 S1=new Son1();
		S1.House();
		S1.Building();
		S1.House();
		S1.Car();
		
		System.out.println();
		System.out.println("Calling Son2 properties");
		
		Son2 S2=new Son2();
		S2.Bungalow();
		S2.House();
		S2.Flat();
		S2.Land();
		
		System.out.println();*/
		System.out.println("calling fathers properties taken from grandfather");
		Father F=new Father();
		
		F.Building();
		F.Bungalow();
		F.Land();
		
		Son S=new Son();
		S.Bike();
		
		Son1 S1=new Son1();
		S1.Building();
		
		
		
		
	}
}
