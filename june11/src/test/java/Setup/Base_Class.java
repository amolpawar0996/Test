package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	public static WebDriver openchromedriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amolb\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver openfirefoxdriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\amolb\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;

	}

	public static WebDriver openedgedriver() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\amolb\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		return driver;

	}

}
