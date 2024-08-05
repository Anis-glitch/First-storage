package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(name="last_name")
	private WebElement LastName;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(name="cc_num")
	private WebElement CardNumber;
	@FindBy(id="cc_type")
	private WebElement CardType;
	@FindBy(name="cc_exp_month")
	private WebElement ExpiryMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ExpiryYear;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCardNumber() {
		return CardNumber;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}
	public WebElement getExpiryYear() {
		return ExpiryYear;
	}
	public WebElement getCvvno() {
		return Cvvno;
	}
	public WebElement getBtnBookNow() {
		return btnBookNow;
	}
	@FindBy(name="cc_cvv")
	private WebElement Cvvno;
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	
	

}
