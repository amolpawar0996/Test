package Flipcart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	@FindBy(xpath = "//a[@class='_3SkBxJ']")
	private WebElement cart;
	@FindBy(xpath = "(//div[@class='_3dsJAO'])[14]")
	private WebElement remove;
	@FindBy(xpath = "//div[@class='_3dsJAO _24d-qY FhkMJZ']")
	private WebElement remove1;

	public Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickcart() {
		cart.click();
	}

	public void removecart(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", remove);

		//js.executeScript("window.scrollBy(0,-50)");

		remove.click();
		Thread.sleep(2000);
		remove1.click();
		Thread.sleep(2000);
	}

}
