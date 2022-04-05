package pageobjmodule;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parameterization.Fbparameterization;
import parameterization.Propertyfile_reader;

public class Sample1 {
	
	@FindBy(xpath="//input[@type=\"text\"]")private WebElement Username;
	
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement Password;
	
	@FindBy(xpath="//button[@name=\"login\"]")private WebElement Login;
	
	Propertyfile_reader pr=new Propertyfile_reader();
	
	
	public Sample1(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void SetUsername() throws EncryptedDocumentException, IOException {
		
		Username.sendKeys(pr.Username());
	}
	
	public void SetPassword() throws EncryptedDocumentException, IOException {
		
		Password.sendKeys(pr.password());
	}
	
	public void Clicklogin() {
		Login.click();
	}
	
	

}
