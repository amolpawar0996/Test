package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		
		//WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		WebDriverWait ref = new WebDriverWait(driver,Duration.ofSeconds(20));// Explicit wait.
		WebElement day = ref.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@aria-label='Day']")));
		
		Select s = new Select(day);
	    s.selectByValue("27");
	    
	    
	    WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
	    
	    Select m = new Select(month);
	    m.selectByIndex(0);
	   
	    
	    WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	    
	    Select y = new Select(year);
	    y.selectByVisibleText("1998");
	}
		
	
	

}
