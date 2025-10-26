package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

	public LogoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//td[@class='reg_success']")
	WebElement loggedOutMessage;
	
	
	public String loggedOutMessage() {
		return loggedOutMessage.getText();
	}

}
