package this_super;

public class Main {
	int A=10;
	
	public void Test() {
		int A=20;
		
		System.out.println(A);
		System.out.println(this.A);
		
	}

public static void main(String[]args) {
	Main M=new Main();
	M.Test();
	
	
}
}
