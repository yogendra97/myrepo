package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {
	
	@FindBy(xpath="(//a[@role=\"button\"])[2]")private WebElement Create;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")private WebElement FSname;
	
	@FindBy(xpath="(//input[@type=\"text\"])[3]")private WebElement SRname;
	
	@FindBy(xpath="(//input[@type=\"text\"])[4]")private WebElement mobile;

	@FindBy(xpath="(//input[@type=\"password\"])[2]")private WebElement password;
	
	@FindBy(xpath="(//select[@title=\"Day\"])")private WebElement date;
	
	@FindBy(xpath="(//select[@title=\"Month\"])")private WebElement month;
	
	@FindBy(xpath="(//select[@title=\"Year\"])")private WebElement year;
	
	@FindBy(xpath="(//input[@type=\"radio\"])[2]")private WebElement Radio;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[2]")private WebElement Signup;
	
	public NewAccount(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void Clickoncreateacc() {
		Create.click();
	}
	
	public void SetFirstname(String Firstname) {
		FSname.sendKeys(Firstname);
	}
	
	public void SetSurname(String Surname) {
		SRname.sendKeys(Surname);
	}
	
	public void Setmobile(String Mobile) {
		mobile.sendKeys(Mobile);
	}
	
	public void SetPassword(String Password) {
		password.sendKeys(Password);
		
	}
	public void SetBirthdate(String Date) {
		Select S=new Select(date);
		S.selectByVisibleText(Date);
	}
	
	public void SetMonth(String Month) {
		Select S=new Select(month);
		S.selectByVisibleText(Month);
	}
	
	public void SetYear(String Year) {
		Select S= new Select(year);
		S.selectByVisibleText(Year);
	}
	public void SetGender() {
		Radio.click();
	}
	
	public void ClickSignup() {
		Signup.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
