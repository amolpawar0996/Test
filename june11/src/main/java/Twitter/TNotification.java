package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TNotification {
	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-sdzlij r-18u37iz r-1777fci r-dnmrzs r-xyw6el r-o7ynqc r-6416eg'])[3]")
	private WebElement clknotifications;

	@FindBy(xpath = "//a[@href='/notifications/mentions']")
	private WebElement clkmention;

	@FindBy(xpath = "//a[@aria-label='Settings']")
	private WebElement clkstngs;

	@FindBy(xpath = "//div[@aria-label='Back']")
	private WebElement clkback;

	public TNotification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clknotification() {
		clknotifications.click();
	}

	public void mentions() {
		clkmention.click();
	}

	public void clksetting() {
		clkstngs.click();
	}

	public void back() {
		clkback.click();
	}

}
