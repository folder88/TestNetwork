package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShop {

	
	
WebDriver ldriver;
	
	public DemoWebShop(WebDriver rdriver) { 
		
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	

	//links
	@FindBy(how = How.XPATH, using ="//a[@class=\"ico-register\"]")
	@CacheLookup
	WebElement Register_button;
	
	public void Register_button(){
		Register_button.click();
	}
	
	
	@FindBy(how = How.XPATH, using ="//a[@class=\"ico-login\"]")
	@CacheLookup
	WebElement Login_Button;
	
	public void Login_Button(){
     	Login_Button.click();
	}
	
	
	@FindBy(how = How.XPATH, using ="//span[text()=\"Shopping cart\"]")
	@CacheLookup
	WebElement Shopping_cart;
	
	public void Shopping_cart(){
     	Shopping_cart.click();
	}

	
	
	@FindBy(how = How.XPATH, using ="//span[text()=\"Wishlist\"]")
	@CacheLookup
	WebElement Wishlist;
	
	public void Wishlist(){
     	Wishlist.click();
	}

	
	
	//input[@value = "Log in"]
	
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
	@CacheLookup
	WebElement SearchButton;
	
	
	public void SearchButton(){
     	SearchButton.click();
	}
	
	
	
	
	
	//CATEGORIES
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
	@CacheLookup
	WebElement BOOKS;
	
	public void BOOKS(){
		BOOKS.click();
	}
	
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement COMPUTERS;
	
	
	public void COMPUTERS(){
		COMPUTERS.click();
	}
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
	@CacheLookup
	WebElement ELECTRONICS;
	
	public void ELECTRONICS(){
		ELECTRONICS.click();
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
	@CacheLookup
	WebElement APPARELANDSHOES;
	
	public void APPARELANDSHOES(){
		APPARELANDSHOES.click();
	}
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")
	@CacheLookup
	WebElement DIGITALDOWNLOADS;
	
	public void DIGITALDOWNLOADS(){
		DIGITALDOWNLOADS.click();
	}
	
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	@CacheLookup
	WebElement JEWELS;
	
	
	public void JEWELS(){
		JEWELS.click();
	}
	
	@FindBy(how = How.XPATH, using ="/html/body/div[4]/div[1]/div[2]/ul[1]/li[7]/a")
	@CacheLookup
	WebElement GIFTCARDS;
	
	
	public void GIFTCARDS(){
		GIFTCARDS.click();
	}
	

	
	
	
	
}
