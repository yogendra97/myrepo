package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homebutton {
	
	@FindBy(xpath="//img[@alt=\"Flipkart\"]")private WebElement Homebutton;
	
	public Homebutton(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Checkhomebutton() {
		
		boolean Result = Homebutton.isDisplayed();
		
		if(Result ==true) {
			System.out.println("Home Button is Present");
		}
		else {
			System.out.println("Home button is not present");
		}
		
	}

}
