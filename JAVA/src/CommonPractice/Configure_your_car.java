package CommonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Configure_your_car {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\amolb\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
	    Thread.sleep(2000);
	    // To Fetch and Validate Title.
	    String title = driver.getTitle();
		System.out.println(title);
		String ExpectedTitle = "Build my Car - Configuration";
		if(title.equals(ExpectedTitle)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigated to incorrect page");
		}
		//To fetch and Validate url.
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String ExpectedURL = "http://www.cookbook.seleniumacademy.com/Config.html";
		if(url.equals(ExpectedURL)) {
			System.out.println("URL is correct");
		}
		else {
			System.out.println("Url is not correct");
		}
		Thread.sleep(2000);
		//To check the Heading.
		WebElement Heading = driver.findElement(By.xpath("//h2[text()='Configure Your Car']"));
		String text = Heading.getText();
		System.out.println(text);
		String ExpectedText = "Configure Your Car";
		if(text.equals(ExpectedText)) {
			System.out.println("The Heading is correct");
		}
		else {
			System.out.println("The Heading is not correct");
		}
		Thread.sleep(2000);
		//Operate Listbox Element.
		WebElement Car = driver.findElement(By.xpath("//select[@name='make']"));
		Select s = new Select(Car);
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		
		WebElement FuelType= driver.findElement(By.xpath("//input[@value='Petrol']"));
		FuelType.click();
		boolean result = FuelType.isSelected();
		if(result==true) {
			System.out.println("Petrol is selected");
		}
		else {
			System.out.println("Petrol is not selected");
		}
		
		WebElement TypeFuel = driver.findElement(By.xpath("//input[@value='Diesel']"));
	   //TypeFuel.click();
		boolean res = TypeFuel.isSelected();
	    if(res==true) {
	    	System.out.println("Diesel is selected");
	    }
	    else {
	    	System.out.println("Diesel is not selected");
	    }
	    Thread.sleep(2000);
	    
       WebElement option1 = driver.findElement(By.xpath("//input[@name='abs']"));
	   if (option1.isEnabled()) {
		   option1.click();
	   }
	   else {
	    	System.out.println("ABS Element is disabled");
	   }
	   WebElement option2 = driver.findElement(By.xpath("//input[@name='airbags']"));
	   if (option2.isEnabled()) {
		   option2.click();
	   }
	   else {
	    	System.out.println("AIRBAGS Element is disabled");
	   }
	   WebElement option3 = driver.findElement(By.xpath("//input[@name='parksensor']"));
	   if (option3.isEnabled()) {
		   option3.click();
	   }
	   else {
	    	System.out.println("Parking Sensor Element is disabled");
	   }
	   WebElement option4 = driver.findElement(By.xpath("//input[@name='ledheadlamp']"));
	   if (option4.isEnabled()) {
		   option4.click();
	   }
	   else {
	    	System.out.println("LED Head Lamp Element is disabled");
	   }
	   
	   driver.findElement(By.xpath("//option[contains(@value,'bl')]")).click();
	   driver.findElement(By.xpath("//option[contains(@value,'wt')]")).click();
	   driver.findElement(By.xpath("//option[contains(@value,'rd')]")).click();
	   driver.findElement(By.xpath("//option[contains(@value,'br')]")).click();
	   driver.findElement(By.xpath("//option[contains(@value,'sl')]")).click();
	   Thread.sleep(2000);
	  
	   WebElement Helpbutton = driver.findElement(By.xpath("//button[contains(@id,'helpbutton')]"));
	   Helpbutton.click();
	   if (Helpbutton.isEnabled()) {
		   Helpbutton.click();
	   }
	   else {
	    	System.out.println("Helpbutton Element is disabled");
	   }
	}
}	   
	    
	    