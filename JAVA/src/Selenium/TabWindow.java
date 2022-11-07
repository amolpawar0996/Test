
//Program to open new TAB and new WINDOW.

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
