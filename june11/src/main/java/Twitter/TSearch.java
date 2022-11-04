package Twitter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TSearch {

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1awozwy r-sdzlij r-18u37iz r-1777fci r-dnmrzs r-xyw6el r-o7ynqc r-6416eg'])[2]") // click
	private WebElement clksearch;

	@FindBy(xpath = "//input[@aria-label='Search query']") // searchbox
	private WebElement sendname;

	@FindBy(xpath = "//div[@aria-label='Clear']") // click on clear of searchbox
	private WebElement clear;

	@FindBy(xpath = "(//a[@aria-selected='false'])[1]") // click on trending
	private WebElement trending;

	@FindBy(xpath = "(//a[@aria-selected='false'])[2]") // click on news
	private WebElement news;

	@FindBy(xpath = "(//a[@aria-selected='false'])[3]") // click on sports
	private WebElement sports;

	@FindBy(xpath = "(//a[@aria-selected='false'])[4]") // click on entertainment
	private WebElement entertainment;

	@FindBy(xpath = "//a[@aria-label='Settings']") // click on SEARCH SETTING
	private WebElement searchstng;

	@FindBy(xpath = "//div[@data-testid='app-bar-close']") // close on SEARCH SETTING
	private WebElement clssearchstng;

	public TSearch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clicksearch() throws InterruptedException {
		Thread.sleep(2000);
		clksearch.click();
	}

	public void searchbox() throws InterruptedException {
		Thread.sleep(2000);
		sendname.sendKeys("Sagar Kalamkar");
		Thread.sleep(2000);
		clear.click();
		Thread.sleep(3000);
		sendname.sendKeys("Sumit Borgave");
		Thread.sleep(2000);
		clear.click();
		Thread.sleep(3000);
		sendname.sendKeys("Minal Nimse");
		Thread.sleep(2000);
		clear.click();

	}

	public void trending() throws InterruptedException {
		trending.click();
		Thread.sleep(2000);

	}

	public void news() throws InterruptedException {
		news.click();
		Thread.sleep(2000);
	}

	public void sports() throws InterruptedException {
		sports.click();
		Thread.sleep(2000);
	}

	public void entertainment() throws InterruptedException {
		entertainment.click();
		Thread.sleep(1000);

	}

	public void searchsetting() throws InterruptedException {
		searchstng.click();
		Thread.sleep(2000);

	}
	public void clssearchsetting() throws InterruptedException {
		clssearchstng.click();
		Thread.sleep(1000);

	}
}
