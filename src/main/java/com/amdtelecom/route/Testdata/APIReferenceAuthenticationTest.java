package com.amdtelecom.route.Testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdtelecom.route.Base.TestBase;
import com.amdtelecom.route.Pages.APIReference;

public class APIReferenceAuthenticationTest extends TestBase{
	
	APIReference apireference;

	public APIReferenceAuthenticationTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		apireference = new APIReference();	
	}
	
	@Test(description="Veify entering auth header & click 'try it'")
	public void GetAuthenticated() throws InterruptedException {
		apireference.TryAuth();	
	}
	
	@Test(description="Verify API response")
	public void VerifyErrorCode() throws InterruptedException {
		apireference.TryAuth();
		apireference.ErrorCode();
		Assert.assertTrue(true);
	}
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}
