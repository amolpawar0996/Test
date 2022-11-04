package Twitter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TProfile {
	@FindBy(xpath="//a[@aria-label='Profile']")
	private WebElement clkprofiles;
	
	@FindBy(xpath="(//a[@role='tab'])[2]")
	private WebElement clkrepliess;
	
	@FindBy(xpath="(//a[@role='tab'])[3]")
	private WebElement clkmedias;
	
	@FindBy(xpath="(//a[@role='tab'])[4]")
	private WebElement clklikes;
	
	public TProfile(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clkprofile() {
		clkprofiles.click();
	}
	
	public void clkreplies(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);
        clkrepliess.click();
	}
	
	public void clkmedia() {
		clkmedias.click();
	}
	
	public void clklike() {
		clklikes.click();
	}

}
