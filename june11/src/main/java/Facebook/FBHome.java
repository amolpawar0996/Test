package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHome {
	
	@FindBy (xpath="//input[@placeholder='Search Facebook']") private WebElement searchbar;//click on search bar
    @FindBy(xpath="(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xlyipyv xuxw1ft'])[1]")private WebElement sumit;
	@FindBy(xpath="(//div[@class='x1n2onr6 x1ja2u2z x78zum5 x2lah0s xl56j7k x6s0dn4 xozqiw3 x1q0g3np xi112ho x17zwfj4 x585lrc x1403ito x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xn6708d x1ye3gou x1hr4nm9 x1r1pt67'])[3]")private WebElement addfriend;
    @FindBy (xpath="//span[text()='Photo/video']") private WebElement photo; //click on photo/video
	@FindBy (xpath="(//div[@aria-label='Close'])[2]") private WebElement closephoto; //click on cross of photo
	
	
	
	
	public FBHome(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clicksearchbar() {
		searchbar.sendKeys("Sumit Borgave");
	}
	public void clickphoto() {
		photo.click();
	}
	public void closephoto() {
		closephoto.click();
	}
	public void sumit() {
		sumit.click();
	}
	public void sendrequest() {
		addfriend.click();
	}
	
	
}

 
