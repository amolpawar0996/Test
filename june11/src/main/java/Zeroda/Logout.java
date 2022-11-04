package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy (xpath="//a[@href='/logout']")private  WebElement logout;
	@FindBy (xpath="//span[text()='OKP335']")private WebElement setting;
	@FindBy (xpath="//a[text()='Change user']")private WebElement clickuser;

	
	
	public Logout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonlogout() {
	    setting.click();
		logout.click();
	}
	public void changeuser() {
		clickuser.click();
	}
	
	
	
}
