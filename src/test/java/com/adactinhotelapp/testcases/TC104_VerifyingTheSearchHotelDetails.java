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

@Test(groups = {"sanity","regression","master"})
public class TC104_VerifyingTheSearchHotelDetails extends BaseClass {
	
	public void verifyingTheSearchHotelDetails() {
		ChainTestListener.log("Test TC104_VerifyingTheSearchHotelDetails has started");
		Allure.step("Test TC104_VerifyingTheSearchHotelDetails has started");


		//to login
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
	  
	  Assert.assertEquals(sh.hotelValidate(), prop.getProperty("hotel")); 
	  Assert.assertEquals( sh.locValidate(), prop.getProperty("location"));	  
	  Assert.assertEquals(sh.roomValidate(), prop.getProperty("rooms1"));
	  Assert.assertEquals(sh.inDateValidate(), prop.getProperty("chkInDate"));
	  Assert.assertEquals(sh.outDateValidate(), prop.getProperty("chkOutDate"));
	  Assert.assertEquals(sh.roomTypeValidate(), prop.getProperty("roomType"));
	 
	  ChainTestListener.log("Test TC104_VerifyingTheSearchHotelDetails has ended");
		Allure.step("Test TC104_VerifyingTheSearchHotelDetails has ended");


	}
}
