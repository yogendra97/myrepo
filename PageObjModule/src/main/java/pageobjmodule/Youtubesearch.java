package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Youtubesearch {
	
	@FindBy(xpath="//input[@id=\"search\"]")private WebElement Search;
	@FindBy(xpath="//button[@id=\"search-icon-legacy\"]")private WebElement Searchbutton;
	
	
	public Youtubesearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Searchsong() {
		Search.sendKeys("Dil ko karar aaya");
	}
	
	public void Clickonsearch() {
		Searchbutton.click();
	}
	

}
