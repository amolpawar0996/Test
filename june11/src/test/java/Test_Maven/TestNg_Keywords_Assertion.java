package Test_Maven;

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

public class TestNg_Keywords_Assertion {
	WebDriver driver;
	Login log;
	PIN loginpin;
	Home home;
	Logout out;
	Order order;
	
	@BeforeClass
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	    driver = new ChromeDriver(options);
	    driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
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
		
		home = new Home(driver);  //home object
		out = new Logout(driver); //logout object
		order= new Order(driver);
		
		
		}
	
	
	@Test (priority=1,timeOut=3000)  //enabled=false
	public void test() throws InterruptedException {
		System.out.println("test");
		
		home.order();
		Thread.sleep(2000);
		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);
		if(orderurl.equals("https://kite.zerodha.com/orders")) {
			System.out.println("Navigate to correct order page");
		}
		else {
			System.out.println("Navigate to incorrect page");
		}
		 
		//order.clicksearch();
		//Thread.sleep(2000);
		//order.cancelledamo();
		//Thread.sleep(2000);
		//order.closeamo();
		//Thread.sleep(2000);
		order.clickgtt();
		Thread.sleep(2000);
		order.newgttt();
		Thread.sleep(2000);
		order.closegttt();
		Thread.sleep(2000);
	}
	
	@Test  (priority=2,enabled=false)//invocationCount=2
	public void Holding() throws InterruptedException {
		System.out.println("Holding");
		
		home.holdings();
		String orderurl = driver.getCurrentUrl();
		System.out.println(orderurl);
		if(orderurl.equals("https://kite.zerodha.com/holdings")) {
			System.out.println("Navigate to correct holdings page");
		}
		else {
			System.out.println("Navigate to incorrect page");
		}
		
		Thread.sleep(2000);
	}
	@Test   (priority=3,enabled=true)  //dependsOnMethods= "Holding"
	public void Position() throws InterruptedException {
		System.out.println("Position");
		
		home.positions();
		String positionurl = driver.getCurrentUrl();
		System.out.println(positionurl);
		
	// Test Assertion:- SoftAssert (class name)(verify)(Non-Static Methods)
		
		SoftAssert soft = new SoftAssert(); //Create object of soft
			
		/* 1) comparision 2) Apply result on @Test
		   Actual equal to expected = True => TC passed
		   Actual equal to expected = False => TC failed    */
		soft.assertEquals(positionurl, "https://kite.zerodha.com/positions");
		
		/* 1) comparision 2) Apply result on @Test
		   Actual equal to expected = True => TC Failed
    	   Actual equal to expected = False => TC failed    */
		soft.assertNotEquals(positionurl, "https://kite.zerodha.com/positions");
		
					
		boolean result = positionurl.equals("https://kite.zerodha.com/positions");
		/* 1) Apply result on @Test
		   Result = True => TC PASSED
		   Result = False => TC Failed	*/		
					
		soft.assertTrue(result);
		
		
		boolean result1 = positionurl.equals("https://kite.zerodha.com/positions");
		/* 1) Apply result on @Test
		   Result = True => TC Failed
		   Result = False => TC Passed	*/		
					
		soft.assertFalse(result1);
		
    	//Forcefully remove from execution 
		
		soft.fail();
		
		// Apply the soft assertbresults on the @test methods
		soft.assertAll();
	
		}
	
	@Test  (priority=4,enabled=true)
	public void Fund() throws InterruptedException {
		System.out.println("Fund");
		
		home.funds();
		String fundurl = driver.getCurrentUrl();
		System.out.println(fundurl);
		
	// Test Assertion:- Hard Assert (class name-Assert)(validation)(Static Methods)

		
	/*  1)Comparison  2)Apply result on @Test
	     Actual equals to expected = True => Test case passed
	     Actual equals to expected = False => Test case failed   */
		Assert.assertEquals(fundurl, "https://kite.zerodha.com/funds");
		
	/*  1)Comparison  2)Apply result on @Test
	     Actual Notequals to expected = True => Test case failed
	     Actual Notequals to expected = False => Test case passed  */
        Assert.assertNotEquals(fundurl, "https://kite.zerodha.com/funds");
		
        boolean result = fundurl.equals("https://kite.zerodha.com/funds");
/*      1) Apply result on @Test
         Result=True=> Test case passed
         Result=false=> Test case failed           */
        Assert.assertTrue(result);
        
        boolean result1 = fundurl.equals("https://kite.zerodha.com/funds");
/*      1) Apply result on @Test
          Result=True=> Test case failed
          Result=false=> Test case passed       */
          Assert.assertFalse(result1);
          
         //To fail the test case
          Assert.fail();
          
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
