package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIN {
	@FindBy (xpath="//input[@type='password']")private WebElement pin;
	
	@FindBy (xpath="//button[@type='submit']") private WebElement submit;
	
	public PIN (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpin() {
		pin.sendKeys("234567");
	}
	
	public void continueclick() {
		submit.click();
	}

}
