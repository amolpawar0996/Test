package CommonPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adesh {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		 driver.findElement(By.xpath("//div[@id='msdd']"));
		 driver.findElement(By.xpath("//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'English')]")).click();

		driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
		WebElement var = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		var.sendKeys("India");
		Thread.sleep(1000);
		var.click();
		driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"))
				.click();

	}

}
