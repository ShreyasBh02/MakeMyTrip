package Test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Base.base;
import TestCase.*;
import Utility.utility;



public class test extends base{
	tc01 t1;
	tc02 t2;
	tc03 t3;
	tc04 t4;

	@BeforeClass
	public void OpenBrowser() {
		initializeBrowser();
		t1= new tc01(driver);
		t2= new tc02(driver);
		t3= new tc03(driver);
		t4= new tc04(driver);
	}
	@BeforeMethod
	public void OpenApp() throws Throwable {
		
	}
	
	@Test
	public void verifyText1() throws Throwable {
		t1.slect();
		t1.enterFrom(utility.getTD(1, 0));
		t1.enterTo(utility.getTD(1, 1));
		t1.enterdep();
		t1.enterretn(driver);
		String actT = t1.verifyText1();
		String expT = utility.getTD(3,1);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actT, expT,"TC is passed");	
	
	}
	@Test
	public void verifyText2() throws Throwable {
		t2.slecttrvel();
		t2.selectadlt();
		t2.selectchld();
		t2.verifyText2(driver);
	}
	@Test
	public void verifyText3() throws Throwable {
		t3.selectadlt();
		t3.selectchld();
		t3.clickaply(driver);
		t3.cliksrch();
		if(driver.findElements(By.xpath("//button[text()='Refresh']")).size()>0)  {
			t3.popup(driver);
		}
		t3.navigate();
	}
	@Test
	public void verifyText4() throws Throwable {
		Thread.sleep(5000);
		t4.vtitle(driver);
		String actTit=t4.vtitle(driver);
		String expTit = utility.getTD(7,1);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actTit, expTit,"TC is passed");
		
		String actFdate = t4.vFdate();
		String expFdate = utility.getTD(5,1);
		soft.assertEquals(actFdate, expFdate,"TC is passed");
		
		String actRdate = t4.vRdate();
		String expRdate = utility.getTD(6,1);
		soft.assertEquals(actRdate, expRdate,"TC is passed");
	}
	
	@AfterMethod
	public void logout() {
	}
	@AfterClass
	public void closeBrow() {
		Reporter.log("Closing browser", true);
		closeBrowser() ;
		t1=new tc01(driver);
	}
}
