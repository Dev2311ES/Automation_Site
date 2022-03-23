package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement clickWomenElement;

	public Women_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);	
		
	}

	public WebElement getClickWomenElement() {
		return clickWomenElement;
	}

	//http://automationpractice.com/index.php?id_category=3&controller=category

}
