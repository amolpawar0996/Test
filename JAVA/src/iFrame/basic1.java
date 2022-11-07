
/*iFrame:- Displaying webpage as a part of another web page is known as iFrame.
  iFrame will be created by using tagname iframe.*/

package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().parentFrame(); // focus diverted to parent frame
		// driver.switchTo().defaultContent(); //focus diverted to main frame
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}

}
