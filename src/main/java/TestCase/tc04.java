package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc04 {
	//Declaration
		@FindBy(xpath = "//h2[contains(text(),'Complete your booking')]") private WebElement title;
		@FindBy(xpath = "//span[contains(text(),'Thursday, Jun 1')]") private WebElement Fdate;
		@FindBy(xpath = "//span[contains(text(),'Tuesday, Sep 5')]") private WebElement Rdate;
		
		
	//Initialization
		public tc04(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	//Implementation
		public String vtitle() {
			String tit = title.getText();
			return tit;
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
