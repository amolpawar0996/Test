
//Program to OPEN Browser and hit the URL

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartSelenium {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();//create the object of chrome driver w r t web driver.
		
		driver.get("https://meet.google.com/");
	    
		
	
	}

}
