package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
 public WebDriver driver;
 
 public Address(WebDriver driver2) {
	 this.driver = driver2;
	 PageFactory.initElements(driver, this);
 }
 
 @FindBy(name = "message")
private WebElement comments;

public WebElement getComments() {
	return comments;
}

@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
private WebElement summaryCheckout;

public WebElement getSummaryCheckout() {
	return summaryCheckout;
}
}