package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page_Dress {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'][normalize-space()='Printed Summer Dress'])[1]")
	private WebElement printedDress;

	public Women_Page_Dress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getPrintedDress() {
		return printedDress;
	}

}
