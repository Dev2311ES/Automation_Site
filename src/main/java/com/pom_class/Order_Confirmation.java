package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Confirmation {
	public WebDriver driver;
	
	@FindBy(xpath  ="//a[@title='Log me out']")
	private WebElement logotAccount;

	public Order_Confirmation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogotAccount() {
		return logotAccount;
	}

	
}
