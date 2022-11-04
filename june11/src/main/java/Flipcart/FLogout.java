package Flipcart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLogout {
	// WebDriver driver;
	@FindBy(xpath = "(//div[@class='_28p97w'])[1]")
	private WebElement account;
	@FindBy(xpath = "//div[text()='Logout']")
	private WebElement lo;

	public FLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void acc(WebDriver driver) throws InterruptedException {

		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(account).perform();
		a.moveToElement(lo).click().build().perform();
	}

}
