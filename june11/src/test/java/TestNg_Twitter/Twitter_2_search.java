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

import Twitter.THome;
import Twitter.TLogin;
import Twitter.TLogout;
import Twitter.TSearch;

public class Twitter_2_search {
	WebDriver driver;
	TLogin tlgn;
	TLogout tlgt;
	TSearch tsearch;

	@Parameters("browser")

	@BeforeTest
	public void openbrowsers(String browserName) {
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
	public void createobjects() {

		tlgn = new TLogin(driver);
		tlgt = new TLogout(driver);
		tsearch = new TSearch(driver);

	}

	@BeforeMethod
	public void logintwitter() throws InterruptedException {
		System.out.println("Beforemethod");

		tlgn.opentwitter(driver);

	}

	@Test
	public void SearchSend() throws InterruptedException {
		System.out.println("SearchSend");
		tsearch.clicksearch();
		Thread.sleep(2000);
		String searchurl = driver.getCurrentUrl();
		System.out.println(searchurl);
		Assert.assertEquals(searchurl, "https://twitter.com/explore");

		String searchtitle = driver.getTitle();
		System.out.println(searchtitle);
		Assert.assertEquals(searchtitle, "Explore / Twitter");
		Thread.sleep(1000);

		tsearch.trending();
		Thread.sleep(2000);
		String trendingurl = driver.getCurrentUrl();
		System.out.println(trendingurl);
		Assert.assertEquals(trendingurl, "https://twitter.com/explore/tabs/trending");

		tsearch.news();
		Thread.sleep(2000);
		String newsurl = driver.getCurrentUrl();
		System.out.println(newsurl);
		Assert.assertEquals(newsurl, "https://twitter.com/explore/tabs/news_unified");

		tsearch.sports();
		Thread.sleep(2000);
		String sportsurl = driver.getCurrentUrl();
		System.out.println(sportsurl);
		Assert.assertEquals(sportsurl, "https://twitter.com/explore/tabs/sports_unified");

		tsearch.entertainment();
		Thread.sleep(2000);
		String entmnturl = driver.getCurrentUrl();
		System.out.println(entmnturl);
		Assert.assertEquals(entmnturl, "https://twitter.com/explore/tabs/entertainment_unified");

		tsearch.searchbox();
		Thread.sleep(2000);
		tsearch.searchsetting();

		String searchstngurl = driver.getCurrentUrl();
		System.out.println(searchstngurl);
		Assert.assertEquals(searchstngurl, "https://twitter.com/settings/explore");

		tsearch.clssearchsetting();

	}

	@AfterClass
	public void Clearobject() {
		tlgn = null;
		tlgt = null;
		tsearch=null;
		// driver = null;

	}

	@AfterTest
	public void closebrowser() {

		driver.close();
		System.gc(); // garbage collect and object clear delet

	}

}
