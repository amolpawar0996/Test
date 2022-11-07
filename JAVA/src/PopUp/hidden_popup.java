package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
//	    driver.get("https://www.flipkart.com/");
//	    Thread.sleep(2000);
//	    
//	    WebElement text = driver.findElement(By.xpath("//button[text()='✕']"));
//	    text.click();
	    
	    driver.get("https://www.amazon.in/");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
	    Thread.sleep(2000);
	    
	    WebElement close = driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']"));
	    close.click();
	    
	    
	}
}


