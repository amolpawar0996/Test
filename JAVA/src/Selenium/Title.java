
//Program for to check the title of current URL and Also validate the the Actual and Expected title.

package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
        public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vctcpune.com/");
	      
		String title = driver.getTitle();
		System.out.println(title);
		
		String expectedtitle = "Velocity | Best software testing centre in Pune and Mumbai";
        
		if(title.equalsIgnoreCase(expectedtitle)) {
			System.out.println("Navigate to correct Page");
		}
		else {
			System.out.println("Navigated to incorrect Page");
		}
		
     }

}
