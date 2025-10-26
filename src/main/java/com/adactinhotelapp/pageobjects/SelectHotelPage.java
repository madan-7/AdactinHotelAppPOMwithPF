package com.adactinhotelapp.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotelPage extends BasePage {

	public SelectHotelPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='hotel_name_0']")
	WebElement hotelName;

	@FindBy(xpath = ("//input[@id='location_0']"))
	WebElement location;

	@FindBy(xpath = "//input[@id='rooms_0']")
	WebElement rooms;

	@FindBy(xpath = "//input[@id='arr_date_0']")
	WebElement arrivalDate;

	@FindBy(xpath = "//input[@id='dep_date_0']")
	WebElement departureDate;

	@FindBy(xpath = "//input[@id='room_type_0']")
	WebElement roomsType;
	
	
	@FindBy(xpath = "//input[@id='price_night_0']")
	WebElement priceForNight;
	
	@FindBy(xpath = "//input[@id='no_days_0']")
	WebElement numOfDays;
	
	@FindBy(xpath = "//input[@id='total_price_0']")
	WebElement totalPrice;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logOutClick;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	WebElement selectButton;

	@FindBy(xpath = "//input[@id='continue']")	
	WebElement clickContinueButton;
	
	
	public String hotelValidate() {		
		
		return hotelName.getAttribute("value");
	}

	public String locValidate() {

		return location.getAttribute("value");
	}

	public String roomValidate() {

		return rooms.getAttribute("value");
	}

	public String inDateValidate() {

		return arrivalDate.getAttribute("value");
	}

	public String outDateValidate() {

		return departureDate.getAttribute("value");
	}

	public String roomTypeValidate() {

		return roomsType.getAttribute("value");
	}
	
	public String priceForNight() {
				 
		 return  priceForNight.getAttribute("value");
	}
	
	public String numOfDays() {
		 
		 return  numOfDays.getAttribute("value");
	}
	
	public String totalPrice() {
		return totalPrice.getAttribute("value");
	}
	
	public void logOutClick() {
		logOutClick.click();
	}
	
	public void selectButton() {
		selectButton.click();
	}
	
	
	public void clickContinueButton() {
		
		clickContinueButton.click();
	}
	
	


}
