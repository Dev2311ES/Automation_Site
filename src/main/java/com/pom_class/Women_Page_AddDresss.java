package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page_AddDresss {
	
	public WebDriver driver;
	
	public Women_Page_AddDresss(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "thumb_12")
	private WebElement yellowDesign;

	public WebElement getYellowDesign() {
		return yellowDesign;
	}

	@FindBy(id = "thumb_13")
	private WebElement blueDesign;
	
	public WebElement getBlueDesign() {
		return blueDesign;
	}

	@FindBy(id = "thumb_14")
	private WebElement redDesign;
	
	public WebElement getRedDesign() {
		return redDesign;
	}

	
	@FindBy(id = "thumb_15")
	private WebElement blackDesign;
	
	public WebElement getBlackDesign() {
		return blackDesign;
	}

	@FindBy(xpath = "//a[@title='Close']")
	private WebElement close_Btn;
	
	public WebElement getClose_Btn() {
		return close_Btn;
	}

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement addQuantity;
	
	public WebElement getAddQuantity() {
		return addQuantity;
	}

	@FindBy(id = "group_1")
	private WebElement selectSize;
	
	public WebElement getselectSize() {
		return selectSize;
	}


	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement addToCart_Btn;
	
	public WebElement getAddToCart_Btn() {
		return addToCart_Btn;
	}

	@FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
	private WebElement continueShopping;

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	@FindBy(xpath = "(//a[@title='Dresses'][normalize-space()='Dresses'])[2]")
	private WebElement dressesPage;

	public WebElement getDressesPage() {
		return dressesPage;
	}

	//http://automationpractice.com/index.php?id_product=5&controller=product#/color-yellow/size-m

}
