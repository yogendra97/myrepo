package module1;



public class Demo1 {

	public void Test() {
		System.out.println("Running non static method");
		
	}
	public static void Test1() {
		System.out.println("Running static method");
	}
	public static void main(String[] args) {
	//calling static variable method
	Test1();
		
		//calling not static method
		Demo1 obj= new Demo1();
		obj.Test();
		Test1();
		
		multiplication();
		obj.divide();
		
		
		
	}
	public static void multiplication() {
		int a=5;
		int b=2;
		int c=(a*b);
		System.out.println(c);		
		
		
	}
	public void divide() {
		int a=25;
		int b=5;
		int c=(a/b);
		System.out.println(c);
				
		
	}
	 

			
			
		}
	
	
	
