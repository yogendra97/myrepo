package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import parameterization.Propertyfile_reader;

public class Browserfactory {
	
	
	Propertyfile_reader Fi=new Propertyfile_reader();
	
	public WebDriver OpenChrome() {
		ChromeOptions Options =new ChromeOptions();
		Options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", Fi.Chromepath());
		WebDriver driver=new ChromeDriver(Options);
		driver.get(Fi.URL());
		
		driver.manage().window().maximize();
		return driver;
	}

	public WebDriver Openfirefox() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse workspace\\PageObjModule\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public void Closedriver(WebDriver driver) {
		driver.close();
	}
}
