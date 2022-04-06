package Casting;

public class Upcasting {

	public static void main(String[] args) {
		System.out.println("calling son properties like inheritence");
		Son S=new Son();
		S.Money();
		S.House();
		S.Bike();
		
		System.out.println("calling upcasting properties");
		
		Father F=new Son();
		F.House();
		F.Money();
		
		
		//downcasting is not possible
	//	((Son)F).Money();
		
		
				
	}
	
}
