package Abstraction;

public  class Concrete extends Half{


	
public void Substraction() {
	int f=5;
	int g=2;
	int i=(f-g);
	System.out.println(i);
}


public void Test() {
	
	System.out.println("incomplete method from abstract class");
	
		
	}



public static void main(String[] args) {
	Concrete C=new Concrete();
	C.Substraction();
	C.Test();

	
	Half H= new Concrete();   //upcasting
	H.Test1();
	
	
}
}
