package dependancies;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.Flipkartlogin;
import pageobjmodule.Homebutton;

public class Parameterizationflipkart {
	
	Browserfactory Bro;
	WebDriver driver;
	Flipkartlogin Fl;
	Homebutton H;

	
	
	@BeforeClass
	public void openbrowser() {
		Bro=new Browserfactory();
		driver=Bro.OpenChrome();
		driver.get("https:/www.flipkart.com");
	}
		@BeforeMethod
		public void Flipkartlogin() {
			Fl=new Flipkartlogin(driver);
			try {
				Fl.SetUSname();
				Fl.SetPassword();
				Fl.ClickLogin();
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}
		}
			@Test
			public void Homebutton() {
			H=new Homebutton(driver);	
			H.Checkhomebutton();
			Reporter.log("Test is passed,",true);
			
			
			
		
			
		}
			@AfterMethod
			public void Closebrowser() throws InterruptedException {
				
				Thread.sleep(5000);
				Bro.Closedriver(driver);
			}
		
			
	

	

}
