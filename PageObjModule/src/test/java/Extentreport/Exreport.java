package Extentreport;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import browser.Browserfactory;

public class Exreport {
	
	Browserfactory bro;
	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter reporter;
	
	
	
	@BeforeMethod
	public void startreport() {
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("Facebook");
	reporter.config().setDocumentTitle("Facebooktitle");
	
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("operator", "Windows");
	extent.setSystemInfo("Tested By", "Yogendra");
	
	}
	
	@org.testng.annotations.Test 
	public void Test() {
		ExtentTest etest = extent.createTest("Test 1");
		 bro=new Browserfactory();
	     driver = bro.OpenChrome();
	     etest.info("firefox started ");
		driver.get("https://www.facebook.com");
		
		
			
	}
	
	@AfterMethod
	public void teardown() {
	 bro.Closedriver(driver);
	 extent.flush();
	
	}

}
