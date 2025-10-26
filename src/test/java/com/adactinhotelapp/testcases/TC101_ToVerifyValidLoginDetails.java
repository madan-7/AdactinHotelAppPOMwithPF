package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;

public class TC101_ToVerifyValidLoginDetails extends BaseClass {

	@Description("TC101_ToVerifyValidLoginDetails (DEC)")
	@Epic("TC101-Authentication (EPIC)")
	@Test(groups= {"regression","smoke"})
	public void ValidLoginDetails() {
		
		
		ChainTestListener.log("Test TC101_ToVerifyValidLoginDetails has started");
		Allure.step("Test TC101_ToVerifyValidLoginDetails has started");


		LoginPage lp = new LoginPage(driver);

		lp.usernameInput(prop.getProperty("username"));
		lp.passwordInput(prop.getProperty("password"));
		lp.loginButton();
		
		ChainTestListener.log("Logged into home page");
		Allure.step("Logged into home page");


		Assert.assertEquals(getTitleofPage(), AppConstants.SEARCH_HOTEL_PAGE_TITLE);
		
		
		ChainTestListener.log("Test TC101_ToVerifyValidLoginDetails has ended");
		Allure.step("Test TC101_ToVerifyValidLoginDetails has ended");


	}
	
	
	//java.lang.AssertionError: expected [Adactin.com - Search Hotel] but found [Adactin.com - Hotel Reservation System]

}
