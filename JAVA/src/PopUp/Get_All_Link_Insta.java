package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Link_Insta {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(2000);
        
        List<WebElement> Links = driver.findElements(By.xpath("//a"));
        System.out.println(Links.size()); //size of link present on webpage
        
        for(int i=1; i<Links.size(); i++) {//String Concatination
        	//System.out.println(Links.get(i).getText());
        	System.out.println(Links.get(i).getText()+" :- "+Links.get(i).getAttribute("href"));
        }
        
        
        
	}

}
