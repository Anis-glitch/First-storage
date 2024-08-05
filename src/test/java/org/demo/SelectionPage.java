package org.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage extends BaseClass {
	public SelectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	@FindBy(name="continue")
	private WebElement btnContinue;
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
