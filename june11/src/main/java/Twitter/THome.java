package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class THome {
	@FindBy(xpath = "//div[@aria-label='Add a GIF']") // click on GIF
	private WebElement clkgif;

	@FindBy(xpath = "//div[@aria-label='Close']") // click on close
	private WebElement clsgif;

	@FindBy(xpath = "//div[@aria-label='Add poll']") // click on poll
	private WebElement clkpoll;

	@FindBy(xpath = "//div[@data-testid='removePollButton']") // click on remove poll
	private WebElement clspoll;

	@FindBy(xpath = "//div[@aria-label='Schedule Tweet']") // click on schedule tweet
	private WebElement clkschedule;

	@FindBy(xpath = "//div[@data-testid='app-bar-close']") // click on schedule tweet
	private WebElement clsschedule;

	public THome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void gif() throws InterruptedException {
		Thread.sleep(2000);
		clkgif.click();
	}

	public void closegif() throws InterruptedException {
		Thread.sleep(3000);
		clsgif.click();
	}

	public void addpoll() throws InterruptedException {
		Thread.sleep(2000);
		clkpoll.click();
	}

	public void closeaddpoll() throws InterruptedException {
		Thread.sleep(3000);
		clspoll.click();
	}

	public void scheduletweet() throws InterruptedException {
		Thread.sleep(2000);
		clkschedule.click();
	}

	public void closescheduletweet() throws InterruptedException {
		Thread.sleep(3000);
		clsschedule.click();
	}

}
