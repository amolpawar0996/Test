package Twitter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TLogin {
	@FindBy(xpath = "(//div[@dir='auto'])[8]") // click on sign in
	private WebElement signin;
	@FindBy(xpath = "//input[@autocomplete='username']")
	private WebElement enterno;

	@FindBy(xpath = "(//div[@style='color: rgb(15, 20, 25);'])[2]")
	private WebElement next;

	@FindBy(xpath = "//input[@autocomplete='current-password']")
	private WebElement enterpwd;

	@FindBy(xpath = "(//div[@role='button'])[3]")
	private WebElement lgn;

	public TLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void opentwitter(WebDriver driver) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", signin);

		// js.executeScript("window.scrollBy(0,-50)");

		signin.click();
		Thread.sleep(1000);
		enterno.sendKeys("9673860996");
		Thread.sleep(1000);
		next.click();
		Thread.sleep(1000);
		enterpwd.sendKeys("Amol@0996");
		Thread.sleep(10000);
		lgn.click();

	}

}
