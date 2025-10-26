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

@Test(groups = {"master"})
public class TC105_ToVerifyChkIn_Out_DateProper_SearchHotel extends BaseClass {
	
	public void verifyingChkInAndChkOutDates() {
		ChainTestListener.log("Test TC105_ToVerifyChkIn_Out_DateProper_SearchHotel has started");
		Allure.step("Test TC105_ToVerifyChkIn_Out_DateProper_SearchHotel has started");


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
	  
	 
	  Assert.assertEquals(sh.inDateValidate(),prop.getProperty("chkInDate"));
	  Assert.assertEquals(sh.outDateValidate(), prop.getProperty("chkOutDate"));
	  
	  
	  ChainTestListener.log("Test TC105_ToVerifyChkIn_Out_DateProper_SearchHotel has ended");
		Allure.step("Test TC105_ToVerifyChkIn_Out_DateProper_SearchHotel has ended");
	
	 

	}
}
