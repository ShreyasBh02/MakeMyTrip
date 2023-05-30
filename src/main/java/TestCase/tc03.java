package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class tc03 {
	//Declaration
	@FindBy(xpath = "//li[contains(@data-cy,'adults-2')]") private WebElement adult;
	@FindBy(xpath = "//li[contains(@data-cy,'children-2')]") private WebElement child;
	@FindBy(xpath = "//button[@class='primaryBtn btnApply pushRight']")private WebElement apply;
	@FindBy(xpath = "//a[text()='Search']") private WebElement search;
	@FindBy(xpath = "//button[@class='button buttonSecondry buttonBig fontSize12 relative']") private WebElement cancle;
	@FindBy(xpath = "(//p[contains(text(),'Non Stop')])[1]")private WebElement nonsp;
	@FindBy(xpath = "//button[text()='Book Now']") private WebElement bookNow;
	@FindBy(xpath = "//button[text()='Continue']") private WebElement contne;

	//Initialization
	public tc03(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Implementation
	public void selectadlt() {
		adult.click();
	}
	public void selectchld() {
		child.click();
	}
	public void clickaply(WebDriver driver) {
		apply.click();
	}
	public void cliksrch() {
		search.click();
	}
	public void popup(WebDriver driver) throws Throwable {
		Thread.sleep(5000);
		//cancle.click();
		String dateDES="False";
		while(dateDES=="False") {
			if(driver.findElements(By.xpath("//button[text()='Refresh']")).size()>0) {
				driver.findElement(By.xpath("//button[text()='Refresh']")).click();
				dateDES="True";
			}
		}
	}

	public void navigate() throws Throwable {
		cancle.click();
		nonsp.click();
		bookNow.click();
		Thread.sleep(5000);
		contne.click();
	}
}
