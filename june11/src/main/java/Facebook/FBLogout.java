package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLogout {
	@FindBy(xpath="//div[@aria-label='Your profile']") 
	private WebElement profile; //click on profile
	@FindBy(xpath="(//div[@class='x14yjl9h xudhj91 x18nykt9 xww2gxu x6s0dn4 x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x3nfvp2 xl56j7k x1n2onr6 x1qhmfi1 xc9qbxq x14qfxbe'])[5]")
	private WebElement logo;
	
	
	public FBLogout (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickprofile() {
		profile.click();
		
	}
	public void clicklogout() {
		logo.click();
		
	}
	
}
