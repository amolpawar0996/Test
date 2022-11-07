package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement display = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		
		boolean result = display.isDisplayed();
		System.out.println(result);
		if(result==true) {
			System.out.println("Element is displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
	}

}
