package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPageFacebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?next=https%3A%2F%2Fwww.facebook.com%2Fcampaign%2Flanding.php%3Fcampaign_id%3D14884913640%26extra_1%3Ds%257Cc%257C589460569885%257Cb%257Cfb%2Bsign%257C%26placement%26creative%3D589460569885%26keyword%3Dfb%2Bsign%26partner_id%3Dgooglesem%26extra_2%3Dcampaignid%253D14884913640%2526adgroupid%253D128696221832%2526matchtype%253Db%2526network%253Dg%2526source%253Dnotmobile%2526search_or_content%253Ds%2526device%253Dc%2526devicemodel%253D%2526adposition%253D%2526target%253D%2526targetid%253Dkwd-296321047089%2526loc_physical_ms%253D1007788%2526loc_interest_ms%253D%2526feeditemid%253D%2526param1%253D%2526param2%253D%26gclid%3DCjwKCAjw9suYBhBIEiwA7iMhNPx5DynctMIeUtgER1UWxavI-vYST-HORtdwd6vfYzYZ1G2xnAv-3xoCF7AQAvD_BwE&locale=en_GB&display=page");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("Amol");
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[2]")).sendKeys("Pawar");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("9673860996");
	    driver.findElement(By.xpath("(//input[contains(@type,'password')])")).sendKeys("amol@123");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//select[contains(@name,'birthday_day')])")).sendKeys("27");
	    driver.findElement(By.xpath("//select[contains(@name,'birthday_month')]")).sendKeys("Jan");
	    driver.findElement(By.xpath("//select[contains(@name,'birthday_year')]")).sendKeys("1998");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
	    Thread.sleep(3000);
	
	
	}

}
