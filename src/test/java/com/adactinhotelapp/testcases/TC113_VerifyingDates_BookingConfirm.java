package com.adactinhotelapp.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.adactinhotelapp.constants.AppConstants;
import com.adactinhotelapp.pageobjects.BookHotelPage;
import com.adactinhotelapp.pageobjects.HotelBookingConfirmation;
import com.adactinhotelapp.pageobjects.LoginPage;
import com.adactinhotelapp.pageobjects.SearchHotelPage;
import com.adactinhotelapp.pageobjects.SelectHotelPage;
import com.adactinhotelapp.testbase.BaseClass;
import com.aventstack.chaintest.plugins.ChainTestListener;

import io.qameta.allure.Allure;

@Test(groups = {"master"})
public class TC113_VerifyingDates_BookingConfirm extends BaseClass {

	public void toVerifyingDatesInBookingConfirm() {
		ChainTestListener.log("TC113_VerifyingDates_BookingConfirm has started");
		Allure.step("Test TC113_VerifyingDates_BookingConfirm has started");

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
		
		bookHotelPage.firstName(prop.getProperty("fName"));
		bookHotelPage.lastName(prop.getProperty("lName"));
		bookHotelPage.address(prop.getProperty("address"));
		bookHotelPage.CCNumber(prop.getProperty("CCNumber"));
		bookHotelPage.CCType(prop.getProperty("CCType"));
		bookHotelPage.expMonth(prop.getProperty("expMonth"));
		bookHotelPage.expYear(prop.getProperty("expYear"));
		bookHotelPage.CVVNUM(prop.getProperty("CVVNumber"));
		
		bookHotelPage.bookNow();
		
		expilcitWaits(bookHotelPage.proceesing());
		
		
		Assert.assertEquals(getTitleofPage(), AppConstants.HOTEL_BOOKING_CONFIRMATION_PAGE_TITLE);
		
		HotelBookingConfirmation hbc = new HotelBookingConfirmation(driver);
		
		
		Assert.assertEquals( hbc.chkInDate(),prop.getProperty("chkInDate") ); // sh.inDateValidate() 
		Assert.assertEquals( hbc.chkOutDate(),  prop.getProperty("chkOutDate") );

		
	
		
		ChainTestListener.log("TC113_VerifyingDates_BookingConfirm has ended");
		Allure.step("Test TC113_VerifyingDates_BookingConfirm has ended");

	}
}
