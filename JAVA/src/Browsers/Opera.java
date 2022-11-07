package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;


public class Opera {
	public static void main(String[] args) {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\amolb\\Downloads\\operadriver_win64\\operadriver.exe");
		
		WebDriver driver= new OperaDriver();
		driver.get("https://twitter.com/");
	}

}
