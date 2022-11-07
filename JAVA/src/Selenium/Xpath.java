package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amol@123");//xpath by attribute
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123@14gdhej");//xpath by attribute
		//driver.findElement(By.xpath("//button[@value='1']")).click();// xpath by attribute
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();//xpath by text.
		
	}
}
