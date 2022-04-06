package module1;

public class Demo {
	 static int a=40;
	
	public void Addition() {
		int b=10;
		int c=a+b;
		System.out.println("Addition "+c);
		
	}
	
	public static void substraction() {
		int d=5;
		int e=a-d;
		
		System.out.println("Substraction "+e);
		
		
	}
	public static void main(String[]args) {
		
		 substraction();
		 
		 
		Demo A=new Demo();
		A.Addition();
		A.Multiplication();
		
		
		
	}
	
	public void Multiplication() {
		int f=2;
		int g=(a*f);
		
		System.out.println("Multiplication "+g);
		
		
	}


}

