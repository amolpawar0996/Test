package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(3000);
	
	driver.findElement(By.tagName("button")).click();
   // driver.findElement(By.id("email")).sendKeys("amol@123");
   // driver.findElement(By.id("email")).sendKeys("amol@1234567");
	//driver.findElement(By.id("pass")).sendKeys("123@amol");
	//driver.findElement(By.tagName("button")).click();
	driver.findElement(By.name("email")).sendKeys("amol@123");
	
	
	//driver.findElement(By.tagName("input")).sendKeys("amol@123");
	driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
    }
}
