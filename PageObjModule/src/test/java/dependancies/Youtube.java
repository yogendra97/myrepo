package dependancies;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.Youtubesearch;
import pageobjmodule.playsong;

public class Youtube {
	
	Browserfactory bro;
	WebDriver driver;
	Youtubesearch S;
	playsong P;
	
	@BeforeClass
	public void openbrowser() {
		bro=new Browserfactory();
		driver=bro.OpenChrome();
		driver.get("https://www.youtube.com");
		
	}
	@BeforeMethod
	public void searchsong() throws InterruptedException {
		S=new Youtubesearch(driver);
		S.Searchsong();
		Thread.sleep(2000);
		S.Clickonsearch();
	}
	@Test()
	public void playsong() throws InterruptedException {
		P=new playsong(driver);
		Thread.sleep(2000);
		P.Playsong();
		
	}
	/*@AfterClass
	public void Closedriver() throws InterruptedException {
		bro=new Browserfactory();
		Thread.sleep(2000);
		bro.Closedriver(driver);
	}*/
	

}
