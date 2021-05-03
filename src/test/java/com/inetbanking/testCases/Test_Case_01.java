package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoWebShop;

public class Test_Case_01 extends BaseClass{

	
	
	@Test
	public void method() throws InterruptedException{
		
		
		
		DemoWebShop demowebshow = new DemoWebShop(driver);
		
		demowebshow.BOOKS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		demowebshow.COMPUTERS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		demowebshow.ELECTRONICS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		demowebshow.APPARELANDSHOES();
		Thread.sleep(2000);
		driver.navigate().back();
		
		demowebshow.DIGITALDOWNLOADS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		demowebshow.JEWELS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		demowebshow.GIFTCARDS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		
	
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
