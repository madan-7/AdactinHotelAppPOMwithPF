package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookHotelPage extends BasePage {

	public BookHotelPage(WebDriver driver) {
		super(driver);
	}
	
	public Select select;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logOutClick;
	
	public void logOutClick() {
		logOutClick.click();
	}
	
	
	@FindBy(xpath = "//input[@id='hotel_name_dis']")
	WebElement hotelName;
	
	public String hotelName() {
		return hotelName.getAttribute("value");
	}
	
	@FindBy(xpath = "//input[@id='location_dis']")
	WebElement location;
	
	public String location() {
		return location.getAttribute("value");
	}
	
	
	@FindBy(xpath = "//input[@id='room_type_dis']")
	WebElement roomType;
	
	public String roomType() {
		return roomType.getAttribute("value");
	}
	

	@FindBy(xpath = "//input[@id='total_days_dis']")
	WebElement totalDays;
	
	public String totalDays() {
		return totalDays.getAttribute("value");
	}
	
	

	@FindBy(xpath = "//input[@id='price_night_dis']")
	WebElement pricePerDay;
	
	public String pricePerDay() {
		return pricePerDay.getAttribute("value");
	}
	
	@FindBy(xpath = "//input[@id='total_price_dis']")
	WebElement totalPrice;
	
	public String totalPrice() {
		return totalPrice.getAttribute("value");
	}
	
	@FindBy(xpath = "//input[@id='gst_dis']")
	WebElement GST;
	
	public String GST() {
		return GST.getAttribute("value");
	}
	
	
	@FindBy(xpath = "//input[@id='final_price_dis']")
	WebElement finalPrice;
	
	public String finalPrice() {
		return finalPrice.getAttribute("value");
	}
	
	
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement firstName;
	
	public void firstName(String fname) {
		 firstName.sendKeys(fname);;
	}
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lastName;	
	public void lastName(String lName) {
		lastName.sendKeys(lName);
	}
	
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement address;
	
	public void address(String adrs) {
		 address.sendKeys(adrs);
	}
	
	@FindBy(xpath = "//input[@id='cc_num']")
	WebElement ccNum;
	
	public void CCNumber(String num) {
		ccNum.sendKeys(num);
	}
	
	@FindBy(xpath = "//select[@id='cc_type']")
	WebElement ccType;	
	
	public void CCType(String visibleText) {
		select = new Select(ccType);
		select.selectByContainsVisibleText(visibleText);
	}
	
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	WebElement expMonth;	
	
	public void expMonth(String expMnt) {
		select = new Select(expMonth);
		select.selectByContainsVisibleText(expMnt);
	}
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	WebElement expYear;	
	
	public void expYear(String visibleText) {
		select = new Select(expYear);
		select.selectByContainsVisibleText(visibleText);
	}
	
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	WebElement CC_CVVNUM;	
	
	public void CVVNUM(String cvvNum) {
		CC_CVVNUM.sendKeys(cvvNum);
	}
	
	
	@FindBy(xpath = "//input[@id='book_now']")
	WebElement bookNow;
	
	public void bookNow() {
		 bookNow.click();;
	}
	
	
	
	@FindBy(xpath = "//label[@id='process_span']")
	WebElement proceesing;
	
	public WebElement proceesing() {
		
		return proceesing;
	}
	
	
	
}
