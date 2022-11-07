package PopUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Data {
	public static void main(String[] args) throws InterruptedException {
		
					
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		//driver.manage().window().maximize();
				
		// no. of rows present in webtable
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(row.size());
		
		for(int i=1; i<row.size(); i++) {
		List<WebElement> cell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		//System.out.println(cell.size());
		
		
			System.out.println("Row NO : " +i+ " No of Cell " + cell.size());
			
			for(int j=0; j<cell.size(); j++) {
				System.out.print(cell.get(j).getText()+",  ");
			}
		System.out.println();	
		}		
	}
			
}


