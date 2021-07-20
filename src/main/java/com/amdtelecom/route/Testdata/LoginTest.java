package com.amdtelecom.route.Testdata;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdtelecom.route.Base.TestBase;
import com.amdtelecom.route.Pages.LoginPage;




public class LoginTest extends TestBase {
	
	LoginPage loginPage;
	
	
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginPage = new LoginPage();	
	}
	
	@Test(description="Veify Login")
	public void loginTest() throws InterruptedException {
		loginPage.login();
		Assert.assertTrue(true);
		System.out.println("Logged in successfully");
		Thread.sleep(2000);
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
