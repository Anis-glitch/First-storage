package org.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Reuse {
	public static void main(String[] args) throws Exception {
		BaseClass b =new BaseClass();
		b.launchBrowser();
		b.launchUrl("https://adactinhotelapp.com/");
		b.windowMax();
		WebElement txtuser = b.findElementById("username");
		b.enterValue(txtuser,"anisfathima");
		WebElement txtpass = b.findElementById("password");
		b.enterValue(txtpass,"9US98C");
		WebElement login = b.findElementById("login");
		b.btnLogin(login);
		HomePage hp =new HomePage();
		b.enterValue(hp.getSelectLocate(), "Paris");
		b.enterValue(hp.getSelectHotel(), "Hotel Cornice");
		b.enterValue(hp.getSelectRoomType(), "Super Deluxe");
		b.enterValue(hp.getNumberOfRooms(), "10-Ten");
		b.enterValue(hp.getCheckIn(), "21/07/2024");
		b.enterValue(hp.getCheckOut(), "25/07/2024");
		b.enterValue(hp.getAdultRoom(), "4-Four");
		b.enterValue(hp.getChildRoom(), "3-Three");
		b.btnLogin(hp.getBtnSearch());
		SelectionPage sp =new SelectionPage();
		b.btnLogin(sp.getSelectHotel());
		b.btnLogin(sp.getBtnContinue());
		BookHotelPage bhp =new BookHotelPage();
		b.enterValue(bhp.getFirstName(), "Anis Fathima");
		b.enterValue(bhp.getLastName(), "Abdul Jabbar");
		b.enterValue(bhp.getAddress(), "Anna nagar");
		b.enterValue(bhp.getCardNumber(), "1234234534564567");
		b.enterValue(bhp.getCardType(), "Visa");
		b.enterValue(bhp.getExpiryMonth(), "June");
		b.enterValue(bhp.getExpiryYear(), "2026");
		b.enterValue(bhp.getCvvno(), "567");
		b.btnLogin(bhp.getBtnBookNow());
		
		
		
	}
	
		
	
	

}
