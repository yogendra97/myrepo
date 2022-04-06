package this_super;

public class Sample2 extends Sample1{
	
	int a=30;
	public void Test1(){
		
		int a=40;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		
		
		
		
	}
	public static void main(String[]args) {
		Sample2 obj1=new Sample2();
		obj1.Test1();
		
	
		}
	}


