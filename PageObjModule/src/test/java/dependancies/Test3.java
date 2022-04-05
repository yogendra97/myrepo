package dependancies;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.Browserfactory;
import pageobjmodule.OpenInsta;

public class Test3 {
	
	Browserfactory Bro;
	WebDriver driver;
	OpenInsta OP;
	
	@BeforeClass
	public void Openbrowser() {
		Bro=new Browserfactory();
		driver=Bro.OpenChrome();
		driver.get("https://www.instagram.com");
	}
	@BeforeMethod
	public void Login() throws InterruptedException {
		OP=new OpenInsta(driver);
		Thread.sleep(5000);
		OP.Username();
		OP.Password();
		OP.Login();
	}
	@Test
	public void Ab() {
		System.out.println("HI");
	}

}
