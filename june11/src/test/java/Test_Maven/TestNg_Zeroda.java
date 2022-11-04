package Test_Maven;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Zeroda.Home;
import Zeroda.Login;
import Zeroda.Logout;
import Zeroda.Order;
import Zeroda.PIN;

public class TestNg_Zeroda {
	WebDriver driver;
	Login log;
	PIN loginpin;
	Home home;
	Logout out;
	Order order;
	SoftAssert soft;

	@BeforeClass
	public void openbrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void logintoapplication() throws InterruptedException {
		System.out.println("Before Method");

		log = new Login(driver);
		log.enterUN();
		log.enterPW();
		log.login();

		loginpin = new PIN(driver);
		Thread.sleep(3000);
		loginpin.enterpin();

		loginpin.continueclick();

		home = new Home(driver); // home object
		out = new Logout(driver); // logout object
		order = new Order(driver);
		soft = new SoftAssert();

	}

	@Test(priority = 1) // enabled=false
	public void test() throws InterruptedException {
		System.out.println("test");

		home.order();
		Thread.sleep(2000);

		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);

		Assert.assertEquals(orderurl, "https://kite.zerodha.com/orders");
		order.clicktrades();
		Thread.sleep(2000);
		order.opengetstart();
		Thread.sleep(2000);
		order.entersearch();
		Thread.sleep(2000);
		order.clicktata();
		Thread.sleep(2000);
		order.closetata();
		Thread.sleep(4000);
//		order.clicksearch();
//		
//		Thread.sleep(2000);
//		order.cancelledamo();
//		
//	   Thread.sleep(2000);
//		order.closeamo();

		// Thread.sleep(2000);

		order.clickgtt();
		Thread.sleep(2000);
		order.newgttt();
		Thread.sleep(2000);
		order.closegttt();
		Thread.sleep(2000);
	}

	@Test(priority = 2, enabled = false) // invocationCount=2
	public void Holding() throws InterruptedException {
		System.out.println("Holding");

		home.holdings();
		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);
		if (orderurl.equals("https://kite.zerodha.com/holdings")) {
			System.out.println("Navigate to correct holdings page");
		} else {
			System.out.println("Navigate to incorrect page");
		}

		Thread.sleep(2000);
	}

	@Test(priority = 3, enabled = false) // dependsOnMethods= "Holding"
	public void Position() throws InterruptedException {
		System.out.println("Position");

		home.positions();
		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);
		if (orderurl.equals("https://kite.zerodha.com/positions")) {
			System.out.println("Navigate to correct positions page");
		} else {
			System.out.println("Navigate to incorrect page");
		}

		Thread.sleep(2000);
	}

	@Test(priority = 4, enabled = false)
	public void Fund() throws InterruptedException {
		System.out.println("Fund");

		home.funds();
		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);
		if (orderurl.equals("https://kite.zerodha.com/funds")) {
			System.out.println("Navigate to correct funds page");
		} else {
			System.out.println("Navigate to incorrect page");
		}
		// Assert.fail();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logout() {
		System.out.println("After Method");
		out.clickonlogout();
		out.changeuser();
	}

	@AfterClass
	public void closetab() {
		System.out.println("After class");
		driver.close();
	}

}
