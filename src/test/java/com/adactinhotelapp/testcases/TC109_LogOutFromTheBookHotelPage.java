package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.BookHotelPage;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.pageobjects.LogoutPage;
import com.adactinhotelapp.pageobjects.SearchHotelPage;
import com.adactinhotelapp.pageobjects.SelectHotelPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

@Test(groups = {"sanity","master"})
public class TC109_LogOutFromTheBookHotelPage extends BaseClass {

	public void toVerifylogOutfromBookHotelPage() {
		ChainTestListener.log("TC109_LogOutFromTheBookHotelPage has started");
		Allure.step("Test TC109_LogOutFromTheBookHotelPage has started");

		// to login
		LoginPage lp = new LoginPage(driver);

		lp.usernameInput(prop.getProperty("username"));
		lp.passwordInput(prop.getProperty("password"));
		lp.loginButton();

		ChainTestListener.log("Logged into home page");
		Allure.step("Logged into home page");

		Assert.assertEquals(getTitleofPage(), AppConstants.SEARCH_HOTEL_PAGE_TITLE);

		ChainTestListener.log("Test TC101_ToVerifyValidLoginDetails has ended");
		Allure.step("Test TC101_ToVerifyValidLoginDetails has ended");

		SearchHotelPage hotelPage = new SearchHotelPage(driver);

		hotelPage.enterAllRegisterDetails();

		SelectHotelPage sh = new SelectHotelPage(driver);

		Assert.assertEquals(getTitleofPage(), AppConstants.Select_Hotel_PAGE_TITLE);

		
		sh.selectButton();
		sh.clickContinueButton();

		BookHotelPage bookHotelPage = new BookHotelPage(driver);
		bookHotelPage.logOutClick();
		

		Assert.assertEquals(getTitleofPage(), AppConstants.LOGOUT_PAGE_TITLE);
		LogoutPage lop = new LogoutPage(driver);
		
		
		Assert.assertEquals(lop.loggedOutMessage(), AppConstants.Succ_Logout_MSG);
		

		ChainTestListener.log("TC109_LogOutFromTheBookHotelPage has ended");
		Allure.step("Test TC109_LogOutFromTheBookHotelPage has ended");

	}
}
