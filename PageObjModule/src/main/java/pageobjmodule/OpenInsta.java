package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenInsta {
	
	@FindBy(xpath="//input[@type=\"text\"]")private WebElement Username;
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement Password;
	@FindBy(xpath="//div[@class=\"            qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    \"]")private WebElement Login;
	
	public OpenInsta(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Username() {
		Username.sendKeys("yogendra_3532");
	}
	
	public void Password() {
		Password.sendKeys("mh127427");
	}
	public void Login() {
		Login.click();
	}

}
