package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase {
	
	
	
WebDriver ldriver;
	
	public TestCase (WebDriver rdriver) { 
		
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	
	@FindBy(how = How.ID, using ="popin_tc_privacy_button")
	@CacheLookup
	WebElement cookies;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav_sub\"]/ul/li[1]/a")
	@CacheLookup
	WebElement pensionVermögen;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav_sub\"]/ul/li[1]/div/ul/li[1]/a")
	@CacheLookup
	WebElement pensionVermögen2;
	
	@FindBy(how = How.LINK_TEXT, using ="Pension & Vermögen")
	@CacheLookup
	WebElement cookies2;
	
	
	
	public void pensionVermögen(){
		pensionVermögen.click();
	}
	public void pensionVermögen2(){
		pensionVermögen2.click();
	}
	
	public void cookies() {
		cookies.click();
			
	}
	
	public void folder() {
		cookies2.click();
			
	}
	
	
	
}
