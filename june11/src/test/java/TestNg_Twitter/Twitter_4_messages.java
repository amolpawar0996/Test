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
import Twitter.TMessages;
import Twitter.TNotification;
import Twitter.TSearch;

public class Twitter_4_messages {
	WebDriver driver;
	TLogin tlgn;
	TLogout tlgt;
	TMessages tmsg;

	@Parameters("browser")

	@BeforeTest
	public void openbrowserm(String browserName) {
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
	public void createobjectm() {

		tlgn = new TLogin(driver);
		tlgt = new TLogout(driver);
		tmsg = new TMessages(driver);

	}

	@BeforeMethod
	public void logintwitter() throws InterruptedException {
		System.out.println("Beforemethod");

		tlgn.opentwitter(driver);

	}

	@Test
	public void Messages() throws InterruptedException {
		System.out.println("Messages");
		tmsg.clkmsg();
		Thread.sleep(2000);
		String msgurl = driver.getCurrentUrl();
		System.out.println(msgurl);
		Assert.assertEquals(msgurl, "https://twitter.com/messages");

		String msgtitle = driver.getTitle();
		System.out.println(msgtitle);
		Assert.assertEquals(msgtitle, "Messages / Twitter");
		Thread.sleep(1000);

		tmsg.clkwritemsg();
		Thread.sleep(2000);
		String mentionurl = driver.getCurrentUrl();
		System.out.println(mentionurl);
		Assert.assertEquals(mentionurl, "https://twitter.com/messages/compose");

		tmsg.clksearchpeople();
		Thread.sleep(2000);
		String stngnurl = driver.getCurrentUrl();
		System.out.println(stngnurl);
		Assert.assertEquals(stngnurl, "https://twitter.com/messages/compose");

		driver.navigate().back();
		Thread.sleep(2000);

		tmsg.msgsetting();
		Thread.sleep(2000);
		String stngsurl = driver.getCurrentUrl();
		System.out.println(stngsurl);
		Assert.assertEquals(stngsurl, "https://twitter.com/messages/settings");
		driver.navigate().back();
		Thread.sleep(2000);

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
		tmsg = null;
		// driver = null;

	}

	@AfterTest
	public void closebrowser() {

		driver.close();
		System.gc(); // garbage collect and object clear delet

	}
}
