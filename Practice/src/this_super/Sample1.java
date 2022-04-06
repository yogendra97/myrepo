package this_super;

public class Sample1 {

	int a=10;
	public void Test() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
	} 
	
	public static void main(String[]args) {
		Sample1 obj=new Sample1();
		obj.Test();
		
	}
}
