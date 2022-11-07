package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element_Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement dismiss = driver.findElement(By.xpath("//input[@data-action-type='DISMISS']"));
		dismiss.click();

		WebElement signin = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Thread.sleep(2000);

		Actions a = new Actions(driver);

		a.moveToElement(signin).perform();

		WebElement order = driver.findElement(By.xpath("//span[text()='Orders']"));

		a.click(order).perform();
	}

}
