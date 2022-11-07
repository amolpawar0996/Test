package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		for (int i = 0; i <= 3; i++) {
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		}
		Set<String> ids = driver.getWindowHandles();

		ArrayList<String> a1 = new ArrayList<String>(ids);

		String cbid = a1.get(1);
		driver.switchTo().window(cbid);

		driver.findElement(By.xpath("//span[text()='Training']")).click();
		Thread.sleep(2000);

		driver.switchTo().window(a1.get(3));
		Thread.sleep(2000);

		String title = driver.getTitle();
		System.out.println(title);
		String ExpectedTitle = "Home - qavalidation";
		if (title.equals(ExpectedTitle)) {
			System.out.println("Navigate to correct page");
		} else {
			System.out.println("Navigated to incorrect page");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//a[@title='Contact me'])[2]")).click();

	}

}
