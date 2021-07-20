package com.amdtelecom.route.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdtelecom.route.Base.TestBase;


public class LoginPage extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password; 
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[text()=\"Try backup pin\"]")
	WebElement TrywithPin;
	
	@FindBy(xpath="//button[text()=\"Send\"]")
	WebElement SendButton;
	
	@FindBy(xpath="//h1[text()=\"Verification is required\"]")
	WebElement VerificationRequiredText;
	
	
	
	public LoginPage(){
			PageFactory.initElements(driver, this);
		}	
	
	public HomePage login() throws InterruptedException {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
		Thread.sleep(3000);
		/*if (VerificationRequiredText.getText()=="Verification is required") {
			TrywithPin.sendKeys(prop.getProperty("PinKey"));
			SendButton.click();
			System.out.println("Try with pin is not required");
		}
		else {
			System.out.println("Try with pin is not required");
		}*/
		
		
		return new HomePage();
	}
}
