package Testing;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilis.Utility_Screenshot;

public class TestNG2 {
	WebDriver driver;
	int tcid;

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("Before suit from TestNG2");

	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("Before test from TestNG2");

	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("Before class");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("Before Method");

	}

	@Test
	public void testA() {

		System.out.println("testA running from TestNG2");

	}

	@Test
	public void testB() {
		int tcid = 123;
		System.out.println("testB  running from TestNG2");

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		System.out.println("after Method");

		if (ITestResult.FAILURE == result.getStatus()) {
			Utility_Screenshot.capturescreenshot(driver, tcid);
		}
	}

	@AfterClass
	public void afterclass() {

		System.out.println("after class");

	}

	@AfterTest
	public void afterTest() {

		System.out.println("After test from TestNG2");

	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("After suit from TestNG2");

	}

}
