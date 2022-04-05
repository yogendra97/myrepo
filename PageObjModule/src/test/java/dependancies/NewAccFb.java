package dependancies;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.NewAccount;
import parameterization.ExcelReadernew;

public class NewAccFb {
	
	Browserfactory bro;
	WebDriver driver;
	ExcelReadernew Ex;
	NewAccount Acc;
	
	@BeforeClass
	public void Openchrome() {
		bro=new Browserfactory();
		driver=bro.OpenChrome();
	}
	
	@DataProvider
	public Object[][] getUserdata() throws EncryptedDocumentException, IOException {
		Ex=new ExcelReadernew();
		Object[][] data = Ex.Userdata("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Newaccount.xlsx", "Sheet1");
		return data;
	}
	
	@Test (dataProvider="getUserdata")
	public void Createacc(String Firstname,String Surname,String Mobile,String Password,String Date,String Month,String Year) throws InterruptedException {
		Acc=new NewAccount(driver);
		
		Thread.sleep(2000);
		Acc.Clickoncreateacc();
		Thread.sleep(5000);
		Acc.SetFirstname(Firstname);
		Acc.SetSurname(Surname);
		Acc.Setmobile(Mobile);
		Acc.SetPassword(Password);
		Acc.SetBirthdate(Date);
		Acc.SetMonth(Month);
		Acc.SetYear(Year);
		Acc.SetGender();
		
		Thread.sleep(2000);
		Acc.ClickSignup();
	}
	
	@AfterClass
	public void CloseBrowser() {
		bro.Closedriver(driver);
	}

}
