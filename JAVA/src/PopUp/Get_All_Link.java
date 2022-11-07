package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
        List<WebElement> link = driver.findElements(By.xpath("//a"));
        System.out.println(link.size());
        
       for(int i=1; i<link.size(); i++) {
    	   //System.out.println(link.get(i).getText());
           System.out.println(link.get(i).getText()+" :- "+link.get(i).getAttribute("href"));
       }
     }
       
}

