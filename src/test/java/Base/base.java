package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	public WebDriver driver;
	public void initializeBrowser(){
		System.setProperty("webdriver.chrome.driver", "E:\\java\\selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
	}
	public void closeBrowser() {
		driver.quit();
	}
}
