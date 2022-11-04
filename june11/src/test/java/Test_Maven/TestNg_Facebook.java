package Test_Maven;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Facebook.FBHome;
import Facebook.FBLogin;
import Facebook.FBLogout;
import Utilis.Utility_Screenshot;


public class TestNg_Facebook extends Utility_Screenshot  {
	WebDriver driver;
	FBLogin log1 ;
	FBHome home1;
	FBLogout fblogout;
	int tcid;
	
	
	
	
	@BeforeClass
	public void openfacebook(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	    driver = new ChromeDriver(options);
	    driver.get("https://www.facebook.com/login/");
		
	    driver.manage().window().maximize();
	    System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void logintofacebook() throws InterruptedException, IOException {
		System.out.println("Before Method");
		
		log1 = new FBLogin(driver);
		log1.enterPhoneNo();
		log1.enterPWD();
		Thread.sleep(2000);
		//Utility_Screenshot.capturescreenshot(driver, 123);
		Thread.sleep(1000);
		log1.clicklogin();
		Thread.sleep(3000);
		Utility_Screenshot.capturescreenshot(driver, 123);
		
		
		home1= new FBHome(driver);
		fblogout=new FBLogout(driver);
		
	}
	
	@Test
	public void Home() throws InterruptedException {
		tcid = 123;
		System.out.println("Home");
	 
		
		home1.clicksearchbar();
		
		Thread.sleep(2000);
		home1.sumit();
		Thread.sleep(2000);
		home1.sendrequest();
//		Thread.sleep(2000);
//		home1.clickphoto();
//		Thread.sleep(2000);
//		home1.closephoto();
//		Thread.sleep(2000);
		
		
		
	}
	
	
	
	@AfterMethod
	public void Logout(ITestResult result) throws InterruptedException, IOException {
		System.out.println("After Method");
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility_Screenshot.capturescreenshot(driver, tcid);
		}
		fblogout.clicklogout();
		Thread.sleep(2000);
		fblogout.clicklogout();
		driver.switchTo().alert().accept();;
		
		
	}
	
	@AfterClass
	public void closefacebook() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
	

}
