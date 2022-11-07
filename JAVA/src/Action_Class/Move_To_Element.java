
//ACTION CLASS,Flipcart,
/*Dropdown:-Options will be displayed if we move angular pointer on
   any element that options are known as dropdown.*/

package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//button[text()='✕']")).click();
	    Thread.sleep(2000);
	    WebElement log = driver.findElement(By.xpath("//a[text()='Login']"));
	    
	    Actions a = new Actions(driver);
	    a.moveToElement(log).perform();
	    WebElement order = driver.findElement(By.xpath("//div[text()='Orders']"));
	    a.click(order).perform();
	 }

}
