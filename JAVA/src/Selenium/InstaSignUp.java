package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaSignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("9673860996");
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("AmolPawar");
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("amol_pawar_patil");
		driver.findElement(By.xpath("(//input[contains(@type,'password')])")).sendKeys("amol@123");
	    
	}

}
