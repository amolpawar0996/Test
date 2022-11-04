package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TMessages {
	@FindBy(xpath = "//a[@aria-label='Direct Messages']")
	private WebElement clkmsg;

	@FindBy(xpath = "//a[@data-testid='empty_state_button_text']")
	private WebElement clkwritemsg;

	@FindBy(xpath = "//input[@placeholder='Search people']")
	private WebElement clksearchpeople;

	@FindBy(xpath = "//a[@aria-label='Settings']")
	private WebElement msgsetting;

	public TMessages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clkmsg() {
		clkmsg.click();
	}

	public void clkwritemsg() {
		clkwritemsg.click();
	}

	public void clksearchpeople() {
		clksearchpeople.sendKeys("Minal Nimse");
	}

	public void msgsetting() {
		msgsetting.click();
	}


}
