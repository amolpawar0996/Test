
/*1) If we use driver.switchTo().parentFrame(); then it will navigate from
  child frame to immediate parent frame.
  2) If we use driver.switchTo().defaultContent(); then it will navigate from
  any child to main page.*/

package iFrame;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); // url where iframe is present
		// url where iframe is present
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		// iframe xpath iframe location
		
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		//driver.switchTo().parentFrame();
		
		// selenium focus diverted to main page 
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(2000);
		
		ArrayList<String> addr = new ArrayList<String> (driver.getWindowHandles());
		 
	    driver.switchTo().window(addr.get(1));
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@title='Video Tutorials'])[1]")).click();

}

}
