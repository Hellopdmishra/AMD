package com.amdtelecom.route.Pages;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdtelecom.route.Base.TestBase;


public class HomePage extends TestBase {

	

	@FindBy(xpath="//span[text()=\"SMS\"]")
	WebElement SMSTab;
	
	@FindBy(xpath="//input[@id=\"SmsSenderInput\"]")
	WebElement Sender;
	
	@FindBy(xpath="(//input[@id=\"recipient-input\"])[1]")
	WebElement Recepient;
	
	@FindBy(xpath="(//textarea[@name=\"message\"])[1]")
	WebElement Message;
	
	@FindBy(xpath="//span[@data-title=\"All fields are required to send SMS\"]")
	WebElement SendButton;
	
	@FindBy(xpath="(//button[@type=\"submit\"])[1]")
	WebElement Popupsubmit;
	
	
	
	
	public HomePage(){
			PageFactory.initElements(driver, this);
		}	
	
	public HomePage sendSMS() {
		Recepient.sendKeys(prop.getProperty("recepient"));
		Message.sendKeys("Hello! Good Evening");
		SendButton.click();
		Popupsubmit.click();
		return new HomePage();
	}
}
