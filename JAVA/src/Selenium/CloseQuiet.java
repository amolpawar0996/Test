
//Program for Close the Current tab, Close the Browser.

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuiet {
        public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
		
		Thread.sleep(3000);
		
		driver.close(); //close method is used to close current tab.
		
		//driver.quit();  //quit method is used to close the Browser.
	}

}
