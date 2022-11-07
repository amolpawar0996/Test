package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@name='alertbox']")).click();
	    Thread.sleep(2000);
	    
	   driver.switchTo().alert().accept();
	   
	   driver.findElement(By.xpath("//button[text()='Confirm Alert Box']")).click();
	   Thread.sleep(2000);
	   driver.switchTo().alert().dismiss();
	   Thread.sleep(2000);
	}
}
