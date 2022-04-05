package dependancies;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.Fbmultiplelogin;
import parameterization.Exceldata;

public class Fbaccounts {
	
	Browserfactory Bro;
	WebDriver driver;
	Fbmultiplelogin Login;
	
	
	
	@BeforeClass
	public void Openchrome() {
		Bro=new Browserfactory();
		driver=Bro.OpenChrome();
		driver.get("https://www.facebook.com");
		
	}
	@DataProvider
	public Object[][] Excelinfo() throws EncryptedDocumentException, IOException {
		Exceldata data=new Exceldata();
		Object[][] Userinfo = data.Userdata();
		return Userinfo;
	}
	
	@Test (dataProvider ="Excelinfo")
	public void login(String Username,String Password) throws InterruptedException {
		Login=new Fbmultiplelogin(driver);
		Thread.sleep(2000);
		Login.SendUsername(Username);
		Login.SendPassword(Password);
		Login.clicklogin();
		Thread.sleep(5000);
		Login.Logout();
		
	}
	
	@AfterClass
	public void Closedriver() {
		Bro.Closedriver(driver);
	}
	

}
