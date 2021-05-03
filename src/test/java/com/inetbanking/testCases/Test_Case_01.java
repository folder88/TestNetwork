package com.inetbanking.testCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoWebShop;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.Login_Page;

public class Test_Case_01 extends BaseClass{

	
	
	@Test
	public void method() throws InterruptedException{
		
		
		
		DemoWebShop demowebshow = new DemoWebShop(driver);
		Login_Page Login_Page = new Login_Page(driver);
		
		
		
		demowebshow.BOOKS();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		demowebshow.Login_Button();
		Login_Page.Email("corne5liugurin@gmail.test");
		Login_Page.Password("lenroc88");
		
		Login_Page.Login();
		
		Login_Page.Text_error_01();
		
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
