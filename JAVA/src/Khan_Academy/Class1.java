package Khan_Academy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.khanacademy.org/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@id='login-or-signup']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='uid-login-form-0-wb-id-identifier-field']"))
				.sendKeys("amolbpawar8654@gmail.com");
		driver.findElement(By.xpath("//input[@id='uid-labeled-text-field-1-wb-id-field']")).sendKeys("Amol@0996");

		driver.findElement(By.xpath("//button[@data-test-id='log-in-submit-button']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@data-test-id='learn-menu-button']")).click();
		driver.findElement(By.xpath("//span[text()='Class 1']")).click();
		driver.findElement(By.xpath("//a[@class='_1rhl3qm4']")).click();
		driver.findElement(By.xpath("//a[@class='_1lrvdlvw']")).click();
		Thread.sleep(2000);

		WebElement src = driver.findElement(By.xpath("//div[@class='card stack']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='perseus-clearfix draggable-box']"));

		Actions action = new Actions(driver);

		for (int i = 1; i <= 2; i++) {

			action.dragAndDrop(src, dest).build().perform();
		}
		driver.findElement(By.xpath("//button[@class='_rz7ls7u']")).click();

	}

}
