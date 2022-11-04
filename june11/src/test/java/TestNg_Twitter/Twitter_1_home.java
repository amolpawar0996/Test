package TestNg_Twitter;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Setup.Base_Class;
import Twitter.THome;
import Twitter.TLogin;
import Twitter.TLogout;
import Utilis.Utility_Screenshot;

public class Twitter_1_home extends Base_Class {
	WebDriver driver;
	TLogin tlgn;
	TLogout tlgt;
	THome thome;
	int tcid;

	@Parameters("browser")

	@BeforeTest
	public void openbrowser(String browserName) {
		System.out.println(browserName);

		if (browserName.equals("Chrome")) {
			driver = openchromedriver();
		}

		if (browserName.equals("Firefox")) {
			driver = openfirefoxdriver();
		}
		if (browserName.equals("Edge")) {

			driver = openedgedriver();
		}

		driver.get("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void ctreateobject() {

		tlgn = new TLogin(driver);
		tlgt = new TLogout(driver);
		thome = new THome(driver);

	}

	@BeforeMethod
	public void logintwitter() throws InterruptedException {
		System.out.println("Beforemethod");
		tlgn.opentwitter(driver);

	}

	@Test(priority = 1, enabled = true)
	public void HomeGIF() throws InterruptedException {
		tcid = 12345;
		String loginurl = driver.getCurrentUrl();
		System.out.println(loginurl);
		Assert.assertEquals(loginurl, "https://twitter.com/i/flow/login");

		System.out.println("HomeGIF");

		thome.gif();
		String gifurl = driver.getCurrentUrl();
		System.out.println(gifurl);
		Assert.assertEquals(gifurl, "https://twitter.com/i/foundmedia/s");

		thome.closegif();

		String homeurl = driver.getCurrentUrl();
		System.out.println(homeurl);
		Assert.assertEquals(homeurl, "https://twitter.com/home");

		String hometitle = driver.getTitle();
		System.out.println(hometitle);
		Assert.assertEquals(hometitle, "Home / Twitter");
		Thread.sleep(1000);

	}

	@Test(priority = 2, enabled = false)
	public void HomeAddPoll() throws InterruptedException {
		System.out.println("HomeAddPoll");

		thome.addpoll();

		thome.closeaddpoll();
		Thread.sleep(1000);
	}

	@Test(priority = 3, enabled = false)
	public void HomeScheduleTweet() throws InterruptedException {
		System.out.println("HomeScheduleTweet");
		thome.scheduletweet();
		String schurl = driver.getCurrentUrl();
		System.out.println(schurl);
		Assert.assertEquals(schurl, "https://twitter.com/compose/tweet/schedule");

		thome.closescheduletweet();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void logouttwitter(ITestResult result) throws InterruptedException, IOException {
		System.out.println("After method");
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility_Screenshot.capturescreenshot(driver, tcid);
		}
		tlgt.closetwitter(driver);
	}

	@AfterClass
	public void Clearobject() {
		tlgn = null;
		tlgt = null;
		thome = null;
		// driver = null;

	}

	@AfterTest
	public void closebrowser() {

		driver.close();
		System.gc(); // garbage collect and object clear delete

	}

}
