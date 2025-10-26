package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelBookingConfirmation extends BasePage {

	public HotelBookingConfirmation(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//input[@id='arrival_date']")
	WebElement chkInDate;
	
	public String chkInDate() {
		return chkInDate.getAttribute("value");
	}
	
	
	@FindBy(xpath = "//input[@id='departure_text']")
	WebElement chkOutDate;
	
	public String chkOutDate() {
		return chkOutDate.getAttribute("value");
	}
	
	

	@FindBy(xpath = "//input[@id='order_no']")
	WebElement orderNum;
	
	public String orderNum() {
		return orderNum.getAttribute("value");
	}

	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	WebElement itinerary;
	
	public void clickItinerary() {
		itinerary.click();
	}
	
	@FindBy(xpath = "//input[@id='search_hotel']")
	WebElement searchHotel;
	
	public void searchHotel() {
		searchHotel.click();
	}
	
	
	
	
	

	@FindBy(xpath = "//input[@id='logout']")
	WebElement logOut;
	
	public void logOut() {
		logOut.click();
	}
}
