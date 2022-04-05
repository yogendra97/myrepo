package pageobjmodule;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parameterization.Parameterization;

public class Flipkartlogin {
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement Username;
	@FindBy(xpath="(//input[@type=\"password\"])")private WebElement Password;
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")private WebElement Login;
	Parameterization Pr=new Parameterization();
	
	public Flipkartlogin(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void SetUSname() throws EncryptedDocumentException, IOException {
		
		Username.sendKeys(Pr.Username());
	}
	public void SetPassword() throws EncryptedDocumentException, IOException {
		
		Password.sendKeys(Pr.password());
	}
	public void ClickLogin() {
		
		Login.click();
		
		
	}

}
