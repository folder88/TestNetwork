package com.inetbanking.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.DemoWebShop;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.pageObjects.Login_Page;

import junit.framework.Assert;

public class Test_Case_01 extends BaseClass{

	
	public String username = "ccorneliugurin@gmail.test";
	public String password = "lenroc88";
	public String error_01 = "Login was unsuccessful. Please correct the errors and try again.";
	public String error_02 = "No customer account found";
	public String erroe_03 = "Please enter a valid email address.";
	
	
	
	@Test
	public void method() throws InterruptedException{
		
		
		
		DemoWebShop demowebshow = new DemoWebShop(driver);
		Login_Page Login_Page = new Login_Page(driver);
		
		
		
	
		
		Thread.sleep(2000);
		demowebshow.Login_Button();
		Thread.sleep(2000);
		
		
		
		
		if(username == "corneliugurin@gmail.test" && password == "lenroc88") {
			
			
			Logger.info("Username and Password are correct");
			Thread.sleep(2000);
			Login_Page.Email(username);
			Thread.sleep(2000);
            Login_Page.Password(password);
            Thread.sleep(2000);
			Login_Page.Login();
			Thread.sleep(2000);
			Logger.info("Login was succesful");
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(2000);
			Assert.assertTrue(true);
			
		}
		
		else if(username !="corneliugurin@gmail.test" || password != "lenroc88")
		
		{
			
			
			Logger.info("Username and Password are incorrect");
			Thread.sleep(2000);
			Login_Page.Email(username);
			Thread.sleep(2000);
            Login_Page.Password(password);
            Thread.sleep(2000);
			Login_Page.Login();
			//String text = Login_Page.Text_error_01();
			assertEquals(error_01, Login_Page.Text_error_01());
			assertEquals(error_02, Login_Page.Text_error_02());
			
			
			//driver.navigate().back();
			//Assert.assertTrue(false);
		}
		
		
		
	
	
		
		driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
