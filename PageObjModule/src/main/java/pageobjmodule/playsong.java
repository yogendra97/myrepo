package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class playsong {
	
	@FindBy(xpath="(//a[@id=\"video-title\"])[1]")private WebElement Clicksong;
	
	public playsong(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Playsong() {
		Clicksong.click();
	}

}
