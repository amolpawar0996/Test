package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSignPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/register?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_newcust");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Amol Pawar");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("9673860996");
	    driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("amolpawar6243@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("amol@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[contains(@id,'continue')]")).click();
	    Thread.sleep(4000);
	    
	    
	  
	
	}

}
