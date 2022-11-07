package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxSizeAndgetText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select s = new Select(day);
	   List<WebElement> option = s.getOptions();
	   int size = option.size();
	   System.out.println(size);
	   
	   for(int i=0;i<=size-1;i++) {
		   System.out.println(option.get(i).getText());
	   }
	    
	    
	}
}
