package kewordsforannotations;

import org.testng.annotations.Test;

public class keyworddependsonmethod {
	
	@Test (enabled=false)
	public void Orderplaced() {
		System.out.println("Order is placed");
		
	}
	
	@Test (dependsOnMethods="Orderplaced")
	public void Checkorder() {
		System.out.println("Order is checked");
	}
	

}
