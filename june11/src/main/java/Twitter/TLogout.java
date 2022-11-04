package Twitter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLogout {
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-172uzmj r-1pi2tsx r-1ny4l3l r-13qz1uu']") // click on profile
	private WebElement profile;
	@FindBy(xpath = "//input[@autocomplete='username']")
	private WebElement enterno;

	@FindBy(xpath = "//span[text()='Log out @AmolPawar0996']")
	private WebElement lgt;

	@FindBy(xpath = "//div[@style='color: rgb(15, 20, 25);']")
	private WebElement clicklgt;

	public TLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void closetwitter(WebDriver driver) throws InterruptedException {

		profile.click();
		Thread.sleep(1000);
		
		lgt.click();
		Thread.sleep(1000);
		
		clicklgt.click();

	}
	

}
