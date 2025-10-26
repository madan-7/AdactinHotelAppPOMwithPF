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
public class TC106_ToVerifyNumOfRooms_SearchHotel extends BaseClass {
	
	public void toVerifyNumOfRooms() {
		ChainTestListener.log("TC106_ToVerifyNumOfRooms_SearchHotel has started");
		Allure.step("Test TC106_ToVerifyNumOfRooms_SearchHotel has started");


		//to login
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
	  
	  
	  Assert.assertEquals(sh.roomValidate(),prop.getProperty("room"));
	  
	  	  
	  
		ChainTestListener.log("TC106_ToVerifyNumOfRooms_SearchHotel has ended");
		Allure.step("Test TC106_ToVerifyNumOfRooms_SearchHotel has ended");

	 
	 

	}
}
