package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_AddToCart {
//	http://automationpractice.com/index.php?id_product=4&controller=product
	public WebDriver driver;
	
	public Dresses_AddToCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "thumb_10")
	private WebElement whiteDesign;

	public WebElement getWhiteDesign() {
		return whiteDesign;
	}
	
	@FindBy(id = "thumb_11")
	private WebElement pinkDesign;
	
	public WebElement getPinkDesign() {
		return pinkDesign;
	}

	@FindBy(xpath = "//a[@title='Close']")
	private WebElement close_Btn;

	public WebElement getClose_Btn() {
		return close_Btn;
	}
	
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement addQuantityDresses;
	
	public WebElement getAddQuantityDresses() {
		return addQuantityDresses;
	}
	
	@FindBy(id = "group_1")
	private WebElement selectDressesSize;
	
	public WebElement getSelectDressesSize() {
		return selectDressesSize;
	}

	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addToCartBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement proceedToCheckout;

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	
	
}
