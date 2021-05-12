package com.inetbanking.pageObjects;

import java.util.concurrent.TimeUnit;

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
	
	
	
	
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"billing-buttons-container\"]/input")
	@CacheLookup
	WebElement Billing_adress_continue_button_first_click;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"shipping-buttons-container\"]/input")
	@CacheLookup
	WebElement Billing_adress_continue_button_second_click; 
	
	
	@FindBy(how = How.XPATH,using="//*[@id=\"shipping-method-buttons-container\"]/input")
	@CacheLookup
	WebElement Shipping_method_continue_button;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"payment-method-buttons-container\"]/input")
	@CacheLookup
	WebElement Payment_method_continue_button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"payment-info-buttons-container\"]/input")
	@CacheLookup
	WebElement Payment_information_continue_button;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"confirm-order-buttons-container\"]/input")
	@CacheLookup
	WebElement Confirm_order_continue_button;
	
	@FindBy(how = How.XPATH,using="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	@CacheLookup
	WebElement  Last_continue_button;
	
	
	
	
	
	public void Payment_process(String Shipping_method,String Payment_method) throws InterruptedException {
		
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Billing_adress_continue_button_first_click.click();
		//Thread.sleep(2000);
		Billing_adress_continue_button_second_click.click();
		//Thread.sleep(2000);
		
		Shipping_method(Shipping_method);
		//Thread.sleep(2000);
		
		Shipping_method_continue_button.click();
		//Thread.sleep(2000);
		Paymend_method(Payment_method);
		//Thread.sleep(2000);
		
		Payment_method_continue_button.click();
		//Thread.sleep(2000);
		Payment_information_continue_button.click();
		//Thread.sleep(2000);
		Confirm_order_continue_button.click();
		//Thread.sleep(2000);
		Last_continue_button.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void Shipping_method(String world) {
		
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
	
	public void Paymend_method(String world) {
		
    if(world=="Cash_on_delivery") {
			
			driver.findElement(By.id(Cash_on_delivery)).click();
			
			
		}
		else if(world == "Check_Money_Order") {
			
			driver.findElement(By.id(Check_Money_Order)).click();
		}
		
		else if (world == "Credit_Card") {
			driver.findElement(By.id(Credit_Card)).click();
		}
    
		else if (world == "Purchase_order") {
			driver.findElement(By.id(Purchase_order)).click();
		}
		
	}
	
	
	
	
}
