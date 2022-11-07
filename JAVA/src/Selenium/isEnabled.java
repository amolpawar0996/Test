package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    Thread.sleep(2000);
	    
	    WebElement loginbutton = driver.findElement(By.xpath("//button[@value='1']"));
	    
	    if (loginbutton.isEnabled()) {
	    	System.out.println("Element is enabled");
	    }
	    else {
	    	System.out.println("Element is disabled");
	    }
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    driver.get("https://www.instagram.com/");
	    Thread.sleep(2000);
	    
	    WebElement LogIn = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
	    Thread.sleep(2000);
	    
	    if (LogIn.isEnabled()) {
	    	System.out.println("Element is enabled");
	    }
	    else {
	    	System.out.println("Element is disabled");
	    }
	    
	}
}
