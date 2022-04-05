package kewordsforannotations;

import org.testng.annotations.Test;

public class kewordinvocationcount {
	
	@Test  (invocationCount=5)
	public void Test1() {
		
		System.out.println("Running Test 1");
	}
	@Test (invocationCount=4)
	public void Test2() {
		System.out.println("Running Test 2");
	}

}
