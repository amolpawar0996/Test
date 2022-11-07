package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot1 {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		for(int i=0;i<=5;i++) {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String text = RandomString.make();
		
		File dest = new File("C:\\Users\\amolb\\OneDrive\\Screenshot\\demo"+text+".jpg");
		
		FileHandler.copy(src, dest);
		
		
		}
	}

}
