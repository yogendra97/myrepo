package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import browser.Browserfactory;


public class Assertmethod {
	
	WebDriver driver;
	@Test
	public void Test() {
		
		int a=4,b=5;
		
	//	Assert.assertTrue(a>b);
		
		//Assert.assertFalse(a<b);
		
		//System.out.println("hi");*/
		String Str="Yogendra";
		String Str1="Yogendr";
		String Str2 = null;
		
		Browserfactory bro=new Browserfactory();
		driver=bro.OpenChrome();
		
		WebElement Logo = driver.findElement(By.xpath("//img[@class=\"fb_logo _8ilh img\"]"));
		
		WebElement Username=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
	  //   Assert.assertTrue(Logo.isDisplayed());
		
		Assert.assertFalse(Logo.isDisplayed());
		
	//	Assert.assertEquals(Str, Str1);
		
	//	Assert.fail();
		
	//	Assert.assertNotSame(Str, Str1);
		
	//	Assert.assertNotNull(Username);
		
	//	Assert.assertNull(Str2);
		
	//	SoftAssert soft=new SoftAssert();
		
	//	soft.assertFalse(Logo.isDisplayed());
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Username.sendKeys("Yogendra");
		
		
	     
	     Reporter.log("hii", true);
	     
	  //   driver.close();
	     
	   //  soft.assertAll();
		
		
		
		
	}

}
