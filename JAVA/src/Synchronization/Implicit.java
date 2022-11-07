package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Implicit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.get("https://www.facebook.com/signup");
	
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// Implicit wait.
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select s = new Select(day);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("List Box is Multiple selected");
		}
		else {
			System.out.println("List Box is not Multiple selected");
		}
		
	
	}

}
