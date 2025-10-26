package com.adactinhotelapp.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookedItineraryPage extends BasePage {

	public BookedItineraryPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[contains(@name, 'hotel_name')])[1]")
	WebElement enabledOrNot;

	public boolean enabledOrNot() {

		return enabledOrNot.isDisplayed();
	}
	
	

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'hotel')]")
	WebElement hotelName;

	public String hotelValidate() {

		return hotelName.getAttribute("value");
	}

	@FindBy(xpath = ("//input[@class='select_text' and contains(@name,'location')]"))
	WebElement location;

	public String locValidate() {

		return location.getAttribute("value");
	}

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'rooms')]")
	WebElement rooms;

	public String roomValidate() {

		return rooms.getAttribute("value");
	}

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'arr_date')]")
	WebElement arrivalDate;

	public String inDateValidate() {

		return arrivalDate.getAttribute("value");
	}

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'dep_date')]")
	WebElement departureDate;

	public String outDateValidate() {

		return departureDate.getAttribute("value");
	}

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'room_type')]")
	WebElement roomsType;

	public String roomTypeValidate() {

		return roomsType.getAttribute("value");
	}

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'price_night')]")
	WebElement priceForNight;

	public String priceForNight() {

		return priceForNight.getAttribute("value");
	}
	


	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'total_price')]")
	WebElement totalPrice;

	public String totalPrice() {
		return totalPrice.getAttribute("value");
	}
	
	

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'first_name')]")
	WebElement fistName;

	public String fistName() {
		return fistName.getAttribute("value");
	}
	

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'last_name')]")
	WebElement lastName;

	public String lastName() {
		return lastName.getAttribute("value");
	}
	
	//order_id
	

	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'order_id')]")
	WebElement orderId;

	public String getOrderId() {
		return orderId.getAttribute("value");
	}
	
	//Go
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	WebElement clickGoButton;

	public void clickGoButton() {
		 clickGoButton.click();;
	}
	

	@FindBy(xpath = "//input[@id='order_id_text']")
	WebElement orderIdInputBox;

	public void orderIdInputBox(String id) {
		 orderIdInputBox.sendKeys(id);
	}
	
	
	@FindBy(xpath = "//input[@name='cancelall']")
	WebElement cancelOrdered;

	public void cancelOrdered() {
		cancelOrdered.click();
	}
	
	@FindBy(xpath = "//input[@class='select_text' and contains(@name,'order_id')]")
	List<WebElement> listOfOrderIds;	
	
	public List<WebElement> listOfOrderIds() {
		
		return listOfOrderIds;
		
		}
	
	
	@FindBy(xpath = "//input[@type='checkbox']//parent::td")
	WebElement checkBoxClick;
	
	public void checkBoxClick() {
		checkBoxClick.click();
		
	}

	
	
}
