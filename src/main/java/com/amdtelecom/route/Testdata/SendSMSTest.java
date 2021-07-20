package com.amdtelecom.route.Testdata;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdtelecom.route.Base.TestBase;
import com.amdtelecom.route.Pages.HomePage;
import com.amdtelecom.route.Pages.LoginPage;

public class SendSMSTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	
	public SendSMSTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		
		
	}
	
	@Test(description="sending SMS ")
	public void SendSMSTest1() throws InterruptedException {
		
		loginPage.login();
		homePage.sendSMS();
		Thread.sleep(2000);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
