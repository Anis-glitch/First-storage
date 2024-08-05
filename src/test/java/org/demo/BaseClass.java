package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public WebDriver launchBrowser() {
		driver = new ChromeDriver();
		return driver;
	}
	public void launchUrl (String url) {
		driver.get(url);
	}
	public void windowMax() {
		driver.manage().window().maximize();
	}
	public void enterValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public void btnLogin(WebElement element) {
		element.click();
	}
	
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	
	
	
	
	

}
