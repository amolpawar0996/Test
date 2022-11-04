package Zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	@FindBy (xpath="//a[@target='_blank'])[1]")private WebElement orderhistory;
	@FindBy (xpath="//input[@type='search']") private WebElement search;
	@FindBy (xpath="//span[text()='CANCELLED AMO']") private WebElement cancel;
	@FindBy (xpath="//button[@type='button'][2]") private WebElement close;
	@FindBy (xpath="//a[@href='/orders/gtt']") private WebElement gtt;
	@FindBy (xpath="//button[@class='button-blue']") private WebElement newgtt;
	@FindBy (xpath="//button[@class='button-outline']") private WebElement closegtt;
	
    @FindBy (xpath="//button[@class='button-blue']") private WebElement getstart;
    @FindBy (xpath="(//input[@icon='search'])[2]") private WebElement getstartsearch;
    @FindBy (xpath="//li[@class='search-result-item selected']") private WebElement tata;
	@FindBy (xpath="//button[@class='button-outline']") private WebElement tataclose;
	@FindBy (xpath="//span[text()='Trades']") private WebElement trades;
	
	public  Order (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickordhist() {
		orderhistory.click();
	}
	public void clicksearch() {
		search.sendKeys("ZOMATO");;
	}
	public void cancelledamo() {
		cancel.click();
	}
	public void closeamo() {
		close.click();
	}
	public void clickgtt() {
	    gtt.click();
	}
	public void newgttt() {
		newgtt.click();
	}
	public void closegttt() {
		closegtt.click();
	}
	
	
	public void opengetstart() {
		getstart.click();
	}
	public void entersearch() {
		getstartsearch.sendKeys("TATAMOTERS");
	}
	public void clicktata() {
		tata.click();
	}
	public void closetata() {
		tataclose.click();
	}
	public void clicktrades() {
		trades.click();
	}

}
