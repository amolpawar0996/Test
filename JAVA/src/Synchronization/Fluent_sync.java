package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent_sync {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/signup");
	
	Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(15)) //maximum waiting time
			.pollingEvery(Duration.ofSeconds(2)) //Frequency
			.ignoring(NoSuchElementException.class); //Condition
	
	fluentwait.until(new Function<WebDriver,WebElement>(){
		public WebElement apply (WebDriver driver) {
			return driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		}
	});
	}
}
