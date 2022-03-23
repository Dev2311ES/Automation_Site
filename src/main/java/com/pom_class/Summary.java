package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
public WebDriver driver;
public Summary(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "(//i[@class='icon-minus'])[2]")
private WebElement removeQuantity; 

public WebElement getRemoveQuantity() {
	return removeQuantity;
}

@FindBy(xpath = "(//span[contains(text(),'Proceed to checkout')])[2]")
private WebElement checkout ;

public WebElement getCheckout() {
	return checkout;
} 


}