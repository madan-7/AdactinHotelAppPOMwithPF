package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.BookHotelPage;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.pageobjects.SearchHotelPage;
import com.adactinhotelapp.pageobjects.SelectHotelPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

@Test(groups = {"master"})
public class TC111_ValidatingFields_BookHotelPage extends BaseClass {

	public void toValidatingFieldsInBookHotelPage() {
		ChainTestListener.log("TC111_ValidatingFields_BookHotelPage has started");
		Allure.step("Test TC111_ValidatingFields_BookHotelPage has started");

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
		
		Assert.assertEquals(getTitleofPage(), AppConstants.Book_HOTEL_PAGE_TITLE);

		BookHotelPage bookHotelPage = new BookHotelPage(driver);
	
		
	
		String totalDays = bookHotelPage.totalDays();
		String pricePerDay = bookHotelPage.pricePerDay();
		String totalPrice = bookHotelPage.totalPrice();
		
		double days = stringToInt(totalDays);
		double dayPrice = stringToInt(pricePerDay);
		double totalpri=stringToInt(totalPrice);
		
		
		
		Assert.assertEquals(bookHotelPage.hotelName(), prop.getProperty("hotel"));
		Assert.assertEquals(bookHotelPage.location(), prop.getProperty("location"));
		Assert.assertEquals(bookHotelPage.roomType(), prop.getProperty("roomType"));
		
		
		Assert.assertEquals(days*dayPrice+10, totalpri,"Both are diffrent");
		
		

		ChainTestListener.log("TC111_ValidatingFields_BookHotelPage has ended");
		Allure.step("Test TC111_ValidatingFields_BookHotelPage has ended");

	}
}
