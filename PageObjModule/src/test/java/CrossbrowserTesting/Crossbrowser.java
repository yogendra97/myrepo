package CrossbrowserTesting;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjmodule.Sample1;
import parameterization.Propertyfile_reader;

public class Crossbrowser {
	
	WebDriver driver;
	Propertyfile_reader Pro;
	
	@Parameters("Browser")
	@Test
	public void Openbrowser(String Browser) throws EncryptedDocumentException, IOException, InterruptedException {
		Pro=new Propertyfile_reader();
		if(Browser.equalsIgnoreCase("Chrome")) {
			ChromeOptions Options =new ChromeOptions();
			Options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", Pro.Chromepath());
			driver=new ChromeDriver(Options);
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", Pro.Firefoxpath());
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Proper driver is not selected");
		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Sample1 S=new Sample1(driver);
		
		S.SetUsername();
		S.SetPassword();
		S.Clicklogin();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
