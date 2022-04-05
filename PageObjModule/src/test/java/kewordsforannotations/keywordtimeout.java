package kewordsforannotations;

import org.testng.annotations.Test;

public class keywordtimeout {
	
	@Test (timeOut=5000)
	public void Test1() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("Running test 1");
	}

}
