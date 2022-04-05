package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutFlipkart {
	
	@FindBy(xpath="(//div[@class=\"exehdJ\"])[1]")private WebElement Options;
	@FindBy(xpath="")private WebElement Logout;
	
	
	public LogoutFlipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Logoutflipkart() throws InterruptedException {
		Options.click();
		Thread.sleep(5000);
		Logout.click();
	}
	
	
	

}
