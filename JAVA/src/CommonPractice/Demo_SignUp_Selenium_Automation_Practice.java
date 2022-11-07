package CommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_SignUp_Selenium_Automation_Practice {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    //To fetch and Validate url.
	  	String url = driver.getCurrentUrl();
	  	System.out.println(url);
		String ExpectedURL = "https://www.techlistic.com/p/selenium-practice-form.html";
	  	if(url.equals(ExpectedURL)) {
	  	System.out.println("URL is correct");
	  	}
	  	else {
	  		System.out.println("URL is not correct");
	  	}
	  	Thread.sleep(2000);
		//To check the Heading.
	  	WebElement Heading = driver.findElement(By.xpath("//h3[@class='post-title entry-title']"));
	  	String text = Heading.getText();
		System.out.println(text);
	  	String ExpectedText = "Demo Sign-Up Selenium Automation Practice Form";
	  	if(text.equals(ExpectedText)) {
	  		System.out.println("The Heading is correct");
	  	}
	 	else {
	  		System.out.println("The Heading is not correct");
	  	}
	  	
	  	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Amol");
	  	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
	  	Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	    driver.findElement(By.xpath("//input[@name='exp'][2]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("19/09/2022");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	    driver.findElement(By.xpath("//input[@id='tool-2']")).click();
	    
	    driver.findElement(By.xpath("/select[@name='continents']")).click();
	    driver.findElement(By.xpath("//option[text()='Asia']")).click();
	   
	
	
	
	
	}
}
