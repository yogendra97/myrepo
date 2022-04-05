package kewordsforannotations;

import org.testng.annotations.Test;

public class kewordenable {
	
	@Test  (enabled=false)
	public void Test1() {
		System.out.println("Running Test 1");
	}
	
	@ Test
	public void Test2() {
		System.out.println("Running Test 2");
		
	}

}
