package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxIsMultiselectableOrNot {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select s = new Select(day);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("List Box is Multiple selected");
		}
		else {
			System.out.println("List Box is not Multiple selected");
		}
		Thread.sleep(3000);*/
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		Thread.sleep(2000);
		
        WebElement multiple = driver.findElement(By.xpath("(//select[@class='select select-initialized'])[4]"));
		
		Select a = new Select(multiple);
		
		boolean Result = a.isMultiple();
		System.out.println(Result);
		
		if(Result==true) {
			System.out.println("List Box is Multiple selected");
		}
		else {
			System.out.println("List Box is not Multiple selected");
		}
		
	}
}
