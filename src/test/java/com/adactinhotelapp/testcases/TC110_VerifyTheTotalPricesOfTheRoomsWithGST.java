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
public class TC110_VerifyTheTotalPricesOfTheRoomsWithGST extends BaseClass {
	
	public void toVerifyNumOfRooms() {
		ChainTestListener.log("TC108_VerifyTheTotalPricesOfTheRooms has started");
		Allure.step("Test TC108_VerifyTheTotalPricesOfTheRooms has started");


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
	 
	 
	 String numOfDays = sh.numOfDays(); //2 days
	 String priceForNight = sh.priceForNight();//$275
	 String totalPrice = sh.totalPrice(); 
	 
	 double days = stringToInt(numOfDays);
	 double night= stringToInt(priceForNight);
	 double amountTotal = stringToInt(totalPrice);	 	 
		 
	 double perDayCost = days*night+10;
	 
	
	 Assert.assertEquals(perDayCost, amountTotal);
	

	  
	  	  
	  
		ChainTestListener.log("TC108_VerifyTheTotalPricesOfTheRooms has ended");
		Allure.step("Test TC108_VerifyTheTotalPricesOfTheRooms has ended");

	 
	 

	}
}
