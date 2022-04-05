package pageobjmodule;

import org.openqa.selenium.WebDriver;

import browser.Browserfactory;

public class Browsers {
	
	
	static WebDriver driver; 
	
	public static void main(String[] args) {
		
		
		Browserfactory Browser=new Browserfactory();
		driver = Browser.OpenChrome();
		driver.get("https://www.facebook.com");
		
		Browser.Closedriver(driver);
	///	driver = Browser.Openfirefox();
	//	driver.get("https://www.facebook.com");
		
		
	}

}
