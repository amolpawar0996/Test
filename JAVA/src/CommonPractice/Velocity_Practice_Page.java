package CommonPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Velocity_Practice_Page {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://vctcpune.com/selenium/practice.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   
	    //Radio Button Example
	    driver.findElement(By.xpath("//input[contains(@value,'Radio1')]")).click();
	    
	    //Suggession Class Example
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Type to Select Countries')]")).sendKeys("India");
	    Thread.sleep(2000);
	    
	    //Dropdown Example
	    WebElement option = driver.findElement(By.xpath("//select[contains(@id,'dropdown-class-example')]"));
	    Select s = new Select(option);
	    s.selectByIndex(2);
	    Thread.sleep(2000);
	    
	    //Checkbox Example
	    driver.findElement(By.xpath("//input[contains(@value,'option2')]")).click();
	    Thread.sleep(2000);
	    
	    //Switch Tab Example
	    driver.findElement(By.xpath("//a[text()='Open Tab']")).click();
	    Set<String> ids = driver.getWindowHandles();
	    ArrayList<String> a = new ArrayList<String>(ids);
	    String cbid = a.get(1);
	    driver.switchTo().window(cbid);
	    driver.findElement(By.xpath("//a[text()='Velocity Foundation'][1]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().window(a.get(0));
	    
	    // Switch To Alert Example
	    driver.findElement(By.xpath("//input[contains(@name,'enter-name')]")).sendKeys("Amol");
	    driver.findElement(By.xpath("//input[contains(@id,'alertbtn')]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    driver.findElement(By.xpath("//input[contains(@id,'confirmbtn')]")).click();
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    
	    //Web Table Example
	    List<WebElement> row = driver.findElements(By.xpath("//table[@id='product']//tr"));
        System.out.println(row.size());
		
		for(int i=1; i<row.size(); i++) {
		List<WebElement> cell = driver.findElements(By.xpath("//table[@id='product']//tr["+(i+1)+"]//td"));
		System.out.println("Row NO : " +i+ " No of Cell " + cell.size());
			for(int j=0; j<cell.size(); j++) {
				System.out.print(cell.get(j).getText()+",  ");
			}
		System.out.println();	
		}
		//Thread.sleep(2000);
		
		//Element Displayed Example
	    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
	    Thread.sleep(2000);	    driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("Amol Pawar");
	    Thread.sleep(2000);
	    
	    //Mouse Hover Example
       WebElement mouse = driver.findElement(By.xpath("//button[@id='mousehover']"));
	    
	    Actions aa = new Actions(driver);
	    aa.moveToElement(mouse).perform();
	    Thread.sleep(2000);
	    WebElement order = driver.findElement(By.xpath("//a[text()='Top']"));
	    aa.click(order).perform();
	    
	    //Pop-up Example
	    driver.findElement(By.xpath("//div[contains(@class,'popup')]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[contains(@class,'popup')]")).click();
	    Thread.sleep(2000);
	    
	    //Auto Suggestive Dropdown Example
	    WebElement district = driver.findElement(By.xpath("//input[@list='mah-district']"));
	    
	     district.sendKeys("Aurangabad");
	   // Select s1 = new Select(district);
	   // s1.selectByIndex(3);
	    Thread.sleep(2000);
	    
	    //Calendar Example
       driver.findElement(By.xpath("//input[@placeholder='select date...']")).sendKeys("29/09/2022");
		
	  //Software Testing (Manual+ Automation) Testing
	    driver.findElement(By.xpath("(//a[text()='Read More'])[1]")).click();
	
	
	
	}

}
