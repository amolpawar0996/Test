package Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLogin {

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement un;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	@FindBy(xpath = "(//span[text()='Login'])[2]")
	private WebElement li;

	public FLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUN() {
		un.sendKeys("7020765028");
		pwd.sendKeys("@Saarth1017");
		li.click();
	}
}
