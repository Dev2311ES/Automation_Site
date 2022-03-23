package com.pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
 public WebDriver driver;
 //http://automationpractice.com/index.php?id_category=8&controller=category#/
 public Dresses_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
 
 
 @FindBy(xpath = "(//h5[@itemprop='name'])[2]")
 private WebElement printedDress;

public WebElement getPrintedDress() {
	return printedDress;
}

@FindBy(xpath = "(//span[contains(text(),'Quick view')])[2]")
private WebElement movetoElement;

public WebElement getMovetoElement() {
	return movetoElement;
}

@FindBy(id = "layered_id_feature_5")
private WebElement boxDown;

public WebElement getBoxDown() {
	return boxDown;
}

@FindBy(id = "id='fancybox-frame1647113533976")
private WebElement switchToFrame;

public WebElement getSwitchToFrame() {
	return switchToFrame;
}

}
