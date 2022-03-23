package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	
	public WebDriver driver;
	
	//1.Browser assign
	public Signin_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	//2.enterGmail
	@FindBy(xpath = "//input[@id='email']")
	private WebElement enterGmail;

	public WebElement getEnterGmail() {
		return enterGmail;
	}
	
	//3.enterPassword
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement enterPassword;
	
	public WebElement getEnterPassword() {
		return enterPassword;
	}

	//4.logInBox
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	private WebElement logInBox;

	public WebElement getLogInBox() {
		return logInBox;
	}
	
}
