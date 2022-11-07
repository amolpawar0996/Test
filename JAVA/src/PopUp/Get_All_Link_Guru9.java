package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_All_Link_Guru9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(2000);
        
        List<WebElement> Link = driver.findElements(By.xpath("//a"));
        System.out.println(Link.size());
        
        for(int i=1; i<Link.size(); i++) {
        	//System.out.println(Link.get(i).getText());
        	System.out.println(Link.get(i).getText()+" :- "+Link.get(i).getAttribute("href"));
        }
	}

}
