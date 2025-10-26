package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.ForgotPassword;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;

public class TC121_ValidatingForgotPossword extends BaseClass {
	
	@Description("Validating Forgot Possword")
	@Epic("validatingForgotPossword")
	@Test
	public void validatingForgotPossword() {
		
		ChainTestListener.log("TC102_ValidatingForgotPossword test case has started...............");
		
		Allure.step("TC102_ValidatingForgotPossword test case has started...............");

		
				
		LoginPage page = new LoginPage(driver);
		page.forgotPassword();
		
		ChainTestListener.log("clicked on forgotPassword link");
		Allure.step("clicked on forgotPassword link");


		
		
		ForgotPassword forgotPassword = new ForgotPassword(driver);
		
		Assert.assertEquals(getTitleofPage(), AppConstants.FORGOT_PASSWORD_PAGE_Title);
		
		forgotPassword.enterEmailInputBox("Hello@.com");
		
		ChainTestListener.log("enterd Email in InputBox");
		Allure.step("enterd Email in InputBox");

		
		forgotPassword.clickButton();
		
		ChainTestListener.log("Clicked on submit button");
		Allure.step("Clicked on submit button");

		
		
		ChainTestListener.log("TC102_ValidatingForgotPossword test case has ended");
		Allure.step("TC102_ValidatingForgotPossword test case has ended");


		
		
	}

}
