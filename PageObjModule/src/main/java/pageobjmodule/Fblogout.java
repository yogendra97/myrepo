package pageobjmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogout {
	
	@FindBy(xpath="//div[@aria-label=\"Account\"]")private WebElement Options;
	
	@FindBy(xpath="(//div[@class=\"s45kfl79 emlxlaya bkmhp75w spb7xbtv bp9cbjyn rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv pq6dq46d taijpn5t l9j0dhe7 tdjehn4e tv7at329 thwo4zme\"])[5]")private WebElement Logout;

	public Fblogout(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void LogoutOptions() {
		Options.click();
	}
	
	public void ClickLogout() {
		Logout.click();
	}
}
