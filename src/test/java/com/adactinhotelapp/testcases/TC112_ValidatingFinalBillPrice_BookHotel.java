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

@Test(groups = {"sanity","master"})
public class TC112_ValidatingFinalBillPrice_BookHotel extends BaseClass {

	public void toValidatingFieldsofTotalPrice() {
		ChainTestListener.log("TC112_ValidatingFinalBillPrice_SearchHotel has started");
		Allure.step("Test TC112_ValidatingFinalBillPrice_SearchHotel has started");

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
	
		
	
		
		String totalPrice = bookHotelPage.totalPrice();
		String gstCost=bookHotelPage.GST();
		String finalBille=bookHotelPage.finalPrice();
	
		double totalpri=stringToInt(totalPrice);
		
		double totalGST=stringToInt(gstCost);
		double finalPrice=stringToInt(finalBille);
		
		
	    Assert.assertEquals(finalPrice, totalpri+totalGST);
		
		

		ChainTestListener.log("TC112_ValidatingFinalBillPrice_SearchHotel has ended");
		Allure.step("Test TC112_ValidatingFinalBillPrice_SearchHotel has ended");

	}
}
