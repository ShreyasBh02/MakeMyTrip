package TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class tc01{

	//Declaration
	@FindBy(xpath = "//div[@class='imageSlideContainer']") private WebElement cncle;
	@FindBy(xpath = "//li[text()='Round Trip']") private WebElement rondtrip;
	@FindBy(xpath = "//input[@id='fromCity']") private WebElement org;
	@FindBy(xpath = "//input[@id='toCity']") private WebElement dest;
	@FindBy(xpath = "//span[@class='lbl_input appendBottom10'][contains(text(),'Departure')]") private WebElement depClick;
	@FindBy(xpath = "//p[text()='You are booking for more than 30 days']") private WebElement text;
	
	//Initialization
	public tc01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
	//Implementation
	public void slect() {
		rondtrip.click();
	}
	public void enterFrom(String From) {
		org.sendKeys(From,Keys.ENTER);
	}
	public void enterTo(String To) throws Throwable {
		dest.sendKeys(To);
		Thread.sleep(6000);
		dest.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	}

	public void enterdep(WebDriver driver) throws Throwable {
		depClick.click();
		String dateDES="False";
		while(dateDES=="False") {
			if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,' Jun 02 2023')]")).size()>0) {
				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,' Jun 02 2023')]")).click();
				dateDES="True";
			}
			else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
	}
	
	public void enterretn(WebDriver driver) throws Throwable {
		String dateDES="False";
		while(dateDES=="False") {
			if(driver.findElements(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,' Sep 05 2023')]")).size()>0) {
				driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,' Sep 05 2023')]")).click();
				dateDES="True";
			}
			else {
				Thread.sleep(5000);
				driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
		}
	}
	public String verifyText1() {
		String actT=text.getText();
		return actT;
	}

}
