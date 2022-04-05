package dependancies;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.MultipleLogin;
import parameterization.Multipleuser;

public class Fbmultiple {

	Browserfactory bro;
	WebDriver driver;
	MultipleLogin Login;
	Multipleuser US;

	@BeforeClass
	public void Openchrome() {

		bro = new Browserfactory();
		driver = bro.OpenChrome();

	}

	@DataProvider
	public Object[][] Data() throws EncryptedDocumentException, IOException {
		US = new Multipleuser();
		Object[][] data = US.getuserdata("C:\\Eclipse workspace\\PageObjModule\\Test Data\\Multipleuserdata.xlsx",
				"Sheet1");
		return data;

	}

	@Test(dataProvider = "Data")
	public void login(String Username, String Password) throws InterruptedException {
		Login = new MultipleLogin(driver);
		Thread.sleep(2000);
		Login.SetUsername(Username);
		Login.Password(Password);
		Login.Clicklogin();
		Thread.sleep(4000);
		Login.Logout();
		Thread.sleep(2000);

	}

	@AfterClass
	public void Closedriver() {
		bro.Closedriver(driver);
	}

}
