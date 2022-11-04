package Test_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Flipcart.Cart;
import Flipcart.FLogin;
import Flipcart.FLogout;
import Flipcart.search;

public class TestNg_Flipcart_1 {
	WebDriver driver;
	FLogin lg;
	FLogout out;
	search s;
	Cart crt;

	@BeforeClass
	public void openbrowser() throws InterruptedException {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		lg = new FLogin(driver);
		s = new search(driver);
		out = new FLogout(driver);
		crt = new Cart(driver);

	}

	@BeforeMethod
	public void EnterCre() throws InterruptedException {
		System.out.println("BeforeMethod");
		Thread.sleep(2000);
		lg.enterUN();

	}

	@Test
	public void test() throws InterruptedException {
		System.out.println("test");

		// String url = driver.getCurrentUrl();
		// Assert.assertEqua
}
}

