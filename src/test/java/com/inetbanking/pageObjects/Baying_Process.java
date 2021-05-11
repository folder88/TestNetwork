package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.inetbanking.testCases.BaseClass;

public class Baying_Process extends BaseClass {
	
	
	public static String slow_computer_id = "product_attribute_72_5_18_52";
	public static String medium_computer_id = "product_attribute_72_5_18_53";
	public static String fast_computer_id = "product_attribute_72_5_18_65";
	
	public static String pc_8gb = "product_attribute_72_6_19_91";
	public static String pc_4gb = "product_attribute_72_6_19_55";
	
	public static String pc_harddrive_320 = "product_attribute_72_3_20_57";
	public static String pc_harddrive_400 = "product_attribute_72_3_20_58";
	
	public static String Ground = "shippingoption_0";
	public static String Next_Day = "shippingoption_1";
	public static String nd_Day_Air = "shippingoption_2";
	
	public static String Cash_on_delivery = "paymentmethod_0";
	public static String Check_Money_Order = "paymentmethod_1";
	public static String Credit_Card = "paymentmethod_2";
	public static String Purchase_order = "paymentmethod_3";
	
	
	
WebDriver ldriver;
	
	public Baying_Process(WebDriver rdriver) { 
		
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	
	
	
	
	
public void method() {
	
	
	DemoWebShop demowebshow = new DemoWebShop(driver);
	Login_Page Login_Page = new Login_Page(driver);
	
	
	
	
	
	
	
}
	
	
	
	
	
	@FindBy(how = How.XPATH, using ="//*[@id=\\\"shipping-buttons-container\\\"]/input")
	@CacheLookup
	WebElement First_Click_Continue;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\\\"shipping-method-buttons-container\\\"]/input")
	@CacheLookup
	WebElement Second_Click_Continue;
	
	
	public void function_01(String world) {
		
		if(world=="Ground") {
			
			driver.findElement(By.id(Ground)).click();
			
			
		}
		else if(world == "Next_Day") {
			
			driver.findElement(By.id(Next_Day)).click();
		}
		
		else if (world == "nd_Day_Air") {
			driver.findElement(By.id(nd_Day_Air)).click();
		}
		
	}
	
	
	
	
	
	
}
