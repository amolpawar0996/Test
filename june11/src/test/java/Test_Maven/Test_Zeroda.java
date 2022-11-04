package Test_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Zeroda.Home;
import Zeroda.Login;
import Zeroda.PIN;

public class Test_Zeroda {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
	   
	    
	    driver.manage().window().maximize();
	    driver.get("https://kite.zerodha.com/");
	
	    Login log = new Login(driver);
	    log.enterUN();
	    log.enterPW();
	    log.login();
	    Thread.sleep(5000);
	    
	    
	    PIN enterpin = new PIN(driver);
	    enterpin.enterpin();
	    enterpin.continueclick();
	    Thread.sleep(5000);
	    
	    Home homepage = new Home(driver);
	    
	    homepage.order();
	    
	    
	    
	}
	
}
	
	