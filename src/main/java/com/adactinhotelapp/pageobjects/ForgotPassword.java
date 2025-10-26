package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword extends BasePage {

	public ForgotPassword(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath = "//input[@id='emailadd_recovery']")
	WebElement enterEmailInputBox;
	
	
	@FindBy(xpath = "//input[@id='Submit']")
	WebElement emailPassword;
	
	
	
	public void enterEmailInputBox(String emailinput) {
		
		enterEmailInputBox.sendKeys(emailinput);
		
	}
	
	public void clickButton() {
		emailPassword.click();
	}

}
