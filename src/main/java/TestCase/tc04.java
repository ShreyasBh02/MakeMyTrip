package TestCase;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc04 {
	//Declaration
		@FindBy(xpath = "//h2[@class='fontSize20 blackFont whiteText headerTitle']") private WebElement title;
		@FindBy(xpath = "(//span[@class='scheduleDay'])[1]") private WebElement Fdate;
		@FindBy(xpath = "(//span[@class='scheduleDay'])[2]") private WebElement Rdate;
		
		
	//Initialization
		public tc04(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	//Implementation
		public String vtitle(WebDriver driver) {
			ArrayList<String> w= new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(w.get(1));
			String act = title.getText();
			return act;
			
		}
		public String vFdate() {
			String from = title.getText();
			return from;
		}
		public String vRdate() {
			String rtn=Rdate.getText();
			return rtn;
		}
		
}
