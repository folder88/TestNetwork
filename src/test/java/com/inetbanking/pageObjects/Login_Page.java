package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	
	
	
WebDriver ldriver;
	
	public Login_Page(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
