package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		Set<String> ids = driver.getWindowHandles();

		ArrayList<String> a1 = new ArrayList<String>(ids);

		String cbid = a1.get(1);
		driver.switchTo().window(cbid);

		driver.findElement(By.xpath("//span[text()='Training']")).click();
		Thread.sleep(2000);

		driver.switchTo().window(a1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='home']")).click();

	}

}
