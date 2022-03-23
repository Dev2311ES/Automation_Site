package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Summary {
	
	public WebDriver driver;
	public Order_Summary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath  ="//span[normalize-space()='I confirm my order']")
	private WebElement orderConfirmation;

	public WebElement getOrderConfirmation() {
		return orderConfirmation;
	}
	
	
	
	
	
	

}
