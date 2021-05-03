package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	
	
	
WebDriver ldriver;
	
	public Login_Page(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
		
	}
	
	
	
	@FindBy(how = How.ID, using ="Email")
	@CacheLookup
	WebElement Email;
	
	public void Email(String Text){
		Email.sendKeys(Text);
	}
	
	
	
	@FindBy(how = How.ID, using ="Password")
	@CacheLookup
	WebElement Password;
	
	public void Password(String Text){
		Password.sendKeys(Text);
	}
	
	
	
	@FindBy(how = How.XPATH, using ="//input[@value = \"Log in\"]")
	@CacheLookup
	WebElement Login;
	
	public void Login(){
		Login.click();
	}
	
	@FindBy(how = How.XPATH, using ="//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")
	@CacheLookup
	WebElement Text_error_01;
	
	
	public void Text_error_01(){
		String text = Text_error_01.getText();
		System.out.println(text);
		
		
	}
	
	
	
}
