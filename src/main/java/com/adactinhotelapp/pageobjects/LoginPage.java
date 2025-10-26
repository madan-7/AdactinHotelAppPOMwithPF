package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	
	
	//WebElement usernameInputBox = driver.findElement(By.xpath("//input[@id='username']')"));
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement usernameInputBox;

	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordInputBox;

	@FindBy(xpath  = "//input[@id='login']")
	WebElement loginButton;
	
	
	@FindBy(xpath = "//a[normalize-space()='Forgot Password?']")
	WebElement forgotPassword;
	
	
	@FindBy(xpath = "//a[normalize-space()='New User Register Here']")
	WebElement newUserRegisteration;

	// Action methods

	public void usernameInput(String username) {

		usernameInputBox.sendKeys(username);

	}
	
	public void passwordInput(String pass) {

		passwordInputBox.sendKeys(pass);

	}
	
	public void loginButton() {

		loginButton.click();

	}
	
	public void forgotPassword() {

		forgotPassword.click();;

	}
	
	public void newUserRegisteration() {

		newUserRegisteration.click();;

	}
	
	public String getTitles() {
		
		String title = driver.getTitle();
		
		return title;
	}
	
	
	//common login
	
	public void dirlogin() {
		
		usernameInputBox.sendKeys();
		
	}
	
	
	

}
