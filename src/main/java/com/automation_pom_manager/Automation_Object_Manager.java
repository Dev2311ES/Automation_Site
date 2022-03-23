package com.automation_pom_manager;

import org.openqa.selenium.WebDriver;


import com.pom_class.Address;
import com.pom_class.Dresses_AddToCart;
import com.pom_class.Dresses_Page;
import com.pom_class.Home_Page;
import com.pom_class.Order_Confirmation;
import com.pom_class.Order_Summary;
import com.pom_class.Payment_Page;
import com.pom_class.Shipping;
import com.pom_class.Signin_Page;
import com.pom_class.Summary;
import com.pom_class.Women_Page;
import com.pom_class.Women_Page_AddDresss;
import com.pom_class.Women_Page_Dress;

public class Automation_Object_Manager {
	public WebDriver driver;
	public static Home_Page hp ;
	public static Signin_Page si ;
	public static Women_Page wp ;
	public static Women_Page_Dress wpd ;
	public static Women_Page_AddDresss wpa ;
	public static Dresses_Page dp ;
	public static Dresses_AddToCart dac ;
	public static Summary s ;
	public static Address a ;
	public static Shipping sh ;
	public static Payment_Page pp ;
	public static Order_Summary os ;
	public static Order_Confirmation oc ;
	
	public Automation_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Home_Page get_Instance_Home_Page() {
		if(hp==null) {
			hp = new Home_Page(driver); 
		}
		return hp;
	}
	public Signin_Page get_Instance_Signin_Page() {
		if(si==null) {
			si = new Signin_Page(driver); 
		}
		return si;
	}
	public Women_Page get_Instance_Women_Page() {
		if(wp==null) {
			wp = new Women_Page(driver); 
		}
		return wp;
	}
	public Women_Page_Dress get_Instance_Women_Page_Dress() {
		if(wpd==null) {
			wpd = new Women_Page_Dress(driver); 
		}
		return wpd;
	}
	public Women_Page_AddDresss get_Instance_Women_Page_AddDresss() {
		if(wpa==null) {
			wpa = new Women_Page_AddDresss(driver); 
		}
		return wpa;
	}
	public Dresses_Page get_Instance_Dresses_Page() {
		if(dp==null) {
			dp = new Dresses_Page(driver); 
		}
		return dp;
	}
	public Dresses_AddToCart get_Instance_Dresses_AddToCart() {
		if(dac==null) {
			dac = new Dresses_AddToCart(driver); 
		}
		return dac;
	}
	public Summary get_Instance_Summary() {
		if(s==null) {
			s = new Summary(driver); 
		}
		return s;
	}
	public Address get_Instance_Address() {
		if(a==null) {
			a = new Address(driver); 
		}
		return a;
	}
	public Shipping get_Instance_Shipping() {
		if(sh==null) {
			sh = new Shipping(driver); 
		}
		return sh;
	}
	public Payment_Page get_Instance_Payment_Page() {
		if(pp==null) {
			pp = new Payment_Page(driver); 
		}
		return pp;
	}
	public Order_Summary get_Instance_Order_Summary() {
		if(os==null) {
			os = new Order_Summary(driver); 
		}
		return os;
	}
	public Order_Confirmation get_Instance_Order_Confirmation() {
		if(oc==null) {
			oc = new Order_Confirmation(driver); 
		}
		return oc;
	}
	
	
}
