package kewordsforannotations;

import org.testng.annotations.Test;

public class keywordpriority {
	
	@Test (priority=1)
	public void Test1() {
		System.out.println("Running Test 1");
	}
	
	@Test (priority=-1)
	public void Test2() {
		System.out.println("running Test 2");
		
	}
	
	@Test (priority=3)
	public void Test3() {
		System.out.println("Running Test 3");
	}

}
