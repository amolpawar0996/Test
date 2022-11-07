 

//ACTION CLASS,guru99, DragandDrop.

package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/drag_drop.html");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	    WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        
	    WebElement des=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		 
	    Actions action = new Actions(driver);
		 
	    //action.moveToElement(src).clickAndHold().moveToElement(des).release().build().perform();
	   action.dragAndDrop(src, des).build().perform();
	  
	    	
	    	
	    	        
	    			 
	    			
	    			
	    			
	    			
	    			

	    	
	}

}
