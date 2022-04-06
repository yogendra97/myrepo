package this_super;

public class Main1 extends Main {
	
	int A=30;
	
	public void Test1() {
		
		int A=40;
		System.out.println(A);
		System.out.println(this.A);
		System.out.println(super.A);
		
	}
public static void main(String[]args) {
	
	Main1 obj=new Main1();
	obj.Test1();
	
}
	
}

