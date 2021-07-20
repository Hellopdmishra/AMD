package com.amdtelecom.route.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdtelecom.route.Base.TestBase;

public class APIReference extends TestBase
{
	@FindBy(xpath="//*[@id=\"hub-sidebar-content\"]/div[3]/div[1]/ul/li/a/div")
	WebElement Authentication;
	
	@FindBy(xpath="//input[@id=\"header-authentication_Authorization\"]")
	WebElement AuthHeader; 
	
	@FindBy(xpath="//span[text()=\"Try It\"]")
	WebElement Trybtn;
	
	@FindBy(xpath="(//span[@class=\"httperror\"])[1]")
	WebElement errorcode;
	
	public APIReference(){
		PageFactory.initElements(driver, this);
	}
	
	public APIReference TryAuth() throws InterruptedException {
		Authentication.click();
		Thread.sleep(2000);
		AuthHeader.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		AuthHeader.sendKeys("Basic {"+prop.getProperty("base64Token")+"}");
		Trybtn.click();
		return new APIReference();
		}
	public APIReference ErrorCode() {
		String ErrorText=errorcode.getText();
		System.out.println("Response for API:"+ErrorText);
		return new APIReference();
		
	}
}
