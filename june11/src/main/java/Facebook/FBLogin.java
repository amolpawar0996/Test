package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogin {

	@FindBy(xpath = "//input[@type='text']")
	private WebElement phoneno; // enter phone no.
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password; // enter password
	@FindBy(xpath = "//button[@value='1']")
	private WebElement login; // login

	public FBLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterPhoneNo() { // enter phone no. in login page
		phoneno.sendKeys("9673860996");
	}

	public void enterPWD() { // enter password in login page
		password.sendKeys("Amol@0996");
	}

	public void clicklogin() { // click on login
		login.click();
	}

}
