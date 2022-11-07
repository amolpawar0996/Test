package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSignUpPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://support.google.com/mail/answer/56256?hl=en");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[contains(@class,'action-button')]")).click();
	    Thread.sleep(2000);
	    driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Amol");
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Pawar");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("amolpawar6243@gmail.com");
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("amol@12345");
	    driver.findElement(By.xpath("(//input[contains(@type,'password')])[2]")).sendKeys("amol@12345");
	    driver.findElement(By.xpath("//input[contains(@type,'checkbox')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[contains(@jsname,'')])[2]")).click();
	    Thread.sleep(2000); 
	    
	    }

}
