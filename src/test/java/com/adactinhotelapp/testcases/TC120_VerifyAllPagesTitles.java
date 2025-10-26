package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.pageobjects.SearchHotelPage;
import com.adactinhotelapp.pageobjects.SelectHotelPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

public class TC120_VerifyAllPagesTitles extends BaseClass {

	@Test(groups = {"master"})
	public void titlesVerify() {

		Assert.assertEquals(getTitleofPage(), AppConstants.HOTEL_RESERVATION_TITLE_PAGE);

		LoginPage lp = new LoginPage(driver);

		lp.usernameInput(prop.getProperty("username"));
		lp.passwordInput(prop.getProperty("password"));
		lp.loginButton();

		ChainTestListener.log("Logged into home page");
		Allure.step("Logged into home page");

		Assert.assertEquals(getTitleofPage(), AppConstants.SEARCH_HOTEL_PAGE_TITLE);

		SearchHotelPage hotelPage = new SearchHotelPage(driver);

		hotelPage.enterAllRegisterDetails();

		SelectHotelPage sh = new SelectHotelPage(driver);

		Assert.assertEquals(getTitleofPage(), AppConstants.Select_Hotel_PAGE_TITLE);

		sh.selectButton();
		sh.clickContinueButton();

		Assert.assertEquals(getTitleofPage(), AppConstants.Book_HOTEL_PAGE_TITLE);

	}

}
