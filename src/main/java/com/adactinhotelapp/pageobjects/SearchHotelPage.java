package com.adactinhotelapp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends BasePage {

	public SearchHotelPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//select[@id='location']")
	WebElement location;

	@FindBy(xpath = "//select[@id='hotels']")
	WebElement hotel;

	@FindBy(xpath = "//select[@id='room_type']")
	WebElement roomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	WebElement numOfRooms;

	@FindBy(xpath = "//input[@id='datepick_in']")
	WebElement chkInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	WebElement chkOutDate;

	@FindBy(xpath = "//select[@id='adult_room']")
	WebElement adultsPerRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	WebElement childrenPerRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	WebElement SearchButton;

	@FindBy(xpath = "")
	WebElement resetbutton;
	
	
	@FindBy(xpath="//span[@id='checkin_span']")
	WebElement erroeMSG;

	public Select select;

	public void location(String loc) {

		select = new Select(location);
		select.selectByValue(loc);
	}

	
	
	public void hotel(String htl) {

		select = new Select(hotel);
		select.selectByValue(htl);
		
	}
	
	
	public void roomType(String rType) {

		select = new Select(roomType);
		select.selectByValue(rType);
		
	}
	
	public void numOfRooms(String nRooms) {

		select = new Select(numOfRooms);
		select.selectByValue(nRooms);
		
	}
	
	
	public void chkInDate(String inDate) {

	
		chkInDate.sendKeys(inDate);
		
	}



	public void chkOutDate(String outDate) {
	
		chkOutDate.sendKeys(outDate);
	}



	public void adultsPerRoom(String adultRom) {
		
		select = new Select(adultsPerRoom);
		select.selectByValue(adultRom);
		
	}



	public void childrenPerRoom(String childRom) {
		select = new Select(childrenPerRoom);
		select.selectByValue(childRom);
		
	}
	
	public void SearchButton() {

		SearchButton.click();
		
	}
	
	//for to clean
	
	public void chkInDateClear() {

		chkInDate.clear();
	
		
		
	}
	
	public void chkOutClear() {
		chkOutDate.clear();
	
		
		
	}
	
	public String getErroeMSG() {
		String text = erroeMSG.getText();
		return text;
	}
	
	
	public void enterAllRegisterDetails() {
		
		location.sendKeys("Melbourne");

	    hotel.sendKeys("Hotel Sunshine");
	    
	    roomType.sendKeys("Double");
	    
	    numOfRooms.sendKeys("4");
	    
	    chkInDate.clear();
	    chkInDate.sendKeys("22/10/2025");

	    chkOutDate.clear();
	    chkOutDate.sendKeys("24/10/2025");
	    
	    adultsPerRoom.sendKeys("2");
	    
	    childrenPerRoom.sendKeys("2");
	    
	    SearchButton();
	    
	}

	
	
	
	

}
