package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.pageobjects.SearchHotelPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

@Test(groups = {"master"})
public class TC103_ToVerifyErrorMSGInDateField extends BaseClass {

	public void toVerifyErrorMSGInDateField() {
		ChainTestListener.log("Test TC103_ToVerifyIfErrorIsDateField has started");
		Allure.step("Test TC103_ToVerifyIfErrorIsDateField has started");

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
		hotelPage.location(prop.getProperty("location"));

		hotelPage.hotel(prop.getProperty("hotel"));
		hotelPage.roomType(prop.getProperty("roomType"));
		hotelPage.numOfRooms(prop.getProperty("rooms"));
		hotelPage.chkInDateClear();
		hotelPage.chkOutDate(prop.getProperty("chkOutDate"));

		hotelPage.SearchButton();

		Assert.assertEquals(hotelPage.getErroeMSG(), AppConstants.SEARCH_HOTEL_PAGE_ERROR_MSG_For_chkInDates);
		
		ChainTestListener.log("Test TC103_ToVerifyIfErrorIsDateField has ended");
		Allure.step("Test TC103_ToVerifyIfErrorIsDateField has ended");


	}
}
