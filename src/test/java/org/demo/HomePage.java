package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private  WebElement selectLocate;
	@FindBy(name="hotels")
	private WebElement selectHotel;
	@FindBy(id="room_type")
	private WebElement selectRoomType;
	@FindBy(name="room_nos")
	private WebElement numberOfRooms;
	@FindBy(id="datepick_in")
	private WebElement checkIn;
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(name="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement btnSearch;
	public WebElement getSelectLocate() {
		return selectLocate;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getSelectRoomType() {
		return selectRoomType;
	}
	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}
	public WebElement getCheckIn() {
		return checkIn;
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
		

}
