package Khan_Academy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_info {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
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
		driver.findElement(By.xpath("//div[@class='user-deets editable']")).click();

	}

}
