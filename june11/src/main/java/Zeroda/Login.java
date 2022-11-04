package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

		// Step 1 To declare the global variable (Data Member)
		@FindBy (xpath="//input[@type='text']")
		private WebElement username;
		
		@FindBy (xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy (xpath="//button[@type='submit']")
		private WebElement loginButton;
		
		public Login(WebDriver driver){//Step 2 Initialisation of variable
			
			PageFactory.initElements(driver, this);
			
		}
		
		// Step 3 Method create
			public void enterUN() {
				username.sendKeys("OKP335");
			}
			
			public void enterPW() {
				password.sendKeys("ZAQ1234567");
			}
			
			public void login() {
				loginButton.click();
			}
}






