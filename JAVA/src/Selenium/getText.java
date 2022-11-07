package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//div[@class='mbs _52lq _9bp_ fsl fwb fcb']"));
		String result = text.getText();
		System.out.println(result);
	}
}
