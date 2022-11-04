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
import Twitter.TProfile;

public class Twitter_5_profile {
	WebDriver driver;
	TLogin tlgn;
	TLogout tlgt;
	TProfile tprfl;
	
	@Parameters("browser")

	@BeforeTest
	public void openbrowserp(String browserName) {
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
	public void createobjectp() {
		
		tlgn = new TLogin(driver);
		tlgt = new TLogout(driver);
		tprfl = new TProfile(driver);

	}

	@BeforeMethod
	public void logintwitter() throws InterruptedException {
		System.out.println("Beforemethod");

		tlgn.opentwitter(driver);

	}

	@Test
	public void Profile() throws InterruptedException {
		System.out.println("Profile");
		tprfl.clkprofile();
		Thread.sleep(2000);
		String prflurl = driver.getCurrentUrl();
		System.out.println(prflurl);
		// Assert.assertEquals(prflurl, "https://twitter.com/messages");

		String prfltitle = driver.getTitle();
		System.out.println(prfltitle);
		// Assert.assertEquals(prfltitle, "Messages / Twitter");
		Thread.sleep(1000);

		tprfl.clkreplies(driver);
		Thread.sleep(2000);
		String replyurl = driver.getCurrentUrl();
		System.out.println(replyurl);
		// Assert.assertEquals(replyurl, "https://twitter.com/messages/compose");

		tprfl.clkmedia();
		Thread.sleep(2000);
		String mediaurl = driver.getCurrentUrl();
		System.out.println(mediaurl);
		// Assert.assertEquals(mediaurl, "https://twitter.com/messages/compose");

		tprfl.clklike();
		Thread.sleep(2000);
		String likeurl = driver.getCurrentUrl();
		System.out.println(likeurl);
		//Assert.assertEquals(likeurl, "https://twitter.com/messages/settings");
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
		tprfl = null;
		// driver = null;

	}

	@AfterTest
	public void closebrowser() {

		driver.close();
		System.gc(); // garbage collect and object clear delet

	}

}
