package TestCase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc02 {

//Declaration
	@FindBy(xpath = "//span[text()='Travellers & Class']") private WebElement clickTravel;
	@FindBy(xpath = "//li[contains(@data-cy,'adults-9')]") private WebElement adult;
	@FindBy(xpath = "//li[contains(@data-cy,'children-3')]") private WebElement child;
	@FindBy(xpath = "//*[contains(text(),'Upto 9 passengers allowed')]") private WebElement text2;
	
	
//Initialization
	public tc02(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//Implementation
	public void slecttrvel() {
		clickTravel.click();
	}
	public void selectadlt() {
		adult.click();
	}
	public void selectchld() {
		child.click();
	}
	public void verifyText2(WebDriver driver) {
		boolean text= text2.isDisplayed();
		System.out.println(text +"'Upto 9 passengers allowed' not found");
	}
}
