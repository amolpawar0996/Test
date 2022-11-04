package TestNg_Twitter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Twitter.TLogin;
import Twitter.TLogout;
import Twitter.TNotification;
import Twitter.TSearch;

public class Twitter_3_notification {
	WebDriver driver;
	TLogin tlgn;
	TLogout tlgt;
	TSearch tsearch;
	TNotification tnote;

	@Parameters("browser")

	@BeforeTest
	public void openbrowsern(String browserName) {
		System.out.println(browserName);

		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");

			driver = new ChromeDriver();
		}

		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\amolb\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

			driver = new FirefoxDriver();
		}
		if (browserName.equals("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\amolb\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}

		driver.get("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void createobjectn() {

		tlgn = new TLogin(driver);
		tlgt = new TLogout(driver);
		tsearch = new TSearch(driver);
		tnote = new TNotification(driver);

	}

	@BeforeMethod
	public void logintwitter() throws InterruptedException {
		System.out.println("Beforemethod");

		tlgn.opentwitter(driver);

	}

	@Test
	public void Notifications() throws InterruptedException {
		System.out.println("Notifications");
		tnote.clknotification();
		Thread.sleep(2000);
		String ntfcnurl = driver.getCurrentUrl();
		System.out.println(ntfcnurl);
		Assert.assertEquals(ntfcnurl, "https://twitter.com/notifications");

		String ntfcntitle = driver.getTitle();
		System.out.println(ntfcntitle);
		Assert.assertEquals(ntfcntitle, "Notifications / Twitter");
		Thread.sleep(1000);

		tnote.mentions();
		Thread.sleep(2000);
		String mentionurl = driver.getCurrentUrl();
		System.out.println(mentionurl);
		Assert.assertEquals(mentionurl, "https://twitter.com/notifications/mentions");

		tnote.clksetting();
		Thread.sleep(2000);
		String stngnurl = driver.getCurrentUrl();
		System.out.println(stngnurl);
		Assert.assertEquals(stngnurl, "https://twitter.com/settings/notifications");

		// tnote.back();
		driver.navigate().back();

	}

	@AfterMethod
	public void logouttwitter() throws InterruptedException {
		System.out.println("After mehod");
		tlgt.closetwitter(driver);
	}

	@AfterClass
	public void Clearobject() {
		tlgn = null;
		tlgt = null;
		tnote = null;
		// driver = null;

	}

	@AfterTest
	public void closebrowser() {

		driver.close();
		System.gc(); // garbage collect and object clear delet

	}

}
