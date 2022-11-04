package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	@FindBy (xpath="//span[text()='Orders']")private WebElement orders;
	@FindBy (xpath="//span[text()='Holdings']")private WebElement holdings;
	@FindBy (xpath="//span[text()='Positions']")private WebElement positions;
	@FindBy (xpath="//span[text()='Funds']")private WebElement funds;
		
	
	
	public Home (WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void order() {
			orders.click();
		}
		public void holdings() {
			holdings.click();
		}
		public void positions() {
			positions.click();
		}
		public void funds() {
			funds.click();
		}
		
}				
				
				
				
				
				
				
				

	


