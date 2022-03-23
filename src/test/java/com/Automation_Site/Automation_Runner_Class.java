package com.Automation_Site;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.automation_pom_manager.Automation_Object_Manager;

import Hotel_Book.Automation.Automation_Base_Class;

public class Automation_Runner_Class extends Automation_Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");;
	public static Automation_Object_Manager apom = new Automation_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_Runner_Class.class); 
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Launch The Url");
		getUrl("http://automationpractice.com/index.php");

		// Home Page of Automation Site:
		clickOnElement(apom.get_Instance_Home_Page().getSignin_Btn());
		log.info("Home Page Successfullly Launched ");
	
		// 2.SignIn Account
		inputValueElement(apom.get_Instance_Signin_Page().getEnterGmail(),
				test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\AutomationPractice\\AutomationTestCases.xlsx", 6, 5));

		inputValueElement(apom.get_Instance_Signin_Page().getEnterPassword(),
				test_Data("C:\\Users\\Sugadev\\Desktop\\Project\\AutomationPractice\\AutomationTestCases.xlsx", 7, 5));
		clickOnElement(apom.get_Instance_Signin_Page().getLogInBox());
		log.warn(" Successfully Login");
		
		// Women Page
		clickOnElement(apom.get_Instance_Women_Page().getClickWomenElement());
		log.info("Women Page Successfully Opened");
		
		// Women My Store
		clickOnElement(apom.get_Instance_Women_Page_Dress().getPrintedDress());

		// Women Add of cart
		log.info("Add to cart Notification Page Open");
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getYellowDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getClose_Btn());

		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getBlueDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getClose_Btn());

		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getRedDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getClose_Btn());

		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getBlackDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getClose_Btn());
		log.info("All Designs are Verified");
		
		// Add Quantity
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getAddQuantity());
		sleep(3000);
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getAddQuantity());
		log.info("Add Quantity Successful");
		
		// Select size
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getselectSize());
		dropDown(apom.get_Instance_Women_Page_AddDresss().getselectSize(), "byvalue", "2");
		log.info("Add Size Successful");
		
		// Add to Cart
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getAddToCart_Btn());
		log.warn("Add to Cart competed");
		
		// Continue Shopping
		explicitWait(20, apom.get_Instance_Women_Page_AddDresss().getContinueShopping());
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getContinueShopping());
		log.info("Continue Shopping");
		
		// Switch to Dresses Page
		clickOnElement(apom.get_Instance_Women_Page_AddDresss().getDressesPage());
		log.info("Women Page Switch to Dresses Page Successful");
		
		// Select dresses
		scrollUpAndDown(apom.get_Instance_Dresses_Page().getBoxDown());
		actionClass("moveto", apom.get_Instance_Dresses_Page().getPrintedDress());
		log.info("Successfully Printed dress Selected");
		sleep(3000);
		clickOnElement(apom.get_Instance_Dresses_Page().getPrintedDress());

		// Printed dress in dresses
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getWhiteDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getClose_Btn());

		clickOnElement(apom.get_Instance_Dresses_AddToCart().getPinkDesign());
		sleep(3000);
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getClose_Btn());
		log.info("All Designs are Verified");
		// Add Quantity
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getAddQuantityDresses());
		sleep(1000);
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getAddQuantityDresses());
		log.info("Add Quantity Successful");
		
		// Select Size
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getSelectDressesSize());
		dropDown(apom.get_Instance_Dresses_AddToCart().getSelectDressesSize(), "byvalue", "2");
		log.info("Add Size Successful");
		// Add to cart dresses
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getAddToCartBtn());
		log.info("Add to Cart Completed");
		
		// Proceed to checkout
		explicitWait(5, apom.get_Instance_Women_Page_AddDresss().getContinueShopping());
		clickOnElement(apom.get_Instance_Dresses_AddToCart().getProceedToCheckout());
		log.info("Proceed to Checkout");
		
		// Summary
		clickOnElement(apom.get_Instance_Summary().getRemoveQuantity());
		sleep(2000);
		clickOnElement(apom.get_Instance_Summary().getCheckout());
		log.info("Summary is successfull");
		
		// Address
		inputValueElement(apom.get_Instance_Address().getComments(), "Thank you for your product");
		clickOnElement(apom.get_Instance_Address().getSummaryCheckout());

		// Shipping
		clickOnElement(apom.get_Instance_Shipping().getSelectterms());
		clickOnElement(apom.get_Instance_Shipping().getShippingCheckout());

		// Payment
		clickOnElement(apom.get_Instance_Payment_Page().getBankWire());

		// Order Summary
		clickOnElement(apom.get_Instance_Order_Summary().getOrderConfirmation());
		log.info("Order Confirmation is Successful");
		
		// Order Confirmation and logout
		sleep(3000);
		takeScreenshot("OrderConfirmed");
		log.warn("Take a Screenshot Completed");
		
		clickOnElement(apom.get_Instance_Order_Confirmation().getLogotAccount());
		log.warn("Successful Logout ");
		
		//Quit the Browser
		quit();
		log.info("Quit Browser Successfully");
	
		// Note:Thread.sleep() only for Practice purpose.
	}

}
