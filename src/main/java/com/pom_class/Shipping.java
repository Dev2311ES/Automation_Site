package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
public WebDriver driver;
public Shipping(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getSelectterms() {
	return selectterms;
}
@FindBy(id = "cgv")
	private WebElement selectterms;

@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
private WebElement shippingCheckout;

public WebElement getShippingCheckout() {
	return shippingCheckout;
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
