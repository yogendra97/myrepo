package dependancies;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.Fblogout;
import pageobjmodule.Sample1;
import parameterization.Propertyfile_reader;

public class Class3 {
	
	Browserfactory bro=new Browserfactory();
	WebDriver driver;
	
	Sample1 S;
	Fblogout Lo;
	
	
	@BeforeClass
	public void openbrowser() {
		
		driver=bro.OpenChrome();
		
	}
	
	@BeforeMethod
	public void Login() {
		
		S=new Sample1(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try {
			S.SetUsername();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		try {
			S.SetPassword();
		} catch (Exception e) {
		
			e.printStackTrace();
		
		}
		S.Clicklogin();
		
	}
	@Test
	public void search() throws InterruptedException {

		WebElement Searchbar = driver.findElement(By.xpath("//input[@type=\"search\"]"));
		Searchbar.sendKeys("Yogendra");
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		Lo=new Fblogout(driver);
		Lo.LogoutOptions();
		Thread.sleep(2000);
		Lo.ClickLogout();
		
	
		
	}
@AfterClass
	public void close() {
		bro.Closedriver(driver);
	}
	
	

}
